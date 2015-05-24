public class Array2D {
	public static void main (String []args) {
		int[][]m=new int[3][];
		m[0]=new int[2];
		m[1]=new int[4];
		m[2]=new int[3];
		m[0][0]=5;
		m[1][3]=5;
		m[2][2]=5;
		for(int i=0; i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j] + " ");
			}
		System.out.println();
		}
	}
}