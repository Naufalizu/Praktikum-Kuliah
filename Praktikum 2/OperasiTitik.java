/* Program   : OperasiTitik.java */
/* Deskripsi : File modul OperasiTitik */
/* NIM & Nama  : 24060122120018 & Muhammad Naufal Izzudin */
/* Tanggal   : 26 Februari 2024 *
/***********************************/

public class OperasiTitik{
		public void refleksiSumbuX(Titik titik){
			double y;
			y = titik.getOrdinat();
				
			y *= -1;
			titik.setOrdinat(y);
		}
		
		public void refleksiSumbuY(Titik titik){
			double x;
			x = titik.getAbsis();
				
			x *= -1;
			titik.setAbsis(x);
		}
	
		public double getJarakPusat(Titik titik){
			double x = titik.getAbsis();				
			double y = titik.getOrdinat();
				
			double jarakPusat = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
				
			return jarakPusat;
		}
			
		public Titik getRefleksiX(Titik titik){
			refleksiSumbuX(titik);
			return titik;
		}
		
		public Titik getRefleksiY(Titik titik){
			refleksiSumbuY(titik);
			return titik;
		}		
}