public class WOMethod02 {

public static void CetakGaris () {
		for(int i=0;i<25;i++)
			System.out.print("*");
		System.out.println();
	}
	
	public static void CetakGaris (int PanjangGaris) {
		for(int i=0;i<PanjangGaris;i++)
			System.out.print("*");
		System.out.println();
	}
	
	public static void CetakGaris (int PanjangGaris, String bentuk) {
		for(int i=0;i<PanjangGaris;i++)
			System.out.print(bentuk);
		System.out.println();
	}
	public static void CetakBanner(String kata){
		CetakGaris(25-kata.length()+4,"*");
		System.out.print("*"+kata+"*");
		CetakGaris(kata.length()+4,"*");
	}
	public static void main (String []args) {
		System.out.println("java");
	}
}
