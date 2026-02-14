/**
 * Policy class models an insurance policy.
 * Stores policyholder information and calculates BMI and policy price.
 */
public class Policy
{
    // Fields
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double heightInches;
    private double weightPounds;

    // Constants
    private static final double BASE_FEE = 600.0;
    private static final double AGE_FEE = 75.0;
    private static final double SMOKER_FEE = 100.0;
    private static final double BMI_FACTOR = 703.0;
    private static final double BMI_THRESHOLD = 35.0;
    private static final double BMI_MULTIPLIER = 20.0;

    // No-arg constructor
    public Policy()
    {
        policyNumber = 0;
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        heightInches = 0.0;
        weightPounds = 0.0;
    }

    // Full constructor
    public Policy(int policyNumber, String providerName, String firstName,
                  String lastName, int age, String smokingStatus,
                  double heightInches, double weightPounds)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }

    // Getters
    public int getPolicyNumber()
    {
        return policyNumber;
    }

    public String getProviderName()
    {
        return providerName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    public double getHeightInches()
    {
        return heightInches;
    }

    public double getWeightPounds()
    {
        return weightPounds;
    }

    // Setters
    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setSmokingStatus(String smokingStatus)
    {
        this.smokingStatus = smokingStatus;
    }

    public void setHeightInches(double heightInches)
    {
        this.heightInches = heightInches;
    }

    public void setWeightPounds(double weightPounds)
    {
        this.weightPounds = weightPounds;
    }

    // BMI calculation (no stale data)
    public double getBMI()
    {
        return (weightPounds * BMI_FACTOR) / (heightInches * heightInches);
    }

    // Policy price calculation (no stale data)
    public double getPolicyPrice()
    {
        double price = BASE_FEE;

        if (age > 50)
        {
            price += AGE_FEE;
        }

        if (smokingStatus.equalsIgnoreCase("smoker"))
        {
            price += SMOKER_FEE;
        }

        double bmi = getBMI();

        if (bmi > BMI_THRESHOLD)
        {
            price += (bmi - BMI_THRESHOLD) * BMI_MULTIPLIER;
        }

        return price;
    }
}
