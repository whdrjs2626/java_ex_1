package Week13;

public class Complex {
	private double real; // �Ǽ��� �����ϱ� ���� ����
	private double imaginary; // ����� �����ϱ� ���� ����
	
	public Complex() { // �Ű������� ���� ������
		real = 0;
		imaginary = 0;
	}
	public Complex(double real) { // �Ǽ��� �ʱ�ȭ�ϴ� ������
		this.real = real;
		imaginary = 0;
	}
	public Complex(double real, double imaginary) { // �Ǽ�, ����� �ʱ�ȭ�ϴ� ������
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void setReal(double r) { // �Ǽ� �������Դϴ�.
		real = r;
	}
	public void setImaginary(double i) { // ��� �������Դϴ�.
		imaginary = i;
	}
	
	public double getReal() { // �Ǽ� �������Դϴ�.
		return real;
	}
	public double getImaginary() { // ��� �������Դϴ�.
		return imaginary;
	}
	
	public Complex add(Complex o) { // ���� ��ü�� �Ű����� ��ü�� �Ǽ�, ����� ���ؼ� ���ο� ��ü�� �������ִ� �޼ҵ��Դϴ�.
		Complex c = new Complex(real + o.getReal(), imaginary + o.getImaginary());
		return c;
	}
	public Complex multiply(Complex o) { // ���� ��ü�� �Ű����� ��ü�� ���Ҽ��� ���� �Ͽ� ���ο� ��ü�� �������ִ� �޼ҵ��Դϴ�.
		Complex c = new Complex(real * o.getReal() - imaginary * o.getImaginary(), real * o.getImaginary() + imaginary * o.getReal());
		return c;
	}
	
	public boolean equals(Complex o) {
		if(real == o.getReal() && imaginary == o.getImaginary()) { // ���Ҽ��� �Ǽ��κа� ����κ��� ��ġ�� �� ���� ���Դϴ�.
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return real + " + " + imaginary + "i";
	}
}


