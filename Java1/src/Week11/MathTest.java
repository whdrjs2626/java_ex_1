package Week11;

class Math {
	int Add(int a, int b) { // �Ű������� ���� a�� b�� ���ؼ� �������ݴϴ�.
		return (a + b);
	}

	int Sub(int a, int b) { // �Ű������� ���� a���� b�� ���� �������ݴϴ�.
		return (a - b);
	}

    int Mul(int a, int b) { // �Ű������� ���� a�� b�� ���ؼ� �������ݴϴ�.
		return a * b;
	}

	int Div(int a, int b) { // �Ű������� ���� a�� b�� ������ �������ݴϴ�.
		return a / b;
	}
}
public class MathTest {
	public static void main(String[] args) {
		int x = 12;
		int y = 4;
		Math cal = new Math(); // Math Ŭ������ ��ü�� �����մϴ�.
		System.out.println("x = " + x + " y = " + y);
		System.out.println("x + y = " + cal.Add(x, y)); 
		System.out.println("x - y = " + cal.Sub(x, y));
		System.out.println("x * y = " + cal.Mul(x, y));
		System.out.println("x / y = " + cal.Div(x, y));
	}
}
