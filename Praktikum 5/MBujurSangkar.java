/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: MBujurSangkar.java
* Deskripsi	: Kelas yang membuat implementasi cara menghitung luas bujur sangkar
*/

import java.util.Scanner;

class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
	}
}

// Tidak bisa akan eror karena butuh implementasi dari method cari class lainnya