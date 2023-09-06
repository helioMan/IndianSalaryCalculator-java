import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic payment as provided:");
        int basicSalary = sc.nextInt();

        System.out.println("Enter the HRA rate on your basic salary:");
        double rateHRA = sc.nextDouble();
        double salaryAfterHRA = (rateHRA/100) * basicSalary;

        System.out.println("Enter the DA rate on your basic salary:");
        double rateDA = sc.nextDouble();
        double salaryAfterDA = (rateDA/100) * basicSalary;

        System.out.println("Enter the special allowance given:");
        double specialAllowance = sc.nextDouble();
        System.out.println("Enter the medical allowance given:");
        double medicalAllowance = sc.nextDouble();

        System.out.println("Your salary after adding basic salary, salary after HRA, salary after DA, special allowance, medical allowance is:");
        double subTotalA = basicSalary + salaryAfterHRA + salaryAfterDA + specialAllowance + medicalAllowance;
        System.out.println(subTotalA);

        System.out.println("Enter the employer contribution in your salary:");
        double employerContribution = sc.nextInt();
        System.out.println("Add the gratuity now:");
        double gratuityValue = sc.nextDouble();

        double subTotalB = employerContribution + gratuityValue;
        System.out.println("Salary after the employer contribution and gratuity value is:");
        System.out.println(subTotalB);

        System.out.println("Enter the performance bonus that is being given:");
        int performanceBonus = sc.nextInt();

        System.out.println("Additional amount given as the performance bonus is:");
        System.out.println((double) performanceBonus);

        System.out.println("So, the gross salary per month is: ");
        System.out.println(subTotalA + subTotalB + performanceBonus);

        double monthlyCTC = subTotalA + subTotalB + performanceBonus;
        System.out.println("Also the yearly CTC is: ");
        System.out.println(12 * monthlyCTC);
    }
}