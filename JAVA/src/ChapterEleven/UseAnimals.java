package ChapterEleven;

public class UseAnimals
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog();
        Cow myCow = new Cow();
        Snake mySnake = new Snake();

        myCow.setName("My dog Elise");
        myDog.setName("My dog Murphy");
        mySnake.setName("My snake Sammy");

        System.out.println(myDog.getName() + " says ");
        myDog.speak();
        System.out.println(myCow.getName() + " says ");
        myCow.speak();
        System.out.println(mySnake.getName() + " says ");
        mySnake.speak();
    }
}
