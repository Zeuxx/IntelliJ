package ChapterFour;
/*
 * Created by Isaac on 7/9/2017.
 */

public class EventSite
    {
        private int siteNumber;
        private double fee;
        private String name;

        EventSite()
            {
                siteNumber = 999;
                fee = 0;
                name = "XXXX";
            }

        EventSite(int siteNum)
            {
                this();
                siteNumber = siteNum;
            }

        EventSite(int siteNumber, double fee, String name)
            {
                this.siteNumber = siteNumber;
                this.fee = fee;
                this.name = name;
            }

        int getSiteNumber()
            {
                return siteNumber;
            }

        public void setSiteNumber(int siteNumber)
            {
                this.siteNumber = siteNumber;
            }

        double getFee()
            {
                return fee;
            }

        public void setFee(double fee)
            {
                this.fee = fee;
            }

        String getName()
            {
                return name;
            }

        public void setName(String name)
            {
                this.name = name;
            }
    }
