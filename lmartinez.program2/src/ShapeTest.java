//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 2 
//
//  File Name:            ShapeTest.java
//
//  Course:               ITSE 2317 Intermediate Java Programming
//
//  Due Date:             <Due Date>
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              10
//
//  Description:		  Polymorphism & Interfaces:  This program displays the
//                        attributes of each shape type, including type, dimension
//                        type, area, and volume if applicable.
//
//******************************************************************************



public class ShapeTest
{
    //***************************************************************
    //
    //  Method:       main
    // 
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A 
    //
    //**************************************************************
	public static void main(String[] args)
	{
		// Variables
		double edge       = 2.5,
		       length     = 2.5,
			   radius	  = 5.75,
			   base		  = 7.95,
			   height	  = 10.33;
		int	   numShapes  = 6;
		
		// Create array of shape references to each concrete shape type
		Shape[] shapes = new Shape[numShapes];
		
		shapes[0] = new Circle(radius);
		shapes[1] = new Square(length);
		shapes[2] = new Triangle(base, height);
		shapes[3] = new Sphere(radius);
		shapes[4] = new Cube(length);
		shapes[5] = new Tetrahedron(edge);
		
		developerInfo();
		
		//Looping through the array and printing details

         for(int i=0;i<shapes.length;i++){
        	 
        	 if(shapes[i] instanceof TwoDimensionalShape){
        		 
        		 //2D Shape
        		 
        		 System.out.println(shapes[i]);
           
        		 System.out.println("Dimension: Two-Dimensional");

        		 System.out.printf("Area: %.2f\n",((TwoDimensionalShape) shapes[i]).getArea());
        		 
        	 }
        	 
        	 else if(shapes[i] instanceof ThreeDimensionalShape){
        		 
        		 //3D Shape
        		 
        		 System.out.println(shapes[i]);

        		 System.out.println("Dimension: Three-Dimensional");
        		 
        		 System.out.printf("Surface Area: %.2f\n",((ThreeDimensionalShape) shapes[i]).getArea());

        		 System.out.printf("Volume: %.2f\n",((ThreeDimensionalShape) shapes[i]).getVolume());

        	 }

        	 System.out.println();

         }

}

	
	//***************************************************************
    //
    //  Method:       developerInfo
    // 
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A 
    //
    //**************************************************************
    public static void developerInfo()
    {
       System.out.println ("Name:    <Lillian Martinez>");
       System.out.println ("Course:  ITSE 2317 Intermediate Java Programming");
       System.out.println ("Program: Two \n");

    } // End of developerInfo
}
