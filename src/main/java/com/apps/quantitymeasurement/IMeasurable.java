package com.apps.quantitymeasurement;
public interface IMeasurable {

    SupportsArithmetic supportsArithmetic = () -> true;

    double toBaseUnit(double value);

    double fromBaseUnit(double baseValue);

    default boolean supportsArithmetic() {
        return supportsArithmetic.isSupported();
    }

    default void validateOperationSupport(String operation) {
    }
}
