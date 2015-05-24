public class array2 {
 public static void main (String []args){
	int [] dRandom = new int[10];
	System.out.println("mengisi dRandom dengan 10 bil random");
	for(int i=0;i<dRandom.length;i++) {
		dRandom[i] = (int)(Math.random()*10.0);
	}
	System.out.println("menghasilkan isi bil random dalam array");
	for(int j=0;j<dRandom.length;j++) {
		System.out.println("data random ke ["+j+"]=" +dRandom[j]);
	}
	}
}