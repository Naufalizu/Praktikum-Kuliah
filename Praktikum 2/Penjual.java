/* Program   : Penjual.java */
/* Deskripsi : File modul operasi Penjual */
/* NIM & Nama  : 24060122120018 & Muhammad Naufal Izzudin */
/* Tanggal   : 28 Februari 2024 *
/***********************************/

public class Penjual{
	private String Nama;
	private String Alamat;
	private String NoTelp;
	
	public Penjual(String Nama, String Alamat, String NoTelp){
		this.Nama = Nama;
		this.Alamat = Alamat;
		this.NoTelp = NoTelp;
	}
	
	public String getNama(){
		return Nama;
	}
	
	public void setNama(String Nama){
		this.Nama = Nama;
	}
	
	public String getAlamat(){
		return Alamat;
	}
	
	public void setAlamat(String Alamat){
		this.Alamat = Alamat;
	}
	
	public String getNoTelp(){
		return NoTelp;
	}
	
	public void setNoTelp(String NoTelp){
		this.NoTelp = NoTelp;
	}
	
	public String infoPenj(){
		return
            "Nama : " + Nama + "\n" +
            "Alamat : " + Alamat + "\n" +
			"NoTelp : " + NoTelp;
	}
}