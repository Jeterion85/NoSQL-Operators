package com.github.unipi.trackandknow.nosqldbs;

import com.github.unipi.trackandknow.nosqldbs.mongodb.MongoDBConnector;
import com.github.unipi.trackandknow.nosqldbs.mongodb.MongoDBOperators;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public enum NoSqlDb {

    MONGODB{
        @Override
        public NoSqlDbConnector noSqlDbConnector(String host, int port, String username, String password, String database){
            return MongoDBConnector.newMongoDBConnector(host, port, username, password, database);
        }

        @Override
        public NoSqlDbOperators noSqlDbOperators(Object client, String database, String s){
            return MongoDBOperators.newMongoDBOperators(((MongoClient) client).getDatabase(database).getCollection(s));
        }

        @Override
        public void disconnect(Object o){
            ((MongoClient) o).close();
        }

        @Override
        public int getDefaultPort(){
            return 27017;
        }

        @Override
        public String getDefaultDatabase(){
            return "";
        }

        @Override
        public String getDefaultUsername(){
            return "";
        }

        @Override
        public String getDefaultPassword(){
            return "";
        }

    };

    public abstract NoSqlDbConnector noSqlDbConnector(String host, int port, String username, String password, String database);

    public abstract NoSqlDbOperators noSqlDbOperators(Object client, String database, String s);

    public abstract void disconnect(Object t);

    public String getDefaultHost(){
        return "localhost";
    }

    public abstract int getDefaultPort();

    public abstract String getDefaultDatabase();

    public abstract String getDefaultUsername();

    public abstract String getDefaultPassword();

}