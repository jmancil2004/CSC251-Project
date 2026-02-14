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
}
