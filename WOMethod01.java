public class WOMethod01 {
	public static int add (int a, int b) {
		int c=a+b;
		return c;
	}
	public static void main (String []args) {
		int bil1=100;
		int bil2=200;
		int hasil1 = add(bil1,bil2);
		int hasil2 = add(10,20);
		System.out.println("Hasil add (100,200): "+hasil1);
		System.out.println("Hasil add (10,20): "+hasil2);
	}
}