import java.util.* ;
import java.util.Scanner ;

public class BentukAir {
	public static final int suhu = 10 ;
	public static final int suhu1 = 100 ;
	public static void main (String [] args) {
		//user input
		Scanner userInput = new Scanner(System.in);
		int temperatur;
		System.out.print("Masukkan angka temperatur: ");
		temperatur = userInput.nextInt();
		if (suhu == temperatur)  {
			System.out.println("temperatur dalam bentuk cair.");
		} else if (temperatur < suhu) {
			System.out.println("temperatur dalam bentuk padat.");
		} else if ((temperatur>=suhu) && (temperatur<suhu1)) {
			System.out.println ("temperatur dlm bentuk cair.");
		} else if (temperatur > suhu1){
			System.out.println("temperatur dalam bentuk gas.");
			}
	}
}