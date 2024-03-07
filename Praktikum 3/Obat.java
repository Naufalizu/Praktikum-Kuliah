/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: Obat.java
* Deskripsi	: Program file untuk mengatur Obat 
*/

public class Obat{
	private String nama;
	private boolean tersedia;
	
	public Obat(String nama){
		this.nama = nama;
		tersedia = true;
	}
	
	public String getNama(){
		return nama;
	}
	
	public boolean isTersedia(){
		return tersedia;
	}
	
	public void setTersedia(boolean tersedia){
		this.tersedia = tersedia;
	}
}