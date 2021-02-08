package Week13;

public class SafeArray {
	private int a[];
	public int length; // 배열 a의 크기를 저장할 변수입니다.
	
	public SafeArray(int size) { // 배열 a와 a의 사이즈를 초기화해주는 생성자입니다.
		a = new int[size];
		length = size;
	}
	
	public int get(int index) { // a배열의 index번쨰 데이터를 리턴해줍니다. 
		if(index >= length) { // index가 배열 크기 초과 시 -1 리턴
			return -1;
		}
		else {
			return a[index]; // index가 정상적일 시 데이터를 리턴해줍니다.
		}
	}
	
	public void put(int index, int value) { // index번째 데이터를 value로 설정합니다.
		if(index >= length) { // 배열 크기 초과 시 오류 문장 출력
			System.out.println("잘못된 인덱스 " + index);
		}
		else { // 정상 접근 시 데이터를 설정합니다.
			a[index] = value;
		}
	}
}