package org.bilingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class authentication {

    // private static final String INSTANCE_CONNECTION_NAME = System.getenv("INSTANCE_CONNECTION_NAME");
    // private static final String USER = System.getenv("GCS_DB_USER");
    // private static final String PASSWORD = System.getenv("GCS_USER_PASSWORD");
    // private static final String DB = System.getenv("GCS_DB");
    // public static final String CREDENTIAL_STRING = "jdbc:mysql:///" + DB + "?cloudSqlInstance=" + INSTANCE_CONNECTION_NAME + "&socketFactory=com.google.cloud.sql.mysql.SocketFactory&user=" + USER + "&password=" + PASSWORD;

    public static final String CREDENTIAL_STRING = "jdbc:mysql:///company?cloudSqlInstance=customer-billing-system-384019:asia-south1:billing-system&socketFactory=com.google.cloud.sql.mysql.SocketFactory&user=root&password=alpha-romeo@Ramdev69";
    static Connection connection = null;

    public authentication(String username, String password){
        // System.out.println(PASSWORD);
        // Get a new datasource from the method we defined before

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(CREDENTIAL_STRING);

            /*PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }*/
        } catch (Exception e) {
            // TODO:
            e.printStackTrace();
        }
    }

    public static void main() {
        // new authentication();
    }
}
