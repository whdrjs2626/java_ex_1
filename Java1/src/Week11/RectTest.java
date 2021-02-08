package Week11;

import java.util.Scanner;

class Rectangle {
	double width; // 가로 너비를 저장할 변수
	double height; // 높이를 저장할 변수

	double area() { // 너비*높이를 곱하여 사각형의 넓이를 구해 반환해줍니다.
		return width * height;
	}

	double perimeter() { // 너비*2 + 높이 *2를 하여 둘레를 구해 반환해줍니다.
		return (width * 2 + height * 2);
	}

	void modify(double w, double h) { // 사각형의 너비와 높이를 매개변수의 값으로 변경시킵니다.
		width = w;
		height = h;
	}

	void modifyRatio(double r) { // 사각형의 너비와 높이를 매개변수의 비율만큼 변경해줍니다.
		width *= r;
		height *= r;
	}
}

public class RectTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		// 처음 사각형을 초기화해줍니다.
		Rectangle shape = new Rectangle();
		System.out.print("너비 : ");
		double w = sc.nextDouble();
		System.out.print("높이 : ");
		double h = sc.nextDouble();
		shape.modify(w, h);
		System.out.println("넓이 : " + shape.area() + "   둘레  : " + shape.perimeter());
		
		while (a != -1) { // 위에서 초기화한 사각형을 변경하는 수행을 합니다. -1입력시 종료
			System.out.print("수행할 동작을 입력하시오(사각형 변경 : 1, 비율에 의한 사각형 변경 : 2, 종료 : -1) : ");
			a = sc.nextInt();
			if (a == 1) {
				System.out.print("너비 : ");
				w = sc.nextDouble();
				System.out.print("높이 : ");
				h = sc.nextDouble();
				shape.modify(w, h);
			}
			else if(a == 2) {
				System.out.print("비울 : ");
				double r = sc.nextDouble();
				shape.modifyRatio(r);
			}
			System.out.println("넓이 : " + shape.area() + "   둘레  : " + shape.perimeter());
		}
		
	}
}
