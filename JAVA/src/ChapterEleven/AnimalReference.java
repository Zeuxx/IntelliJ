package ChapterEleven;

import java.io.BufferedReader;

/*
Dynamic Method Binding:
When a superclass is abstract, you cannot instantiate objects of the
superclass; however, you can indirectly create a reference to a
superclass abstract object.

A reference is not an object, but it points to a memory address.

 */
public class AnimalReference
{
    public static void main(String[] args)
    {
        // When you create a reference, you do not use the keyword
        // new to create a concrete object; instead, you create a
        // name in which you can hold the memory address of a concrete
        // object.
        Animal animalRef;
        animalRef = new Cow();
        animalRef.speak();
        //System.out.println(animalRef instanceof Cow);

        animalRef = new Dog();
        animalRef.speak();
        //System.out.println(animalRef instanceof Dog);
    }
}
/*
So, although a reference to an abstract superclass object is not concrete, you can
store a concrete subclass object reference there.
 */
