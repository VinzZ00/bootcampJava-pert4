
public class Dosen extends person {
	
	private String noDosen;
	private double gaji;

	public Dosen(String nama, int umur, String noDosen, double gaji) {
		super(nama, umur);
		this.noDosen = noDosen;
		this.gaji = gaji;
	}

	public String getNoDosen() {
		return noDosen;
	}



	public void setNoDosen(String noDosen) {
		this.noDosen = noDosen;
	}



	public double getGaji() {
		return gaji;
	}



	public void setGaji(double gaji, String Password) {
		if (Password.equals("b12345")) {
			this.gaji = gaji;
		}
		
	}



	@Override
	public void displayNama() {
		// TODO Auto-generated method stub
		System.out.println("nama dosen anda adalah " + this.getNama());
	}

}
