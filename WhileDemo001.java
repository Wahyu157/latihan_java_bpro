import java.util.*;

public class WhileDemo001
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Masukkan jumlah data : ");
		int max = 0;
		int min = 99;
		double rataRata = 0.0;
		
		int jmlData = input.nextInt();
		int sum = 0;
		int count = 0;
		
		while(count<jmlData)
		{
			sum+= input.nextInt();
			count++;
		}
		System.out.println("sum = "+sum);
		System.out.println("avg = "+rataRata);
		System.out.println("max = "+max);
		System.out.println("min = "+min);
	}
}

