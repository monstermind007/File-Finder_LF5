package com.company;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.*;
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

    public static void renameDamaged(){
        Gson gson = new Gson();
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\kaiha_wo2fl1k\\IdeaProjects\\File-Finder_LF5\\Beschädigt.json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            JsonObject json = gson.fromJson(reader, JsonObject.class);
            JsonArray personen = json.getAsJsonArray("einträge");
            JsonObject person = personen.get(0).getAsJsonObject();
            try {
                for (int k = 0; true; k = k + 1) {
                    String defekterPfad = person.get(String.valueOf(k)).getAsString();
                    System.out.println("Defekte Datei "+k+":   "+defekterPfad);
                    ReplaceFileExtension.renameFileExtension(defekterPfad, "testObjekt");
                }
            } catch (Exception e) {
                //System.out.println("End");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Fehler 3");
        }
    }



    public static void renameDamaged(String jsonPfad, String neueEndung){
        Gson gson = new Gson();
        try {
            FileInputStream input = new FileInputStream(jsonPfad);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            JsonObject json = gson.fromJson(reader, JsonObject.class);
            JsonArray personen = json.getAsJsonArray("einträge");
            JsonObject person = personen.get(0).getAsJsonObject();
            try {
                for (int k = 0; true; k = k + 1) {
                    String defekterPfad = person.get(String.valueOf(k)).getAsString();
                    System.out.println("Defekte Datei "+k+":   "+defekterPfad);
                    ReplaceFileExtension.renameFileExtension(defekterPfad, neueEndung);
                }
            } catch (Exception e) {
                //System.out.println("End");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Fehler 3");
        }
    }
}

