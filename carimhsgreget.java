import java.util.*;

class carimhsgreget
{
	public static void main(String[] abc)
	{
		String[][] dbmhs = {
								{"08410100375","Purwanto"},
								{"10410100146","Noer hidayat"},
								{"10410100162","Sandy Perdana"},
								{"11410100142","Himawan Pradipta Utama"},
								{"12410100049","Sujatmiko Hadi Nugroho"},
								{"12410100070","Deny Kusuma"},
								{"12410100088","Mochammad afri fitriansyah"},
								{"12410100131","pradita satria prima"},
								{"12410100159","fajriyan nurli"},
								{"12410100160","hasvi fahlevi"},
								{"13410100006","nico stephanus"},
								{"13410100007","ramdhani kurniawan"},
								{"13410100048","alabviantoh muhti tantonoh"},
								{"13410100049","satrio widodo"},
								{"13410100058","khamim ahsanu amala"},
								{"13410100060","arfiansyah agma"},
								{"13410100061","chandra dwi prasetya"},
								{"13410100069","mohammad rangga"},
								{"13410100083","raimon tarou"},
								{"13410100153","bedes"},
								{"13410100155","anggi pranindya"},
								{"13410100157","ketek"},
								{"13410100180","rayana surya tama"},
								{"13410100190","bad luck brian asril zani"},
								{"13410100192","eko amiyanto"},
								{"13410100200","christin lebdhanigrum"},
								{"13410100206","RB nuriana alim putra"},
								{"13410100216","sabdo wicaksono"},
								{"14410100170","rizky akbar"},
								{"14410100172","abdul haris"},
								{"14410100173","ahmad nofal kurniawan"}, 
								{"14410100174","andri anggara"},
								{"14410100175","auda rizky aulany"},
								{"14410100176","nopy wahyono suwoto"},
								{"14410100177","aria teja"},
								{"14410100178","nuari nimasita"},
								{"14410100179","afif luadfian fahmi"},
								{"14410100180","novita perdani"},
								{"14410100181","dheta ameliya"},
								{"14410100182","sopo"};
							};
		Scanner input = new Scanner(System.in);
		String nim, cetak = "";
		
		System.out.print("Masukkan NIM : ");
		nim = input.next();
		
		for(int i = 0; i < dbmhs.length; i++)
		{
			if(nim.equals(dbmhs[i][0]))
			{
				for(int j = 0; j < dbmhs[i].length; j++)
				{
					cetak = "NIM : " + nim + "\nNama : " + dbmhs[i][1] + "\nPIN : " + ((dbmhs[i][1]).substring(0,3) + (dbmhs[i][1]).substring(dbmhs[i][1].length()-2));
				}
			}
			else
			{ 
				if(i==0){
					cetak = "NIM yang anda masukkan tidak terdaftar dalam database kami!"; }
			}
		}
		System.out.println(cetak);
	}
}