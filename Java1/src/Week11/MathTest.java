package Week11;

class Math {
	int Add(int a, int b) { // 매개변수로 받은 a와 b를 더해서 리턴해줍니다.
		return (a + b);
	}

	int Sub(int a, int b) { // 매개변수로 받은 a에서 b를 빼서 리턴해줍니다.
		return (a - b);
	}

    int Mul(int a, int b) { // 매개변수로 받은 a와 b를 곱해서 리턴해줍니다.
		return a * b;
	}

	int Div(int a, int b) { // 매개변수로 받은 a에 b를 나눠서 리턴해줍니다.
		return a / b;
	}
}
public class MathTest {
	public static void main(String[] args) {
		int x = 12;
		int y = 4;
		Math cal = new Math(); // Math 클래스의 객체를 생성합니다.
		System.out.println("x = " + x + " y = " + y);
		System.out.println("x + y = " + cal.Add(x, y)); 
		System.out.println("x - y = " + cal.Sub(x, y));
		System.out.println("x * y = " + cal.Mul(x, y));
		System.out.println("x / y = " + cal.Div(x, y));
	}
}
