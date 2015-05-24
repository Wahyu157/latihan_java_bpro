import java.util.*;

public class TebakGambarAngkaV2 {
	public static void main (String[] args) {
		String []label={"GAMBAR","ANGKA"};
		int []score ={0,0};
		//lakukan 12x lempar koin
		System.out.println("Ke\t| HASIL LEMPARAN");
		for (int i=0; i<12; i++) {
			int r=(int) (Math.random()+0.5);
			System.out.println((i+1) + "\t|\t" + label[r]);
		}
		//hitung score 0 - gambar dan angka
		//tampilkan total score gambar dan angka
		for(int i=0;i<label.length;i++) {
			System.out.println("Score " + label[i] + " = "+ score[i] );
		}
		//cetak kesimpulannya siapa yang menang
		if (score[0]>score[1])
			System.out.println("gambar menang");
		else if (score[0]<score[1])
			System.out.println("angka menang");
		else
			System.out.println("SERI");
	}
}