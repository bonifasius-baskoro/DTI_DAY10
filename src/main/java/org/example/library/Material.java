package org.example.library;

public class Material {

    String title;
    int quota;
    int countBorrow;
    boolean isAvailabe;

    int countAvailable;

    public boolean isAvailabe() {
        return isAvailabe;
    }

    public Material(String title, int quota) {
        this.title = title;
        this.quota = quota;
        this.countBorrow = 0;
        this.countAvailable = quota;
        if(quota <= 0 ){
            this.isAvailabe = false;
        }else{
            this.isAvailabe=true;
        }

    }

    public Material(String title){
        this.title = title;
        this.quota = 0;
        this.countBorrow = 0;
        this.countAvailable = quota;
        this.isAvailabe= false;
    }

    public String getTitle() {
        return title;
    }

    public int getCountAvailabe(){
        return this.countAvailable;
    }

    public boolean borrowThis(int quotaRequest){
        if(quotaRequest>this.countAvailable){
            System.out.println("Insufficient amount of material");
            return false;
        }
        if(quotaRequest <= 0 ){
            System.out.println("Input the right amount");
            return false;
        }
        else{
            this.countAvailable -= quotaRequest;
            this.countBorrow += quotaRequest;
            if(this.countAvailable==0){
                this.isAvailabe = false;
            }
            return true;
        }
    }
}
