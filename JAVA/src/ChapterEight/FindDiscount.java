package ChapterEight;

import javax.swing.*;

public class FindDiscount
{
    public static void main(String[] args)
    {
        // Variable Declarations
        final int NUM_RANGES = 5;
        int[] discountRangeLimit = {1, 13, 50, 100, 200};
        double[] discountRate = {0.00, 0.10, 0.14, 0.18, 0.20};
        double customerDiscount;
        int numOrdered;
        String strNumOrdered;
        int sub = NUM_RANGES - 1;

        // Prompt user and set values
        strNumOrdered = JOptionPane.showInputDialog(null,
                "How many items are ordered?");
        numOrdered = Integer.parseInt(strNumOrdered);
        while (sub >= 0 && numOrdered < discountRangeLimit[sub])
            --sub;
        customerDiscount = discountRate[sub];
        JOptionPane.showMessageDialog(null,
                "Discount rate for " + numOrdered + " items is " + customerDiscount);

    }
}
