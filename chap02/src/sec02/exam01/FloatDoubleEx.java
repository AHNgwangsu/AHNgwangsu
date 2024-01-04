package sec02.exam01;

public class FloatDoubleEx {

	public static void main(String[] args) {
		float num1 = 123.45675568454657635432263f;
		double num2 = 123.45675568454657635432263;

		System.out.println("float형 변수 num1 : " + num1);
		System.out.println("double형 변수 num1 : " + num2);
		double var = 0.1;
		for (int i = 0; i < 10; i++) { // 10회 반복
			var += 0.1;
		}
		System.out.println(var);
	}

}
