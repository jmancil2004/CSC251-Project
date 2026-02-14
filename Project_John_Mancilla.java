import java.util.Scanner;

public class Project_John_Mancilla
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the Policy Number: ");
        int policyNumber = Integer.parseInt(sc.nextLine());

        System.out.print("\nPlease enter the Provider Name: ");
        String providerName = sc.nextLine();

        System.out.print("\nPlease enter the Policyholder's First Name: ");
        String firstName = sc.nextLine();

        System.out.print("\nPlease enter the Policyholder's Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("\nPlease enter the Policyholder's Age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = sc.nextLine();

        System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
        double height = Double.parseDouble(sc.nextLine());

        System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
        double weight = Double.parseDouble(sc.nextLine());

        Policy policy = new Policy(policyNumber, providerName, firstName,
                                   lastName, age, smokingStatus, height, weight);

        System.out.printf("%nPolicy Number: %d%n%n", policy.getPolicyNumber());
        System.out.printf("Provider Name: %s%n%n", policy.getProviderName());
        System.out.printf("Policyholder's First Name: %s%n%n", policy.getFirstName());
        System.out.printf("Policyholder's Last Name: %s%n%n", policy.getLastName());
        System.out.printf("Policyholder's Age: %d%n%n", policy.getAge());
        System.out.printf("Policyholder's Smoking Status: %s%n%n", policy.getSmokingStatus());
        System.out.printf("Policyholder's Height: %.1f inches%n%n", policy.getHeightInches());
        System.out.printf("Policyholder's Weight: %.1f pounds%n%n", policy.getWeightPounds());
        System.out.printf("Policyholder's BMI: %.2f%n%n", policy.getBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.getPolicyPrice());

        sc.close();
    }
}
