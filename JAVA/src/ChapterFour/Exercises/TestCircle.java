package Exercises;

/* 
 * Created by Isaac on 7/14/2017.
 */
public class TestCircle
    {
        public static void main(String[] args)
            {
                Circle one = new Circle(1);
                Circle two = new Circle(2);
                Circle three = new Circle(3);

                display(one);
                display(two);
                display(three);
            }

        private static void display(Circle a)
            {
                System.out.println("The radius is: " + a.getRadius());
                System.out.println("The diameter is: " + a.getDiameter());
                System.out.println("The area is: " + a.getArea() + '\n');

                System.out.println("Testing setters, setting radius to 5");
                a.setRadius(5);

                System.out.println("The radius is: " + a.getRadius());
                System.out.println("The diameter is: " + a.getDiameter());
                System.out.println("The area is: " + a.getArea() + '\n');
            }
    }
