/** 
	* File		: ExceptionOnArray.java
	* Deskripsi	: Program untuk demo asersi, yang akan menolak input jari - jari lingkaran yang berilai nol
	*
	*/
	
public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		} catch (ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		} finally {
			System.out.println("clean up code...");
		}
	}
}