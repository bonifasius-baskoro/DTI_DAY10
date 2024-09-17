package org.example;

import org.example.library.DVD;
import org.example.library.Library;
import org.example.library.Material;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,DVD> testMap = new HashMap<>();
        DVD testDvd  = new DVD("Herman");
        testMap.put("Herman", testDvd);
        System.out.println(testMap.get("Herman").getGenre());
        Library testLibrary = new Library("Library Test");
//        testLibrary.run();



    }
}