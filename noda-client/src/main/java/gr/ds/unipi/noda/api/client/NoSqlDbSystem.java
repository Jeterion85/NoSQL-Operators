package gr.ds.unipi.noda.api.client;

import gr.ds.unipi.noda.api.client.hbase.HBaseBuilderFactory;
import gr.ds.unipi.noda.api.client.mongo.MongoDBBuilderFactory;
import gr.ds.unipi.noda.api.client.neo4j.Neo4jBuilderFactory;
import gr.ds.unipi.noda.api.client.redisearch.RediSearchBuilderFactory;
import gr.ds.unipi.noda.api.core.nosqldb.NoSqlConnectionFactory;
import gr.ds.unipi.noda.api.core.nosqldb.NoSqlDbConnector;
import gr.ds.unipi.noda.api.core.nosqldb.NoSqlDbOperators;
import org.apache.spark.sql.SparkSession;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public abstract class NoSqlDbSystem {

    private final List<Pair<String, Integer>> addresses;
    private final SparkSession sparkSession;
    private final NoSqlConnectionFactory nsdb;

    protected abstract static class Builder<T extends Builder<T>> {

        List<Pair<String, Integer>> addresses = new ArrayList<>();
        SparkSession sparkSession = null;

        public T host(String host) {

            int i = 0;
            while (i < addresses.size()) {
                if (addresses.get(i).getValue0() == null) {
                    addresses.set(i, new Pair<>(host, addresses.get(i).getValue1()));
                    break;
                }
                i++;
            }
            if (i == addresses.size()) {
                addresses.add(new Pair<>(host, null));
            }

            return self();
        }

        public T port(int port) {

            int i = 0;
            while (i < addresses.size()) {
                if (addresses.get(i).getValue1() == null) {
                    addresses.set(i, new Pair<>(addresses.get(i).getValue0(), port));
                    break;
                }
                i++;
            }
            if (i == addresses.size()) {
                addresses.add(new Pair<>(null, port));
            }
            return self();
        }

        public T sparkSession(SparkSession sparkSession) {
            this.sparkSession = sparkSession;
            return self();
        }

        protected abstract NoSqlDbSystem build();

        protected abstract T self();
    }

    protected NoSqlDbSystem(Builder<?> builder, NoSqlConnectionFactory noSqlConnectionFactory) {
        sparkSession = builder.sparkSession;
        nsdb = noSqlConnectionFactory;

        for (int i = 0; i < builder.addresses.size(); i++) {
            if (builder.addresses.get(i).getValue0() == null) {
                builder.addresses.set(i, new Pair<>(getDefaultHost(), builder.addresses.get(i).getValue1()));
            }
            if (builder.addresses.get(i).getValue1() == null) {
                builder.addresses.set(i, new Pair<>(builder.addresses.get(i).getValue0(), getDefaultPort()));
            }
        }

        if (builder.addresses.size() == 0) {
            builder.addresses.add(new Pair<>(getDefaultHost(), getDefaultPort()));
        }

        addresses = Collections.unmodifiableList(builder.addresses.stream().distinct().collect(Collectors.toList()));//list is sorted
    }

    protected List<Pair<String, Integer>> getAddresses() {
        return addresses;
    }

    protected abstract NoSqlDbConnector getConnector();

    public NoSqlDbOperators operateOn(String s) {
        return nsdb.noSqlDbOperators(getConnector(), s, sparkSession);
    }

    public void closeConnection() {
        nsdb.closeConnection(getConnector());
    }

    public static void closeConnections() {
        toBeCleaned.forEach(NoSqlConnectionFactory::closeConnections);
    }

    private static final List<NoSqlConnectionFactory> toBeCleaned = new ArrayList<>();

    public static MongoDBBuilderFactory MongoDB() {
        return new MongoDBBuilderFactory();
    }

    public static Neo4jBuilderFactory Neo4j() {
        return new Neo4jBuilderFactory();
    }

    public static HBaseBuilderFactory HBase() {
        return new HBaseBuilderFactory();
    }

    public static RediSearchBuilderFactory RediSearch() {
        return new RediSearchBuilderFactory();
    }

    public String getDefaultHost() {
        return "localhost";
    }

    public abstract int getDefaultPort();

}
