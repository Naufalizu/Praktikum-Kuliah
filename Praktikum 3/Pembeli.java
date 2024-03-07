/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: Pembeli.java
* Deskripsi	: Program class pembeli 
*/

public class Pembeli {
    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;
    
    public Pembeli(String nama) {
        this.nama = nama;
        keranjangObat = new Obat[5];
        jumlahObat = 0;
    }
    
    public String getNama() {
        return nama;
    }
    
    public Obat[] getKeranjangObat() {
        return keranjangObat;
    }

    public int getJumlahObat() {
        return jumlahObat;    
    }

    public void beliObat(Obat obat) throws BatasObatPenuhException, ObatTidakTersediaException {
        try {
            if (!obat.isTersedia()) {
                throw new ObatTidakTersediaException();
            }

            if (jumlahObat >= 5) {
                throw new BatasObatPenuhException();
            }

            obat.setTersedia(false);
            keranjangObat[jumlahObat] = obat;
            jumlahObat++;
			
        } catch (ObatTidakTersediaException ase) {
			System.out.println(ase.getMessage());
        } catch (BatasObatPenuhException ase) {
			System.out.println(ase.getMessage());
        }
    }
}
