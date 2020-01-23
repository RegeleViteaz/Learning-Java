public class Employee
{
    private String name; // The employee's name
    private int idNumber; // The employee's id number
    private String department; // The employee's department
    private String position; // The employee's position

    /**
     * Constructor
     * @param empName The employee's name
     * @param empIdNumber The employee's id number
     * @param empDepartment The employee's department
     * @param empPosition The employee's position
     */
    public Employee(String empName, int empIdNumber, String empDepartment, String empPosition)
    {
        name = empName;
        idNumber = empIdNumber;
        department = empDepartment;
        position = empPosition;
    }

    /**
     * Constructor
     * @param empName The employee's name
     * @param empIdNumber The employee's id number
     */
    public Employee(String empName, int empIdNumber)
    {
        name = empName;
        idNumber = empIdNumber;
        department = "";
        position = "";
    }

    /**
     * No-Arg Constructor
     * Initializes the object to default values
     */
    public Employee()
    {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    /**
     * The setName method sets the employee's name
     * @param empName The employee's name
     */
    public void setName(String empName)
    {
        name = empName;
    }

    /**
     * The setName method sets the employee's id number
     * @param empIdNumber The employee's name
     */
    public void setIdNumber(int empIdNumber)
    {
        idNumber = empIdNumber;
    }

    /**
     * The setName method sets the employee's department
     * @param empDepartment The employee's department
     */
    public void setDepartment(String empDepartment)
    {
        department = empDepartment;
    }

    /**
     * The setName method sets the employee's position
     * @param empPosition The employee's position
     */
    public void setPosition(String empPosition)
    {
        position = empPosition;
    }

    /**
     * The getName method returns the employee's name
     * @return The value in the name field
     */
    public String getName()
    {
        return name;
    }

    /**
     * The getIdNumber method returns the employee's id number
     * @return The value in the idNumber field
     */
    public int getIdNumber()
    {
        return idNumber;
    }

    /**
     * The getDepartment method returns the employee's department
     * @return The value stored in the department field.
     */
    public String getDepartment()
    {
        return department;
    }

    /**
     * The getPosition method returns the employee's position
     * @return The value stored in the position field
     */
    public String getPosition()
    {
        return position;
    }
}
