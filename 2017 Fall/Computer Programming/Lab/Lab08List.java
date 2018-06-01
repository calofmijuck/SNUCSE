import java.io.*;

public class Lab08List {
	public static void main(String[] args) {
		LList a = new MyList();
		a.add(10);
		a.add(5);
		a.add(3);
		a.add(6);
		a.add(0);
		a.add(2);
		a.add(9);
		a.add(11);
		a.add(13);
		System.out.println(a);
		a.remove(9);
		a.remove(0);
		a.remove(13);
		System.out.println(a);
		System.out.println(a.removeFront());
		System.out.println(a.removeLast());
		System.out.println(a);
	}
}