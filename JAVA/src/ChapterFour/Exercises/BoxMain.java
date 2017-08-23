package Exercises;

/* 
 * Created by Isaac on 7/13/2017.
 */
public class BoxMain
    {
        public static void main(String[] args)
            {
                System.out.println("Creating line:");
                Box line = new Box(10);

                System.out.println("Creating rectangle:");
                Box rectangle = new Box(10,5);

                System.out.println("Creating box:");
                Box box = new Box(10, 10, 10);
            }
    }
