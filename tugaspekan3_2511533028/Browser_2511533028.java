package tugaspekan3_2511533028;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511533028 {
	public static void main(String[] args) {
		Scanner input_3028 = new Scanner(System.in);
		Stack<Website_2511533028> history_3028 = new Stack<>();
		
		int pilihan_3028;
		
		do {
			System.out.println("\n=== Browser History NIM: 2511533028 ===");
			System.out.println("1. Kunjungi Website (Push)");
			System.out.println("2. Tombol Back (Pop)");
			System.out.println("3. Lihat Halaman Aktif (Peek)");
			System.out.println("4. Cek Status History");
			System.out.println("5. Keluar");
			System.out.print("Pilihan: ");
			pilihan_3028 = input_3028.nextInt();
			input_3028.nextLine();
			
			switch (pilihan_3028) {
			    case 1:
			    	System.out.print("Masukkan Judul: ");
			    	String judul_3028 = input_3028.nextLine();
			    	
			    	System.out.print("Masukkan Url: ");
			    	String url_3028 = input_3028.nextLine();
			    	
			    	Website_2511533028 web_3028 = new Website_2511533028(judul_3028, url_3028);
			    	history_3028.push(web_3028);
			    	
			    	System.out.println("Berhasil mengunjungi halaman!");
			    	break;
			    	
			    case 2:
			    	if (!history_3028.isEmpty()) {
			    		Website_2511533028 removed_3028 = history_3028.pop();
			    		System.out.println("Kembali dari: " + removed_3028.getJudul_3028());
			    	} else {
			    		System.out.println("History kosong, tidak bisa kembali");
			    	}
			    	break;
			    	
			    case 3:
			    	if (!history_3028.isEmpty()) {
			    		Website_2511533028 current_3028 = history_3028.peek();
			    		System.out.println("Halaman aktif:");
			    		System.out.println("Judul: " + current_3028.getJudul_3028());
			    		System.out.println("URL: " + current_3028.getUrl_3028());
			    	} else {
			    		System.out.println("Tidak ada halaman yang dibuka.");
			    	}
			    	break;
			    	
			    case 4:
			    	System.out.println("Jumlah history: " + history_3028.size());
			    	if (history_3028.isEmpty()) {
			    		System.out.println("History kosong.");
			    	} else {
			    		System.out.println("History tidak kosong.");
			    	}	
			    	break;
			    	
			    case 5:
			    	System.out.println("Program selesai.");
			    	break;
			    	
			    default:
			    	System.out.println("Pilihan tidak valid!");
			    	
			}
		} while (pilihan_3028 != 5);
		
		input_3028.close();
	} 

}
