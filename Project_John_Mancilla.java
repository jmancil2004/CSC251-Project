import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Project_John_Mancilla
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Policy> policies = new ArrayList<>();

        Scanner file = new Scanner(new File("PolicyInformation.txt"));

        while (file.hasNext())
        {
            int policyNumber = file.nextInt();
            file.nextLine();

            String providerName = file.nextLine();
            String firstName = file.nextLine();
            String lastName = file.nextLine();

            int age = file.nextInt();
            file.nextLine();

            String smokingStatus = file.nextLine();

            double height = file.nextDouble();
            double weight = file.nextDouble();
            file.nextLine();

            Policy policy = new Policy(policyNumber, providerName, firstName,
                                       lastName, age, smokingStatus, height, weight);

            policies.add(policy);
        }

        file.close();

        int smokers = 0;
        int nonSmokers = 0;

        for (Policy p : policies)
        {
            System.out.printf("%nPolicy Number: %d%n", p.getPolicyNumber());
            System.out.printf("Provider Name: %s%n", p.getProviderName());
            System.out.printf("Policyholder's First Name: %s%n", p.getFirstName());
            System.out.printf("Policyholder's Last Name: %s%n", p.getLastName());
            System.out.printf("Policyholder's Age: %d%n", p.getAge());
            System.out.printf("Policyholder's Smoking Status: %s%n", p.getSmokingStatus());
            System.out.printf("Policyholder's Height: %.1f inches%n", p.getHeightInches());
            System.out.printf("Policyholder's Weight: %.1f pounds%n", p.getWeightPounds());
            System.out.printf("Policyholder's BMI: %.2f%n", p.getBMI());
            System.out.printf("Policy Price: $%.2f%n%n", p.getPolicyPrice());

            if (p.getSmokingStatus().equalsIgnoreCase("smoker"))
                smokers++;
            else
                nonSmokers++;
        }

        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
    }
}