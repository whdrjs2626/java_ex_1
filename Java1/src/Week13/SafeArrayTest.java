package Week13;

public class SafeArrayTest {
	public static void main(String[] args) {
		SafeArray array = new SafeArray(3); // �迭�� ũ��� 3 
		
		for(int i = 0; i < (array.length+1); i++) { 
			array.put(i, i * 10); // �迭�� �ִ� �ε��� 2�� �ʰ��ؼ� �����մϴ�.
		}
		
		for(int i = 0; i < (array.length+1); i++) {
			System.out.print(array.get(i) + "  ");
		}
	}
}
