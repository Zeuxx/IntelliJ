package Exercises;

/* 
 * Created by Isaac on 7/13/2017.
 */
public class TestShirt
    {
        public static void main(String[] args)
            {
                Shirt one = new Shirt(37, 43);
                System.out.println("Collar size: " + one.getCollarSize());
                System.out.println("Collar size: " + one.getSleeveLength());
                System.out.println("Material: " + Shirt.MATERIAL);
            }
    }
