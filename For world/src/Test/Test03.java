package Test;

public class Test03 {
	static{
		System.out.println("AAAA");
	}
	{
		System.out.println("BBBB");
	}
	public Test03() {
		// TODO Auto-generated constructor stub
		System.out.println("CCCC");
	}	
	
	public static void main(String[] args) {
		Test03 aa = new haha();
		Test03 bb = new haha();
	}
}
class haha  extends Test03{
	static{
		System.out.println("DDDD");
	}
	{
		System.out.println("EEEE");
	}
	public haha() {
		// TODO Auto-generated constructor stub
		System.out.println("FFFF");
	}
}

