package ChapterFour.Exercises;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Created by Isaac on 7/19/2017.
 */
public class YearEnd
    {
    public static void main(String[] args)
        {
            GregorianCalendar a = new GregorianCalendar();
            if (a.isLeapYear(a.get(Calendar.YEAR)))
                {
                    int yearLength = 366;
                    System.out.println("It is " + (yearLength - a.get(Calendar.DAY_OF_YEAR)) + " day(s) until the end of the year");
                }
            else
                {
                    int yearLength = 365;
                    System.out.println("It is " + (yearLength - a.get(Calendar.DAY_OF_YEAR)) + " day(s) until the end of the year");
                }
        }
    }
