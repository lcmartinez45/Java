/* 
Name: Lillian Martinez
Course: ITSE 2321 Object-Oriented Programming Java
Program: 11
File Name: FormatDate.java
Due Date: 11-30-2019
Instructor: Fred Kumi
Chapter: Chapters 1 - 9, 14, and 15
Description: This program reads a date in the first array format and prints it 
in the second format.
 */

import java.text.SimpleDateFormat;
import java.util.Date;


public class FormatDate {
   public static void main(String[] args) throws Exception {
       System.out.println("Integer Date Format\tString+Integer Date Format\n");
       String arr[] = { "04/12/2018", "13/01/2000", "02/29/2015", "01/01/2014", "09/31/2016" };
       for(String s:arr) {
           Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(s);
           SimpleDateFormat sf = new SimpleDateFormat("MMM dd,yyyy");
           System.out.println(s+"\t\t"+sf.format(date1));
       }
   }
}

