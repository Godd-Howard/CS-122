/**
 * Made by Kurtis Yoder
 * 
 * This class is used to check different details
 * about a triangle
 */

public class Triangle1 
{
   
    private double base;
    private double height;
        
        /**
        * No-Arg Constructor
        * Initialize instance variables
        */
   
        public Triangle1()
        {
            base = 1.0;
            height = 1.0;
        }
  
        /**
         * Constructor
         * @param b Type double base of the triangle
         * @param h Type double height of the triangle
         */
        
        public Triangle1(double b, double h)
        {
            if (b>0)
            {
                base = b;
            }
            else
            {
                base = 1.0;
            }
            if (h>0)
            {
                height = h;
            }
            else
            {
                height = 1.0;
            }
        }
        
        /**
         * Constructor
         * @param b Type string base of the triangle
         * @param h Type string height of the triangle
         */
        
        public Triangle1(String b, String h)
        {
            double ba = Double.parseDouble(b);
            double he = Double.parseDouble(h);
            if (ba>0)
            {
                base = ba;
            }
            else
            {
                base = 1.0;
            }
            if (he>0)
            {
                height = he;
            }
            else
            {
                height = 1.0;
            }
        }
        
        /**
         * Copy Constructor
         * Create object that will be copied from the object passed
         * as an argument
         * @param tri Will be copied into a new object
         */
        
        public Triangle1(Triangle1 tri)
        {
            base = tri.base;
            height = tri.height;
        }
        
        /**
         * The setLength method stores a value in the
         * length field.
         * @param len The value to store in length.
         */

        public void setBase(double b)
        {
            base = b;
        }

        /**
         *  The setWidth method stores a value in the
         *  width field.
         *  @param w The value to store in width.
         */

        public void setHeight(double h)
        {
            height = h;
        }
        
        /**
         * Returns the base of the triangle
         * @return base The base of the triangle
         */
        
        public double getBase()
        {
            return base;
        }
        
        /**
         * Returns the height of the triangle
         * @return height The height of the triangle
         */
        
        public double getHeight()
        {
            return height;
        }
        
        /**
         * Returns the area of the triangle
         * @return area The area of the triangle
         */
        
        public double getArea()
        {
            double area = base*height*0.50;
            return area;
        }
        
        /**
         * Returns a string with the dimensions of the triangle
         * @return str Dimensions of the triangle
         */
        
        public String toString()
        {
            String str = "base: " + base + "\nheight: " + height;
            return str;
        }
        
        /**
         * Compares two triangle objects and returns a true or false
         * @param tri Triangle object
         * @return status Returns true if triangle objects are the same
         * Returns false if triangle object is not the same
         */
        
        public boolean equals(Triangle1 tri)
        {
            boolean status;
            
            if(base == tri.base  && height == tri.height )
            {
                status = true;
            }
            else
            {
                status = false;
            }
            return status;
        }
        
        /**
         * Creates a copy of the current object
         * @return copyObj Returns a copy of the current object
         */
        
        public Triangle1 copy()
        {
            Triangle1 copyObj = new Triangle1(base, height);
            return copyObj;
        }
        
        

}
