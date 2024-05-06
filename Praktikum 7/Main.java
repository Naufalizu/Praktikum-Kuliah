/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: Main.java
* Deskripsi	: Main class untuk generic Kupu
*/

public class Main {
    public static void main(String[] args) {
        // Kamus
        Ulat K;
        Data<Kupu> anu;
       
        // Algoritma 
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
    } 
}
