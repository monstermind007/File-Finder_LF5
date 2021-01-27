package com.company;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceFileExtension {
    public static boolean renameFileExtension(String datei, String neueEndung) {
        String ziel;
        String aktuelleEndung = getFileExtension(datei);

        //Überprüft ob die Datei zu beginn überhaupt eine Endung besitzt
        if (aktuelleEndung.equals("")) {
            ziel = datei + "." + neueEndung;
        }
        //Wenn nicht dann wird die Endung geändert.
        else {
            ziel = datei.replaceFirst(Pattern.quote("." + aktuelleEndung) + "$", Matcher.quoteReplacement("." + neueEndung));
        }
        return new File(datei).renameTo(new File(ziel));
    }

    //Schleife -- Ermittelt aktuelle Endung und speichert sie in den String aktuelleEndung
    public static String getFileExtension(String f) {
        String ext = "";
        int i = f.lastIndexOf('.');
        if (i > 0 && i < f.length() - 1) {
            ext = f.substring(i + 1);
        }
        return ext;
    }

    //Main Methode
    public static void main(String args[]) throws Exception {
        System.out.println(ReplaceFileExtension.renameFileExtension("E:/Testdatei.pdf", "##"));
    }
}