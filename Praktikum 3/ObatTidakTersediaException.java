/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: ObatTidakTersediaException.java
* Deskripsi	: Program exception untuk memberikan pesan "bahwa obat tidak tersedia"
*/

public class ObatTidakTersediaException extends Exception{
	public ObatTidakTersediaException(){
		super("Maaf obat yang saat ini anda cari sedang tidak tersedia");
	}
}
