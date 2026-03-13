package com.apps.quantitymeasurement.service;

import com.apps.quantitymeasurement.*;
import com.apps.quantitymeasurement.dto.*;

public class QuantityMeasurementServiceImpl
        implements IQuantityMeasurementService {

    public boolean compare(QuantityDTO q1, QuantityDTO q2) {

        Quantity<?> quantity1 =
                new Quantity<>(q1.getValue(), LengthUnit.valueOf(q1.getUnit()));

        Quantity<?> quantity2 =
                new Quantity<>(q2.getValue(), LengthUnit.valueOf(q2.getUnit()));

        return quantity1.equals(quantity2);
    }

    public QuantityDTO convert(QuantityDTO q, String targetUnit) {

        Quantity<LengthUnit> quantity =
                new Quantity<>(q.getValue(), LengthUnit.valueOf(q.getUnit()));

        Quantity<LengthUnit> result =
                quantity.convertTo(LengthUnit.valueOf(targetUnit));

        return new QuantityDTO(result.getValue(), targetUnit);
    }

    public QuantityDTO add(QuantityDTO q1, QuantityDTO q2, String targetUnit) {

        Quantity<LengthUnit> quantity1 =
                new Quantity<>(q1.getValue(), LengthUnit.valueOf(q1.getUnit()));

        Quantity<LengthUnit> quantity2 =
                new Quantity<>(q2.getValue(), LengthUnit.valueOf(q2.getUnit()));

        Quantity<LengthUnit> result =
                quantity1.add(quantity2, LengthUnit.valueOf(targetUnit));

        return new QuantityDTO(result.getValue(), targetUnit);
    }
}