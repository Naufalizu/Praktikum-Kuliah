/* Program   : Produk.java */
/* Deskripsi : File modul operasi Produk */
/* NIM & Nama  : 24060122120018 & Muhammad Naufal Izzudin */
/* Tanggal   : 28 Februari 2024 *
/***********************************/

public class Produk{
	private String Nama;
	private double Harga;
	private int Stok;
	private String Deskripsi;
	private Penjual penjual;
	
	public Produk(String Nama, double Harga, int Stok, String Deskripsi, Penjual penjual){
		this.Nama = Nama;
		this.Harga = Harga;
		this.Stok = Stok;
		this.Deskripsi = Deskripsi;
		this.penjual = penjual;
	}
	
	public String getNama(){
		return Nama;
	}
	
	public void setNama(String Nama){
		this.Nama = Nama;
	}
	
	public double getHarga(){
		return Harga;
	}
	
	public void setHarga(double Harga){
		this.Harga = Harga;
	}
	
	 public int getStok() {
        return Stok;
    }
	
	public void setStok(int Stok){
		this.Stok = Stok;
	}
	
	public String getDeskripsi(){
		return Deskripsi;
	}
	
	public void setDeskripsi(String Deskripsi){
		this.Deskripsi = Deskripsi;
	}
	
	public Penjual getPenjual(){
		return penjual;
	}
	
	public String infoProd() {
		 return "Informasi Produk :\n" +
                "Nama : " + Nama + "\n" +
                "Harga : " + Harga + "\n" +
                "Stok : " + Stok + "\n" +
                "Deskripsi : " + Deskripsi +
				"Penjual : " + penjual.infoPenj();
    }
   
	public void ubahStok(int Jumlah){
		Stok += Jumlah;
	}
}