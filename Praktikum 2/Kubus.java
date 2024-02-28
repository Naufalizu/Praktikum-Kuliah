/* Program   : Kubus.java */
/* Deskripsi : File modul operasi Kubus */
/* NIM & Nama  : 24060122120018 & Muhammad Naufal Izzudin */
/* Tanggal   : 28 Februari 2024 *
/***********************************/

public class Kubus{
	private double Sisi;
	
	public Kubus(double Sisi){
		this.Sisi = Sisi;
	}
	
	public double hitungVolume(){
		return Sisi * Sisi * Sisi;
	}
	
	public double hitungLuasPermukaan(){
		return 6 * Sisi * Sisi;
	}
}