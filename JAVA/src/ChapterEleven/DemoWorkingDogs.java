package ChapterEleven;

public class DemoWorkingDogs
{
    public static void main(String[] args)
    {
        WorkingDog aSheepHerder = new WorkingDog();
        WorkingDog aSeeingEyeDog = new WorkingDog();

        aSheepHerder.setName("Simon, the Border Collie");
        aSeeingEyeDog.setName("Sophie, the German Shepard");

        aSheepHerder.setHoursOfTraining(40);
        aSeeingEyeDog.setHoursOfTraining(300);

        System.out.println(aSheepHerder.getName() + " says ");
        aSheepHerder.speak();
        aSheepHerder.work();
        System.out.println();  // blank line

        System.out.println(aSeeingEyeDog.getName() + " says ");
        aSeeingEyeDog.speak();
        aSeeingEyeDog.work();
    }
}
