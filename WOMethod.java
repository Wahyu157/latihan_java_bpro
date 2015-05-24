public class WOMethod {
/**
* nama method = main
  return value void
  parameter args = array of string
**/
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
	public static void main (String[]args) {
		CetakGaris(69, "*");
		System.out.println("View Data CUstomer");
		CetakGaris(21, "#");
		System.out.println("id\tNama\tAlamat");
	}
}