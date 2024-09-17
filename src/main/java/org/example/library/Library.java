package org.example.library;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    String name;
    HashMap<String,Material> mapDVD;
    HashMap<String,Material> mapBooks;
    HashMap<String,Material> mapMagazine;
    HashMap<String,Material> mapOtherMaterial;
    HashMap<String,HashMap<String,Material>> mapCategoryMaterial;
    ArrayList<String> menuMaterial;

    public Library(String name) {
        this.name = name;
        this.mapDVD = new HashMap<>();
        this.mapBooks = new HashMap<>();
        this.mapMagazine = new HashMap<>();
        this.mapOtherMaterial = new HashMap<>();
        this.mapCategoryMaterial = new HashMap<>();
        this.menuMaterial = new ArrayList<>();
        menuMaterial.add("DVD");
        menuMaterial.add("Books");
        menuMaterial.add("Magazine");
        menuMaterial.add("Other Material");
        this.mapCategoryMaterial.put("Magazine",this.mapMagazine);
        this.mapCategoryMaterial.put("DVD",this.mapDVD);
        this.mapCategoryMaterial.put("Books",this.mapBooks);
        this.mapCategoryMaterial.put("Other Material",this.mapOtherMaterial);
        this.mapDVD.put("Herman",new DVD("Herman"));

    }

    public void run(){
        InputScanner inputUser = new InputScanner();
        System.out.println("Test Library App");
        showMaterialCategoryList();
        System.out.println(getMaterialCategory(menuMaterial.get(Integer.parseInt(inputUser.getInput("Input option:")))).toString());
    }

    private void showMaterialCategoryList(){
        for(int i = 0 ; i <menuMaterial.size(); i++){
            System.out.println(i+". " + menuMaterial.get(i));
        }
    }

    private HashMap<String,Material> getMaterialCategory(String materialName){
        return mapCategoryMaterial.get(materialName);
    }

    private Material chooseAvailableMaterial(HashMap<String,Material> mapMaterial){
        InputScanner inputUser= new InputScanner();
        ArrayList<String> titleList= new ArrayList<>();
        mapMaterial.entrySet().stream().forEach(entry-> titleList.add(entry.getKey()));
        System.out.println("Pick material that you want to see");
        for(int i = 0 ; i <titleList.size(); i++){
            System.out.println(i+". "+titleList.get(i));
        }
        try{
            return mapMaterial.get(titleList.get(Integer.parseInt(inputUser.getInput("Pick the number of material you want to choose:"))));
        }catch (NumberFormatException e){
            System.out.println("Wrong input");
            return null;
        }

    }

    private void addBook(Material inputMaterial){
        this.mapBooks.put(inputMaterial.getTitle(),inputMaterial);
    }







}
