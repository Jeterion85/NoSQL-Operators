package gr.ds.unipi.noda.api.core.operators;

import gr.ds.unipi.noda.api.core.operators.filterOperators.FilterOperator;
import gr.ds.unipi.noda.api.core.operators.filterOperators.comparisonOperators.ComparisonOperator;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.Coordinates;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.GeographicalOperator;
import gr.ds.unipi.noda.api.core.operators.filterOperators.logicalOperators.LogicalOperator;

import java.util.Date;

public class FilterOperators {

    public static FilterOperator and(FilterOperator filterOperator1, FilterOperator filterOperator2, FilterOperator... filterOperators) {
        return LogicalOperator.logicalOperator.newOperatorAnd(filterOperator1, filterOperator2, filterOperators);
    }

    public static FilterOperator or(FilterOperator filterOperator1, FilterOperator filterOperator2, FilterOperator... filterOperators) {
        return LogicalOperator.logicalOperator.newOperatorOr(filterOperator1, filterOperator2, filterOperators);
    }

    public static FilterOperator gte(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gte(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gte(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gte(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gte(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gte(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGte(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator gt(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorGt(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lte(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLte(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator lt(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorLt(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, boolean fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, String fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator eq(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorEq(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, double fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, boolean fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, String fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, int fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, float fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, short fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, long fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator ne(String fieldName, Date fieldValue) {
        return ComparisonOperator.comparisonOperator.newOperatorNe(fieldName, fieldValue);
    }

    public static FilterOperator inGeoPolygon(String fieldName, Coordinates coordinates1, Coordinates coordinates2, Coordinates coordinates3, Coordinates... coordinates) {
        return GeographicalOperator.geographicalOperator.newOperatorInGeoPolygon(fieldName, coordinates1, coordinates2, coordinates3, coordinates);
    }

    public static FilterOperator inGeoBox(String fieldName, Coordinates lowerBoundPoint, Coordinates upperBoundPoint) {
        return GeographicalOperator.geographicalOperator.newOperatorInGeoBox(fieldName, lowerBoundPoint, upperBoundPoint);
    }

    public static FilterOperator inGeoCircleKm(String fieldName, Coordinates point, double radius) {
        return GeographicalOperator.geographicalOperator.newOperatorInGeoCircleKm(fieldName, point, radius);
    }

    public static FilterOperator inGeoCircleMeters(String fieldName, Coordinates point, double radius) {
        return GeographicalOperator.geographicalOperator.newOperatorInGeoCircleMeters(fieldName, point, radius);
    }

    public static FilterOperator inGeoCircleMiles(String fieldName, Coordinates point, double radius) {
        return GeographicalOperator.geographicalOperator.newOperatorInGeoCircleMiles(fieldName, point, radius);
    }

    public static FilterOperator nearestNeighbors(String fieldName, Coordinates point, int neighbors) {
        return GeographicalOperator.geographicalOperator.newOperatorNearestNeighbors(fieldName, point, neighbors);
    }

    public static FilterOperator keyword(String fieldName, String keyword){
        return null;
    }

    public static FilterOperator onlyKeyword(String fieldName, String keyword){
        return null;
    }

    public static FilterOperator allKeywords(String fieldName, String keyword){
        return null;
    }

    public static FilterOperator anyKeywords(String fieldName, String keyword){
        return null;
    }
}