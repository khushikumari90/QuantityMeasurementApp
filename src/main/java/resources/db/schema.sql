CREATE TABLE IF NOT EXISTS quantity_measurement (

    id INT PRIMARY KEY AUTO_INCREMENT,

    type VARCHAR(50),

    operation VARCHAR(50),

    value1 VARCHAR(50),

    value2 VARCHAR(50),

    result BOOLEAN,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);