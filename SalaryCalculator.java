import java.util.Scanner;

class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input basic salary
        System.out.println("Enter the basic salary as provided:");
        int basicSalary = sc.nextInt();

        // Input HRA rate
        System.out.println("Enter the HRA rate on your basic salary:");
        double rateHRA = sc.nextDouble();
        double salaryAfterHRA = (rateHRA / 100) * basicSalary;

        // Input DA rate
        System.out.println("Enter the DA rate on your basic salary:");
        double rateDA = sc.nextDouble();
        double salaryAfterDA = (rateDA / 100) * basicSalary;

        // Input special allowance and medical allowance
        System.out.println("Enter the special allowance given:");
        double specialAllowance = sc.nextDouble();
        System.out.println("Enter the medical allowance given:");
        double medicalAllowance = sc.nextDouble();

        // Calculate subtotal A
        System.out.println("Your salary after adding basic salary, salary after HRA, salary after DA, special allowance, medical allowance is:");
        double subTotalA = basicSalary + salaryAfterHRA + salaryAfterDA + specialAllowance + medicalAllowance;
        System.out.println(subTotalA);

        // Input employer contribution and gratuity
        System.out.println("Enter the employer contribution in your salary:");
        double employerContribution = sc.nextDouble();
        System.out.println("Add the gratuity now:");
        double gratuityValue = sc.nextDouble();

        // Calculate subtotal B
        double subTotalB = employerContribution + gratuityValue;
        System.out.println("Salary after the employer contribution and gratuity value is:");
        System.out.println(subTotalB);

        // Input performance bonus
        System.out.println("Enter the performance bonus that is being given:");
        int performanceBonus = sc.nextInt();

        // Calculate gross salary per month
        System.out.println("Additional amount given as the performance bonus is:");
        System.out.println((double) performanceBonus);

        System.out.println("So, the gross salary per month is: ");
        double monthlyCTC = subTotalA + subTotalB + performanceBonus;
        System.out.println(monthlyCTC);

        // Calculate yearly CTC
        System.out.println("Also, the yearly CTC is: ");
        System.out.println(12 * monthlyCTC);

        sc.close();
    }
}
