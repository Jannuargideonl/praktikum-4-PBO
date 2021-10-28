class siswa {
	int nrp;
	public void setNrp(int i) {
		nrp=i;
		
	}
}

public class praktikum4no1c {
	public static void main(String args[]) {
		siswa anak=new siswa();
		anak.setNrp(5);
		System.out.println(anak.nrp);
	}
}