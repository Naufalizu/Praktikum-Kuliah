/* Program   : MKubus.java */
/* Deskripsi : File main modul Kubus */
/* NIM & Nama  : 24060122120018 & Muhammad Naufal Izzudin */
/* Tanggal   : 28 Februari 2024 *
/*****************************/

public class MKubus{
	public static void main(String[] args){
		Kubus kubus = new Kubus(4.0);
		Kubus kubus1 = new Kubus(10.0);
		
		System.out.println("Volume Kubus : " + kubus.hitungVolume());
		System.out.println("Luas Permukaan Kubus : " + kubus.hitungLuasPermukaan());
		
		System.out.println("Volume Kubus1 : " + kubus1.hitungVolume());
		System.out.println("Luas Permukaan Kubus1 : " + kubus1.hitungLuasPermukaan());
	}	
}