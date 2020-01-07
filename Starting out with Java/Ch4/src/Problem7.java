import java.util.Scanner;

/**
 * Date: 01/07/2020
 * Starting out with Java Programming Challenge Chapter 4 Problem 7: Hotel Occupancy
 * Program that calculates the occupancy rate for each floor of a hotel.
 */
public class Problem7
{
    public static void main(String[] args)
    {
        int totalRooms          = 0,
            totalRoomsOccupied  = 0,
            totalRoomsVacant    = 0;
        double occupancyRate;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the amount of floors in the hotel");
        int hotelFloors = keyboard.nextInt();

        while(!(hotelFloors > 0))
        {
            System.out.println("Invalid number of floors. Enter the amount of floors in the hotel");
            hotelFloors = keyboard.nextInt();
        }

        // Aks for the number of rooms and the total rooms occupied on each floor level
        // and accumulates their respective totals
        for(int floorLevel = 1; floorLevel <= hotelFloors; floorLevel++)
        {
            System.out.println("How many rooms are on the " + floorLevel + " floor");
            int roomsOnFloorLevel = keyboard.nextInt();

            // Input validation: the amount of rooms per floor must be more than 10
            while(!(roomsOnFloorLevel > 10))
            {
                System.out.println("The " + floorLevel + " floor level must have more than 10 rooms");
                roomsOnFloorLevel = keyboard.nextInt();
            }
            totalRooms += roomsOnFloorLevel;

            System.out.println("How many rooms are occupied on the " + floorLevel + " floor");
            int roomsOnFloorLevelOccupied = keyboard.nextInt();
            while(!(roomsOnFloorLevelOccupied <= roomsOnFloorLevel) || !(roomsOnFloorLevelOccupied > 0))
            {
                System.out.println("Invalid input. Enter the amount of rooms that are occupied on the " + floorLevel + " floor");
                roomsOnFloorLevelOccupied = keyboard.nextInt();
            }
            totalRoomsOccupied += roomsOnFloorLevelOccupied;
        }
        totalRoomsVacant = totalRooms - totalRoomsOccupied;
        occupancyRate = totalRoomsOccupied / (double)totalRooms;

        System.out.printf("Your hotel contains " + hotelFloors + " floors, " + totalRooms +
                           " rooms of which " + totalRoomsOccupied + " are occupied and " + totalRoomsVacant +
                           " are vacant.\nTherefore, your occupancy rate is %.2f", occupancyRate);
    }
}
