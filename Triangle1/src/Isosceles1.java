/**
 * Made by Kurtis Yoder
 * 
 * This class is used to check different details
 * about an isosceles triangle
 */



public class Isosceles1 extends Triangle1 
{
    private double side;
    
        /**
         * Constructor
         * @param base Type double base of the triangle
         * @param side Type double side length of one of 
         * the sides of an isosceles triangle
         */
        
        public Isosceles1(double base, double side)
        {
      
            if (base>0)
            {
                super.setBase(base);
            }
            else
            {
                super.setBase(1.0);
            }
            if (side>0)
            {
                this.side = side;
            }
            else
            {
                this.side = 1.0;
            }
            
            super.setHeight(Math.sqrt(Math.pow(this.side, 2) 
                            - 0.25*(Math.pow(getBase(), 2))));
        }
        
        /**
         * Constructor
         * @param base Type string base of the isosceles triangle
         * @param side Type string side length of one of 
         * the sides of the isosceles triangle
         */
        
        public Isosceles1(String base, String side)
        {
          
            double ba = Double.parseDouble(base);
            double si = Double.parseDouble(side);
            
            if (ba>0)
            {
                super.setBase(ba);
            }
            else
            {
                super.setBase(1.0);
            }
            if (si>0)
            {
                this.side = si;
            }
            else
            {
                this.side = 1.0;
            }
            
            super.setHeight(Math.sqrt(Math.pow(this.side, 2) 
                            - 0.25*(Math.pow(getBase(), 2))));
        }
        
        /**
         * Copy Constructor
         * Create object that will be copied from the object passed
         * as an argument
         * @param iso Will be copied into a new object
         */
        
        public Isosceles1(Isosceles1 iso)
        {
            super.setBase(iso.getBase());
            super.setHeight(iso.getHeight());
            side = iso.side;
        }
        
        /**
         * Returns the side length of the
         * isosceles triangle
         * @return side Returns the side length of the
         * isosceles triangle
         */
        
        public double getSideLength()
        {
            return side;
        }
        
        /**
         * Calculates perimeter of an isosceles triangle
         * then returns it
         * @return Returns perimeter of an isosceles triangle
         */
        
        public double getPerimeter()
        {
            return side*2 + getBase();
        }
        
        /**
         * Calulates the radius of the inscribed circle of an
         * isosceles triangle
         * @return Returns radius of the inscribed circle of an
         * isosceles triangle
         */
        
        public double getInRadius()
        {
            return (2*side*getBase() 
                    - Math.pow(getBase(), 2)) / (4*getHeight()); 
        }
        
        /**
         * Calulates the radius of the circumscribed circle
         * of an isosceles triangle
         * @return Returns radius of the circumscribed circle
         * of an isosceles triangle
         */
        
        public double getCircumRadius()
        {
            return (Math.pow(side, 2)) / (2*getHeight()); 
        }
        
        /**
         * Compares two isosceles objects and returns a true or false
         * @param iso Isosceles object
         * @return status Returns true if isosceles objects are the same
         * Returns false if isosceles objects are not the same
         */
        
        public boolean equals(Isosceles1 iso)
        {
            boolean status;
            
            if(side == iso.side  && getHeight() 
               == iso.getHeight() && getBase() == iso.getBase())
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
        
        public Isosceles1 copy()
        {
            Isosceles1 copyObj = new Isosceles1(getBase(), side);
            return copyObj;
        }
        
        /**
         * Returns a string with the dimensions of an isosceles triangle
         * @return str Dimensions of an isosceles triangle
         */
        
        @Override
        public String toString()
        {
            String str = "Isosceles:\nside: " + side + 
                         "\nTriangle:\n" + super.toString();
            return str;
        }
        
        
        
        

}
