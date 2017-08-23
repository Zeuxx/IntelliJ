package ChapterFour;

/* 
 * Created by Isaac on 7/9/2017.
 */
public class DemoConstructor2
    {
    public static void main(String[] args)
        {
        EventSite site1 = new EventSite();
        EventSite site2 = new EventSite(678);
        EventSite site3 = new EventSite(456, 25.00, "Josh");
        display(site1);
        display(site2);
        display(site3);
        }

    private static void display(EventSite site)
        {
        System.out.println("\nEvent site #" + site.getSiteNumber() + "\nFee is $" + site.getFee() +
                                   "\nName of site is " + site.getName());
        }
    }
