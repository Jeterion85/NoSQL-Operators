package gr.ds.unipi.noda.api.YYYDataBase.sortOperator;

import gr.ds.unipi.noda.api.core.operators.sortOperators.BaseSortOperatorFactory;
import gr.ds.unipi.noda.api.core.operators.sortOperators.SortOperator;

public final class YYYDataBaseSortOperatorFactory extends BaseSortOperatorFactory {

    @Override
    public SortOperator newOperatorAsc(String fieldName) {
        return OperatorAsc.newOperatorAsc(fieldName);
    }

    @Override
    public SortOperator newOperatorDesc(String fieldName) {
        return OperatorDesc.newOperatorDesc(fieldName);
    }

}
