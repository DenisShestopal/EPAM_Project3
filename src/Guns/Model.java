package Guns;

import java.util.Map;

/**
 * Created by Deniska on 7/6/2016.
 */
public class Model {
    String model;
    int handy;
    String handyStr;

        String fullRange;
        int killRange;
        boolean cagePresent;
        int cage;
        boolean optic;
        String material;


        String origin;
        String color;
        double price;

    public Model(){

    }
    public void setModel(String name){
        this.model=name;
    }
    public void setHandy(int value){
        this.handy=value;
    }
    public void setHandyStr(String name){
        this.handyStr=name;
    }
    public void setFullRange(String fullRange){
        this.fullRange=fullRange;
    }
    public void setKillRange(int value){
        this.killRange=value;
    }public void setCagePresent(boolean cagePresent){
        this.cagePresent=cagePresent;
    }public void setCage(int cage){
        this.cage=cage;
    }public void setOptic(boolean optic){
        this.optic=optic;
    }
    public void setMaterial(String material){
        this.material=material;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setPrice(double price){
        this.price=price;
    }





}

class Main{
    public static void main(String ... args){

    }
}


