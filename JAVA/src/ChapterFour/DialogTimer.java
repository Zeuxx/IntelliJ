package ChapterFour;

import javax.swing.*;
import java.util.GregorianCalendar;

/*
 * Created by Isaac on 7/9/2017.
 */
public class DialogTimer
    {
        public static void main(String[] args)
            {
                int time1, time2, milli1, milli2, sec1, sec2, timeDifference;
                final int MILLISECINSECOND = 1000;
                GregorianCalendar before = new GregorianCalendar();
                milli1 = before.get(GregorianCalendar.MILLISECOND);
                sec1 = before.get(GregorianCalendar.SECOND);
                time1 = MILLISECINSECOND * sec1 + milli1;
                JOptionPane.showConfirmDialog(null, "Is stealing ever justified? ");

                GregorianCalendar after = new GregorianCalendar();
                milli2 = after.get(GregorianCalendar.MILLISECOND);
                sec2 = after.get(GregorianCalendar.SECOND);
                time2 = MILLISECINSECOND * sec2 + milli2;
                timeDifference = time2 - time1;
                JOptionPane.showMessageDialog(null, "It took " + timeDifference + " milliseconds for you to answer");;
            }
    }