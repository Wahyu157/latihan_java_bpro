import java.util.*;

public class array3 {
 public static void main (String []args){
	Scanner input = new Scanner (System.in);
	int [] dRandom = new int[10];
	int min=0;
	int max=0;
	double rata2 =0.0;
	
	int jmlData = input.nextInt();
	int sum = 0;
	int count = 0;
	System.out.println("mengisi dRandom dengan 10 bil random");
	for(int i=0;i<dRandom.length;i++) {
		dRandom[i] = (int)(Math.random()*10.0);
	}
	System.out.println("menghasilkan isi bil random dalam array");
	min = dRandom[0];
	max = dRandom[0];
	for(int j=0;j<dRandom.length;j++) {
		if(min>dRandom[j])
			min=dRandom[j];
		if(max>dRandom[j])
			max=dRandom[j];
		System.out.println("data random ke ["+j+"]=" +dRandom[j]);
	}
	System.out.println("rata2 = " +rata2);
	System.out.println("nilai min = " +min);
	System.out.println("nilai max = " +max);
	for(int i=0;i<dRandom.length;i++) {
		System.out.print(i+"\t|");
		for(int j=0;j<dRandom[i];j++) {
			System.out.print("*");
		}
		System.out.println();	
	}
	}
}