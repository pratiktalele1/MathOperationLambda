@FunctionalInterface
interface Addition {
	public void addition(int x, int y);
}

@FunctionalInterface
interface Subtraction {
	public void subtraction(int x, int y);
}

@FunctionalInterface
interface Division {
	public void division(int x, int y);
}

public class UC_1_1 {
	public void operation() {
		Addition addition = (x, y) -> {
			System.out.println("addition is :: " + (x + y));
		};

		Subtraction subtraction = (x, y) -> {
			System.out.println("subtraction is :: " + (x - y));
		};

		Division division = (x, y) -> {
			System.out.println("division is :: " + (x / y));
		};

		addition.addition(4, 5);
		subtraction.subtraction(6, 2);
		division.division(6, 2);
	}
}
