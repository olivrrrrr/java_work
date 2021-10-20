package com.olivertech;

public class Passport {
    private int passportNumber;
    private String name;
    private String passportColor;

    public Passport(int passportNumber, String name, String passportColor){
        this.passportNumber = passportNumber;
        this.name = name;
        this.passportColor = passportColor;
    }

    public int getPassportNumber(){
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber){
         this.passportNumber = passportNumber ;
    }


}
