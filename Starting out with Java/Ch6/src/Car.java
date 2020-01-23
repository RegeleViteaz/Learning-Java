public class Car
{
    private int yearModel;
    private String make;
    private int speed;

    /**
     * Constructor
     * @param carYearModel The car's year model
     * @param carMake The make of the car
     */
    public Car(int carYearModel, String carMake)
    {
        yearModel = carYearModel;
        make = carMake;
        speed = 0;
    }

    /**
     * The setYearModel method sets the car's year model
     * @param carYearModel
     */
    public void setYearModel(int carYearModel)
    {
        yearModel = carYearModel;
    }

    /**
     * The setMake method sets the make of the car
     * @param carMake The make of the car
     */
    public void setMake(String carMake)
    {
        make = carMake;
    }

    /**
     * The setSpeed method sets the car's speed
     * @param carSpeed The car's speed
     */
    public void setSpeed(int carSpeed)
    {
        speed = carSpeed;
    }

    /**
     * The getYearModel method returns the car's year model
     * @return The car's year model
     */
    public int getYearModel()
    {
        return yearModel;
    }

    /**
     * The getMake method returns the make of the car
     * @return The make of the car
     */
    public String getMake()
    {
        return make;
    }

    /**
     * The getSpeed method returns the car's speed
     * @return The car's speed
     */
    public int getSpeed()
    {
        return speed;
    }

    /**
     * The accelerate method adds 5 to the speed field
     */
    public void accelerate()
    {
        speed += 5;
    }

    /**
     * The brake method subtracts 5 to the speed field
     */
    public void brake()
    {
        speed -= 5;
    }
}
