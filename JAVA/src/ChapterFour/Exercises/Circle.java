package Exercises;

/* 
 * Created by Isaac on 7/14/2017.
 */
public class Circle
    {
        double radius, diameter, area;

        public Circle(double radius)
            {
                this.radius = radius;
                this.diameter = radius * 2;
                this.area = Math.PI * (Math.pow(radius, 2));
            }

        public void setRadius(double radius)
            {
                this.radius = radius;
                this.diameter = radius * 2;
                this.area = Math.PI * (Math.pow(radius, 2));
            }

        public double getRadius()
            {
                return radius;
            }

        public double getDiameter()
            {
                return diameter;
            }

        public double getArea()
            {
                return area;
            }
    }
