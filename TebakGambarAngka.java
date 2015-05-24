import java.util.*;
public class TebakGambarAngka
{
	public static void main (String argc[]) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Program Tebak Gambar - Angka");
	System.out.print("Masukkan Tebakan Anda [1: Gambar 0: Angka]>");
	int tebakanUser = sc.nextInt();
	
	System.out.println("Anda Menebak = ");
	if (tebakanUser==1)
		System.out.println("Gambar");
	else
		System.out.println("Angka");
	
	int pcOut = (int) (Math.random()+ 0.5);
	
	System.out.println("Komputer menghasilkan ");
	if (pcOut==1)
		System.out.println("Gambar");
	else
		System.out.println("Angka");
		
	if(tebakanUser==pcOut)
		System.out.println("Selamat anda menang");
		else
		System.out.println("Selamat anda kalah");
		
	}
}
