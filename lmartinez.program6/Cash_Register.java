import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 6 
//
//  File Name:            Cash_Register.java
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

public class Cash_Register 
{
	List<Retail_Item> purchaseList = new ArrayList<Retail_Item>();
	
	public void display_menu(List<Retail_Item> list)
	{
		System.out.println("\nMenu Items: \n");
		
		IntStream.range(0, list.size())
			.mapToObj(index -> String.format("%d. %s", index +1, list.get(index).getItemDescription()))
			.forEach(System.out::println);
		
		int count = list.size();
		System.out.printf("%d. Clear Cart %n", count+1);
		System.out.printf("%d. Show Inventory %n", count+2);
		System.out.printf("%d. Checkout %n", count+3);
		
	}
	public void purchase_item(Retail_Item item, List<Retail_Item> list)
	{
		item.setUnitsInInventory(item.getUnitsInInventory()-1);
		purchaseList.add(item);
	}
	
	public double get_total()
	{
		double total = 0.0;
		
		total = purchaseList.stream()
				.mapToDouble(Retail_Item::getPrice)
				.sum();
		System.out.println(total);
		return total;
	}
	
	public void show_items()
	{
		purchaseList.stream()
			.forEach(System.out::println);
	}
	
	public void clear_items()
	{
		purchaseList.clear();
	}
   
}


