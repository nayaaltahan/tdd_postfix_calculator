package tdd_postfix_calculator;

public class Calculator {

	public double calculate(String equation) {

		if (equation.contains("+")) {
			return processAddition(equation);
		}
		if (equation.matches("[0-9]+")) {
			return Double.parseDouble(equation);
		}

		return Double.NaN;
	}

	public double processAddition(String equation) {
		String[] elements = equation.split("\\s+");
		double el = 0;
		double result = 0;
		for (int i = 0; i < elements.length; i++) {
			if (!elements[i].equals("+")) {
				el = Double.parseDouble(elements[i]);
				result += el;
			}
		}
		return result;
	}

}
