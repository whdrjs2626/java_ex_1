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
		System.out.println("차 색상 : " + color);
		System.out.println("기어     : " + gear);
		System.out.println("속도     : " + speed);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		color = "Blue";
		speed = 11.8;
		gear = 1;
		while(a != -1) {
			carPrint();
			System.out.print("수행할 동작을 입력하시오(기어 변속 : 1, 가속 : 2, 감속 : 3, 종료 : -1) : ");
			a = sc.nextInt();
			if(a == 1) {
				System.out.print("몇 단으로 변속하시겠습니까? : ");
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
		System.out.println("프로그램 종료");
	}
}
