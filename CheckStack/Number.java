package CheckStack;

public class Number {
	
	
	public static void main(String[] args) {
		System.out.println("-----Frist main----");
        method1();
        System.out.println("-------last main----");
}

	private static void method1() {
		System.out.println("------frist method1----");
		method2();
		System.out.println("------last method1----");
	}

	private static void method2() {
		System.out.println("-------frist method1");
		int c =10/2;
		System.out.println(c);
		System.out.println("------last method2----");
	}

}
