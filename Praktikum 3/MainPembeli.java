/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: MainPembeli.java
* Deskripsi	: Program main dari pembeli 
*/

public class MainPembeli{
	public static void main(String[] args){
		Pembeli pembeli = new Pembeli("Muhammad Naufal Izzudin");
		
		try{
			pembeli.beliObat(new Obat("Paracetamol"));
            pembeli.beliObat(new Obat("Molexflu"));
			pembeli.beliObat(new Obat("Amoxilin"));
			Obat obatNotAvailable = new Obat("Counterpain");
			pembeli.beliObat(new Obat("Panadol"));
			pembeli.beliObat(new Obat("Tolak Angin"));
			pembeli.beliObat(new Obat("Dulcolax"));
			
			obatNotAvailable.setTersedia(false);
            pembeli.beliObat(obatNotAvailable);

		} catch (BatasObatPenuhException ase){
			System.out.println(ase.getMessage());
		} catch (ObatTidakTersediaException ase){
			System.out.println(ase.getMessage());
		}
		
		System.out.println("Informasi Pembeli:");
        System.out.println("Nama: " + pembeli.getNama());
        System.out.println("Jumlah Obat di Keranjang: " + pembeli.getJumlahObat());
        System.out.println("Obat dalam Keranjang:");
        for (Obat obat : pembeli.getKeranjangObat()) {
            if (obat != null) {
                System.out.println("- " + obat.getNama());
            }
        }
	}
}
