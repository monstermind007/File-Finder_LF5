package com.company;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceFileExtension {
    public static boolean renameFileExtension(String datei, String neueEndung) {
        String ziel;
        String aktuelleEndung = "pdf";

        //Ändert die Endung
        ziel = datei.replaceFirst(Pattern.quote("." + aktuelleEndung) + "$", Matcher.quoteReplacement("." + neueEndung));
        return new File(datei).renameTo(new File(ziel));
    }


    //Main Methode
    public static void main(String args[]) throws Exception {
        System.out.println(ReplaceFileExtension.renameFileExtension("E:/Testdatei.pdf", "##"));
    }
}

