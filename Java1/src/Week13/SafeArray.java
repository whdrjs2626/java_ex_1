package Week13;

public class SafeArray {
	private int a[];
	public int length; // �迭 a�� ũ�⸦ ������ �����Դϴ�.
	
	public SafeArray(int size) { // �迭 a�� a�� ����� �ʱ�ȭ���ִ� �������Դϴ�.
		a = new int[size];
		length = size;
	}
	
	public int get(int index) { // a�迭�� index���� �����͸� �������ݴϴ�. 
		if(index >= length) { // index�� �迭 ũ�� �ʰ� �� -1 ����
			return -1;
		}
		else {
			return a[index]; // index�� �������� �� �����͸� �������ݴϴ�.
		}
	}
	
	public void put(int index, int value) { // index��° �����͸� value�� �����մϴ�.
		if(index >= length) { // �迭 ũ�� �ʰ� �� ���� ���� ���
			System.out.println("�߸��� �ε��� " + index);
		}
		else { // ���� ���� �� �����͸� �����մϴ�.
			a[index] = value;
		}
	}
}