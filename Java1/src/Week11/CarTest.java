package Week11;

import java.util.Scanner;

class Car {
	String color; // 차의 색상을 저장할 변수
	double speed; // 차의 속도를 저장할 변수
	int gear; // 차의 기어상태를 저장할 변수

	void changeGear(int n) { // 매개변수로 받은 값으로 기어를 변속합니다.
		gear = n;
	}

	void speedUp() { // 속도를 10 증가시킵니다.
		speed += 10;
	}

	void speedDown() { // 속도를 10 감소시킵니다.
		speed -= 10;
	}

	void carPrint() { // 차의 색상, 기어, 속도를 출력합니다.
		System.out.println("차 색상 : " + color);
		System.out.println("기어     : " + gear);
		System.out.println("속도     : " + speed);
	}

}

public class CarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		Car car = new Car(); // 객체 생성
		car.color = "Black"; // 차의 상태를 초기화합니다.
		car.speed = 15.8;
		car.gear = 1;
		while (a != -1) { // a가 -1이 아니면 반복문을 계속 반복합니다.
			car.carPrint(); // 반복문이 실행될 때 마다 차의 상태를 출력합니다.
			System.out.print("수행할 동작을 입력하시오(기어 변속 : 1, 가속 : 2, 감속 : 3, 종료 : -1) : ");
			a = sc.nextInt(); 
			if (a == 1) { // 1을 입력했다면 기어를 변속합니다.
				System.out.print("몇 단으로 변속하시겠습니까? : ");
				int n = sc.nextInt();
				car.changeGear(n);
			} else if (a == 2) { // 2를 입력했다면 가속합니다.
				car.speedUp();
			} else if (a == 3) { // 3을 입력했다면 감속합니다.
				car.speedDown();
			}
		}
		System.out.println("프로그램 종료"); // -1을 입력하여 반복문을 빠져나오면 프로그램을 종료합니다.
	}
}