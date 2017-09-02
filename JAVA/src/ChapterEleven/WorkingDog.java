package ChapterEleven;

public class WorkingDog extends Dog implements Worker
{
    private int hoursOfTraining;

    public int getHoursOfTraining()
    {
        return hoursOfTraining;
    }

    void setHoursOfTraining(int hoursOfTraining)
    {
        this.hoursOfTraining = hoursOfTraining;
    }

    public void work()
    {
        speak();
        System.out.println("I am a dog who works");
        System.out.println("I have " + hoursOfTraining +
        " hours of professional training!");
    }
}
