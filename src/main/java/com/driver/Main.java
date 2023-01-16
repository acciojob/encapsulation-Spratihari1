package com.driver;

public class Main {
public static void main(String[] args){
    RWOnly obj= new RWOnly();
    obj.writeOnly ("sandeep");
    obj.readOnly ();
    //'name' has private access in 'com.driver.RWOnly'


}


}