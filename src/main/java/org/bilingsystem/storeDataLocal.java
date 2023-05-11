/* In this class we store the Bill Details given as arguments to store in Local MySQL Database. It stores
 *  few important billing details in Cloud for example Bill No, Name of the Customer, Phone No, Prices, taxes,
 *  managed by which employee, Date/Time etc.
 *  -by Shivam */
package org.bilingsystem;

import java.sql.*;

public class storeDataLocal {

    private static final String db = "company";
    private static final String user = "root";
    private static final String password = "18180612";

    public storeDataLocal(int BillNo, String name, String phone, Double foodprice, Double tax, Double totalAmount, int id) {

        Connection connection = null;
        int status = -1;

        // This try-catch block check weather the Database exist or not. If not then it creates a database for its use.
        try {
            // Establishing the Connection with Local MySQL Server.
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db, user, password);
            System.out.println("Local SQL connection Successfully established !");

            // Checking the Local Database exist or not.
            PreparedStatement preparedStatement = connection.prepareStatement("USE " + db);
            if (preparedStatement.execute() == Boolean.FALSE){
                System.out.println(String.format("Using Local Database '%s'...", db));
            }
        } catch (SQLException e) {

            // If the Local MySQL Database is not present, then it creates itself.
            try {
                // Establishing the Connection with Local MySQL Server.
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", user, password);
                System.out.println("Local SQL connection Successfully established !");
                System.out.println("Local Database does not exist !!!");

                // Creating the Database if it doesn't exist.
                Statement statement = connection.createStatement();
                status = statement.executeUpdate("CREATE DATABASE " + db);
                if (status > 0) {
                    System.out.println("Local Database is created successfully...");
                    PreparedStatement preparedStatement = connection.prepareStatement("USE " + db);
                    if (preparedStatement.execute() == Boolean.FALSE){
                        System.out.println(String.format("Using Local Database '%s'...", db));
                    }
                }

                // Creating the table if it doesn't exist.
                Statement statement1 = connection.createStatement();
                status = statement1.executeUpdate("CREATE TABLE BillDetails (" +
                        "idBill INT NOT NULL, " +
                        "name VARCHAR(45) NULL, " +
                        "phone VARCHAR(10) NULL, " +
                        "date VARCHAR(10) NULL, " +
                        "foodprice DECIMAL(9,2) NULL, " +
                        "tax DECIMAL(8,2) NULL, " +
                        "total DECIMAL(10,2) NULL, " +
                        "empid INT NULL, PRIMARY KEY (idBill));");
                if (status == 0) {
                    System.out.println("Table for storing Bill Details is created successfully...)");
                }

            } catch (SQLException e2){
                e.printStackTrace();
            }
        }

        // This try-catch block checks the Table exist or not. If not then it creates one.
        try {
            // If this block runs, then it means the required Table already exists inside the database
            // This block is the manages the preparing of the Query for Inserting the information's in the Table
            PreparedStatement preparedStatement = connection.prepareStatement(String.format(
                    "INSERT INTO billdetails (idBill,name,phone,date,foodprice,tax,total,empid) " +
                            "VALUES (%d, '%s', '%s', '%s', %f, %f, %f, %d);",
                    BillNo,name,phone,java.time.LocalDate.now().toString(),foodprice,tax,totalAmount,id));
            if (preparedStatement.execute() == Boolean.FALSE){
                System.out.println(String.format("Bill No: %d Successfully Bill data is stored in Local SQL Database.", BillNo, id));
            }

        } catch (SQLException e) {
            // Otherwise, it runs Query to Create the required Table inside the database.
            System.out.println("Table for storing Bill Details does not exist !!!");
            try {
                // Preparing Query to Create Table.
                Statement statement1 = connection.createStatement();
                status = statement1.executeUpdate("CREATE TABLE BillDetails (" +
                        "idBill INT NOT NULL, " +
                        "name VARCHAR(45) NULL, " +
                        "phone VARCHAR(10) NULL, " +
                        "date VARCHAR(10) NULL, " +
                        "foodprice DECIMAL(9,2) NULL, " +
                        "tax DECIMAL(8,2) NULL, " +
                        "total DECIMAL(10,2) NULL, " +
                        "empid INT NULL, PRIMARY KEY (idBill));");
                if (status == 0) {
                    System.out.println("Table for storing Bill Details is created successfully...)");
                }
                // Query for Inserting the information's in the Table
                PreparedStatement preparedStatement = connection.prepareStatement(String.format(
                        "INSERT INTO billdetails (idBill,name,phone,date,foodprice,tax,total,empid) " +
                                "VALUES (%d, '%s', '%s', '%s', %f, %f, %f, %d);",
                        BillNo,name,phone,java.time.LocalDate.now().toString(),foodprice,tax,totalAmount,id));
                if (preparedStatement.execute() == Boolean.FALSE) {
                    System.out.println(String.format("Bill No: %d Successfully Bill data is stored in Local SQL Database.", BillNo, id));
                }

            } catch (SQLException e2) {
                // printing the Errors
                e2.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // new storeData();
    }
}
