/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: ArrayListTest.java
* Deskripsi	: Program penggunaan objek ArrayList sebagai Collection class 
*/

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        System.out.println("Menambah elemen");
        strings.add("praktikum");
        strings.add("collections");
        strings.add("generik");
        // Iterasi pada keseluruhan ArrayList
        for(String s : strings) {
            System.out.print(s + " \n");
        }
        System.out.println("Menghapus elemen");
        strings.remove("praktikum");
        // Iterasi pada keseluruhan ArrayList
        for(String s : strings) {
            System.out.print(s + " \n");
        }
    }
}
