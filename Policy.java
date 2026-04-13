/**
 * Policy class models an insurance policy.
 * A Policy has a PolicyHolder.
 */
public class Policy
{
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    private static final double BASE_FEE = 600.0;
    private static final double AGE_FEE = 75.0;
    private static final double SMOKER_FEE = 100.0;
    private static final double BMI_THRESHOLD = 35.0;
    private static final double BMI_MULTIPLIER = 20.0;

    private static int policyCount = 0;

    /**
     * Default constructor.
     */
    public Policy()
    {
        policyNumber = 0;
        providerName = "";
        policyHolder = new PolicyHolder("", "", 0, "non-smoker", 0.0, 0.0);
        policyCount++;
    }

    /**
     * Constructs a Policy object with all attributes.
     * @param policyNumber the policy number
     * @param providerName the provider name
     * @param policyHolder the policy holder object
     */
    public Policy(int policyNumber, String providerName, PolicyHolder policyHolder)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(policyHolder); // deep copy
        policyCount++;
    }

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
     * Gets a copy of the policy holder.
     * @return a copy of the policy holder
     */
    public PolicyHolder getPolicyHolder()
    {
        return new PolicyHolder(policyHolder);
    }

    /**
     * Gets the number of Policy objects created.
     * @return the number of Policy objects
     */
    public static int getPolicyCount()
    {
        return policyCount;
    }

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
     * Sets the policy holder using a copy.
     * @param policyHolder the policy holder to set
     */
    public void setPolicyHolder(PolicyHolder policyHolder)
    {
        this.policyHolder = new PolicyHolder(policyHolder);
    }

    /**
     * Calculates and returns the policy price.
     * @return the total policy price
     */
    public double getPolicyPrice()
    {
        double price = BASE_FEE;

        if (policyHolder.getAge() > 50)
        {
            price += AGE_FEE;
        }

        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
        {
            price += SMOKER_FEE;
        }

        double bmi = policyHolder.getBMI();

        if (bmi > BMI_THRESHOLD)
        {
            price += (bmi - BMI_THRESHOLD) * BMI_MULTIPLIER;
        }

        return price;
    }

    /**
     * Returns the Policy information as a string.
     * @return the Policy information
     */
    public String toString()
    {
        return "Policy Number: " + policyNumber + "\n\n" +
               "Provider Name: " + providerName + "\n\n" +
               policyHolder.toString() + "\n\n" +
               "Policy Price: $" + String.format("%.2f", getPolicyPrice());
    }
}