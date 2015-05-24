public class PrinterDaftarIsi{
	public static String buatDaftarIsi (String judulBab, int halaman) {
	String str="judul Bab";
	for(int i=str.length();i<50;i++)
		str=str+".";
	str=str+" "+halaman;
	return str;
	}
	public static void main (String []args) {
		//String []databab;
		//masukkan jumlah bab : 3 ?
		//judul bab 1 : opo
		//halaman bab 1:
		//judul bab 2 : isi ne opo lee ??
		//halaman bab 2:
		//judul bab 3 : isi sembarang 
		//halaman bab 3:
		//daftar isi 
		//bab 1: .......2
		String bab1=buatDaftarIsi("Bab 1: Pengantar Bpro", 2);
		System.out.println(bab1);
		String bab2=buatDaftarIsi("Bab 2: Basic Java", 69);
		System.out.println(bab2);
	}
}