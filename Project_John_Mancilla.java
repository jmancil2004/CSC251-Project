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

        while (file.hasNextLine())
        {
            String line = file.nextLine().trim();

            if (line.equals(""))
            {
                continue;
            }

            int policyNumber = Integer.parseInt(line);
            String providerName = file.nextLine();
            String firstName = file.nextLine();
            String lastName = file.nextLine();
            int age = Integer.parseInt(file.nextLine());
            String smokingStatus = file.nextLine();
            double height = Double.parseDouble(file.nextLine());
            double weight = Double.parseDouble(file.nextLine());

            PolicyHolder holder = new PolicyHolder(firstName, lastName, age,
                                                   smokingStatus, height, weight);

            Policy policy = new Policy(policyNumber, providerName, holder);

            policies.add(policy);
        }

        file.close();

        int smokers = 0;
        int nonSmokers = 0;

        for (Policy p : policies)
        {
            System.out.println(p);
            System.out.println();

            if (p.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
                smokers++;
            else
                nonSmokers++;
        }

        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println();
        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
    }
}