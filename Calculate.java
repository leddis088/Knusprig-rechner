public class Calculate {
	public static double addition(double number1, double number2, double number3, double number4, double number5, double number6, double number7) {
		return number1 + number2 + number3 + number4 + number5 + number6 + number7;
	}

	public static double subtraction(double number1, double number2, double number3, double number4, double number5, double number6, double number7) {
		double result;
		if ((number7 == 0.0) && (number6 == 0.0) && (number5 == 0.0) && (number4 == 0.0) && (number3 == 0.0)) {
			result = number2 - number1;
		} else if ((number7 == 0.0) && (number6 == 0.0) && (number5 == 0.0) && (number4 == 0.0)) {
			result = number3 - number2 - number1;
		} else if ((number7 == 0.0) && (number6 == 0.0) && (number5 == 0.0)) {
			result = number4 - number3 - number2 -  number1;
		} else if ((number7 == 0.0) && (number6 == 0.0)) {
			result = number5 - number4 - number3 - number2 - number1;
		} else if (number7 == 0.0) {
			result = number6 - number5 - number4 - number3 - number2 - number1;
		} else {
			result = number7 - number6 - number5 - number4 - number3 - number2 - number1;
		}
		return result;
	}

	public static double multiplication(double number1, double number2, double number3, double number4, double number5, double number6, double number7) {
		double result;
		if ((number7 == 0.0) && (number6 == 0.0) && (number5 == 0.0) && (number4 == 0.0) && (number3 == 0.0)) {
			result = number2 * number1;
		} else if ((number7 == 0.0) && (number6 == 0.0) && (number5 == 0.0) && (number4 == 0.0)) {
			result = number3 * number2 * number1;
		} else if ((number7 == 0.0) && (number6 == 0.0) && (number5 == 0.0)) {
			result = number4 * number3 * number2 *  number1;
		} else if ((number7 == 0.0) && (number6 == 0.0)) {
			result = number5 * number4 * number3 * number2 * number1;
		} else if (number7 == 0.0) {
			result = number6 * number5 * number4 * number3 * number2 * number1;
		} else {
			result = number7 * number6 * number5 * number4 * number3 * number2 * number1;
		}
		return result;
	}

	public static double division(double number1, double number2, double number3, double number4, double number5, double number6, double number7) {
		double result;
		if ((number7 == 0.0) && (number6 == 0.0) && (number5 == 0.0) && (number4 == 0.0) && (number3 == 0.0)) {
			result = number2 / number1;
		} else if ((number7 == 0.0) && (number6 == 0.0) && (number5 == 0.0) && (number4 == 0.0)) {
			result = number3 / number2 / number1;
		} else if ((number7 == 0.0) && (number6 == 0.0) && (number5 == 0.0)) {
			result = number4 / number3 / number2 /  number1;
		} else if ((number7 == 0.0) && (number6 == 0.0)) {
			result = number5 / number4 / number3 / number2 / number1;
		} else if (number7 == 0.0) {
			result = number6 / number5 / number4 / number3 / number2 / number1;
		} else {
			result = number7 / number6 / number5 / number4 / number3 / number2 / number1;
		}
		return result;
	}

	public static double wurzel(double number1) {
		return Math.sqrt(number1);
	}

	public static double power(double number1, double exponent) {
		return Math.pow(number1, exponent);
	}

	public static String binary(int number) {
		String result = "";
		while (number > 0) {
			int remainder = number % 2;
			result = remainder + result;
			number /= 2;
		}
		return  result;
	}
}