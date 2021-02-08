package Week11;

import java.util.Scanner;

class Car {
	String color; // ���� ������ ������ ����
	double speed; // ���� �ӵ��� ������ ����
	int gear; // ���� �����¸� ������ ����

	void changeGear(int n) { // �Ű������� ���� ������ �� �����մϴ�.
		gear = n;
	}

	void speedUp() { // �ӵ��� 10 ������ŵ�ϴ�.
		speed += 10;
	}

	void speedDown() { // �ӵ��� 10 ���ҽ�ŵ�ϴ�.
		speed -= 10;
	}

	void carPrint() { // ���� ����, ���, �ӵ��� ����մϴ�.
		System.out.println("�� ���� : " + color);
		System.out.println("���     : " + gear);
		System.out.println("�ӵ�     : " + speed);
	}

}

public class CarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		Car car = new Car(); // ��ü ����
		car.color = "Black"; // ���� ���¸� �ʱ�ȭ�մϴ�.
		car.speed = 15.8;
		car.gear = 1;
		while (a != -1) { // a�� -1�� �ƴϸ� �ݺ����� ��� �ݺ��մϴ�.
			car.carPrint(); // �ݺ����� ����� �� ���� ���� ���¸� ����մϴ�.
			System.out.print("������ ������ �Է��Ͻÿ�(��� ���� : 1, ���� : 2, ���� : 3, ���� : -1) : ");
			a = sc.nextInt(); 
			if (a == 1) { // 1�� �Է��ߴٸ� �� �����մϴ�.
				System.out.print("�� ������ �����Ͻðڽ��ϱ�? : ");
				int n = sc.nextInt();
				car.changeGear(n);
			} else if (a == 2) { // 2�� �Է��ߴٸ� �����մϴ�.
				car.speedUp();
			} else if (a == 3) { // 3�� �Է��ߴٸ� �����մϴ�.
				car.speedDown();
			}
		}
		System.out.println("���α׷� ����"); // -1�� �Է��Ͽ� �ݺ����� ���������� ���α׷��� �����մϴ�.
	}
}