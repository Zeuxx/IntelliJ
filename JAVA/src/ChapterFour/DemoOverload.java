package ChapterFour;
/*
 * Created by Isaac on 7/9/2017.
 */
public class DemoOverload
    {
        public static void main(String[] args)
            {
                int month = 6, day = 24, year = 2010;
                overloadDate(month);
                overloadDate(month, day);
                overloadDate(month, day, year);
            }

        private static void overloadDate(int month)
            {
                System.out.println("Event date " + month + "/1/2011");
            }

        private static void overloadDate(int month, int day)
            {
                System.out.println("Event date " + month + "/" + day + "/2011");
            }

        private static void overloadDate(int month, int day, int year)
            {
                System.out.println("Event date " + month + "/" + day + "/" + year);
            }
    }
