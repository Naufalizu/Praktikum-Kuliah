/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: BatasObatPenuhException.java
* Deskripsi	: Program exception untuk memberikan pesan "bahwa batas maksimal pembelian obat adalah 5"
*/

public class BatasObatPenuhException extends Exception{
	public BatasObatPenuhException(){
		super("Maaf batas maksimal pembelian obat adalah 5");
	}
}