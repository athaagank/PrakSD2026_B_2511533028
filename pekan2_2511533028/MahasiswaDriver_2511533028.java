package pekan2_2511533028;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2511533028 {
	// 1. Method untuk menampilkan menu
   public static void tampilkanMenu() {
	   System.out.println("\nMenu:");
	   System.out.println("1. Tambah Mahasiswa_2511533028");
	   System.out.println("2. Tampilkan Semua Mahasiswa_2511533028");
	   System.out.println("3. Hapus Mahasiswa_2511533028 Berdasarkan NIM");
	   System.out.println("4. Cari Mahasiswa_2511533028 Berdasarkan NIM");
	   System.out.println("5. Keluar");
   }
   
   // 2. Method untuk tambah mahasiswa_2511533028
   public static <Mahasiswa> void tambahMahasiswa_2511533028(ArrayList<Mahasiswa_2511533028> list, Scanner sc) {
	   System.out.print("Masukkan NIM: ");
	   String nim = sc.nextLine();
	   System.out.print("Masukkan Nama: ");
	   String nama = sc.nextLine();
	   System.out.print("Masukkan Prodi");
	   String prodi = sc.nextLine();
	   list.add(new Mahasiswa_2511533028(nim, nama, prodi));
	   System.out.println("Mahasiswa_2511533028 berhasil ditambahkan");
   }
  
   // 3. Method untuk tampilkan semua data
   public static void tampilkanSemuaMahasiswa_2511533028(ArrayList<Mahasiswa_2511533028> list) {
	   if (list.isEmpty()) {
		   System.out.println("Daftar mahasiswa_2511533028 kosong.");
	   } else {
		   System.out.println("Data Mahasiswa:");
		   for (Mahasiswa_2511533028 mhs : list) {
			   System.out.println(mhs);
		   }
	   }
   }
   
   // 4. Method untuk hapus mahasiswa_2511533028 berdasarkan NIM
   public static void hapusMahasiswa_2511533028(ArrayList<Mahasiswa_2511533028> list, Scanner sc) {
	   System.out.print("Masukkan NIM yang akan dihapus: ");
	   String nimHapus = sc.nextLine();
	   boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimHapus));
	   
	   if (removed) {
		   System.out.println("Data denganNIM " + nimHapus + " berhasil dihapus.");
	   } else {
		   System.out.println("NIM tidak ditemukan.");
	   }
   }
   
   // 5. Method untuk cari mahasiswa_2511533028 berdasarkan NIM
   public static void cariMahasiswa_2511533028(ArrayList<Mahasiswa_2511533028> list, Scanner sc) {
	   System.out.print("Masukkan NIM yang dicari: ");
	   String nimCari =sc.nextLine();
	   boolean ditemukan = false;
	   
	   for (Mahasiswa_2511533028 mhs : list) {
		   if (mhs.nim.equals(nimCari)) {
			   System.out.println("Hasil Pencarian: " + mhs);
			   ditemukan = true;
			   break;
		   }
	   }
	   
	   if (!ditemukan) {
		   System.out.println("NIM tidak ada.");
	   }
   }
   public static void main(String[] args) {
	   ArrayList<Mahasiswa_2511533028> mahasiswaList = new ArrayList<>();
	   Scanner scanner = new Scanner(System.in);
	   int choice;
	   
	   do {
		   tampilkanMenu();
		   System.out.print("Pilih menu: ");
		   choice = scanner.nextInt();
		   scanner.nextLine(); // Consume newline
		   
		   switch (choice) {
		   case 1:
			   tambahMahasiswa_2511533028(mahasiswaList, scanner);
			   break;
		   case 2:
			   tampilkanSemuaMahasiswa_2511533028(mahasiswaList);
			   break;
		   case 3:
			   hapusMahasiswa_2511533028(mahasiswaList, scanner);
			   break;
		   case 4:
			   cariMahasiswa_2511533028(mahasiswaList, scanner);
			   break;
		   case 5:
			   System.out.println("Keluar dari program.");
			   break;
		   default:
			   System.out.println("Pilihan tidak valid.");
		   }
	   } while (choice != 5);
	   scanner.close();
   }

}
