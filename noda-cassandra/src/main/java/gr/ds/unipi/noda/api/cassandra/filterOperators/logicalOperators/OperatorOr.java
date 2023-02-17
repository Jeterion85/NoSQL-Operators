package gr.ds.unipi.noda.api.cassandra.filterOperators.logicalOperators;

import gr.ds.unipi.noda.api.core.operators.filterOperators.FilterOperator;

final class OperatorOr extends LogicalOperator {

    @Override
    public StringBuilder getOperatorExpression(){
        throw new IllegalArgumentException("The OR(∨) operation is not supported by Cassandra!");
    }

    private OperatorOr(FilterOperator filterOperator1, FilterOperator filterOperator2, FilterOperator... filterOperators) {
        super(filterOperator1, filterOperator2, filterOperators);
    }

    public static OperatorOr newOperatorOr(FilterOperator filterOperator1, FilterOperator filterOperator2, FilterOperator... filterOperators) {
        return new OperatorOr(filterOperator1, filterOperator2, filterOperators);
    }

}
