package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class ProductDatabase {
    public static void main(String[] args) throws SQLException {
        try {
            forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
        try (Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/shanthi", "root", "root")) {
            String createTable = "CREATE TABLE products" +
                    "(id INT AUTOINCREMENT PRIMARY KEY," +
                    "product_id INT" +
                    "product_name VARCHAR(255)," +
                    "Product_desription VARCHAR(255)," +
                    "product_price Double NoT NULL)";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(createTable);
            }
            String insertData = "insert into products" +
                    "(product_id,product_name,Product_desription,product_price)values(1234,'laptop','hp laptop',70000.00)";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(insertData);
            }System.out.println("product database is create successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
