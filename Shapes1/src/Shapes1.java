/**
 * Made by Kurtis Yoder
 * 
 * This class explores the details of shapes through the
 * integration of other classes
 */

public class Shapes1 
{
    
    private Triangle1 triangle;
    private Rectangle1 rectangle;
    
        /**
         * Constructor
         * @param tri A Triangle object
         * @param rect A Rectangle object
         */
        
        public Shapes1(Triangle1 tri, Rectangle1 rect)
        {
        
        triangle=tri;
        rectangle=rect;
        
        }
        
        /**
         * Copy Constructor
         * Create object that will be copied from the object passed
         * as an argument
         * @param shapes Will be copied into a new object
         */
        
        public Shapes1(Shapes1 shapes)
        {
            triangle = shapes.triangle;
            rectangle = shapes.rectangle;
        }
        
        /**
         * Returns a Triangle object's base and height
         * @return The values in the Triangle object
         */
        
        public Triangle1 getTriangle()
        {
            return triangle;
        }
        
        /**
         * Returns a Rectangle object's length and width
         * @return The values in the Rectangle object
         */
        
        public Rectangle1 getRectangle()
        {
            return rectangle;
        }
        
        /**
         * Returns a string with the dimensions of a triangle and rectangle
         * @return str Dimensions of a triangle and rectangle
         */
        
        public String toString()
        {
            String str = "Triangle:\n" + triangle.toString() 
            + "\nRectangle:\n" + rectangle.toString();
            return str;
        }
        
        /**
         * Compares two Shapes objects and returns a true or false
         * @param shapes Shapes object
         * @return status Returns true if Shapes objects are the same
         * Returns false if Shapes object is not the same
         */
        
        public boolean equals(Shapes1 shapes)
        {
            boolean status;
            
            if(triangle == shapes.triangle  && rectangle == shapes.rectangle)
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
        
        public Shapes1 copy()
        {
            Shapes1 copyObj = new Shapes1(triangle, rectangle);
            return copyObj;
        }
        
        /**
         * Method calculates the area of a triangle
         * @param base Base of a triangle
         * @param height Height of a triangle
         * @return Area of the triangle
         */
        
        public double calcTriangleArea(double base, double height)
        {
            double area = base*height*0.50;
            return area;
        }
        
        /**
         * Method calulates the area of a rectangle
         * @param length Length of a rectangle
         * @param width Width of a rectangle
         * @return Area of the rectangle
         */
        
        public double calcRectangleArea(double length, double width)
        {
            double area = length*width;
            return area;
        }
        
    
    
    

}
