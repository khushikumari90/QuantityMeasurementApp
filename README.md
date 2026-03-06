# QuantityMeasurementApp

## 🌿 Branch Structure

```
dev
└── main
    └── feature/UC1-FeatEquality
        └── feature/UC2-FeetAndInchesMeasurementEquality
            └── feature/UC3-GenericQuantityClassForDryPrinciple
                └── feature/UC4-ExtendedUnitSupport
                    └── feature/UC5-Unit-to-Unit-Conversion
```

## 📌 Use Cases Implemented

### UC1: Feet Measurement Equality
- Compare two feet measurements to check if they are equal.

### UC2: Feet and Inches Measurement Equality
- Compare measurements given in feet and inches.
- Example: `1 ft = 12 inches`.

### UC3: Generic Quantity Class (DRY Principle)
- Implement a generic quantity class to avoid duplicate code.

### UC4: Extended Unit Support
- Added support for more units like:
  - Feet
  - Inches
  - Yards
  - Centimeters

### UC5: Unit-to-Unit Conversion
- Convert between units such as:
  - Feet → Inches
  - Yards → Inches
  - Centimeters → Feet
