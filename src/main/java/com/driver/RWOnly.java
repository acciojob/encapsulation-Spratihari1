package com.driver;

public class RWOnly {
    private  String name;

    public void readOnly (){

        System.out.println(name);

    }

    public void writeOnly (String n){

        this.name=n;
    }

    
}
