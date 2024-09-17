package org.example.library;

public class DVD extends  Material{

    String genre;
    public DVD(String title, int quota) {
        super(title, quota);
    }

    public DVD(String title) {
        super(title);
    }
    public DVD(String title, int quota, String genre){
        super(title,quota);
        this.genre= genre;
    }

    public String getGenre() {
        return genre;
    }
}
