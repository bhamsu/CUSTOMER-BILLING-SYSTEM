/* In this class we match the given id & password arguments with our Cloud Database stored in
*  Google Cloud Storage(GCS). If they match, the login is successful and the class move help into
*  the next frame that is Homepage/Home Frame.
*  -by Subham Das */
package org.bilingsystem;

import javax.swing.JOptionPane;
import java.awt.*;
import java.sql.*;

public class authentication {

    // The variables are stored in my System Variables, so that the crucial information doesn't get leaked.
    // The variable declared here store the GCS CloudSQL connection information for example user, password, connection ip etc.
    // System.getenv() function used to get the System/Environment Variables of your Local machine.
    private static final String INSTANCE_CONNECTION_NAME = System.getenv("INSTANCE_CONNECTION_NAME");
    private static final String USER = "root"; // System.getenv("GCS_DB_USER");
    private static final String PASSWORD = System.getenv("GCS_USER_PASSWORD");
    private static final String DB = "company"; // System.getenv("GCS_DB");

    // The Connection link
    public static final String CREDENTIAL_STRING = "jdbc:mysql:///" + DB + "?cloudSqlInstance=" + INSTANCE_CONNECTION_NAME + "&socketFactory=com.google.cloud.sql.mysql.SocketFactory&user=" + USER + "&password=" + PASSWORD;

    static Connection connection = null;

    public authentication(Container mainFrameCont, int username, String password){

        try {
            // Connecting with Google Cloud Server
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(CREDENTIAL_STRING);
            System.out.println("Google CloudSQL connection Successfully established!");

            // Running the CloudSQL to execute our Query, specifically we are checking the given id & password is in the database or not
            PreparedStatement preparedStatement = connection.prepareStatement(String.format("SELECT name, NOB FROM employee WHERE id=%d AND password='%s'", username, password));
            ResultSet resultSet = preparedStatement.executeQuery(); // Execution of the Query

            resultSet.next();
            if (resultSet.getString("name") != null) {
                // Successfully Logged In
                System.out.println(String.format("Successfully Logged in by %s.",resultSet.getString("name")));
                JOptionPane.showMessageDialog(null, "Login Successful!!");
                homePanel home = new homePanel(mainFrameCont, connection, username, resultSet.getInt("NOB"));
            } else {
                // Login Failed
                JOptionPane.showMessageDialog(mainFrameCont, "Error: Failed Login!!");
                System.out.println("Login Failed.");
            }

        } catch (Exception e) {
            // Prints any type of Error
            e.printStackTrace();
            // Or maybe Login Failed for any other reason.
            System.out.println("Login Failed.");
            JOptionPane.showMessageDialog(mainFrameCont, "Error: Failed Login!!");

        }
    }

    public static void main() {
        // new authentication();
    }
}
