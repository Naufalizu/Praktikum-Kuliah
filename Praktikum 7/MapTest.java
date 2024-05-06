/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: MapTest.java
* Deskripsi	: Program yang menggunakan Generic untuk pasangan Kunci-Nilai
*/

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // Kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        // Menempatakan elemen kunci dan nilai 
        map.put(1, "satu");
        map.put(2, "dua");
        // Mengambil elemen pertama 
        System.out.println(map.get(1));
        // Mengambil keseluruhan kunci sebagai objek collection set 
        Set<Integer> key = map.keySet();
    }
}
