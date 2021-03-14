
public class PrintOneToHundered {
	
	public static void method1() {
		System.out.println("-----Method 1-------");
		for(int i='A'/'A'; i<='d';i++) {
			System.out.println(i);
		}
	}
	
	public static void method2() {
		System.out.println("-----Method 2-------");
		for(int i="A".length(); i<="AAAAAAAAAA".length()*"AAAAAAAAAA".length();i++) {
			System.out.println(i);
		}
	}

	
	public static void main(String...args) {
		method1();
		method2();
	}
}
