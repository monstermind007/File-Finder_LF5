package com.company;

import java.io.IOException;
import java.security.PublicKey;
import java.io.File;

public class Main {

    public static void main(String[] args) throws IOException {

        Search.In("C:\\Users\\techc\\OneDrive\\Dokumente\\PDF"); // Schau was alles existiert
        Search.showDir(1, new File("C:\\Users\\techc\\OneDrive\\Dokumente\\PDF"));
    }
}
