package Exercises;

/* 
 * Created by Isaac on 7/10/2017.
 */
public class Commission
    {
        private double salesFigure;
        private double dblRate;
        private int rate;

        public Commission(double salesFigure, double dblRate, int rate)
            {
                this.salesFigure = salesFigure;
                this.dblRate = dblRate;
                this.rate = rate;
            }

        public static void main(String[] args)
            {
                Commission one = new Commission(1000, .03, 3);
                Commission two = new Commission(1000, .04, 4);
                display(one);
                display(two);
                System.out.println("Commission using 1a is: ");
                computeCommission(1000);
            }

        public static void display(Commission a)
            {
                System.out.println("The sales are " + a.salesFigure + ", the rate is " + a.dblRate + "%.");
                System.out.println("Commission using double is: ");
                computeCommission(a.salesFigure, a.dblRate);
                System.out.println("Commission using integer is: ");
                computeCommission(a.salesFigure, a.rate);
                System.out.println('\n');
            }

        public static void computeCommission(double salesFigure, double dblRate)
            {
                System.out.println(salesFigure * dblRate);
            }

        public static void computeCommission(double salesFigure, int rate)
            {
                System.out.println( (rate / 100.0) * salesFigure);
            }

        public static void computeCommission(double salesFigure)
            {
                double rate = .075;
                System.out.println( rate  * salesFigure);
            }

        public double getRate()
            {
                return rate;
            }

        public void setRate(int rate)
            {
                this.rate = rate;
            }

        public double getDblRate()
            {
                return dblRate;
            }

        public void setDblRate(double dblRate)
            {
                this.dblRate = dblRate;
            }

        public double getSalesFigure()
            {
                return salesFigure;
            }

        public void setSalesFigure(double salesFigure)
            {
                this.salesFigure = salesFigure;
            }
    }
