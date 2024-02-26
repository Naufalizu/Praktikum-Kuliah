/* Program   : MGaris.java */
/* Deskripsi : File main modul Garis */
/* NIM & Nama  : 24060122120018 & Muhammad Naufal Izzudin */
/* Tanggal   : 26 Februari 2024 *
/***********************************/

public class MGaris{
	public static void main(String[] args){
		
		Titik titik1 = new Titik(2, 3);
		Titik titik2 = new Titik(5, 7);
		
		Garis garis1 = new Garis(titik1, titik2);
		
		// Objek Garis 
		System.out.println("Titik Awal: (" + garis1.getTitikAwal().getAbsis() + ", " + garis1.getTitikAwal().getOrdinat() + ")");
		System.out.println("Titik Akhir: (" + garis1.getTitikAkhir().getAbsis() + ", " + garis1.getTitikAkhir().getOrdinat() + ")");
		
		// Panjang Garis
		System.out.println("Panjang Garis: " + garis1.getPanjang());
		
		// Gradien Garis 
		System.out.println("Graiden Garis: " + garis1.getGradien());
		
		// Refleksi dengan sumbu Y 
		Garis garisRefleksiY = garis1.getRefleksiY();
		System.out.println("Titik awal refleksi Y: (" + garisRefleksiY.getTitikAwal().getAbsis() + ", " + garisRefleksiY.getTitikAwal().getOrdinat() + ")");
		System.out.println("Titik akhir refleksi Y: (" + garisRefleksiY.getTitikAkhir().getAbsis() + ", " + garisRefleksiY.getTitikAkhir().getOrdinat() + ")");
		
		// Coba garis lain 
		Titik titik3 = new Titik(1, 1);
		Titik titik4 = new Titik(4, 3);
		Garis garis2 = new Garis(titik3, titik4);
		
		// Cek apakah garis1 tegak lurus dengan garis2
		boolean isTegakLurus = garis1.isTegakLurus(garis2);
		System.out.println("Garis 1 tegak lurus dengan garis 2: " + isTegakLurus);
		}
}