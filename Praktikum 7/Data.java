/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: Data.java
* Deskripsi	: Kelas konstruksi Data
*/

public class Data<T> {
    private T isi;
    T getIsi() {
        return this.isi;
    }
    
    void setIsi(T x) {
        this.isi = x;
    } 
}