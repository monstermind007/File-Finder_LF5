package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Search {

    public static void lookInAll(String path, String type) {

        ArrayList < File > files = getPaths(new File(path),
                new ArrayList < File > ());

        if (files == null) return;
        try {
            for (int i = 0; i < files.size(); i++) {
                String h = String.valueOf(files.get(i));
                //boolean result = Files.isHidden(Path.of(h)); // schaut ob es sich um eine versteckten Datei handelt, wird jedoch nicht verwendet

                if (h.endsWith(type)) {
                    allOut(files.get(i).getCanonicalPath(), type);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList < File > getPaths(File file, ArrayList < File > list) {
        if (file == null || list == null || !file.isDirectory())
            return null;
        File[] fileArr = file.listFiles();
        for (File f: fileArr) {
            try {
                if (f.isDirectory()) { // try exept testen
                    getPaths(f, list);
                }
            } catch (Exception e) {
                //System.out.println("Ups an error hase coruptred oder so xD");
            }
            list.add(f);
        }
        return list;
    }
    public static int hi;

    private static void allOut(String path, String type) {
        hi = hi + 1;
        System.out.println(hi + "---" + path);
    }
}