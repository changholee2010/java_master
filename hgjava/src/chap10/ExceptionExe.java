package chap10;

public class ExceptionExe {
	public static void main(String[] args) {
		try {
			test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of prog.");
	}

	public static void test() throws ClassNotFoundException {
		// 일반예외 : 예외를 처리.

		Class.forName("java.lang.String");

		Class.forName("java.lang.String");

		Class.forName("java.lang.String");

		Class.forName("java.lang.String");

	}
}
