public class MortgageCalculator {

    public double computeMaxMortgage(
            int yearOfBirth, int employmentLength, int numberOfChildren,
            double income, boolean hasSpouse, double spouseIncome, String jobTitle
    ) {
        if (!isEligibleByAge(yearOfBirth)) return 0;

        double baseAmount = calculateBaseAmount(income, employmentLength, numberOfChildren);
        baseAmount += getSpouseContribution(hasSpouse, spouseIncome);
        baseAmount += getJobBonus(jobTitle);

        return baseAmount;
    }

    private boolean isEligibleByAge(int yearOfBirth) {
        return yearOfBirth <= 2000;
    }

    private double calculateBaseAmount(double income, int employmentLength, int children) {
        return (income * 20) + (employmentLength * 1000) - (children * 2000);
    }

    private double getSpouseContribution(boolean hasSpouse, double spouseIncome) {
        return hasSpouse ? spouseIncome * 10 : 0;
    }

    private double getJobBonus(String jobTitle) {
        return switch (jobTitle.toLowerCase()) {
            case "developer" -> 20000;
            case "architect" -> 30000;
            default -> 0;
        };
    }
}
