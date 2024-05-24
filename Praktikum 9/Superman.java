/**
 * Nama : Muhammad Naufal Izzudin 
 * NIM : 24060122120018
 * File : Superman.java
 * Deskripsi : Pengelola superman dalam program 
 */

public class Superman extends Kryptonian implements IFlyer {
    private String name;
    
    public Superman(String name){
        this.name = name;
    }
    
    @Override
    public void takeOff(){}
    
    @Override
    public void land(){}
    
    @Override
    public void fly(){}
    
    public void leapBuilding(){}
    
    public void stopBullet(){}
    
    @Override
    public void eat(){
        System.out.println("Nasi Goreng");
    }
    
    public String getName() {
        return this.name = name;
    }  
}
