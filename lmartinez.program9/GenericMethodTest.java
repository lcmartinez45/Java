//********************************************************************
//
//  Developer:            Instructor/Lillian Martinez
//
//  Program #:            Nine
//
//  File Name:            GenericMethodTest.java
//
//  Course:               ITSE 2317 Intermediate Java Programming             
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              20
//
//  Description:
//         Printing array elements using generic method printArray.
//
//********************************************************************

public class GenericMethodTest
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
       developerInfo();
       
      // create arrays of Integer, Double and Character
      Integer[] integerArray = {1, 2, 3, 4, 5};
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
      Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
      
      System.out.printf("Array integerArray contains: %n");
      printArray(integerArray); // pass an Integer array
      
      System.out.printf("%nArray doubleArray contains: %n");
      printArray(doubleArray); // pass a Double array
      
      System.out.printf("%nArray characterArray contains: %n");
      printArray(characterArray); // pass a Character array
      
      try{
        System.out.printf("%nArray integerArray between 1-3: %n");
        printArray(integerArray, 1, 3); // pass an Integer array
      
        System.out.printf("%nArray doubleArray between 1-4: %n");
        printArray(doubleArray, 1, 4); // pass a Double array
      
        System.out.printf("%nArray characterArray between 1-3: %n");
        printArray(characterArray, 1, 3); // pass a Character array
      
        System.out.printf("%nArray integerArray between 0-6: %n");
        printArray(integerArray, 0, 6); // pass an Integer array, overloaded
   
      }catch(InvalidSubscriptException e)
       {
            e.printStackTrace();
       }
   }

   // generic method printArray                     
   public static <T> void printArray(T[] inputArray)
   {
      // display array elements            
      for (T element : inputArray)
	  {       
         System.out.printf("%s ", element);
      }                                    

      System.out.println();
   } 
   
   public static <T> void printArray(T[] inputArray, int lowSubscript, int highSubscript)throws InvalidSubscriptException
   {
       if(lowSubscript < 0 || highSubscript >= inputArray.length || highSubscript <= lowSubscript)
           throw new InvalidSubscriptException();
       
       else{
           for(int index = lowSubscript; index <= highSubscript; index++)
           System.out.printf("%s, ", inputArray[index]);
           System.out.println();
       }
   }
   
   public static void developerInfo()
    {
        System.out.println ("Name:    Lillian Martinez");
        System.out.println ("Course:  ITSE 2317 Intermediate Java Programming");
        System.out.println ("Program: Nine \n");

    }
}

