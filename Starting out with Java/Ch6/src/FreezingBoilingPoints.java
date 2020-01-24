/**
 * Date: 01/24/2020
 * Starting out with Java Programming Challenge Chapter 6 Problem 9: FreezingBoilingPoints Class
 * FreezingBoilingPoints class holds information about bank charges
 */

public class FreezingBoilingPoints
{
    private double temperature;
    private final int freezingPoint_EthylAlcohol = -173;
    private final int boilingPoint_EthylAlcohol = 172;
    private final int freezingPoint_Oxygen = -362;
    private final int boilingPoint_Oxygen = -306;
    private final int freezingPoint_Water = 32;
    private final int boilingPoint_Water = 212;

    public FreezingBoilingPoints()
    {
        temperature = 0.0;
    }

    public FreezingBoilingPoints(double temp)
    {
        temperature = temp;
    }

    public void setTemperature(double temp)
    {
        temperature = temp;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public boolean isEthylFreezing()
    {
        return temperature <= freezingPoint_EthylAlcohol;
    }

    public boolean isEthylBoiling()
    {
        return temperature >= boilingPoint_EthylAlcohol;
    }

    public boolean isOxygenFreezing()
    {
        return temperature <= freezingPoint_Oxygen;
    }

    public boolean isOxygenBoiling()
    {
        return temperature >= boilingPoint_Oxygen;
    }

    public boolean isWaterFreezing()
    {
        return temperature <= freezingPoint_Water;
    }

    public boolean isWaterBoiling()
    {
        return temperature >= boilingPoint_Water;
    }
}
