package calc;

public class Arithmetic {
	public static float add(float num1, float num2) {
		return num1 + num2;
	}

	public static float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public static float multiply(float num1, float num2) {
		return num1 * num2;
	}

	public static float divide(float num1, float num2) {
		return num1 / num2;
	}

	public static float square(float num1) {
		return Arithmetic.power(num1, 2.0f);
	}

	public static float cube(float num1) {
		return Arithmetic.power(num1, 3.0f);
	}

	public static float power(float num1, float num2) {
		return (float) Math.pow(num1, num2);
	}

	public static float mod(float num1, float num2) {
		return num1 % num2;
	}
}