package com.apps.quantitymeasurement;

import com.apps.quantitymeasurement.controller.*;
import com.apps.quantitymeasurement.dto.*;
import com.apps.quantitymeasurement.service.*;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        IQuantityMeasurementService service =
                new QuantityMeasurementServiceImpl();

        QuantityMeasurementController controller =
                new QuantityMeasurementController(service);

        QuantityDTO feet = new QuantityDTO(1,"FEET");
        QuantityDTO inches = new QuantityDTO(12,"INCHES");

        controller.compare(feet,inches);

        controller.convert(feet,"INCHES");

        controller.add(feet,inches,"FEET");
    }
}