/**
 * Nama : Muhammad Naufal Izzudin 
 * NIM : 24060122120018
 * File : Bird.java
 * Deskripsi : Pengelola bird dalam program 
 */

public class Bird extends Animal implements IFlyer{
    public Bird(){}
    
    @Override
    public void takeOff(){}
    
    @Override
    public void land(){}
    
    @Override
    public void fly(){}
    
    public void buildNest(){}
    
    public void layEggs(){}
    
    @Override
    public void eat(){
        System.out.println("Makanan Burung");
    }
}

