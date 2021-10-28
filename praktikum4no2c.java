class siswa {
	int nrp;
	String nama;
	
	public void setNrp(int i) {
		nrp=i;
	}
public void setNama(String i) {
	nama=i;
}
}

public class praktikum4no2c {
	public static void main(String args[]) {
		siswa anak=new siswa();
		anak.setNrp(5);
		anak.setNama("Budi");
		System.out.println(anak.nrp);
		System.out.println(anak.nama);
	}
}
