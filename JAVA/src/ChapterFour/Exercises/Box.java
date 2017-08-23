package Exercises;

/* 
 * Created by Isaac on 7/13/2017.
 */
public class Box
    {
        private int length, width, height;

        public Box(int length)
            {
                this.length = length;
                this.width = 0;
                this.height = 0;
                System.out.println("Line created.");
            }

        public Box(int length, int width)
            {
                this.length = length;
                this.width = width;
                this.height = 0;
                System.out.println("Rectangle created.");
            }

        public Box(int length, int width, int height)
            {
                this.length = length;
                this.width = width;
                this.height = height;
                System.out.println("Box created.");
            }

        public int getLength()
            {
                return length;
            }

        public void setLength(int length)
            {
                this.length = length;
            }

        public int getWidth()
            {
                return width;
            }

        public void setWidth(int width)
            {
                this.width = width;
            }

        public int getHeight()
            {
                return height;
            }

        public void setHeight(int height)
            {
                this.height = height;
            }
    }
