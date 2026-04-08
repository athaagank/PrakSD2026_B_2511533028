package pekan3_2511533028;

public class stackArrayDriver_2511533028 {
	public static void main(String[] args) {
		stackArray_2511533028 s = new stackArray_2511533028();
		s.push_2511533028(10);
		s.push_2511533028(20);
		s.push_2511533028(30);
		System.out.println(s.pop_2511533028() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah :" + s.peek());
		System.out.print("Element pada stack");
		s.print();
	}

}
