# QuantityMeasurementApp

## 🌿 Branch Structure

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

Measurement
📌 Use Cases Implemented
🔹 Basic Features
UC1 – Feet Equality: Compare two values in feet
UC2 – Feet & Inches Equality: Compare values with different units (1 ft = 12 inches)
UC3 – Generic Quantity (DRY): Reusable class to eliminate duplicate logic
UC4 – Extended Unit Support: Added units like feet, inches, yard, cm
UC5 – Unit Conversion: Convert between units (ft ↔ inches, cm, yard)
🔹 Arithmetic Operations
UC6 – Addition of Length Units: Add two quantities
UC7 – Target Unit Addition: Return result in desired unit
UC8 – Refactoring Unit Enum: Improved code structure
UC12 – Subtraction & Division: Perform arithmetic operations
UC13 – Centralized Arithmetic Logic: DRY-based common logic
🔹 Advanced Measurements
UC9 – Weight Measurement: Support for kg, gram
UC10 – Multi-Category Support: Length, weight, volume
UC11 – Volume Equality: Compare volume units
UC14 – Temperature Measurement: Special handling with limited operations
🔹 Architecture & Backend
UC15 – N-Tier Architecture: Controller, Service, Repository layers
UC16 – JDBC Integration: Database persistence
UC17 – Spring Backend: REST APIs using Spring Boot
🔐 Security
UC18 – Authentication & User Management:
Spring Security with JWT & OAuth2 (Google Login)
📖 Project Overview

This project is a Quantity Measurement Application that provides:

✅ Unit comparison and conversion
✅ Arithmetic operations on measurements
✅ Multi-category support (length, weight, volume, temperature)
✅ Database integration using JDBC
✅ RESTful APIs with Spring Boot
✅ Secure authentication using JWT & OAuth2
