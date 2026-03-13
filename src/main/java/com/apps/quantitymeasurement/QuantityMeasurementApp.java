package com.apps.quantitymeasurement;

import com.apps.quantitymeasurement.controller.QuantityMeasurementController;
import com.apps.quantitymeasurement.repository.QuantityMeasurementDatabaseRepository;
import com.apps.quantitymeasurement.service.QuantityMeasurementServiceImpl;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityMeasurementDatabaseRepository repository =
                new QuantityMeasurementDatabaseRepository();

        QuantityMeasurementServiceImpl service =
                new QuantityMeasurementServiceImpl(repository);

        QuantityMeasurementController controller =
                new QuantityMeasurementController(service);

        controller.compareLengths(1.0, 100.0);
    }
}