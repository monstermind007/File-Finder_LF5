package com.company;

import java.io.File;
import java.io.IOException;


public class Search {
    public static void In(String directoryName ) {
        File dir = new File(directoryName);
        String[] children = dir.list();

        if (children == null) {
            System.out.println("does not exist or is not a directory");
        } else {
            int another = 0;
            int pdf = 0;
            for (int i = 0; i < children.length; i++) {

                if ( (children[i] != null) && children[i].endsWith( ".pdf")) {
                    String filename = children[i];
                    System.out.println(filename);
                    pdf++;
                } else {
                    another++;
                }
            }
            System.out.println("Es existieren " + another + " ander Objekte in diesem Ordner");
            System.out.println("Davon sind " + pdf + " PDF Datein");
        }
    }

    static void showDir(int indent, File file) throws IOException {
        for (int i = 0; i < indent; i++) System.out.print('-');
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++){
                showDir(indent + 4, files[i]);
            }
        }
    }
}
