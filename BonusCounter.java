/**
* Program untuk menghitung bonus pembelian
* dengan ketentuan setiap beli 2 gratis 1
* contoh beli = 3 --> 3+1 = 4
*/
import java.io.*;
public class BonusCounter{
	public static void main(String []args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int jmlBarang=0;
		int bonus = jmlBarang/2;
		int jmlBarangPlusBonus = jmlBarang + bonus; 
		int harga1 = 0;
		int hargaplusbonus = jmlBarangPlusBonus * harga1;
		
		System.out.println("====================");
		System.out.println(" Beli 2 Gratis 1 ");
		System.out.println("====================");
		System.out.print("Masukkan Jumlah baju yang dibeli = ");
		jmlBarang = Integer.parseInt(br.readLine());
		System.out.print("Masukkan Jumlah harga = ");
		harga1 = Integer.parseInt(br.readLine());
			
		System.out.println("");
		
		System.out.println("jmlBarang yang dibeli= " + jmlBarang);
		System.out.println("bonus yang didapat = " + bonus);
		System.out.println("jmlBarang + bonus = " + jmlBarangPlusBonus);
		System.out.println("Harga Jumlah Barang + bonus = " + hargaplusbonus );
	}
}

// Tugas : 1 barang = 25000 , cari harga jual+bonus = ?????????????