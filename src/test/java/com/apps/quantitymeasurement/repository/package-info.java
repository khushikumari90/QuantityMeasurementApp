package com.apps.quantitymeasurement.repository;

import com.app.quantitymeasurement.entity.QuantityMeasurementEntity;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class QuantityMeasurementDatabaseRepositoryTest {

    private QuantityMeasurementDatabaseRepository repository;

    @Before
    public void setUp() {
        repository = new QuantityMeasurementDatabaseRepository();
        repository.deleteAll();
    }

    @Test
    public void givenMeasurement_WhenSaved_ShouldIncreaseCount() {

        QuantityMeasurementEntity entity =
                new QuantityMeasurementEntity("LENGTH", "COMPARE", "1", "12", true);

        repository.save(entity);

        int count = repository.getTotalCount();

        assertEquals(1, count);
    }

    @Test
    public void givenMultipleMeasurements_WhenRetrieved_ShouldReturnAll() {

        repository.save(new QuantityMeasurementEntity("LENGTH","COMPARE","1","12",true));
        repository.save(new QuantityMeasurementEntity("WEIGHT","COMPARE","1","1000",true));

        List<QuantityMeasurementEntity> list = repository.getAllMeasurements();

        assertEquals(2, list.size());
    }

    @Test
    public void givenMeasurements_WhenDeleted_ShouldReturnZeroCount() {

        repository.save(new QuantityMeasurementEntity("LENGTH","COMPARE","1","12",true));

        repository.deleteAll();

        assertEquals(0, repository.getTotalCount());
    }
}