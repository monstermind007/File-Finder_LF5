package com.company;
import java.io.File;
import java.awt.Desktop;


public class CheckMain {

    public static void main(String[]args) {

        try {

            File pdfFile = new File("c:\\test.pdf");
            if (pdfFile.exists()) {

                if (Desktop.isDesktopSupported()) {
                    //Desktop.getDesktop().open(pdfFile);
                    System.out.println("File Found!");
                } else {
                    System.out.println("Awt Desktop is not supported!");
                }

            } else {
                System.out.println("File is not exists!");
            }

            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
