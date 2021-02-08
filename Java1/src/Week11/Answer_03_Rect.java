package Week11;

import java.util.Scanner;

class Rectangle2 {
	double width;
	double height;

	double area() {
		return width * height;
	}

	double perimeter() {
		return (width * 2 + height * 2);
	}

	void modify(double w, double h) {
		width = w;
		height = h;
	}

	void modifyRatio(double r) {
		width *= r;
		height *= r;
	}
}

public class Answer_03_Rect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		Rectangle2 shape = new Rectangle2();
		System.out.print("너비 : ");
		double w = sc.nextDouble();
		System.out.print("높이 : ");
		double h = sc.nextDouble();
		shape.modify(w, h);
		System.out.println("넓이 : " + shape.area() + "   둘레  : " + shape.perimeter());
		while (a != -1) {
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
