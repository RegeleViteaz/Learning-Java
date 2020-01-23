import java.util.Scanner;

public class PersonalInformationDemo
{
    public static void main(String[] args)
    {
        PersonalInformation joeDoe = new PersonalInformation();
        PersonalInformation johnCoy = new PersonalInformation("Joe Coy", "12345 world street", 25, 1234567890);

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the name of the joeDoe object: ");
        String joeDoeName = keyboardInput.nextLine();

        System.out.print("Enter the address of the joeDoe object: ");
        String joeDoeAddress = keyboardInput.nextLine();
        keyboardInput.nextLine(); // Consume nextLine

        System.out.print("Enter the age of the joeDoe object: ");
        int joeDoeAge = keyboardInput.nextInt();

        System.out.print("Enter the phone number of the joeDoe object: ");
        int joeDoePhoneNum = keyboardInput.nextInt();

        joeDoe.setName(joeDoeName);
        joeDoe.setAddress(joeDoeAddress);
        joeDoe.setAge(joeDoeAge);
        joeDoe.setPhoneNumber(joeDoePhoneNum);

        System.out.println("The joeDoe object has the following properties\n" +
                           "Name: " + joeDoe.getName() + "\nAddress: " + joeDoe.getAddress() +
                           "\nAge: " + joeDoe.getAge() + "\nPhone Number: " + joeDoe.getPhoneNumber());
    }
}
