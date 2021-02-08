package Week12;
import java.util.Scanner;

class Calc {
	private String formula; // 멤버변수 
	public Calc(String formula) { // 매개변수를 받아 멤버변수를 초기화하는 생성자입니다. 
		this.formula = formula;
	}
	void calculator() { // 초기화된 멤버 변수 formula를 계산하는 메소드입니다.
		for(int i = 0; i < formula.length(); i++) { // formula를 첫번째 글자부터 끝까지 훑습니다.
			if(formula.charAt(i) == '+') { // +연산자가 식에 있는 경우, i는 연산자의 인덱스입니다.
				double pre = Double.parseDouble(formula.substring(0, i)); // 첫번째 숫자 의 위치는 0~i-1
				double post = Double.parseDouble(formula.substring(i+1)); // 두번째 숫자의 위치는 i+1~끝 입니다.
				System.out.println(pre + " + " + post + " = " + (pre+post)); // 계산 및 출력
			}
			else if(formula.charAt(i) == '-') { // -연산자가 식에 있는 경우
				double pre = Double.parseDouble(formula.substring(0, i));
				double post = Double.parseDouble(formula.substring(i+1));
				System.out.println(pre + " - " + post + " = " + (pre-post));
			}
			else if(formula.charAt(i) == '*') { // *연산자가 식에 있는 경우
				double pre = Double.parseDouble(formula.substring(0, i));
				double post = Double.parseDouble(formula.substring(i+1));
				System.out.println(pre + " * " + post + " = " + (pre*post));
			}
			else if(formula.charAt(i) == '/') { // /연산자가 식에 있는 경우
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
		System.out.print("수식 입력 : ");
		formula = scan.next();
		Calc calc = new Calc(formula); // 객체 생성 및 입력한 수식을 매개변수로 줍니다.
		calc.calculator(); // 수식 계산
	}
}


