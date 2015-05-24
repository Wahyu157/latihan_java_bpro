public class ViewDBmhs {
	public static void menu(){
		System.out.println("Program view data mhs \nKelas Q1-142");
		System.out.println("1. cari data mhs by NIM");
		System.out.println("2. view data mhs filter by nama");
		System.out.println("3. view data mhs filter by angkatan");
		System.out.println("4. view all data mhs");
		System.out.println("5. exit");
		System.out.println("pilihen sak karepmu [1-5]>");
	}
	
	public static void viewAll(){
		for(int i=0;i<SimpleSearch01.daftarNama.length;i++) {
			System.out.println((i+1)+".\t" + SimpleSearch01.daftarNama[i] + "\t" +SimpleSearch01.daftarNim[i]);
		}
	}
	
	public static void filterByNama(Scanner sc){
		System.out.println("view data mhs filter by nama");
		System.out.println("Masukkan nama : ");
		String str= sc.next();
		String []hasil=SimpleSearch01.filterNama(str);
		for(String _nama:hasil)
			System.out.println(_nama);
		if(hasilCari==-1)
			System.out.println("Nim : "+ nim + "Tidak ditemukan!");
			else
			System.out.println("Nama : "+ SimpleSearch01.daftarNama[hasilCari]);
	}
	
	public static void filterByNim(Scanner sc){
		System.out.println("view data mhs filter by nim");
		System.out.println("Masukkan nim : ");
		String str= sc.next();
		String []hasil=SimpleSearch01.filterNim(str);
		for(String _nama:hasil)
			System.out.println(_nama);
	}
	
	public static void main(String[] argv) {
		Scanner sc=new Scanner(System.in);
		boolean selesai = false;
		do{
			menu();
			int pil=sc.nextInt();
			switch(pil){
				case 1: cariNamaByNim(sc); break;
				case 2: filterByNama(sc); break;
				case 4: viewAll(); break;
				case 5: selesai=true; break;
			}
		}
		while(pil<5);
	}
}