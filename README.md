# QuantityMeasurementApp

## 🌿 Branch Structure
dev
└── main
    └── feature/UC1-FeatEquality
        └── feature/UC2-FeetAndInchesMeasurementEquality
            └── feature/UC3-GenericQuantityClassForDryPrinciple
                └── feature/UC4-ExtendedUnitSupport
                    └── feature/UC5-Unit-to-Unit-Conversion




## 📌 Use Cases Implemented

### UC1: Feet Measurement Equality
- Compare two **feet measurements**.
- Check whether both measurements are equal.

### UC2: Feet and Inches Measurement Equality
- Compare **feet and inches measurements**.
- Example: `1 ft == 12 inches`.

### UC3: Generic Quantity Class (DRY Principle)
- Implement a **generic Quantity class**.
- Avoid duplicate code by following the **DRY (Don't Repeat Yourself) principle**.

### UC4: Extended Unit Support
- Support additional **length units** such as:
  - Feet
  - Inches
  - Yards
  - Centimeters

### UC5: Unit-to-Unit Conversion
- Provide **explicit conversion** between units.
- Examples:
  - Feet → Inches
  - Yards → Inches
  - Centimeters → Feet
