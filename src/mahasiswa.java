
public class mahasiswa extends person implements displayNIK{

	private String NIK;
	private double IPK;
	private Dosen dosenPembimbing;

	public mahasiswa(String nama, int umur, String nIK, double iPK) {
		super(nama, umur);
		NIK = nIK;
		IPK = iPK;
	}

	public void setDosenPembimbing(Dosen dospem) {
		this.dosenPembimbing = dospem;
	}
	
	public Dosen getDosenPembimbing() {
		return dosenPembimbing;
	}

	public String getNIK() {
		return NIK;
	}

	public void setNIK(String nIK) {
		NIK = nIK;
	}

	public double getIPK() {
		return IPK;
	}

	public void setIPK(double iPK) {
		IPK = iPK;
	}
	
	public void displayNama() {
		// TODO Auto-generated method stub
		System.out.println("nama saya adalah " + super.getNama());
	}

	public void displayNIK() {
		// TODO Auto-generated method stub
		System.out.println("NIK saya adalah " + this.NIK);
	}
	
	@Override
	public String displayInstance() {
		// TODO Auto-generated method stub
		return "ini merupakan instance mahasiswa";
	}
	
	public void gantiDosenPembimbing(Dosen pergantianDosen) {
		this.dosenPembimbing = pergantianDosen;
	}
	

}
