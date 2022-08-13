
public abstract class person {
	
	/*
	 * abstract class secara langsung bakal dianggep menjadi parent karena tidak 
	 * bisa initialize secara langsung mengunakan new, melainkan harus di extends 
	 * terlebih dahulu
	 */
	private String nama;
	private int umur;
	
	
	
	public String getNama() {
		return nama;
	}

	public String displayInstance() {
		return "Ini person";
	}

	public void setNama(String nama) {
		this.nama = nama;
	}



	public int getUmur() {
		return umur;
	}



	public void setUmur(int umur) {
		this.umur = umur;
	}	
	
	public person(String nama, int umur) {
		super();
		this.nama = nama;
		this.umur = umur;
	}



	public abstract void displayNama();

}
