@FunctionalInterface
interface Addition1 {
	public void addition(int x, int y);
}

@FunctionalInterface
interface Subtraction1 {
	public void subtraction(int x, int y);
}

@FunctionalInterface
interface Division1 {
	public void division(int x, int y);
}

public class UC_1_2 {
	public void operation() {
		Addition1 addition = (x, y) -> {
			System.out.println("addition is :: " + (x + y));
		};

		Subtraction1 subtraction = (x, y) -> {
			System.out.println("subtraction is :: " + (x - y));
		};

		Division1 division = (x, y) -> {
			System.out.println("division is :: " + (x / y));
		};

		addition.addition(4, 5);
		subtraction.subtraction(6, 2);
		division.division(6, 2);
	}

}
