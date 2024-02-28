/* Program   : MainproPen.java */
/* Deskripsi : File main modul MainproPen */
/* NIM & Nama  : 24060122120018 & Muhammad Naufal Izzudin */
/* Tanggal   : 27 Februari 2024 *
/*****************************/

public class MainproPen {
    public static void main(String[] args) {
        Penjual penjual = new Penjual("Adul", "Jl. Manyar Sabrangan", "081385551174");
        Produk produk = new Produk("Garnier Men Acno Fight Wasabi", 32.278, 4, "Sabun pencuci muka khusus untuk pria dengan kandungan wasabi yang membunuh 99,99 % bakteri penyebab jerawat", penjual);
		
        // Mendapatkan objek Penjual terkait dari objek Produk
        Penjual objPenjual = produk.getPenjual();

        // Mencetak informasi penjual dari objek Penjual
        System.out.println("Informasi Penjual:");
        System.out.println("Nama: " + objPenjual.getNama() + ", Alamat: " + objPenjual.getAlamat() + ", NoTelp: " + objPenjual.getNoTelp());

        // Mencetak informasi produk dari objek Produk
        System.out.println("\nInformasi Produk:");
        System.out.println("Nama: " + produk.getNama() + ", Harga: " + produk.getHarga() + ", Stok: " + produk.getStok() + ", Deskripsi: " + produk.getDeskripsi() + ", Penjual: " + objPenjual.infoPenj());
		
		int jumlahTambah = 2;
        produk.ubahStok(jumlahTambah);
		
        // Mencetak informasi produk setelah mengubah stok
        System.out.println("\nInformasi Produk setelah mengubah stok:");
        System.out.println("Nama: " + produk.getNama() + ", Harga: " + produk.getHarga() + ", Stok: " + produk.getStok() + ", Deskripsi: " + produk.getDeskripsi() + ", Penjual: " + objPenjual.infoPenj());
    }
}
