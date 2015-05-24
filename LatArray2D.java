public class LatArray2D {
	public static void main(String []args) {
		int [][]data={
			{1,0,0,0,0,0},
			{0,1,0,0,0,0},
			{0,0,1,0,0,0},
			{0,0,0,1,0,0},
			{0,0,0,0,1,1},
			{0,0,0,0,1,1}};
		for(int i=(data.length-1);i>=0;i--) {
			for(int j=(data[i].length-1);j>=0;j--) {
				System.out.print((data[j][i]==1)?" # ":" . ");
			}
			System.out.println();
		}
	}
}