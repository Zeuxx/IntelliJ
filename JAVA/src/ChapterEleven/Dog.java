package ChapterEleven;

public class Dog extends Animal
{
    /*
    The speak() method within the Dog class is required because you
    want to create Dog objects and the abstract, parent Animal class
    contains an abstract speak() method. Any statements can be coded
    within the Dog speak() method, but the speak() method must exist.
     */
    public void speak()
    {
        System.out.println("Woof!");
    }
}

