package ChapterEight;

public class PassArray
{
    public static void main(String[] args)
    {
        final int NUM_ELEMENTS = 4;
        int[] someNums = {5, 10, 15, 20};
        int x;

        System.out.print("At start of main: ");
        for (x = 0; x < NUM_ELEMENTS; ++x)
            System.out.print(" " + someNums[x]);

        System.out.println();

        methodGetsArray(someNums);

        System.out.print("At end of main: ");

        for (int var : someNums)
            System.out.print(" " + var);

        System.out.println();

    }

    private static void methodGetsArray(int[] arr)
    {
        System.out.print("At start of method arr holds: ");
        for (int var : arr)
            System.out.print(" " + var);

        System.out.println();

        for (int var = 0; var < arr.length; ++var)
            arr[var] = 888;

        System.out.print(" and at end of method arr holds: ");

        for (int var : arr)
            System.out.print(" " + var);

        System.out.println();
    }
}
