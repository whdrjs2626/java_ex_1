package Week13;

public class SafeArrayTest {
	public static void main(String[] args) {
		SafeArray array = new SafeArray(3); // 배열의 크기는 3 
		
		for(int i = 0; i < (array.length+1); i++) { 
			array.put(i, i * 10); // 배열의 최대 인덱스 2를 초과해서 접근합니다.
		}
		
		for(int i = 0; i < (array.length+1); i++) {
			System.out.print(array.get(i) + "  ");
		}
	}
}
