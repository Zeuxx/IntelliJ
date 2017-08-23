package ChapterFour;

/* 
 * Created by Isaac on 7/9/2017.
 */
public class DemoConstructor
    {
        public static void main(String[] args)
            {
                EventSite site1 = new EventSite();
                EventSite site2 = new EventSite(678);
                display(site1);
                display(site2);
            }

        private static void display(EventSite site)
            {
                System.out.println("\nEvent site #" + site.getSiteNumber() + "\nFee is $" + site.getFee() +
                                           "\nName of site is " + site.getName());
            }
    }
