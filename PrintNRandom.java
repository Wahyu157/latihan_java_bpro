import java.util.*;
public class PrintNRandom
{
	public static void main (String argc[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Jumlah Bil Random: ");
		int n=sc.nextInt();
		int i=1;
		int bilRandom = 0;
		int total =0;
		while(i<n) {
		bilRandom =(int)(Math.random()*10.0);
		System.out.println("BilRandom = "+ i +"="+bilRandom);
		total +=bilRandom;
		i++;
		}
		System.out.println("Total :"+total);
	}
}