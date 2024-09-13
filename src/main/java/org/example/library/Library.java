package org.example.library;

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

    }

    public void run(){

    }

    private void showMaterialList(){
        for(int i = 0 ; i <menuMaterial.size(); i++){
            System.out.println(i+". " + menuMaterial.get(i));
        }
    }

    private HashMap<String,Material> getMaterial(String materialName){
        return mapCategoryMaterial.get(materialName);
    }






}
