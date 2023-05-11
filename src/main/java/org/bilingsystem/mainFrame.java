// -by Subham Das
package org.bilingsystem;

import javax.swing.*;
import java.awt.*;

public class mainFrame extends JFrame {

    Container mainFrameCont;
    public mainFrame() {
        initComponents();
        setTitle("Customer Billing System");
        setSize(Toolkit.getDefaultToolkit().getScreenSize());   // setSize(1920,1080);
        setLocation(0,0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.WHITE);

        mainFrameCont = getContentPane();
        CardLayout layout = new CardLayout();
        mainFrameCont.setLayout(layout);

        loginPanel login = new loginPanel(mainFrameCont, layout);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }

    public static void main(String args[]) {

        // Create and display the form
        java.awt.EventQueue.invokeLater(() -> {
            new mainFrame().setVisible(true);
        });
    }

}
