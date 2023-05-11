/* This class is mainly responsible for the generation Bill invoice (we can see it in the Right Hand side of
 *  the homepage). It gets all the arguments, and put them accordingly into the Invoice. And Later it also responsible
 *  for saving the invoice in a particular folder for any further use. We can extend it further to print the invoice also.
 *  -by Amit */
package org.bilingsystem;

import javax.swing.*;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class receipt {

    // Building the upper portion of the invoice, which is kind of fixed for every invoice.
    public receipt(JTextArea textArea, int BillNo, String name, String phone, String[] fooditem, double[] costing, double[] quantity, Double foodprice, Double tax, Double totalAmount) throws PrinterException {
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
                BillNo, java.time.LocalDate.now().toString(), name, phone));
        // Adding all the order food items in the invoice.
        for (int i = 0; i < 13; i++) {
            if (fooditem[i] == null) {
                break;
            } else {
                textArea.setText(textArea.getText() + String.format("" +
                        " %s\t%s    %s\t         %s \n",
                        fooditem[i], Double.toString(quantity[i]), Double.toString(costing[i]), Double.toString(costing[i] * quantity[i])));
            }
        }

        // Adding the Final text into the Invoice
        textArea.setText(textArea.getText() + String.format("" +
                " Total\t\t                          %s \n " +
                "Tax\t\t                             %s \n " +
                "Grand Total\t\t                     %s \n " +
                "  --------------------------------------------------------------------------- \n " +
                "                  ~ Developed by the UEM Students ~ ",
                Double.toString(foodprice), Double.toString(tax), Double.toString(totalAmount)));

        // textArea.print();

        // Creating PDF document instance
        Document doc = new Document();
        try
        {
            // Generate a PDF at the specified location
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(System.getProperty("user.dir") + "\\bills\\" + BillNo + ".pdf"));
            System.out.println("PDF created.");
            // Opens the PDF
            doc.open();
            // Adds paragraph to the PDF file
            doc.add(new Paragraph(textArea.getText()));
            // Close the PDF file
            doc.close();
            // Closes the writer
            writer.close();
        }
        catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        // System.out.println("Hello!!");
    }
}
