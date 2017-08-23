package Exercises;

/* 
 * Created by Isaac on 7/13/2017.
 */
public class Shirt
    {
        private int collarSize, sleeveLength;
        final static String MATERIAL = "Cotton";

        Shirt(int collarSize, int sleeveLength)
            {
                this.collarSize = collarSize;
                this.sleeveLength = sleeveLength;
            }

        int getCollarSize()
            {
                return collarSize;
            }

        public void setCollarSize(int collarSize)
            {
                this.collarSize = collarSize;
            }

        int getSleeveLength()
            {
                return sleeveLength;
            }

        public void setSleeveLength(int sleeveLength)
            {
                this.sleeveLength = sleeveLength;
            }

        public static String getMATERIAL()
            {
                return MATERIAL;
            }


    }
