package Test;

public class Chirld extends Parent{
	public void count() {
		System.out.println(10/3);
	}
	public static void modify (String s) {
		s += "world!";
	}
	public static void main(String[] args) {
		Parent p = new Chirld();
		p.count();
		
		String s = new String("Hello");
		modify(s);
		System.out.println(s);
	}
}

class Parent {
	public void count() {
		System.out.println(5%3);
	}
}

