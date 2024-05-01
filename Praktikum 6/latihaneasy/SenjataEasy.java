/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: SenjataEasy.java
* Deskripsi	: representasi dasar dari objek SenjataEasy 
*/

package latihaneasy;

public class SenjataEasy {
    
    private String bunyi;
    private int peluru;
    
    public SenjataEasy(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    
    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    } 
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }    
    
    public void menembak(){
         System.out.println(getBunyi());
         setPeluru(getPeluru() - 1);
         System.out.println("Peluru sisa: " + getPeluru());
    }
     
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
}
