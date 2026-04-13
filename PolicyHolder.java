public class PolicyHolder
{
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double heightInches;
    private double weightPounds;

    public PolicyHolder(String firstName, String lastName, int age,
                        String smokingStatus, double heightInches, double weightPounds)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }

    public PolicyHolder(PolicyHolder obj)
    {
        firstName = obj.firstName;
        lastName = obj.lastName;
        age = obj.age;
        smokingStatus = obj.smokingStatus;
        heightInches = obj.heightInches;
        weightPounds = obj.weightPounds;
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

    public double getBMI()
    {
        return (weightPounds * 703) / (heightInches * heightInches);
    }

    public String toString()
    {
        return "Policyholder's First Name: " + firstName + "\n\n" +
               "Policyholder's Last Name: " + lastName + "\n\n" +
               "Policyholder's Age: " + age + "\n\n" +
               "Policyholder's Smoking Status (Y/N): " + smokingStatus + "\n\n" +
               "Policyholder's Height: " + heightInches + " inches\n\n" +
               "Policyholder's Weight: " + weightPounds + " pounds\n\n" +
               "Policyholder's BMI: " + String.format("%.2f", getBMI());
    }
}