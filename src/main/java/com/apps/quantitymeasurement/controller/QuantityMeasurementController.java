package com.apps.quantitymeasurement.controller;

import com.apps.quantitymeasurement.service.IQuantityMeasurementService;

public class QuantityMeasurementController {

    private final IQuantityMeasurementService service;

    public QuantityMeasurementController(IQuantityMeasurementService service) {
        this.service = service;
    }

    public boolean compareLengths(double feet, double inches) {
        return service.compareLength(feet, inches);
    }
}