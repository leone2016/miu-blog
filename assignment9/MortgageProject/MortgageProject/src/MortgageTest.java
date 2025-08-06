import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MortgageTest {

	private final MortgageCalculator calculator = new MortgageCalculator();

	@Test
	public void shouldApproveMortgageForEligibleArchitect() {
		double result = calculator.computeMaxMortgage(1967, 5, 2, 3000, false, 0, "Architect");
		assertEquals(180000, result, 0.001);
	}

	@Test
	public void shouldRejectMortgageForYoungApplicant() {
		double result = calculator.computeMaxMortgage(2001, 5, 2, 3000, false, 0, "Architect");
		assertEquals(0, result, 0.001);
	}

	@Test
	public void shouldCalculateForDeveloperWithSpouse() {
		double result = calculator.computeMaxMortgage(1977, 12, 2, 4000, true, 2000, "Developer");
		assertEquals(220000, result, 0.001);
	}

	@Test
	public void shouldCalculateWithZeroValues() {
		double result = calculator.computeMaxMortgage(1980, 0, 0, 0, false, 0, "Unemployed");
		assertEquals(0, result, 0.001);
	}
}
