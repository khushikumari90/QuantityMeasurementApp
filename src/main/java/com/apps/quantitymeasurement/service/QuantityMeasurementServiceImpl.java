package com.apps.quantitymeasurement.service;

import com.apps.quantitymeasurement.entity.QuantityMeasurementEntity;
import com.apps.quantitymeasurement.repository.IQuantityMeasurementRepository;

public class QuantityMeasurementServiceImpl implements IQuantityMeasurementService {

    private final IQuantityMeasurementRepository repository;

    public QuantityMeasurementServiceImpl(IQuantityMeasurementRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean compareLength(double feet, double inches) {

        boolean result = (feet * 12) == inches;

        QuantityMeasurementEntity entity = new QuantityMeasurementEntity(
                "LENGTH", "COMPARE", String.valueOf(feet), String.valueOf(inches), result
        );

        repository.save(entity);

        return result;
    }
}