package Week11;
import java.util.Scanner;

public class Answer_02_Car {
	public static String color;
	public static double speed;
	public static int gear;
	
	public static void changeGear(int n) {
		gear = n;
	}
	public static void speedUp() {
		speed += 10;
	}
	public static void speedDown() {
		speed -= 10;
	}
	public static void carPrint() {
		System.out.println("�� ���� : " + color);
		System.out.println("���     : " + gear);
		System.out.println("�ӵ�     : " + speed);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		color = "Blue";
		speed = 11.8;
		gear = 1;
		while(a != -1) {
			carPrint();
			System.out.print("������ ������ �Է��Ͻÿ�(��� ���� : 1, ���� : 2, ���� : 3, ���� : -1) : ");
			a = sc.nextInt();
			if(a == 1) {
				System.out.print("�� ������ �����Ͻðڽ��ϱ�? : ");
				int n = sc.nextInt();
				changeGear(n);
			}
			else if(a == 2) {
				speedUp();
			}
			else if(a == 3) {
				speedDown();
			}
		}
		System.out.println("���α׷� ����");
	}
}
