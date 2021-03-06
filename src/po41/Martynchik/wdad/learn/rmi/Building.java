package po41.Martynchik.wdad.learn.rmi;

import java.io.Serializable;

public class Building implements Serializable {
    private String street;
    private int number;

    public Building(String street, int number){
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }
}
