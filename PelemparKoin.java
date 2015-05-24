public class PelemparKoin
{
	public static void main (String argc[]) 
	{
		int bilRandom = (int)(Math.random()+0.5);
		if (bilRandom==1){
			System.out.println("Gambar");
		}
		else{
			System.out.println("Angka");
		}
	}
}
