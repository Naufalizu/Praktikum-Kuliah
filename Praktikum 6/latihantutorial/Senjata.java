/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: Senjata.java
* Deskripsi	: File yang menurunkan class ke kontrolSenjata 
*/

package latihantutorial;

public class Senjata {

    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
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
    
    public boolean isMenusuk() {
        return menusuk;
    }
    
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
