//package com.apps.quantitymeasurement.integration;
//
//import com.apps.quantitymeasurement.repository.*;
//import com.apps.quantitymeasurement.service.QuantityMeasurementServiceImpl;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class QuantityMeasurementIntegrationTest {
//
//    private QuantityMeasurementServiceImpl service;
//    private IQuantityMeasurementRepository repo;
//
//    @Before
//    public void setup() {
//        repo = new QuantityMeasurementDatabaseRepository();
//        service = new QuantityMeasurementServiceImpl(repo);
//        repo.deleteAll();
//    }
//
//    @Test
//    public void testEndToEnd() {
//        service.compare(10, 10);
//        service.compare(5, 6);
//
//        assertEquals(2, repo.getCount());
//    }
//}