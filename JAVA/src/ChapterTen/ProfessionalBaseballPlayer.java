package ChapterTen;

public class ProfessionalBaseballPlayer extends BaseballPlayer
{
    double salary;
    /*
    THIS METHOD WILL NOT WORK
    YOU CANNOT OVERRIDE A STATIC MEMBER OF A
    PARENT CLASS
     */
    /*
    public static void showOrigins()
    {
        super.showOrigins();
        System.out.println("The first professional " +
        "major league baseball game was played in 1871");
    }*/

    /*IF YOU THE ProfessionalBaseballPlayer CLASS TO DISPLAY
    * INFORMATION ABOUT BASEBALL ABOUT BASEBALL IN GENERAL AS
    * WELL AS PROFESSIONAL BASEBALL IN PARTICULAR, THE FOLLOWING
    * WILL WORK*/

    // Display both messages from within a child class method with
    // println() statements

    // You can use the parent class name, a dot, and the method name.
    // Although a child class cannot inherit its parent's static methods,
    // it can access its parent's static methods the same way any
    // other class can.

    public static void showOrigins()
    {
        BaseballPlayer.showOrigins();
        System.out.println("The first professional " +
                "major league baseball game was played in 1871");
    }




}
