/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: BangunDatar.java
* Deskripsi	: Kelas abstrak, berisi abstraksi bangun datar
*/

public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
}