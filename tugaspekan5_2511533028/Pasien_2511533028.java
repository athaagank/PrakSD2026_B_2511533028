package tugaspekan5_2511533028;

public class Pasien_2511533028 {
	String namaPasien_3028;
	String penyakit_3028;
	int nomorAntrian_3028;
	Pasien_2511533028 next_3028;
	
	// Constructor
	public Pasien_2511533028(String nama, String penyakit, int nomor) {
		this.namaPasien_3028 = nama;
		this.penyakit_3028 = penyakit;
		this.nomorAntrian_3028 = nomor;
		this.next_3028 = null;
	}
	
	// Getter
	public String getNama_3028() {
		return namaPasien_3028;
	}
	
	public String getPenyakit_3028() {
		return penyakit_3028;
	}
	
	public int getNomor_3028() {
		return nomorAntrian_3028;
	}
	
	public Pasien_2511533028 getNext_3028() {
		return next_3028;
	}
	
	// Setter
	public void setNext_3028(Pasien_2511533028 next) {
		this.next_3028 = next;
	}

}
