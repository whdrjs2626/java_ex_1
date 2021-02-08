package Week12;
import java.util.Scanner;

class Calc {
	private String formula; // ������� 
	public Calc(String formula) { // �Ű������� �޾� ��������� �ʱ�ȭ�ϴ� �������Դϴ�. 
		this.formula = formula;
	}
	void calculator() { // �ʱ�ȭ�� ��� ���� formula�� ����ϴ� �޼ҵ��Դϴ�.
		for(int i = 0; i < formula.length(); i++) { // formula�� ù��° ���ں��� ������ �Ƚ��ϴ�.
			if(formula.charAt(i) == '+') { // +�����ڰ� �Ŀ� �ִ� ���, i�� �������� �ε����Դϴ�.
				double pre = Double.parseDouble(formula.substring(0, i)); // ù��° ���� �� ��ġ�� 0~i-1
				double post = Double.parseDouble(formula.substring(i+1)); // �ι�° ������ ��ġ�� i+1~�� �Դϴ�.
				System.out.println(pre + " + " + post + " = " + (pre+post)); // ��� �� ���
			}
			else if(formula.charAt(i) == '-') { // -�����ڰ� �Ŀ� �ִ� ���
				double pre = Double.parseDouble(formula.substring(0, i));
				double post = Double.parseDouble(formula.substring(i+1));
				System.out.println(pre + " - " + post + " = " + (pre-post));
			}
			else if(formula.charAt(i) == '*') { // *�����ڰ� �Ŀ� �ִ� ���
				double pre = Double.parseDouble(formula.substring(0, i));
				double post = Double.parseDouble(formula.substring(i+1));
				System.out.println(pre + " * " + post + " = " + (pre*post));
			}
			else if(formula.charAt(i) == '/') { // /�����ڰ� �Ŀ� �ִ� ���
				double pre = Double.parseDouble(formula.substring(0, i));
				double post = Double.parseDouble(formula.substring(i+1));
				System.out.println(pre + " / " + post + " = " + (pre/post));
			}
		}
	}
}

public class CalcTest {
	public static void main(String[] args) {
		String formula;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		formula = scan.next();
		Calc calc = new Calc(formula); // ��ü ���� �� �Է��� ������ �Ű������� �ݴϴ�.
		calc.calculator(); // ���� ���
	}
}


