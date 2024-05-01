/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: testSenjata.java
* Deskripsi	: File main dari objek Senjata dan kontrolSenjata 
*/

package latihantutorial;

public class testSenjata {
    
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        kontrolSenjata kontrolAK47 = new kontrolSenjata(ak47);
        kontrolSenjata kontrolM16 = new kontrolSenjata(m16);
        
        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);
        kontrolAK47.tampilkanSisaPeluru();
       
        System.out.println("=========================");
        
        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.menembak(2);
        kontrolM16.tampilkanSisaPeluru();
    }
}


