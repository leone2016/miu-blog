public class Application {
	public static void main(String[] args) {
		MortgageCalculator calculator = new MortgageCalculator();

		double mortgage = calculator.computeMaxMortgage(
				1985, 10, 1, 4000, true, 2000, "Developer"
		);

		System.out.println("Maximum mortgage: $" + mortgage);
	}
}
