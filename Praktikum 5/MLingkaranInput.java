/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: MLingkaranInput.java
* Deskripsi	: implementasi cara menghitung luas lingkaran
*/

import java.util.Scanner;

public class MLingkaranInput{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jari jari lingkaran : ");
		double r = scan.nextDouble();
		Lingkaran l = new Lingkaran(r);
		System.out.println("Luas Lingkaran dengan jari-jari " + r + "satuan adalah" + l.hitungLuas());
	}
}