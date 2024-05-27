/**
 * File : Mahasiswa.java
 * Deskripsi : Program untuk menampilkan key dan value dari sebuah Map yang berisi NIM dan nama mahasiswa menggunakan ekspresi lambda.
 */

import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class Mahasiswa {
    public static void main(String[] args) {
        // Membuat Map untuk menyimpan NIM dan nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122120018", "Naufal");
        mahasiswaMap.put("24060122120019", "Falizz");
        mahasiswaMap.put("24060122120020", "Budiono");
        mahasiswaMap.put("24060122120022", "Baginda");
        mahasiswaMap.put("24060122120023", "Siti");
        mahasiswaMap.put("24060122120024", "Ahmad");
        mahasiswaMap.put("24060122120025", "Zahra");
        mahasiswaMap.put("24060122120026", "Rizki");
        mahasiswaMap.put("24060122120027", "Diana");
        mahasiswaMap.put("24060122120028", "Indra");

        // Menampilkan key dan value menggunakan ekspresi lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM : " + nim + ", Nama : " + nama));
    }
}
