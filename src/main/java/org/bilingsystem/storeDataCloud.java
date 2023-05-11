/* In this class we store the Bill Details given as arguments to store it in CloudSQL Database. It stores
*  few important billing details in Cloud for example Bill No, Name of the Customer, Phone No, Prices, taxes,
*  managed by which employee, Date/Time etc.
*  -by Shreya Ghosh */
package org.bilingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class storeDataCloud {

        public storeDataCloud(int BillNo, String name, String phone, Double foodprice, Double tax, Double totalAmount,
                              Connection connection, int id, int NOB) throws SQLException {

            try {
                // Creating SQL Query to upload the details is the Google CloudSQL and the executing them.
                PreparedStatement preparedStatement1 = connection.prepareStatement(String.format(
                        "INSERT INTO BillDetails (idBill,name,phone,date,foodprice,tax,total,empid) " +
                                "VALUES (%d, '%s', '%s', '%s', %f, %f, %f, %d);",
                        BillNo,name,phone,java.time.LocalDate.now().toString(),foodprice,tax,totalAmount,id));
                // Executing the above Query
                if (preparedStatement1.execute() == Boolean.FALSE){
                    System.out.println(String.format("Bill No: %d Successfully Bill data is stored in CloudSQL.", BillNo, id));
                }

                // This Query update the employee table. Which update the number of customer handled by that employee.
                PreparedStatement preparedStatement2 = connection.prepareStatement(String.format(
                        "UPDATE employee SET NOB=%d WHERE id=%d;", NOB+1, id));
                // Once again, executing the above Query
                if (preparedStatement2.execute() == Boolean.FALSE){
                    System.out.println(String.format("Successfully employee table updated for id %d.", id));
                }
                // ResultSet resultSet = preparedStatement.executeQuery();
            } catch (Exception e) {
                // Printing errors, if any kind of error occurs.
                e.printStackTrace();
            }

            // Closing the Connection
            connection.close();
    }
}
