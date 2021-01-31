package com.company;

import org.json.JSONObject;
import org.json.JSONArray;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Search {

    public static int hi;
    ///////////////////////////////////////////////////////////
//Michel
    public static ArrayList<String> PathArray = new ArrayList<String>();
    public static ArrayList<String> PathArrayDamaged = new ArrayList<String>();

    ///////////////////////////////////////////////////////////
    public static void lookInAll(String path, String type) {
        JSONObject pfade = new JSONObject();
        JSONObject main = new JSONObject();
        if (path.endsWith(type)) {
        } else {
            ArrayList<File> files = getPaths(new File(path),
                    new ArrayList<>());

            if (files == null) return;
            try {
                int id = 0;
                for (File file : files) {
                    String h = String.valueOf(file);
                    //boolean result = Files.isHidden(Path.of(h)); // schaut ob es sich um eine versteckten Datei handelt, wird jedoch nicht verwendet

                    if (h.endsWith(type)) {
///////////////////////////////////////////////////////////
//Michel
                        String pfad = file.getCanonicalPath();
                        boolean damage = Check.damaged(pfad);
                        if (damage) {
                            pfade.put(String.valueOf(id), pfad);
                            PathArrayDamaged.add(pfad);
                            id++;
                        } else {
                            PathArray.add(pfad);
                        }
                        hi++;
///////////////////////////////////////////////////////////
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Fehler 1");
            }
        }
///////////////////////////////////////////////////////////
//Michel
        JSONArray listenName = new JSONArray();
        listenName.put(pfade);
        main.put("einträge", listenName);

        try (FileWriter file = new FileWriter("Beschädigt.json")) {
            file.write(main.toString());
            file.flush();
        } catch (IOException e) {
            System.out.println("JSON Schreibfehler");
        }

    }
///////////////////////////////////////////////////////////

    private static ArrayList<File> getPaths(File file, ArrayList<File> list) {
        if (file == null || list == null || !file.isDirectory())
            return null;
        File[] fileArr = file.listFiles();
        assert fileArr != null;
        for (File f : fileArr) {
            try {
                if (f.isDirectory()) { // try exept testen
                    getPaths(f, list);
                }
            } catch (Exception e) {
                //System.out.println("Fehler 2");
                //System.out.println("Ups an error hase coruptred oder so xD");
            }
            list.add(f);
        }
        return list;
    }
}