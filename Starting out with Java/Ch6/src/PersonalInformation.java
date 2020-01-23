/**
 * Date: 01/23/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 3: Personal Information class
 * Personal Information class holds information about a person
 */

public class PersonalInformation
{
    private String name;
    private String address;
    private int age;
    private int phoneNumber;

    public PersonalInformation()
    {
        name = "";
        address = "";
        age = 0;
        phoneNumber = 0;
    }

    public PersonalInformation(String persoName, String persoAddress, int persoAge, int persoPhoneNumber)
    {
        name = persoName;
        address = persoAddress;
        age = persoAge;
        phoneNumber = persoPhoneNumber;
    }

    public void setName(String persoName)
    {
        name = persoName;
    }

    public void setAddress(String persoAddress)
    {
        address = persoAddress;
    }

    public void setAge(int persoAge)
    {
        age = persoAge;
    }

    public void setPhoneNumber(int persoPhoneNumber)
    {
        phoneNumber = persoPhoneNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getAge()
    {
        return age;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }
}
