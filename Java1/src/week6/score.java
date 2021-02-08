package week6;
import java.util.Scanner;
public class score {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[100]; // 점수를 저장할 배열
		int size = 0; // 입력한 점수의 개수
		int num = 0; // 입력할 정수
		int sum = 0; // 입력한 수의 합을 저장할 변수
		while (true) {
			System.out.print("점수를 입력하세요(-1을 입력하면 입력 종료) : ");
			num = scan.nextInt(); // 정수 입력
			if (num == -1)
				break; // 입력한 정수가 -1이면 반복문을 벗어납니다.
			scores[size++] = num;
			sum += num;
		}
		for (int i = 0; i < size; i++) { // 배열을 내림차 순으로 정렬하는 반복문입니다.
			for (int j = i + 1; j < size; j++) { // j는 항상 i보다 큰 인덱스를 반복합니다.
				if (scores[i] < scores[j]) { // 앞에게 뒤에거보다 작으면 두 데이터를 바꿔줍니다.
					int small = scores[i];
					scores[i] = scores[j];
					scores[j] = small;
				}
			}
		}

		System.out.print("\n점수 :");
		for (int i = 0; i < size; i++) { // 정렬된 배열을 출력합니다.
			System.out.print("  " + scores[i]);
		}
		System.out.println("\n평균 : " + (double) sum / size); // 합계 / 입력한 갯수 = 평균
		System.out.print("최고 점수 : " + scores[0]); // 내림차 순 정렬에 의해 0번째 데이터가 최대값입니다.
		System.out.println("  최저 점수 : " + scores[size - 1]); // 마지막 데이터가 최소값입니다.

		while (true) {
			boolean found = false;
			System.out.print("\n등수를 알고 싶은 정수를 입력하세요(-1을 입력하면 종료) : ");
			num = scan.nextInt();
			if (num == -1) {
				System.out.println("-1을 입력하여 종료합니다.");
				break; // 입력한 정수가 -1이면 반복문을 벗어납니다.
			}
			for (int i = 0; i < size; i++) {
				if (scores[i] == num) {
					System.out.println("찾는 점수는 " + (i + 1) + "등 입니다.");
					found = true;
				}
			}
			if (found == false) {
				System.out.println("찾는 점수는 존재하지 않습니다.");
			}
		}
	}
}