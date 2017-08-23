package Exercises;

/* 
 * Created by Isaac on 7/13/2017.
 */
public class TestHousehold
    {
        public static void main(String[] args)
            {
                Household one = new Household();
                System.out.println("Testing constructor:");
                System.out.println("Occupants: " + one.getOccupants());
                System.out.println("Annual Income: " + one.getAnnualIncome());

                System.out.println("Testing getters and setters: ");
                one.setOccupants(5);
                System.out.println("Occupants: " + one.getOccupants());
                one.setAnnualIncome(10000);
                System.out.println("Annual Income: " + one.getAnnualIncome());
            }
    }
