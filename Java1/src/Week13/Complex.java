package Week13;

public class Complex {
	private double real; // 실수를 저장하기 위한 변수
	private double imaginary; // 허수를 저장하기 위한 변수
	
	public Complex() { // 매개변수가 없는 생성자
		real = 0;
		imaginary = 0;
	}
	public Complex(double real) { // 실수만 초기화하는 생성자
		this.real = real;
		imaginary = 0;
	}
	public Complex(double real, double imaginary) { // 실수, 허수를 초기화하는 생성자
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void setReal(double r) { // 실수 설정자입니다.
		real = r;
	}
	public void setImaginary(double i) { // 허수 설정자입니다.
		imaginary = i;
	}
	
	public double getReal() { // 실수 접근자입니다.
		return real;
	}
	public double getImaginary() { // 허수 접근자입니다.
		return imaginary;
	}
	
	public Complex add(Complex o) { // 현재 객체와 매개변수 객체의 실수, 허수를 더해서 새로운 객체를 리턴해주는 메소드입니다.
		Complex c = new Complex(real + o.getReal(), imaginary + o.getImaginary());
		return c;
	}
	public Complex multiply(Complex o) { // 현재 객체와 매개변수 객체의 복소수의 곱을 하여 새로운 객체를 리턴해주는 메소드입니다.
		Complex c = new Complex(real * o.getReal() - imaginary * o.getImaginary(), real * o.getImaginary() + imaginary * o.getReal());
		return c;
	}
	
	public boolean equals(Complex o) {
		if(real == o.getReal() && imaginary == o.getImaginary()) { // 복소수의 실수부분과 허수부분이 일치할 시 같은 수입니다.
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return real + " + " + imaginary + "i";
	}
}


