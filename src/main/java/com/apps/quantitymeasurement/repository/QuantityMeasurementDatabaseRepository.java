package com.apps.quantitymeasurement.repository;

import com.apps.quantitymeasurement.entity.QuantityMeasurementEntity;
import com.apps.quantitymeasurement.util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuantityMeasurementDatabaseRepository
        implements IQuantityMeasurementRepository {

    private final ConnectionPool pool = ConnectionPool.getInstance();

    @Override
    public void save(QuantityMeasurementEntity entity) {

        String sql = "INSERT INTO quantity_measurement " +
                "(type, operation, value1, value2, result) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = pool.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, entity.getType());
            stmt.setString(2, entity.getOperation());
            stmt.setString(3, entity.getValue1());
            stmt.setString(4, entity.getValue2());
            stmt.setBoolean(5, entity.isResult());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<QuantityMeasurementEntity> getAllMeasurements() {

        List<QuantityMeasurementEntity> list = new ArrayList<>();

        try (Connection conn = pool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM quantity_measurement")) {

            while (rs.next()) {
                list.add(new QuantityMeasurementEntity(
                        rs.getString("type"),
                        rs.getString("operation"),
                        rs.getString("value1"),
                        rs.getString("value2"),
                        rs.getBoolean("result")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    @Override
    public int getTotalCount() {

        try (Connection conn = pool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM quantity_measurement")) {

            rs.next();
            return rs.getInt(1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteAll() {

        try (Connection conn = pool.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate("DELETE FROM quantity_measurement");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}