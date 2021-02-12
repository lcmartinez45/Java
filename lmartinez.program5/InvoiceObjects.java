//******************************************************************************
//
//  Developer:            <Developer>
//
//  Program #:            Program 5 
//
//  File Name:            InvoiceObjects.java
//
//  Course:               ITSE 2317 Intermediate Java Programming
//
//  Due Date:             3-20-2020
//
//  Instructor:           Fred Kumi 
//
//  Chapter:              17
//
//  Description:		Lambdas and Streams:  This program uses streams to sort 
//						and map Invoice objects.
//******************************************************************************

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceObjects {
public static void main(String[] args) {
Invoice[] invoices = {
		new Invoice(83, "Electric sander", 7, 57.98),
		new Invoice(24, "Power saw", 18, 99.99),
		new Invoice(7, "Sledge hammer", 11, 21.50),
		new Invoice(77, "Hammer", 76, 11.99),
		new Invoice(39, "Lawm mower", 3, 79.50),
		new Invoice(68, "Screwdriver", 106, 6.99),
		new Invoice(56, "Jig saw", 21, 11.00),
		new Invoice(3, "Wrench", 34, 7.50)
};
developerInfo();

List<Invoice> list = Arrays.asList(invoices);

//A
//Sort by PartDescription
System.out.printf("Sorted Invoice objects by Part Description:%n%n");
list.stream()
	.sorted(Comparator.comparing(Invoice::getPartDescription))
	.forEach(System.out::println);

//B
//Sort by Price
System.out.printf("%nSorted Invoice objects by Price Per Item:%n%n");
list.stream()
	.sorted(Comparator.comparing(Invoice::getPrice))
	.forEach(System.out::println);

//C
System.out.printf("%nMapped Invoice objects to it's Part Description and Quantity, then sorted:%n%n");
list.stream()
.sorted(Comparator.comparing(Invoice::getQuantity))
.map(invoice -> String.format("Description: %-15s Quantity: %-4d", invoice.getPartDescription(), invoice.getQuantity()))
.forEach(System.out::println);

//D
System.out.printf("%nMapped Invoice objects to it's Part Description and value of Invoice, sorted Invoice:%n%n");
list.stream()
.sorted(Comparator.comparingDouble(i -> i.getQuantity() * i.getPrice()))
.map(invoice -> ("Description: " + invoice.getPartDescription() + " - " +  "Invoice Value: $" + invoice.getQuantity() * invoice.getPrice()))
.forEach(System.out::println);

//E
System.out.printf("%nInvoice values in range $200.00 to $500.00:%n%n");
list.stream()
.sorted(Comparator.comparing(i -> i.getQuantity() * i.getPrice()))
.filter(i-> (i.getQuantity() * i.getPrice()) >=200 && (i.getQuantity() * i.getPrice()) <=500 )
.map(i -> ("Description: " + i.getPartDescription() + " - " +  "Invoice Value: $" + i.getQuantity() * i.getPrice()))
.forEach(System.out::println);

//F
System.out.printf("%nFind in Invoices in which the part description contains \"saw\":%n%n");
list.stream()
.filter(i ->  i.getPartDescription()
.contains("saw"))
.collect(Collectors.toList())
.forEach(System.out::println);
	}

public static void developerInfo()
{
   System.out.println ("Name:    Lillian Martinez");
   System.out.println ("Course:  ITSE 2317 Intermediate Java Programming");
   System.out.println ("Program: Five \n");

}
}
