package com.apps.quantitymeasurement.entity;

public class QuantityMeasurementEntity {

    private String type;
    private String operation;
    private String value1;
    private String value2;
    private boolean result;

    public QuantityMeasurementEntity(String type, String operation,
                                     String value1, String value2, boolean result) {
        this.type = type;
        this.operation = operation;
        this.value1 = value1;
        this.value2 = value2;
        this.result = result;
    }

    public String getType() { return type; }
    public String getOperation() { return operation; }
    public String getValue1() { return value1; }
    public String getValue2() { return value2; }
    public boolean isResult() { return result; }
}