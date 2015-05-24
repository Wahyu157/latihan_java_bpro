class caridata{
	public static void main (String []args)
	{
	
		int [] data = {12, 4, 6, 11, 8, 2, 7, 23, 1, 14, 21, 30, 32, 18, 16};
		int dicari = 23;
		System.out.println ("posisi" + dicari + "dalam larik data : " + cari (data, data.length, dicari));
	}
	public static int cari (int [] data, int n, int k )
	{
		int posisi = 0, i;
		boolean ketemu ;
		if (n <= 0)
			posisi = -1;
		else 
		{
			ketemu = false ;
			i = 1;
			while((i < n-1) && !ketemu)
				if (data [i] == k)
				{
					posisi = i;
					ketemu = true;
				}
				else
					i++;
				if (!ketemu)
					posisi = -1 ;
		}
		return posisi;
	}
}