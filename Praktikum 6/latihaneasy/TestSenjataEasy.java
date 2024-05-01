/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: TestSenjataEasy.java
* Deskripsi	: File main dari objek SenjataEasy 
*/

package latihaneasy;

public class TestSenjataEasy {
    
    public static void main(String[] args) {
        SenjataEasy ak47 = new SenjataEasy("TAR");
        SenjataEasy m16 = new SenjataEasy("DOR");
        
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru ");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}