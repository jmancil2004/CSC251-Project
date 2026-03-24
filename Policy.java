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

    /**
     * Default constructor that initializes policy with default values.
     */
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

    /**
     * Constructs a Policy object with all attributes.
     * @param policyNumber the policy number
     * @param providerName the provider name
     * @param firstName the policyholder's first name
     * @param lastName the policyholder's last name
     * @param age the policyholder's age
     * @param smokingStatus smoker or non-smoker
     * @param heightInches height in inches
     * @param weightPounds weight in pounds
     */
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

    /**
     * Gets the policy number.
     * @return the policy number
     */
    public int getPolicyNumber()
    {
        return policyNumber;
    }

    /**
     * Gets the provider name.
     * @return the provider name
     */
    public String getProviderName()
    {
        return providerName;
    }

    /**
     * Gets the policyholder's first name.
     * @return the first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Gets the policyholder's last name.
     * @return the last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Gets the policyholder's age.
     * @return the age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Gets the smoking status.
     * @return the smoking status
     */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    /**
     * Gets the height in inches.
     * @return the height in inches
     */
    public double getHeightInches()
    {
        return heightInches;
    }

    /**
     * Gets the weight in pounds.
     * @return the weight in pounds
     */
    public double getWeightPounds()
    {
        return weightPounds;
    }

    // Setters

    /**
     * Sets the policy number.
     * @param policyNumber the policy number to set
     */
    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    /**
     * Sets the provider name.
     * @param providerName the provider name to set
     */
    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    /**
     * Sets the policyholder's first name.
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Sets the policyholder's last name.
     * @param lastName the last name to set
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Sets the policyholder's age.
     * @param age the age to set
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * Sets the smoking status.
     * @param smokingStatus the smoking status to set
     */
    public void setSmokingStatus(String smokingStatus)
    {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Sets the height in inches.
     * @param heightInches the height to set
     */
    public void setHeightInches(double heightInches)
    {
        this.heightInches = heightInches;
    }

    /**
     * Sets the weight in pounds.
     * @param weightPounds the weight to set
     */
    public void setWeightPounds(double weightPounds)
    {
        this.weightPounds = weightPounds;
    }

    /**
     * Calculates and returns the BMI.
     * @return the BMI value
     */
    public double getBMI()
    {
        return (weightPounds * BMI_FACTOR) / (heightInches * heightInches);
    }

    /**
     * Calculates and returns the policy price.
     * @return the total policy price
     */
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
