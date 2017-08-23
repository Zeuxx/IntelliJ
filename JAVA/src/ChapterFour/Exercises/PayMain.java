package Exercises;

/* 
 * Created by Isaac on 7/10/2017.
 */
public class PayMain
    {
        public static void main(String[] args)
            {
                Pay one = new Pay(40, 5.85, 0,0, 0);
                //
                one.computeNetPay(40);
                display(one);

                one.computeNetPay(40,5.85);
                display(one);

                one.computeNetPay(40,5.85, 0.3
                );
                display(one);
            }


        private static void display(Pay a)
            {
                System.out.println("The gross pay is: " + a.getGrossPay());
                System.out.println("The net pay is: " + a.getNetPay());
            }
    }
