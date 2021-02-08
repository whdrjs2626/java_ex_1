package Week11;

public class Answer_01_Math {
	public static int Add(int a, int b) {
		return (a+b);
	}

	public static int Sub(int a, int b) {
		return (a-b);
	}

	public static int Mul(int a, int b) {
		return a*b;
	}

	public static int Div(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		System.out.println("x = " + x + " y = " + y);
		System.out.println("x + y = " + Add(x,y));
		System.out.println("x - y = " + Sub(x,y));
		System.out.println("x * y = " + Mul(x,y));
		System.out.println("x / y = " + Div(x,y));
	}
}
