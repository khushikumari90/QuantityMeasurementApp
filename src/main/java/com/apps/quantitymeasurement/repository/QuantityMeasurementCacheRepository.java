package com.apps.quantitymeasurement.repository;

import com.apps.quantitymeasurement.entity.QuantityMeasurementEntity;
import java.util.*;

public class QuantityMeasurementCacheRepository
        implements IQuantityMeasurementRepository {

    private List<QuantityMeasurementEntity> cache = new ArrayList<>();

    public void save(QuantityMeasurementEntity entity) {
        cache.add(entity);
    }

    public List<QuantityMeasurementEntity> getAll() {
        return cache;
    }
}