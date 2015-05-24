public class DataPenjualan {
	public static void main(String []args) {
		int [][]data={
			{10,10,4,13,2,10},
			{5,8,4,3,12,10},
			{9,3,4,13,12,10},
			{14,10,4,3,1,10}};
		for(int i=(data.length-1);i>=0;i--) {
			for(int j=(data[i].length-1);j>=0;j--) {
				System.out.print((data[j][i]==1)?" # ":" . ");
			}
			System.out.println();
		}
	}
}