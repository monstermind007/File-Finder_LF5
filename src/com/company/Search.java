package com.company;

import org.json.JSONObject;
import org.json.JSONArray;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Search {

    public static int hi;
    public static String[] PathArray = new String[200];

    public static void lookInAll(String path, String type) {
        JSONObject pfade = new JSONObject();
        JSONObject main = new JSONObject();
        if(path.endsWith(type)){
            allOut(path);
        }else{
            ArrayList<File> files = getPaths(new File(path),
                    new ArrayList<>());

            if (files == null) return;
            try {
                int id = 0;
                for (File file : files) {
                    String h = String.valueOf(file);
                    //boolean result = Files.isHidden(Path.of(h)); // schaut ob es sich um eine versteckten Datei handelt, wird jedoch nicht verwendet

                    if (h.endsWith(type)) {
                        String pfad = file.getCanonicalPath();
                        boolean damage = Check.damaged(pfad);
                        if (damage) {

                            pfade.put(String.valueOf(id), pfad);
                            id++;

                        }
                        hi++;
                        PathArray[hi] = file.getCanonicalPath();
                        allOut(file.getCanonicalPath());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Fehler 1");
            }
        }
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


    private static ArrayList < File > getPaths(File file, ArrayList < File > list) {
        if (file == null || list == null || !file.isDirectory())
            return null;
        File[] fileArr = file.listFiles();
        assert fileArr != null;
        for (File f: fileArr) {
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



    public static String allOut(String path) {
        System.out.println(hi + "---" + path);
        System.out.println(Check.damaged(path));
        return path;
    }


    public static String[] getArray(){
        return PathArray;
    }

}