package pekan1_2511533028;

public class jam_2511533028Driver {
	public static void main(String[] args) {
		jam_2511533028 a = new jam_2511533028(23, 59, 50);
		jam_2511533028 b = new jam_2511533028(0, 0, 15);
		System.out.println("a          = " + a);
		System.out.println("b          = " + b);
		System.out.println("a+b        = " + a.plus(b));
		System.out.println("next 20s   = " + a.nextSecond(20));
		System.out.println("durasi(a,b) = " + jam_2511533028.durasiDetik(a, b));
		System.out.println("a.compareTo(b) = " + a.compareTo(b));
	}

}
