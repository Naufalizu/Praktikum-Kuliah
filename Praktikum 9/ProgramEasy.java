/**
 * Nama : Muhammad Naufal Izzudin 
 * NIM : 24060122120018
 * File : ProgramEasy.java
 * Deskripsi : Pengelola file main dalam program 
 */

import java.util.ArrayList;
import java.util.List;

public class ProgramEasy implements IFlyer{
    public static void main(String[] args){
        List<IFlyer> koleksiBisaTerbang;
        koleksiBisaTerbang = new ArrayList<>();
        
        IFlyer superman = new Superman("superman");
        IFlyer superboy = new Superman("superboy");
        IFlyer supergirl = new Superman("supergirl");
        IFlyer merpati = new Bird();
        IFlyer eagle = new Bird();
        
        koleksiBisaTerbang.add(merpati);
        koleksiBisaTerbang.add(eagle);
        koleksiBisaTerbang.add(superman);
        koleksiBisaTerbang.add(supergirl);
        koleksiBisaTerbang.add(superboy);
        
        for (IFlyer bisaTerbang : koleksiBisaTerbang) {
            if (bisaTerbang instanceof Superman) {
                System.out.println("I'm " + ((Superman)bisaTerbang).getName());
                System.out.println("Bangsa : " + bisaTerbang.getClass().getSuperclass().getSimpleName());
                System.out.print("Makan : ");
                ((Animal) bisaTerbang).eat();
                System.out.println();
            }else{
                System.out.println("I'm " + bisaTerbang.getClass().getSimpleName());
                System.out.println("Bisa terbang");
                System.out.print("Makan : ");
                ((Animal) bisaTerbang).eat();
                System.out.println();
            }           
        }
    }  
    

    @Override
    public void takeOff() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void land() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

