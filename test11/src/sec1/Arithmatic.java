package sec1;

public class Arithmatic extends Repeator{

	@Override
	int power(int num1, int num2) { // 제곱(num1^num2) => ex) 2, 3
		int tmp = num1;
		for(int i = 1; i < num2; i++) {
			num1 = num1 * tmp;
		}
		return num1;
	}

	@Override
	public int multiply(int num1, int num2) { // 곱셈
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) { // 나눗셈
		int su = 0;
		if ( num1 > num2) {
			su = num1 / num2;
		} else {
			su = num2 / num1;
		}
		return su;
	}
	
	public void print() {
		System.out.println("계산기, 중계기, 연산기, ");
	}

}
