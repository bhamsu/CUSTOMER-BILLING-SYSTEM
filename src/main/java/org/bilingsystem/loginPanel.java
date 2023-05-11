/* This class is for the Login Page. Each and every element of the design is coded here, except the
*  authentication part. For that, we have written a dedicated class.
*  -by Daipayan Saha */

package org.bilingsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class loginPanel extends JPanel {

    public loginPanel(Container mainFrameCont, CardLayout layout) {

        // Initializing the main window specifications
        setSize(Toolkit.getDefaultToolkit().getScreenSize());   // setSize(1920,1080);
        setLocation(0,0);
        setBackground(Color.WHITE);
        setLayout(null);
        mainFrameCont.add(this, "1");

        // Setting all the Labels in the Frame
        // Welcome Label...
        JLabel welcomeLabel = new JLabel("Hi, Welcome...");
        welcomeLabel.setBounds(440,180,1000,64);
        welcomeLabel.setBackground(Color.BLACK);
        welcomeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 64));
        this.add(welcomeLabel);

        // UserId Label...
        JLabel useridLabel = new JLabel("UserId");
        useridLabel.setBounds(500,300, 200,32);
        useridLabel.setBackground(Color.BLACK);
        useridLabel.setFont((new Font("Segoe UI", Font.PLAIN, 28)));
        this.add(useridLabel);

        // Password Label...
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(449,350, 200,32);
        passwordLabel.setBackground(Color.BLACK);
        passwordLabel.setFont((new Font("Segoe UI", Font.PLAIN, 32)));
        this.add(passwordLabel);


        // Setting all the Text & Password Fields in the Frame
        // User Id Text Filed...
        JTextField useridText = new JTextField();
        useridText.setBounds(600,300, 200,32);
        useridText.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        useridText.setForeground(Color.GRAY);
        useridText.setBackground(Color.WHITE);
        useridText.setBorder(BorderFactory.createLineBorder(Color.black));
        useridText.setEditable(true);
        this.add(useridText);

        // Password Field...
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(600,350, 200,32);
        passwordText.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        passwordText.setForeground(Color.GRAY);
        passwordText.setBackground(Color.WHITE);
        passwordText.setEchoChar('*');
        passwordText.setBorder(BorderFactory.createLineBorder(Color.black));
        this.add(passwordText);

        // Show Password Check button
        JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
        chckbxNewCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        chckbxNewCheckBox.setBackground(Color.WHITE);
        chckbxNewCheckBox.setBounds(595, 400, 120, 15);
        this.add(chckbxNewCheckBox);
        chckbxNewCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chckbxNewCheckBox.isSelected()) {
                    // Show Password
                    passwordText.setEchoChar((char)0);
                } else {
                    // Replace Password with `*`
                    passwordText.setEchoChar('*');
                }
            }
        });


        // Setting all the Buttons in the Frame
        // Submit Button...
        ImageIcon submitIcon = new ImageIcon(System.getProperty("user.dir") + "\\resources\\submit icon.png");
        Image img = submitIcon.getImage();
        Image newImg = img.getScaledInstance(122, 52,  java.awt.Image.SCALE_SMOOTH); // resizing the image icon
        submitIcon = new ImageIcon(newImg);
        JButton submitBtn = new JButton(submitIcon);
        submitBtn.setBounds(570,430,120,50);
        submitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(submitBtn);

        // Working with Submit Button of Login Page
        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calling the authentication class to match the id & password for login.
                authentication auth = new authentication(mainFrameCont, Integer.parseInt(useridText.getText()), passwordText.getText());
                layout.show(mainFrameCont,"2");   // layout.next(mainFrameCont);
            }
        });
    }
}
