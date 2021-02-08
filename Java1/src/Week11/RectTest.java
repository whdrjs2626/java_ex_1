package Week11;

import java.util.Scanner;

class Rectangle {
	double width; // ���� �ʺ� ������ ����
	double height; // ���̸� ������ ����

	double area() { // �ʺ�*���̸� ���Ͽ� �簢���� ���̸� ���� ��ȯ���ݴϴ�.
		return width * height;
	}

	double perimeter() { // �ʺ�*2 + ���� *2�� �Ͽ� �ѷ��� ���� ��ȯ���ݴϴ�.
		return (width * 2 + height * 2);
	}

	void modify(double w, double h) { // �簢���� �ʺ�� ���̸� �Ű������� ������ �����ŵ�ϴ�.
		width = w;
		height = h;
	}

	void modifyRatio(double r) { // �簢���� �ʺ�� ���̸� �Ű������� ������ŭ �������ݴϴ�.
		width *= r;
		height *= r;
	}
}

public class RectTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		// ó�� �簢���� �ʱ�ȭ���ݴϴ�.
		Rectangle shape = new Rectangle();
		System.out.print("�ʺ� : ");
		double w = sc.nextDouble();
		System.out.print("���� : ");
		double h = sc.nextDouble();
		shape.modify(w, h);
		System.out.println("���� : " + shape.area() + "   �ѷ�  : " + shape.perimeter());
		
		while (a != -1) { // ������ �ʱ�ȭ�� �簢���� �����ϴ� ������ �մϴ�. -1�Է½� ����
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
