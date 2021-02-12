import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 6 
//
//  File Name:            TestProgram6.java
//
//  Course:               ITSE 2317 Intermediate Java Programming
//
//  Due Date:             4-5-2020
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              17
//
//  Description:		Lambdas and Streams
//******************************************************************************

public class TestProgram6 {
	
	static Cash_Register register = new Cash_Register();
	static TestProgram6 object = new TestProgram6();
	
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		developerInfo();
		
		List<Retail_Item> list = object.readFile1();
		object.relistItems(list);
		object.sentialValue(list);
	}
	
	public void sentialValue(List<Retail_Item> list) 
	{
		List<String> cashier = object.readFile2();
		int item = 1;
		while (item != 0)
		{
			register.display_menu(list);
			
			item = object.userInput();
			
			if(item >= 1 && item <= list.size())
			{
				register.purchase_item(list.get(item-1), list);
			}
			else if(item == list.size()+1)
			{
				register.clear_items();
			}
			else if(item == list.size()+2)
			{
				list.stream()
					.forEach(System.out::println); //register.show_items
			}
			else
			{
				object.check_out(cashier);
			}
		}
		register.get_total();

	}
	
	public void relistItems(List<Retail_Item> list)
	{
		System.out.printf("These are the items in stock. %n");
		System.out.printf("Part #:  Item:  Quantity:  Price: %n");
		list.stream()
			.forEach(System.out::println);
		
		int answer;
		System.out.printf("If you wish to continue, press 00. %n");
		answer = scan.nextInt();
		if(answer == 00)
		{
			register.display_menu(list);
		}
	}
	
	@SuppressWarnings("resource")
	public List<Retail_Item> readFile1() throws IOException
	{
		List<Retail_Item> list = new ArrayList<Retail_Item>();
		String filename = "inventory.txt";
			try 
			{
				Scanner input = new Scanner(new File(filename));
					while(input.hasNextLine())
					{
						if(input.hasNextInt())
						{
							int itemNum = input.nextInt();
							String itemDes = input.next();
							int units = input.nextInt();
							double price = input.nextDouble();
							
							list.add(new Retail_Item(itemNum, itemDes, units, price));
						}
					}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			} 
			return list;
	}
	
	@SuppressWarnings("resource")
	public List<String> readFile2()
	{
		List<String> cashier = new ArrayList<String>();
		String filename = "cashier.txt";
			try 
			{
				Scanner input = new Scanner(new File(filename));
					while(input.hasNextLine())
					{
						cashier.add(input.nextLine());
					}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}return cashier;
	}
	
	private void check_out(List<String> cashier)
	{
		DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		
		double price = register.get_total();
		double tax = ((price * 6.25) / 100);
		double finalPrice = price + tax;
		
		Random rand = new Random();
		int num = rand.nextInt((cashier.size()-1));
			System.out.println(cashier.get(num));
			
			System.out.printf("Subtotal:  %.2f%n Tax: %.2f%n Total: %.2f%n", price, tax, finalPrice);
			System.out.println(time.format(now));
	}
	
	public int userInput()
	{
		System.out.printf("%nPlease select an item you would like to purchase: %n");
		return scan.nextInt();
	}
	
	//public void receipt();
	       
	
	public static void developerInfo()
	{
	   System.out.println ("Name:    Lillian Martinez");
	   System.out.println ("Course:  ITSE 2317 Intermediate Java Programming");
	   System.out.println ("Program: Six \n");

	}
}
