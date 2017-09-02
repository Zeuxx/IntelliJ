package ChapterEight;

public class Event
{
    private int typeOfEvent;
    private double rate;
    private String manager;

    Event(int typeOfEvent)
    {
        this.typeOfEvent = typeOfEvent;
        double[] rateSchedule = {47.99, 75.99, 40.99};
        String[] managerList = {"Dustin Britt", "Carmen Lindsey", "Robin Armanetti"};
        setManager(managerList[typeOfEvent - 1]);
        setRate(rateSchedule[typeOfEvent - 1]);
    }

    int getTypeOfEvent()
    {
        return typeOfEvent;
    }

    public void setTypeOfEvent(int typeOfEvent)
    {
        this.typeOfEvent = typeOfEvent;
    }

    double getRate()
    {
        return rate;
    }

    private void setRate(double rate)
    {
        this.rate = rate;
    }

    String getManager()
    {
        return manager;
    }

    private void setManager(String manager)
    {
        this.manager = manager;
    }
}
