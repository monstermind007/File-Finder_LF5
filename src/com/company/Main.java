package com.company;

import java.security.PublicKey;

public class Main {

    public static void main(String[] args){
        Search.lookInAll("C:\\Users\\techc\\OneDrive\\Dokumente\\PDF\\Bewerbungsanschreiben.pdf",".pdf");// Schau was alles existiert und Filtere
        //Kann paar Sekunden dauern
        Search.lookInAll("C:\\Users\\techc\\OneDrive",".pdf");// Schau was alles existiert und Filtere
        //Kann paar Sekunden dauern (Ab C:\Users\techc\ löbt es bei mir )

        System.out.println(Check.damaged("C:\\test.pdf"));
    }
}
