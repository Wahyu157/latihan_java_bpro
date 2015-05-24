public class Swap{
	public static void main(String[] argx) {
	int a=50;
	int b=20;
	int c=0;

	//cetak variabel a & b
	System.out.println("a=" + a);
	System.out.println("b=" + b);
	System.out.println("nilai variabel a dipindah ke b dan isi b ke a");
	
	//proses pindag isi variabel
	c=a;
	a=b;
	b=c;
	c=0;
	System.out.println("a=" + a);
	System.out.println("b=" + b);
	}
}