package tugaspekan5_2511533028;

import java.util.Scanner;

public class RumahSakit_2511533028 {
	Pasien_2511533028 head_3028;
	int counter_3028 = 0;
	
	// Insert (Daftar Pasien)
	public void daftarPasien(String nama, String penyakit) {
		counter_3028++;
		Pasien_2511533028 baru = new Pasien_2511533028(nama, penyakit, counter_3028);
		if (head_3028 == null) {
			head_3028 = baru;
		} else {
			Pasien_2511533028 temp = head_3028;
			while (temp.getNext_3028() != null) {
				temp = temp.getNext_3028();
			}
			temp.setNext_3028(baru);
		}
		
		System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_3028);
	}
	
	// Delete Head (Panggil Pasien)
	public void panggilPasien() {
		if (head_3028 == null) {
			System.out.println("Antrian kosong!");
		} else {
			System.out.println("Memanggil Pasien: ");
			System.out.println("Nama: " + head_3028.getNama_3028());
			System.out.println("Keluhan: " + head_3028.getPenyakit_3028());
			head_3028 = head_3028.getNext_3028();
		}
	}
	
	// Display
	public void tampilkanAntrian() {
		if (head_3028 == null) {
			System.out.println("Antrian kosong!");
		} else {
			Pasien_2511533028 temp = head_3028;
			while (temp != null) {
				System.out.println("No: " + temp.getNomor_3028() + " | Nama: " + temp.getNama_3028() + " | Keluhan: " + temp.getPenyakit_3028());
				temp = temp.getNext_3028();
			}
		}
	}
	
	// Search
	public void cariPasien(String nama) {
		Pasien_2511533028 temp = head_3028;
		boolean ditemukan = false;
		
		while (temp != null) {
			if (temp.getNama_3028().equalsIgnoreCase(nama)) {
				System.out.println("Pasien ditemukan!");
				System.out.println("No: " + temp.getNomor_3028());
				System.out.println("Nama: " + temp.getNama_3028());
				System.out.println("Keluhan: " + temp.getPenyakit_3028());
				ditemukan = true;
				break;
			}
			temp = temp.getNext_3028();
		}
		
		if (!ditemukan) {
			System.out.println("Pasien tidak ditemukan.");
		}
	}
	
	// Status
	public void cekStatus() {
		if (head_3028 == null) {
			System.out.println("Antrian kosong!");
		} else {
			int jumlah = 0;
			Pasien_2511533028 temp = head_3028;
			
			while (temp != null) {
				jumlah++;
				temp = temp.getNext_3028();
			}
			
			System.out.println("Jumlah Pasien: " + jumlah);
			System.out.println("Pasien terdepan: " + head_3028.getNama_3028());
		}
	}
	
	// Main Menu
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RumahSakit_2511533028 rs = new RumahSakit_2511533028();
		int pilihan;
		
		do {
			System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533028 ===");
			System.out.println("1. Daftarkan Pasien");
			System.out.println("2. Panggil Pasien");
			System.out.println("3. Tampilkan Antrian");
			System.out.println("4. Cari Pasien");
			System.out.println("5. Cek Status");
			System.out.println("6. Keluar");
			System.out.print("Pilihan: ");
			pilihan = input.nextInt();
			input.nextLine();
			
			switch (pilihan) {
			case 1:
				System.out.print("Nama: ");
				String nama = input.nextLine();
				System.out.print("Keluhan: ");
				String keluhan = input.nextLine();
				rs.daftarPasien(nama, keluhan);
				break;
				
			case 2:
				rs.panggilPasien();
				break;
				
			case 3:
				rs.tampilkanAntrian();
				break;
				
			case 4:
				System.out.print("Masukkan nama: ");
				String cari = input.nextLine();
				rs.cariPasien(cari);
				break;
				
			case 5:
				rs.cekStatus();
				break;
				
			case 6:
				System.out.println("Keluar...");
				break;
				
			default:
				System.out.println("Pilihan tidak valid!");
			}
		} while (pilihan != 6);
		
		input.close();
	}

}
