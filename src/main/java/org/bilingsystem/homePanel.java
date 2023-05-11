/* In this class, all the UI of Homepage/Home Frame is designed & coded. Few buttons in the class calls
*  other Classes like for storing the bill details both in local as well cloud database.
*  -by Soumi Roy */
package org.bilingsystem;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class homePanel extends JPanel {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField textField_20;
    private JTextField textField_21;
    private JTextField textField_22;
    private JTextField textField_23;

    public homePanel(Container mainFrameCont, Connection connection, int id, int NOB) {

        JPanel contentPane = new JPanel();
        contentPane.setForeground(new Color(0, 128, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        // initComponents();



        mainFrameCont.add(contentPane,"2");
        //setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setSize(Toolkit.getDefaultToolkit().getScreenSize());

        JLabel lblNewLabel = new JLabel("CUSTOMER BILLING SYSTEM");
        lblNewLabel.setForeground(new Color(0, 128, 255));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        lblNewLabel.setBounds(380, -14, 498, 69);
        contentPane.add(lblNewLabel);

        JSeparator separator = new JSeparator();
        separator.setBounds(26, 42, 1215, 6);
        contentPane.add(separator);

        JLabel lblNewLabel_1 = new JLabel("Name:");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_1.setBounds(55, 59, 64, 26);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField.setBounds(129, 59, 180, 26);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Phone No:");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_2.setBounds(459, 58, 140, 26);
        contentPane.add(lblNewLabel_2);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_1.setBounds(609, 59, 180, 26);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Address:");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_3.setBounds(912, 60, 79, 22);
        contentPane.add(lblNewLabel_3);

        textField_2 = new JTextField();
        textField_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_2.setBounds(1028, 60, 180, 26);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(26, 96, 1218, 6);
        contentPane.add(separator_1);

        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(26, 105, 422, 319);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_4 = new JLabel("FOOD ITEMS");
        lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_4.setBounds(167, 11, 141, 21);
        panel.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Qty:");
        lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_5.setBounds(367, 35, 57, 18);
        panel.add(lblNewLabel_5);

        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(30, 35, 377, 2);
        panel.add(separator_2);

        JLabel lblNewLabel_6 = new JLabel("1. Starters");
        lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6.setBounds(10, 67, 102, 14);
        panel.add(lblNewLabel_6);

        textField_3 = new JTextField();
        textField_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_3.setBounds(354, 64, 58, 20);
        panel.add(textField_3);
        textField_3.setColumns(10);

        String s[]= {"SELECT",
                "French Fries      ",
                "Paneer Pakoda     ",
                "Paneer Tikka      ",
                "Paneer 65         ",
                "Chicken Kebab     ",
                "Drums of Heaven   ",
                "Chicken 65        ",
                "Fish Finger       ",
                "Fish Fry          ",
                "Fish Kabiraji     "};

        JComboBox comboBox = new JComboBox(s);
        comboBox.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox.setBounds(132, 63, 194, 22);
        panel.add(comboBox);

        JLabel lblNewLabel_6_1 = new JLabel("2. Burger");
        lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_1.setBounds(10, 90, 102, 22);
        panel.add(lblNewLabel_6_1);

        String burg[]= {"SELECT",
                "Veg Patty Burger  ",
                "Paneer Tikka Burge",
                "Grilled Chicken Bu",
                "BBQ Ham Burger    "};

        JComboBox comboBox_1 = new JComboBox(burg);
        comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_1.setBounds(132, 90, 194, 22);
        panel.add(comboBox_1);

        textField_4 = new JTextField();
        textField_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_4.setColumns(10);
        textField_4.setBounds(354, 91, 58, 20);
        panel.add(textField_4);

        JLabel lblNewLabel_6_2 = new JLabel("3. Pizza");
        lblNewLabel_6_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_2.setBounds(10, 121, 102, 14);
        panel.add(lblNewLabel_6_2);

        String p[]= {"SELECT",
                "Corn Cheese Pizza ",
                "Malai Paneer Pizza",
                "Farmhouse         ",
                "Chicken Fiesta    ",
                "Barbecue Chicken  ",
                "Chicken Dominator ",
                "Chicken Maximus   "};

        JComboBox comboBox_2 = new JComboBox(p);
        comboBox_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_2.setBounds(132, 117, 194, 22);
        panel.add(comboBox_2);

        textField_5 = new JTextField();
        textField_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_5.setColumns(10);
        textField_5.setBounds(354, 118, 58, 20);
        panel.add(textField_5);

        JLabel lblNewLabel_6_3 = new JLabel("4. Pasta");
        lblNewLabel_6_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_3.setBounds(10, 146, 128, 14);
        panel.add(lblNewLabel_6_3);

        String pas[]= {"SELECT",
                "Veggie Pasta      ",
                "Brown Pasta       ",
                "Spicy Arabiatta   ",
                "White Sauce Pasta ",
                "Chicken Sausage Pa",
                "Mexican Pasta     ",
                "Chicken Alfredo Pa"};

        JComboBox comboBox_3 = new JComboBox(pas);
        comboBox_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_3.setBounds(132, 142, 194, 22);
        panel.add(comboBox_3);

        textField_6 = new JTextField();
        textField_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_6.setColumns(10);
        textField_6.setBounds(354, 145, 58, 20);
        panel.add(textField_6);

        JLabel lblNewLabel_6_4 = new JLabel("5. Sandwich");
        lblNewLabel_6_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_4.setBounds(10, 175, 102, 14);
        panel.add(lblNewLabel_6_4);

        String sand[]= {"SELECT",
                "Cheese Sandwich   ",
                "Club Sandwich     ",
                "Corn Cheese Sandwi",
                "Chicken Sandwich  ",
                "Mutton Sandwich   ",
                "Ham Sandwich      ",
                "Grilled Chicken Pa",
                "Bacon Panini      "};

        JComboBox comboBox_4 = new JComboBox(sand);
        comboBox_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_4.setBounds(132, 171, 194, 22);
        panel.add(comboBox_4);

        textField_7 = new JTextField();
        textField_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_7.setColumns(10);
        textField_7.setBounds(354, 172, 58, 20);
        panel.add(textField_7);

        JLabel lblNewLabel_6_5 = new JLabel("6. Biriyani");
        lblNewLabel_6_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_5.setBounds(10, 200, 102, 22);
        panel.add(lblNewLabel_6_5);

        String b[]= {"SELECT",
                "Chicken Biriyani  ",
                "Chicken Spl Biriya",
                "Mutton Biriyani   ",
                "Mutton Spl Biriyan",
                "Paneer Tikka Biriy"};

        JComboBox comboBox_5 = new JComboBox(b);
        comboBox_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_5.setBounds(132, 200, 194, 22);
        panel.add(comboBox_5);

        textField_8 = new JTextField();
        textField_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_8.setColumns(10);
        textField_8.setBounds(354, 201, 58, 20);
        panel.add(textField_8);

        JLabel lblNewLabel_6_6 = new JLabel("7. Staples");
        lblNewLabel_6_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_6.setBounds(10, 231, 102, 18);
        panel.add(lblNewLabel_6_6);

        String stap[]= {"SELECT",
                "Steamed Rice      ",
                "Jeera Rice        ",
                "Kashmiri Pulao    ",
                "Rotti             ",
                "Plain Naan        ",
                "Butter Naan       ",
                "Laccha Paratha    ",
                "Masala Kulcha     ",
                "Amritsari Kulcha  "};

        JComboBox comboBox_6 = new JComboBox(stap);
        comboBox_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_6.setBounds(132, 229, 194, 22);
        panel.add(comboBox_6);

        textField_9 = new JTextField();
        textField_9.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_9.setColumns(10);
        textField_9.setBounds(354, 228, 58, 20);
        panel.add(textField_9);

        JLabel lblNewLabel_6_7 = new JLabel("8. Side Dishes");
        lblNewLabel_6_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_7.setBounds(10, 263, 115, 14);
        panel.add(lblNewLabel_6_7);

        String c[]= {"SELECT",
                "Chilli Paneer     ",
                "Shahi Paneer      ",
                "Paneer Butter Masa",
                "Chilli Chichen    ",
                "Chicken Manchurian",
                "Butter Chicken    ",
                "Chichen Tikka Masa",
                "Mutton Kasha      ",
                "Mutton Dopiaza    ",
                "Mutton Dakbunglow "};

        JComboBox comboBox_7 = new JComboBox(c);
        comboBox_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_7.setBounds(132, 259, 194, 22);
        panel.add(comboBox_7);

        textField_10 = new JTextField();
        textField_10.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_10.setColumns(10);
        textField_10.setBounds(354, 260, 58, 20);
        panel.add(textField_10);

        JLabel lblNewLabel_6_7_1 = new JLabel("9. Dessert");
        lblNewLabel_6_7_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_7_1.setBounds(10, 292, 102, 14);
        panel.add(lblNewLabel_6_7_1);

        String des[]= {"SELECT",
                "Sizzling Brownie  ",
                "Wonder Waffle     ",
                "Chocolate Pudding ",
                "Caramel Pudding   ",
                "Ecstasy Sundae    ",
                "Chocolate Mouse   "};

        JComboBox comboBox_7_1 = new JComboBox(des);
        comboBox_7_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_7_1.setBounds(132, 288, 194, 22);
        panel.add(comboBox_7_1);

        textField_11 = new JTextField();
        textField_11.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_11.setColumns(10);
        textField_11.setBounds(354, 289, 58, 20);
        panel.add(textField_11);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_1.setBounds(469, 105, 415, 319);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_7 = new JLabel("DRINKS");
        lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_7.setBounds(166, 5, 84, 21);
        panel_1.add(lblNewLabel_7);

        JSeparator separator_3 = new JSeparator();
        separator_3.setBounds(49, 37, 338, 3);
        panel_1.add(separator_3);

        JLabel lblNewLabel_5_1 = new JLabel("Qty:");
        lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_5_1.setBounds(344, 37, 57, 18);
        panel_1.add(lblNewLabel_5_1);

        JLabel lblNewLabel_6_8 = new JLabel("1. Coffee");
        lblNewLabel_6_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_8.setBounds(10, 70, 102, 14);
        panel_1.add(lblNewLabel_6_8);

        String cof[]= {"SELECT",
                "Espresso          ",
                "Americano         ",
                "Latte             ",
                "Cupaccino         ",
                "Irish Coffee      ",
                "Dalgona           ",
                "Freddo            ",
                "Affogato          ",
                "Mocha             "};

        JComboBox comboBox_8 = new JComboBox(cof);
        comboBox_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_8.setBounds(122, 66, 194, 22);
        panel_1.add(comboBox_8);

        textField_12 = new JTextField();
        textField_12.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_12.setColumns(10);
        textField_12.setBounds(344, 67, 57, 20);
        panel_1.add(textField_12);

        JLabel lblNewLabel_6_8_1 = new JLabel("2. Tea");
        lblNewLabel_6_8_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_8_1.setBounds(10, 99, 102, 14);
        panel_1.add(lblNewLabel_6_8_1);

        String tea[]= {"SELECT",
                "Green Tea         ",
                "Black Tea         ",
                "Ice Tea           "};

        JComboBox comboBox_8_1 = new JComboBox(tea);
        comboBox_8_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_8_1.setBounds(122, 95, 194, 22);
        panel_1.add(comboBox_8_1);

        textField_13 = new JTextField();
        textField_13.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_13.setColumns(10);
        textField_13.setBounds(344, 96, 57, 20);
        panel_1.add(textField_13);

        JLabel lblNewLabel_6_8_2 = new JLabel("3. Shakes");
        lblNewLabel_6_8_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_8_2.setBounds(10, 128, 102, 14);
        panel_1.add(lblNewLabel_6_8_2);

        String sha[]= {"SELECT",
                "Chocolate Milkshak",
                "Banana Milkshake  ",
                "Strawberry Milksha",
                "Banana Milkshake  ",
                "Mango Milkshake   "};
        JComboBox comboBox_8_2 = new JComboBox(sha);
        comboBox_8_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_8_2.setBounds(122, 124, 194, 22);
        panel_1.add(comboBox_8_2);

        textField_14 = new JTextField();
        textField_14.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_14.setColumns(10);
        textField_14.setBounds(344, 125, 57, 20);
        panel_1.add(textField_14);

        JLabel lblNewLabel_6_8_3 = new JLabel("4. Beverage");
        lblNewLabel_6_8_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_8_3.setBounds(10, 157, 102, 21);
        panel_1.add(lblNewLabel_6_8_3);

        String be[]= {"SELECT",
                "Mineral Water     ",
                "Aerated Soft Drink",
                "Fresh Lime        ",
                "Ginger Ale        ",
                "Red Bull          "};

        JComboBox comboBox_8_3 = new JComboBox(be);
        comboBox_8_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_8_3.setBounds(122, 153, 194, 22);
        panel_1.add(comboBox_8_3);

        textField_15 = new JTextField();
        textField_15.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_15.setColumns(10);
        textField_15.setBounds(344, 154, 57, 20);
        panel_1.add(textField_15);

        JLabel lblNewLabel_6_8_3_1 = new JLabel("5. Mocktail");
        lblNewLabel_6_8_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_6_8_3_1.setBounds(10, 186, 102, 14);
        panel_1.add(lblNewLabel_6_8_3_1);

        String moc[]= {"SELECT",
                "Virgin Mojito     ",
                "Watermelon Mojito ",
                "Blue Lagoon       ",
                "Margarita         ",
                "Pina Colada       ",
                "Purple Rain       ",
                "Delight Punch     "};

        JComboBox comboBox_8_3_1 = new JComboBox(moc);
        comboBox_8_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        comboBox_8_3_1.setBounds(122, 182, 194, 22);
        panel_1.add(comboBox_8_3_1);

        textField_22 = new JTextField();
        textField_22.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_22.setColumns(10);
        textField_22.setBounds(344, 183, 57, 20);
        panel_1.add(textField_22);

        JLabel lblNewLabel_8 = new JLabel("Cost of Meal:");
        lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_8.setBounds(26, 435, 117, 14);
        contentPane.add(lblNewLabel_8);

        textField_16 = new JTextField();
        textField_16.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_16.setBounds(149, 435, 160, 20);
        contentPane.add(textField_16);
        textField_16.setColumns(10);

        JLabel lblNewLabel_9 = new JLabel("Cost of Drinks:");
        lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_9.setBounds(479, 435, 133, 14);
        contentPane.add(lblNewLabel_9);

        textField_17 = new JTextField();
        textField_17.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_17.setBounds(609, 435, 140, 20);
        contentPane.add(textField_17);
        textField_17.setColumns(10);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Home Delivery");
        chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 18));
        chckbxNewCheckBox.setBounds(26, 464, 151, 23);
        contentPane.add(chckbxNewCheckBox);

        JLabel lblNewLabel_10 = new JLabel("Cost of Delivery:");
        lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_10.setBounds(185, 466, 172, 19);
        contentPane.add(lblNewLabel_10);

        textField_18 = new JTextField();
        textField_18.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_18.setBounds(336, 465, 79, 20);
        contentPane.add(textField_18);
        textField_18.setColumns(10);

        JLabel lblNewLabel_11 = new JLabel("TAX:");
        lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_11.setBounds(459, 468, 49, 14);
        contentPane.add(lblNewLabel_11);

        textField_19 = new JTextField();
        textField_19.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_19.setBounds(518, 465, 96, 20);
        contentPane.add(textField_19);
        textField_19.setColumns(10);

        JLabel lblNewLabel_12 = new JLabel("Total Amount:");
        lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_12.setBounds(646, 466, 127, 19);
        contentPane.add(lblNewLabel_12);

        textField_20 = new JTextField();
        textField_20.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textField_20.setBounds(783, 463, 96, 20);
        contentPane.add(textField_20);
        textField_20.setColumns(10);

        JSeparator separator_4 = new JSeparator();
        separator_4.setToolTipText("");
        separator_4.setBounds(26, 492, 870, 6);
        contentPane.add(separator_4);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(903, 139, 326, 495);
        contentPane.add(textArea);

        String[] fooditem = new  String[13];
        double[] costing = new double[13];
        double[] quantity = new double[13];

        JButton btnNewButton = new JButton("Meal & Drinks Amount");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double cost=0.0,cost1=0.0,cost2=0.0,cost3=0.0,cost4=0.0,cost5=0.0,cost6=0.0,cost7=0.0,cost8=0.0,cost9=0.0,cost10=0.0,cost11=0.0,cost12=0.0,cost13=0.0;
                int qty,qty1,qty2,qty3,qty4,qty5,qty6,qty7,qty8,qty9,qty10,qty11,qty12,qty13;
                int counter = 0;

                //CODE FOR FOOD ITEMS

                String item=(String)comboBox.getSelectedItem();
                if(item.equals("SELECT")){
                    qty=0;
                    textField_3.setText(""+qty);
                    cost=0.0;
                }
                else{
                    qty=Integer.parseInt(textField_3.getText());
                    if(item.equals("French Fries      ")){
                        cost=80.0;
                    }
                    else if(item.equals("Paneer Pakoda     ")){
                        cost=120.0;
                    }
                    else if(item.equals("Paneer Tikka      ")){
                        cost=60.0;
                    }
                    else if(item.equals("Paneer 65         ")){
                        cost=170.0;
                    }
                    else if(item.equals("Chicken Kebab     ")){
                        cost=200.0;
                    }
                    else if(item.equals("Drums of Heaven   ")){
                        cost=250.0;
                    }
                    else if(item.equals("Chicken 65        ")){
                        cost=230.0;
                    }
                    else if(item.equals("Fish Finger       ")){
                        cost=80.0;
                    }
                    else if(item.equals("Fish Fry          ")){
                        cost=70.0;
                    }
                    else if(item.equals("Fish Kabiraji     ")){
                        cost=90.0;
                    }
                    fooditem[counter] = item;
                    costing[counter] = cost;
                    quantity[counter] = qty;
                    counter++;
                }

                String item1=(String)comboBox_1.getSelectedItem();

                if(item1.equals("SELECT")){
                    qty1=0;
                    textField_4.setText(""+qty1);
                    cost1=0.0;
                }
                else{
                    qty1=Integer.parseInt(textField_4.getText());
                    if(item1.equals("Veg Patty Burger  ")){
                        cost1=100.0;
                    }
                    else if(item1.equals("Paneer Tikka Burge")){
                        cost1=150.0;
                    }
                    else if(item1.equals("Grilled Chicken Bur")){
                        cost1=200.0;
                    }
                    else if(item1.equals("BBQ Ham Burger     ")){
                        cost1 = 250.0;
                    }
                    fooditem[counter] = item1;
                    costing[counter] = cost1;
                    quantity[counter] = qty1;
                    counter++;
                }

                String item2=(String)comboBox_2.getSelectedItem();

                if(item2.equals("SELECT")){
                    qty2=0;
                    textField_5.setText(""+qty2);
                    cost2=0.0;
                }
                else{
                    qty2=Integer.parseInt(textField_5.getText());
                    if(item2.equals("Corn Cheese Pizza ")){
                        cost2=150.0;
                    }
                    else if(item2.equals("Malai Paneer Pizza")){
                        cost2=150.0;
                    }
                    else if(item2.equals("Farmhouse         ")){
                        cost2=160.0;
                    }
                    else if(item2.equals("Chicken Fiesta    ")){
                        cost2 = 200.0;
                    }
                    else if(item2.equals("Barbecue Chicken  ")){
                        cost2=250.0;
                    }
                    else if(item2.equals("Chicken Dominator ")){
                        cost2=300.0;
                    }
                    else if(item2.equals("Chicken Maximus   ")){
                        cost2=350.0;
                    }
                    fooditem[counter] = item2;
                    costing[counter] = cost2;
                    quantity[counter] = qty2;
                    counter++;
                }

                String item3=(String)comboBox_3.getSelectedItem();

                if(item3.equals("SELECT")){
                    qty3=0;
                    textField_6.setText(""+qty3);
                    cost3=0.0;
                }
                else{
                    qty3=Integer.parseInt(textField_6.getText());
                    if(item3.equals("Veggie Pasta      ")){
                        cost3=150.0;
                    }
                    else if(item3.equals("Brown Pasta       ")){
                        cost3=150.0;
                    }
                    else if(item3.equals("Spicy Arabiatta   ")){
                        cost3=160.0;
                    }
                    else if(item3.equals("White Sauce Pasta ")){
                        cost3 = 200.0;
                    }
                    else if(item3.equals("Chicken Sausage Pa")){
                        cost3=250.0;
                    }
                    else if(item3.equals("Mexican Pasta     ")){
                        cost3=300.0;
                    }
                    else if(item3.equals("Chicken Alfredo Pas")){
                        cost3=350.0;
                    }
                    fooditem[counter] = item3;
                    costing[counter] = cost3;
                    quantity[counter] = qty3;
                    counter++;
                }
                String item4=(String)comboBox_4.getSelectedItem();

                if(item4.equals("SELECT")){
                    qty4=0;
                    textField_7.setText(""+qty4);
                    cost4=0.0;
                }
                else{
                    qty4=Integer.parseInt(textField_7.getText());
                    if(item4.equals("Cheese Sandwich   ")){
                        cost4=70.0;
                    }
                    else if(item4.equals("Club Sandwich     ")){
                        cost4=80.0;
                    }
                    else if(item4.equals("Corn Cheese Sandwi")){
                        cost4=100.0;
                    }
                    else if(item4.equals("Chicken Sandwich  ")){
                        cost4 = 120.0;
                    }
                    else if(item4.equals("Mutton Sandwich   ")){
                        cost4=130.0;
                    }
                    else if(item4.equals("Ham Sandwich      ")){
                        cost4=150.0;
                    }
                    else if(item4.equals("Grilled Chicken Pa")){
                        cost4=200.0;
                    }
                    else if(item4.equals("Bacon Panini      ")){
                        cost4=230.0;
                    }
                    fooditem[counter] = item4;
                    costing[counter] = cost4;
                    quantity[counter] = qty4;
                    counter++;
                }

                String item5=(String)comboBox_5.getSelectedItem();

                if(item5.equals("SELECT")){
                    qty5=0;
                    textField_8.setText(""+qty5);
                    cost5=0.0;
                }
                else{
                    qty5=Integer.parseInt(textField_8.getText());
                    if(item5.equals("Chicken Biriyani  ")){
                        cost5=200.0;
                    }
                    else if(item5.equals("Chicken Spl Biriya")){
                        cost5=250.0;
                    }
                    else if(item5.equals("Mutton Biriyani   ")){
                        cost5=230.0;
                    }
                    else if(item5.equals("Mutton Spl Biriyan")){
                        cost5 = 260.0;
                    }
                    else if(item5.equals("Paneer Tikka Biriy")){
                        cost5=180.0;
                    }
                    fooditem[counter] = item5;
                    costing[counter] = cost5;
                    quantity[counter] = qty5;
                    counter++;
                }

                String item6=(String)comboBox_6.getSelectedItem();

                if(item6.equals("SELECT")){
                    qty6=0;
                    textField_9.setText(""+qty6);
                    cost6=0.0;
                }
                else{
                    qty6=Integer.parseInt(textField_9.getText());
                    if(item6.equals("Steamed Rice      ")){
                        cost6=90.0;
                    }
                    else if(item6.equals("Jeera Rice        ")){
                        cost6=150.0;
                    }
                    else if(item6.equals("Kashmiri Pulao    ")){
                        cost6=180.0;
                    }
                    else if(item6.equals("Rotti             ")){
                        cost6 = 40.0;
                    }
                    else if(item6.equals("Plain Naan        ")){
                        cost6=120.0;
                    }
                    else if(item6.equals("Butter Naan       ")){
                        cost6=130.0;
                    }
                    else if(item6.equals("Laccha Paratha    ")){
                        cost6=140.0;
                    }
                    else if(item6.equals("Masala Kulcha     ")){
                        cost6=150.0;
                    }
                    else if(item6.equals("Amritsari Kulcha ")){
                        cost6=180.0;
                    }
                    fooditem[counter] = item6;
                    costing[counter] = cost6;
                    quantity[counter] = qty6;
                    counter++;
                }

                String item7=(String)comboBox_7.getSelectedItem();

                if(item7.equals("SELECT")){
                    qty7=0;
                    textField_10.setText(""+qty7);
                    cost7=0.0;
                }
                else{
                    qty7=Integer.parseInt(textField_10.getText());
                    if(item7.equals("Chilli Paneer     ")){
                        cost7=150.0;
                    }
                    else if(item6.equals("Shahi Paneer      ")){
                        cost7=180.0;
                    }
                    else if(item7.equals("Paneer Butter Masa")){
                        cost7=180.0;
                    }
                    else if(item7.equals("Chilli Chichen     ")){
                        cost7 = 200.0;
                    }
                    else if(item7.equals("Chicken Manchurian")){
                        cost7=210.0;
                    }
                    else if(item7.equals("Butter Chicken     ")){
                        cost7=230.0;
                    }
                    else if(item7.equals("Chichen Tikka Masal")){
                        cost7=250.0;
                    }
                    else if(item7.equals("Mutton Kasha       ")){
                        cost7=280.0;
                    }
                    else if(item7.equals("Mutton Dopiaza     ")) {
                        cost7=300.0;
                    }
                    else if(item7.equals("Mutton Dakbunglow  ")){
                        cost7=320.0;
                    }
                    fooditem[counter] = item7;
                    costing[counter] = cost7;
                    quantity[counter] = qty7;
                    counter++;
                }

                String item8=(String)comboBox_7_1.getSelectedItem();

                if(item8.equals("SELECT")){
                    qty8=0;
                    textField_11.setText(""+qty8);
                    cost8=0.0;
                }
                else{
                    qty8=Integer.parseInt(textField_11.getText());
                    if(item8.equals("Sizzling Brownie  ")){
                        cost8=150.0;
                    }
                    else if(item8.equals("Wonder Waffle     ")){
                        cost8=180.0;
                    }
                    else if(item8.equals("Chocolate Pudding ")){
                        cost8=180.0;
                    }
                    else if(item8.equals("Caramel Pudding   ")){
                        cost8 = 200.0;
                    }
                    else if(item8.equals("Ecstasy Sundae    ")){
                        cost8=210.0;
                    }
                    else if(item8.equals("Chocolate Mouse   ")){
                        cost8=230.0;
                    }
                    fooditem[counter] = item8;
                    costing[counter] = cost8;
                    quantity[counter] = qty8;
                    counter++;
                }

                //CODE FOR DRINKS-----------


                String item9=(String)comboBox_8.getSelectedItem();

                if(item9.equals("SELECT")){
                    qty9=0;
                    textField_12.setText(""+qty9);
                    cost9=0.0;
                }
                else{
                    qty9=Integer.parseInt(textField_12.getText());
                    if(item9.equals("Espresso          ")){
                        cost9=100.0;
                    }
                    else if(item9.equals("Americano         ")){
                        cost9=120.0;
                    }
                    else if(item9.equals("Latte             ")){
                        cost9=140.0;
                    }
                    else if(item9.equals("Cupaccino         ")){
                        cost9=155.0;
                    }
                    else if(item9.equals("Irish Coffee      ")){
                        cost9=165.0;
                    }
                    else if(item9.equals("Dalgona           ")){
                        cost9=175.0;
                    }
                    else if(item9.equals("Freddo            ")){
                        cost9=180.0;
                    }
                    else if(item9.equals("Affogato          ")){
                        cost9=185.0;
                    }
                    else if(item9.equals("Mocha             ")){
                        cost9=200.0;
                    }
                    fooditem[counter] = item9;
                    costing[counter] = cost9;
                    quantity[counter] = qty9;
                    counter++;
                }

                String item10=(String)comboBox_8_1.getSelectedItem();

                if(item10.equals("SELECT")){
                    qty10=0;
                    textField_13.setText(""+qty10);
                    cost10=0.0;
                }
                else{
                    qty10=Integer.parseInt(textField_13.getText());
                    if(item10.equals("Green Tea         ")){
                        cost10=50.0;
                    }
                    else if(item10.equals("Black Tea         ")){
                        cost10=55.0;
                    }
                    else if(item10.equals("Ice Tea           ")){
                        cost10=60.0;
                    }
                    fooditem[counter] = item10;
                    costing[counter] = cost10;
                    quantity[counter] = qty10;
                    counter++;
                }

                String item11=(String)comboBox_8_2.getSelectedItem();;

                if(item11.equals("SELECT")){
                    qty11=0;
                    textField_14.setText(""+qty11);
                    cost11=0.0;
                }
                else{
                    qty11=Integer.parseInt(textField_14.getText());
                    if(item11.equals("Chocolate Milkshake")){
                        cost11=90.0;
                    }
                    else if(item11.equals("Banana Milkshake   ")){
                        cost11=90.0;
                    }
                    else if(item11.equals("Strawberry Milkshak")){
                        cost11=90.0;
                    }
                    else if(item11.equals("Mango Milkshake    ")){
                        cost11= 90.0;
                    }
                    fooditem[counter] = item11;
                    costing[counter] = cost11;
                    quantity[counter] = qty11;
                    counter++;
                }

                String item12=(String)comboBox_8_3.getSelectedItem();;

                if(item12.equals("SELECT")){
                    qty12=0;
                    textField_15.setText(""+qty12);
                    cost12=0.0;
                }
                else{
                    qty12=Integer.parseInt(textField_15.getText());
                    if(item12.equals("Mineral Water     ")){
                        cost12=60.0;
                    }
                    else if(item12.equals("Aerated Soft Drink")){
                        cost12=90.0;
                    }
                    else if(item12.equals("Fresh Lime        ")){
                        cost12=60.0;
                    }
                    else if(item12.equals("Ginger Ale        ")){
                        cost12= 100.0;
                    }
                    else if(item12.equals("Red Bull          ")){
                        cost12= 120.0;
                    }
                    fooditem[counter] = item12;
                    costing[counter] = cost12;
                    quantity[counter] = qty12;
                    counter++;
                }

                String item13=(String)comboBox_8_3_1.getSelectedItem();;

                if(item13.equals("SELECT")){
                    qty13=0;
                    textField_22.setText(""+qty13);
                    cost13=0.0;
                }
                else{
                    qty13=Integer.parseInt(textField_22.getText());
                    if(item13.equals("Virgin Mojito     ")){
                        cost13=100.0;
                    }
                    else if(item13.equals("Watermelon Mojito ")){
                        cost13=120.0;
                    }
                    else if(item13.equals("Blue Lagoon       ")){
                        cost13=150.0;
                    }
                    else if(item13.equals("Margarita         ")){
                        cost13=170.0;
                    }
                    else if(item13.equals("Pina Colada       ")){
                        cost13=180.0;
                    }
                    else if(item13.equals("Purple Rain       ")){
                        cost13= 190.0;
                    }
                    else if(item13.equals("Delight Punch     ")){
                        cost13=200.0;
                    }
                    fooditem[counter] = item13;
                    costing[counter] = cost13;
                    quantity[counter] = qty13;
                    counter++;
                }


                double totalmeal=cost*qty + cost1*qty1 + cost2*qty2 + cost3*qty3 + cost4*qty4 + cost5*qty5 + cost6*qty6 + cost7*qty7 + cost8*qty8;
                double totaldrinks=cost9*qty9 + cost10*qty10 + cost11*qty11 + cost12*qty12 + cost13*qty13;
                textField_16.setText(""+totalmeal);
                textField_17.setText(""+totaldrinks);
            }
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
        btnNewButton.setBounds(36, 509, 297, 46);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Delivery  & TAX Amount");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chckbxNewCheckBox.isSelected()==true){
                    double cost=50.0;
                    textField_18.setText(""+cost);
                }
                else{
                    double x=0.0;
                    textField_18.setText(""+x);
                }
                double tax1=Double.parseDouble(""+textField_16.getText());
                double tax2=Double.parseDouble(""+textField_17.getText());
                double totaltax=16*(tax1+tax2)/100;
                textField_19.setText(""+totaltax);
            }
        });
        btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        btnNewButton_1.setBounds(357, 509, 309, 46);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Total Amount");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double amt1=Double.parseDouble(""+textField_16.getText());
                double amt2=Double.parseDouble(""+textField_17.getText());
                double amt3=Double.parseDouble(""+textField_18.getText());
                double amt4=Double.parseDouble(""+textField_19.getText());
                double totalamount=amt1+amt2+amt3+amt4;
                int totalamount1=(int)(totalamount);
                textField_20.setText(""+totalamount1);
            }
        });
        btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        btnNewButton_2.setBounds(707, 509, 151, 46);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("CLEAR");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                textField_4.setText("");
                textField_5.setText("");
                textField_6.setText("");
                textField_7.setText("");
                textField_8.setText("");
                textField_9.setText("");
                textField_10.setText("");
                textField_11.setText("");
                textField_12.setText("");
                textField_13.setText("");
                textField_14.setText("");
                textField_15.setText("");
                textField_16.setText("");
                textField_17.setText("");
                textField_18.setText("");
                textField_19.setText("");
                textField_20.setText("");
                textField_21.setText("");
                textField_22.setText("");
                comboBox.setSelectedItem("SELECT");
                comboBox_1.setSelectedItem("SELECT");
                comboBox_2.setSelectedItem("SELECT");
                comboBox_3.setSelectedItem("SELECT");
                comboBox_4.setSelectedItem("SELECT");
                comboBox_5.setSelectedItem("SELECT");
                comboBox_6.setSelectedItem("SELECT");
                comboBox_7.setSelectedItem("SELECT");
                comboBox_7_1.setSelectedItem("SELECT");
                comboBox_8.setSelectedItem("SELECT");
                comboBox_8_1.setSelectedItem("SELECT");
                comboBox_8_3.setSelectedItem("SELECT");
                comboBox_8_3_1.setSelectedItem("SELECT");
                textArea.append("");
            }
        });
        btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        btnNewButton_3.setBounds(73, 566, 133, 46);
        contentPane.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Generate Receipt & Display");

        btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        btnNewButton_4.setBounds(309, 566, 305, 46);
        contentPane.add(btnNewButton_4);


        JButton btnNewButton_5 = new JButton("EXIT");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
        btnNewButton_5.setBounds(731, 566, 89, 46);
        contentPane.add(btnNewButton_5);

        JSeparator separator_5 = new JSeparator();
        separator_5.setBackground(new Color(0, 0, 0));
        separator_5.setBounds(979, 139, 1, 386);
        contentPane.add(separator_5);

        JLabel lblNewLabel_13 = new JLabel("Bill Receipt:");
        lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_13.setBackground(new Color(240, 240, 240));
        lblNewLabel_13.setBounds(1028, 102, 109, 26);
        contentPane.add(lblNewLabel_13);


        JLabel lblNewLabel_14 = new JLabel("Bill No:");
        lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_14.setBounds(26, 17, 76, 17);
        contentPane.add(lblNewLabel_14);

        textField_21 = new JTextField();
        textField_21.setFont(new Font("Times New Roman", Font.BOLD, 16));
        textField_21.setBounds(96, 16, 96, 20);
        contentPane.add(textField_21);
        textField_21.setColumns(10);

        String str = "";
        try {
            File bill = new File(System.getProperty("user.dir") + "\\src\\main\\java\\org\\bilingsystem\\" + "billno.txt");
            Scanner data = new Scanner(bill);
            str = Integer.toString(Integer.parseInt(data.nextLine())+1);
            textField_21.setText(str);
            textField_21.setEditable(false);

            FileWriter bill2 = new FileWriter(bill);
            // bill2.write(Integer.parseInt(data.nextLine()) + 1 +"\n"+ (Integer.parseInt(data.nextLine()) + 1) +"\n"+ (Integer.parseInt(data.nextLine()) + 1)+"\n"+(Integer.parseInt(data.nextLine()) + 1)+"\n"+(Integer.parseInt(data.nextLine()) + 1));
            bill2.write(str);
            bill2.close();

            data.close();
        } catch (FileNotFoundException e) {
            System.out.println("An exception occurred!!");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JLabel lblNewLabel_15 = new JLabel("Date:");
        lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_15.setBounds(1057, 19, 49, 14);
        contentPane.add(lblNewLabel_15);

        textField_23 = new JTextField();
        textField_23.setFont(new Font("Times New Roman", Font.BOLD, 16));
        textField_23.setBounds(1116, 16, 79, 20);
        contentPane.add(textField_23);
        textField_23.setColumns(10);
        textField_23.setText(java.time.LocalDate.now().toString());
        textField_23.setEditable(false);

        // Right side Bill space initial Text
        String finalStr = str;
        textArea.setText(String.format("\n" +
                        "                   INVOICE \n " +
                        " ========================================== \n " +
                        "   Bill No. :  %d \n" +
                        "    Date    :  %s \n" +
                        "    Name    :  %s \n" +
                        "    Phone   :  %s \n" +
                        "    Address :  N/A\n" +
                        " ========================================== \n " +
                        " Food item\t\tQty    Rate\t         Amount \n " +
                        " --------------------------------------------------------------------------- \n ",
                        Integer.parseInt(finalStr), java.time.LocalDate.now().toString(), textField.getText(), textField_1.getText()));

        btnNewButton_4.addActionListener(new ActionListener() {
            // Action performed after pressing "Generate Receipt & Display" Button
            @Override
            public void actionPerformed(ActionEvent e) {
                Double total = Double.parseDouble(textField_16.getText()) + Double.parseDouble(textField_17.getText()) + Double.parseDouble(textField_18.getText());
                try {

                    // Calling the storeDataCloud Class for storing the data into cloud
                    storeDataCloud strDtCloud = new storeDataCloud(Integer.parseInt(finalStr), textField.getText(), textField_1.getText(), total, Double.parseDouble(textField_19.getText()),Double.parseDouble(textField_20.getText()), connection, id, NOB);

                    // Calling the storeDataLocal Class for storing the data into local MySQL
                    storeDataLocal strDtLocal = new storeDataLocal(Integer.parseInt(finalStr), textField.getText(), textField_1.getText(), total, Double.parseDouble(textField_19.getText()),Double.parseDouble(textField_20.getText()), id);

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

                try {

                    // Calling the receipt Class for creating the bill invoice.
                    receipt rcpt = new receipt(textArea, Integer.parseInt(finalStr), textField.getText(), textField_1.getText(), fooditem, costing, quantity, total, Double.parseDouble(textField_19.getText()),Double.parseDouble(textField_20.getText()));
                } catch (PrinterException ex) {
                    ex.printStackTrace();
                }
            }

        });


    }
}
