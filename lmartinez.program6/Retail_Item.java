//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 6
//
//  File Name:            Retail_Item.java
//
//  Course:               ITSE 2317 Intermediate Java Programming
//
//  Due Date:             4-5-2020
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              17
//
//  Description:		Lambdas and Streams.
//******************************************************************************

public class Retail_Item {
   private final int itemNumber; 
   private final String itemDescription;
   private int unitsInInventory;
   private double price;

   // constructor
   public Retail_Item(int itemNumber, String itemDescription, int unitsInInventory, double price)
   {
      if (unitsInInventory < 0) { 
         throw new IllegalArgumentException("Units must be >= 0");
      }

      if (price < 0.0) { 
         throw new IllegalArgumentException(
            "Price per item must be >= 0");
      }

      this.itemNumber = itemNumber;
      this.itemDescription = itemDescription;
      this.unitsInInventory = unitsInInventory;
      this.price = price;
   }

   public int getItemNumber() {
      return itemNumber; 
   } 

   public String getItemDescription() {
      return itemDescription;
   } 

   public void setUnitsInInventory(int unitsInInventory) {
      if (unitsInInventory < 0) { // validate units
         throw new IllegalArgumentException("Quantity of units must be >= 0");
      }

      this.unitsInInventory = unitsInInventory;
   } 

   public int getUnitsInInventory() {
      return unitsInInventory;
   }

   public void setPrice(double price) {
      if (price <0.0) { 
         throw new IllegalArgumentException(
            "Price per item must be >= 0");
      }

      this.price = price;
   } 

   public double getPrice() {
      return price;
   } 

   @Override
   public String toString() {
      return String.format(
         "Part #: %-2d   Item Description: %-10s  Quantity of Units: %-4d  Price: $%,6.2f", 
         getItemNumber(), getItemDescription(), 
         getUnitsInInventory(), getPrice());
   } 
}