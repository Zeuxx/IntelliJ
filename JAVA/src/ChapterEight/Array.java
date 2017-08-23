package ChapterEight;

public class Array {

    int i;
    int[] scoreArray = {2, 14, 35, 67, 85};
    final int INCREASE = 3;

    public void printer() {
        for (i = 0; i < scoreArray.length; ++i)
            System.out.println(scoreArray[i]);
    }

    public void increment(){
        for (i = 0; i < scoreArray.length; ++i)
            scoreArray[i] += INCREASE;
    }

    //Enhanced For Loop
    public void printer02()
    {
        for (int val: scoreArray)
            System.out.println(val);
    }
}
