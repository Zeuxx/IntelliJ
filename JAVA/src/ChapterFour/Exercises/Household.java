package Exercises;

/* 
 * Created by Isaac on 7/13/2017.
 */
public class Household
    {
        private int occupants;
        private double annualIncome;

        Household()
            {
                this.occupants = 1;
                this.annualIncome = 0;
            }

        public Household(int occupants)
            {
                this.occupants = occupants;
                this.annualIncome = 0;
            }

        public Household(int occupants, double annualIncome)
            {
                this.occupants = occupants;
                this.annualIncome = annualIncome;
            }

        int getOccupants()
            {
                return occupants;
            }

        void setOccupants(int occupants)
            {
                this.occupants = occupants;
            }

        double getAnnualIncome()
            {
                return annualIncome;
            }

        void setAnnualIncome(double annualIncome)
            {
                this.annualIncome = annualIncome;
            }
    }
