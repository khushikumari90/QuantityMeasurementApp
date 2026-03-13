package com.apps.quantitymeasurement.controller;

import com.apps.quantitymeasurement.dto.*;
import com.apps.quantitymeasurement.service.*;

public class QuantityMeasurementController {

    private IQuantityMeasurementService service;

    public QuantityMeasurementController(
            IQuantityMeasurementService service) {

        this.service = service;
    }

    public void compare(QuantityDTO q1, QuantityDTO q2) {

        boolean result = service.compare(q1, q2);

        System.out.println(q1.getValue()+" "+q1.getUnit()+
                " == "+q2.getValue()+" "+q2.getUnit()+" -> "+result);
    }

    public void convert(QuantityDTO q, String target) {

        QuantityDTO result = service.convert(q, target);

        System.out.println(q.getValue()+" "+q.getUnit()+
                " -> "+result.getValue()+" "+target);
    }

    public void add(QuantityDTO q1, QuantityDTO q2, String target) {

        QuantityDTO result = service.add(q1, q2, target);

        System.out.println("Result : "+result.getValue()+" "+target);
    }
}