# 📏 QuantityMeasurementApp

## 🌿 Branch Structure

```bash
dev
└── main
    └── feature/UC1-FeatEquality
        └── feature/UC2-FeetAndInchesMeasurementEquality
            └── feature/UC3-GenericQuantityClassForDRYPrinciple
                └── feature/UC4-ExtendedUnitSupport
                    └── feature/UC5-Unit-to-Unit-Conversion
                        └── feature/UC6-Addition-Of-Two-Length-Units
                            └── feature/UC7-Addition-With-Target-Unit-Specification
                                └── feature/UC8-Refactoring-Unit-Enum-To-Standalone
                                    └── feature/UC9-Weight-Measurement
                                        └── feature/UC10-Generic-Quantity-Class-with-Unit-Interface-For-Multi-Category-Support
                                            └── feature/UC11-Volume-Measurement-Equality
                                                └── feature/UC12-Subtraction-and-Division-Operations-on-Quantity-Measurements
                                                    └── feature/UC13-Centralized-Arithmetic-Logic-to-Enforce-DRY-in-Quantity-Operations
                                                        └── feature/UC14-Temperature-Measurement-with-Selective-Arithmetic-Support-and-Measurable-Refactoring
                                                            └── feature/UC15-N-Tier
                                                                └── feature/UC16-Database-Integration-with-JDBC-for-Quantity-Measurement-Persistence
                                                                    └── feature/UC17-Spring-Backend
                                                                        └── feature/UC18-Google-Authentication-and-User-Management-for-Quantity-Measurement
```

## 📌 Use Cases Implemented

### UC1 – Feet Equality
Compare two values in feet for equality.

### UC2 – Feet & Inches Equality
Compare values with different units (1 ft = 12 inches).

### UC3 – Generic Quantity (DRY)
Created reusable class to remove duplicate logic.

### UC4 – Extended Unit Support
Added units like feet, inches, yard, cm.

### UC5 – Unit Conversion
Convert between units (ft ↔ inches, cm, yard).

### UC6 – Addition of Length Units
Add two quantities with same/different units.

### UC7 – Target Unit Addition
Add and return result in desired unit.

### UC8 – Refactoring Unit Enum
Improved design by separating unit logic.

### UC9 – Weight Measurement
Added support for weight units (kg, gram).

### UC10 – Multi-Category Generic Class
Supports multiple categories (length, weight, volume).

### UC11 – Volume Equality
Compare volume units (liters, ml).

### UC12 – Subtraction & Division
Perform arithmetic operations on quantities.

### UC13 – Centralized Arithmetic Logic
Single logic to enforce DRY across operations.

### UC14 – Temperature Measurement
Handle temperature with restricted operations.

### UC15 – N-Tier Architecture
Structured into controller, service, repository layers.

### UC16 – JDBC Database Integration
Store and retrieve data using JDBC.

### UC17 – Spring Backend
Built REST APIs using Spring Boot.

### UC18 – Authentication & User Management
Implemented Spring Security with JWT & OAuth2 (Google Login).

## 📖 Project Overview

This project provides:
- Unit conversion  
- Arithmetic operations  
- Multi-category measurement  
- JDBC database integration  
- Spring Boot APIs  
- Secure authentication (JWT + OAuth2)
