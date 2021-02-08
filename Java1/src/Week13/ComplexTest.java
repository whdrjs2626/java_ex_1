package Week13;

public class ComplexTest {
	public static void main(String[] args) {
		Complex c1 = new Complex(3.0, 2.0);
		Complex c2 = new Complex(1.0, 7.0);
		Complex r1 = c1.add(c2);
		Complex r2 = c1.multiply(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(r1);
		System.out.println(r2);
		
		Complex d1 = new Complex(3.0, 2.0);
		System.out.println(c1.equals(d1));
		System.out.println(c2.equals(d1));
	}
}
