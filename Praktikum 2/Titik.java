/* Program   : Titik.java */
/* Deskripsi : File modul Titik */
/* NIM & Nama  : 24060122120018 & Muhammad Naufal Izzudin */
/* Tanggal   : 19 Januari 2024 *
/***********************************/

public class Titik{
		private double absis;
		private double ordinat;
		static int counterTitik;
		
		public Titik(){
				absis = 0;
				ordinat = 0;
				counterTitik++;
		}
		
		public Titik(double x, double y){
				this.absis = x;
				this.ordinat = y;
				counterTitik++;
		}
		
		public void setAbsis(double x){
				this.absis = x;
		}
		
		public void setOrdinat(double y){
				this.ordinat = y;
		}
		
		public double getAbsis(){
				return this.absis;
		}
		
		public double getOrdinat(){
				return this.ordinat;
		}
		
		public static double getCounterTitik(){
				return counterTitik;
		}
}
			
	