package org.bilingsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class loginPanel extends JPanel {

    JLabel welcomeLabel;
    JLabel useridLabel;
    JLabel passwordLabel;
    JTextField useridText;
    JPasswordField passwordText;
    JButton submitBtn;

    public loginPanel(Container mainFrameCont, CardLayout layout) {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());   // setSize(1920,1080);
        setLocation(0,0);
        setBackground(Color.WHITE);
        setLayout(null);
        mainFrameCont.add(this, "1");

        // Setting all the Labels in the Frame
        // Welcome Label...
        welcomeLabel = new JLabel("Hi, Welcome...");
        welcomeLabel.setBounds(440,180,1000,64);
        welcomeLabel.setBackground(Color.BLACK);
        welcomeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 64));
        this.add(welcomeLabel);

        // UserId Label...
        useridLabel = new JLabel("UserId");
        useridLabel.setBounds(500,300, 200,32);
        useridLabel.setBackground(Color.BLACK);
        useridLabel.setFont((new Font("Segoe UI", Font.PLAIN, 28)));
        this.add(useridLabel);

        // Password Label...
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(449,350, 200,32);
        passwordLabel.setBackground(Color.BLACK);
        passwordLabel.setFont((new Font("Segoe UI", Font.PLAIN, 32)));
        this.add(passwordLabel);


        // Setting all the Text & Password Fields in the Frame
        // User Id Text Filed...
        useridText = new JTextField();
        useridText.setBounds(600,300, 200,32);
        useridText.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        useridText.setForeground(Color.GRAY);
        useridText.setBackground(Color.WHITE);
        useridText.setBorder(BorderFactory.createLineBorder(Color.black));
        useridText.setEditable(true);
        this.add(useridText);

        // Password Field...
        passwordText = new JPasswordField();
        passwordText.setBounds(600,350, 200,32);
        passwordText.setFont(new Font("Segoe UI", Font.PLAIN, 30));
        passwordText.setForeground(Color.GRAY);
        passwordText.setBackground(Color.WHITE);
        passwordText.setBorder(BorderFactory.createLineBorder(Color.black));
        this.add(passwordText);


        // Setting all the Buttons in the Frame
        // Submit Button...
        ImageIcon submitIcon = new ImageIcon("C:\\Users\\SUBHAM DAS\\OneDrive\\Desktop\\newProj\\Management System\\CustomerBillingSystem\\resources\\submit icon.png");
        // ImageIcon submitIcon = new ImageIcon("./../../../../resources/submit icon.png");
        Image img = submitIcon.getImage();
        Image newImg = img.getScaledInstance(122, 52,  java.awt.Image.SCALE_SMOOTH); // resizing the image icon
        submitIcon = new ImageIcon(newImg);
        submitBtn = new JButton(submitIcon);
        submitBtn.setBounds(570,430,120,50);
        submitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.add(submitBtn);

        // Working with Submit Button of Login Page
        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homePanel home = new homePanel(mainFrameCont, layout);
                authentication auth = new authentication(useridText.getText(), passwordText.getText());
                layout.show(mainFrameCont,"2");   // layout.next(mainFrameCont);
            }
        });

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("Hi, Welcome...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(222, Short.MAX_VALUE))
        );
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
}
