package org.example;

import org.example.library.DVD;
import org.example.library.Material;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Material dvdTest = new DVD("One",2,"Action");
        dvdTest.getTitle();
        System.out.println(dvdTest.getCountAvailabe());

    }
}