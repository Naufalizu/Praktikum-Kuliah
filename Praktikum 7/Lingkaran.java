/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: Lingkaran.java
* Deskripsi	: Implementasi lingkaran sebagai BangunDatar
*/

public class Lingkaran extends BangunDatar{
    private double jejari;
    
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    
    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
    
}
