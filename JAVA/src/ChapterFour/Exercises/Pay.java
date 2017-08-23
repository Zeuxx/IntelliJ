package Exercises;

/* 
 * Created by Isaac on 7/10/2017.
 * Problem 02: page 181
 */
public class Pay
    {
        private double hoursWorked, payRate, withholdingRate, grossPay, netPay;

        Pay(double hoursWorked, double payRate, double grossPay, double netPay, double withholdingRate)
            {
                this.withholdingRate = withholdingRate;
                this.hoursWorked = hoursWorked;
                this.payRate = payRate;
                this.grossPay = grossPay;
                this.netPay = netPay;
            }

        public void computeNetPay(double hoursWorked, double payRate, double withholdingRate)
            {
                // compute grossPay: hoursWorked * payRate
                setWithholdingRate(withholdingRate);
                setGrossPay(hoursWorked * payRate);
                // compute netPay: grossPay - (grossPay * withholdingRate)
                setNetPay(this.grossPay - (this.grossPay * withholdingRate));
            }

        public void computeNetPay(double hoursWorked, double payRate)
            {
                // compute grossPay: hoursWorked * payRate
                setGrossPay(hoursWorked * payRate);
                // compute netPay: grossPay - (grossPay * withholdingRate)
                this.withholdingRate = 0.15;
                setNetPay(this.grossPay - (this.grossPay * this.withholdingRate));
            }

        public void computeNetPay(double hoursWorked)
            {
                this.withholdingRate = 0.15;
                this.payRate = 5.85;
                // compute grossPay: hoursWorked * payRate
                setGrossPay(hoursWorked * payRate);
                // compute netPay: grossPay - (grossPay * withholdingRate)
                setNetPay(this.grossPay - (this.grossPay * this.withholdingRate));
            }

        public double getHoursWorked()
            {
                return hoursWorked;
            }

        public void setHoursWorked(double hoursWorked)
            {
                this.hoursWorked = hoursWorked;
            }

        public double getPayRate()
            {
                return payRate;
            }

        public void setPayRate(double payRate)
            {
                this.payRate = payRate;
            }

        public double getWithholdingRate()
            {
                return withholdingRate;
            }

        private void setWithholdingRate(double withholdingRate)
            {
                this.withholdingRate = withholdingRate;
            }

        public double getGrossPay()
            {
                return grossPay;
            }

        private void setGrossPay(double grossPay)
            {
                this.grossPay = grossPay;
            }

        public double getNetPay()
            {
                return netPay;
            }

        private void setNetPay(double netPay)
            {
                this.netPay = netPay;
            }
    }
