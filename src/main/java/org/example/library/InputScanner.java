package org.example.library;

import java.util.Scanner;

public class InputScanner {
    public String getInput(String inputPrint){
        Scanner input = new Scanner(System.in);
        System.out.println(inputPrint);
        return(input.nextLine());
    }
}
