/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: BangunDatarGenericTest.java
* Deskripsi	: Main class untuk generic BangunDatar
*/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingakran : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
    }   
}
