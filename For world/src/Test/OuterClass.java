package Test;

public class OuterClass {
	
	private class InterClass{
		public InterClass() {
			System.out.println("InterClass Create");
		}
	}
	
	public OuterClass() {
		InterClass ic = new InterClass();
		System.out.println("OuterClass Create");
	}
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		String str = "123456789";
		str = str.substring(1,3);
		System.out.println(str);
	}
}
