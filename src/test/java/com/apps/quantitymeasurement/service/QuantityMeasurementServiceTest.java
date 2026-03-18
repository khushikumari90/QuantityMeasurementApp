package com.apps.quantitymeasurement.service;

import com.apps.quantitymeasurement.repository.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementServiceTest {

    private QuantityMeasurementServiceImpl service;
    private IQuantityMeasurementRepository repo;

    @Before
    public void setup() {
        repo = new QuantityMeasurementDatabaseRepository();
        service = new QuantityMeasurementServiceImpl(repo);
        repo.deleteAll();
    }

    @Test
    public void testCompare() {
        service.compare(10, 10);
        assertEquals(1, repo.getCount());
    }
}