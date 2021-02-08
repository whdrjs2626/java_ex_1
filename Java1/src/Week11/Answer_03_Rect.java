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
		System.out.print("�ʺ� : ");
		double w = sc.nextDouble();
		System.out.print("���� : ");
		double h = sc.nextDouble();
		shape.modify(w, h);
		System.out.println("���� : " + shape.area() + "   �ѷ�  : " + shape.perimeter());
		while (a != -1) {
			System.out.print("������ ������ �Է��Ͻÿ�(�簢�� ���� : 1, ������ ���� �簢�� ���� : 2, ���� : -1) : ");
			a = sc.nextInt();
			if (a == 1) {
				System.out.print("�ʺ� : ");
				w = sc.nextDouble();
				System.out.print("���� : ");
				h = sc.nextDouble();
				shape.modify(w, h);
			}
			else if(a == 2) {
				System.out.print("��� : ");
				double r = sc.nextDouble();
				shape.modifyRatio(r);
			}
			System.out.println("���� : " + shape.area() + "   �ѷ�  : " + shape.perimeter());
		}
		
	}
}
