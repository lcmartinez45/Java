//********************************************************************
//
//  Developer:            Lillian Martinez
//
//  Program #:            Twelve
//
//  File Name:            HourlyEmployee.java
//
//  Course:               ITSE 2321 Objected-Oriented Programming (Java)
//
//  Instructor:           Fred Kumi 
//
//  Description:
//      This program extends Employee.java, initializes first name, last name, 
//      pay rate, hours worked. It sets hours worked for the month by asking the
//      user number of hours worked each week. It gets total regular hours worked
//      and overtime hours work for the month. It returns monthly regular and overtime
//      pay. Uses super class toString to display Employee's name, pay rate, total
//      hours worked, regular and overtime hours worked, monthly regular, overtime,
//      gross, net pay and taxes.
//
//********************************************************************;

//Driver class HourlyEmployee extends Employee
class HourlyEmployee extends Employee
{
private double overtime;
private double regular;
double tax;
double gross;
double net;
double payrate;
  
HourlyEmployee()
{
this.overtime=0;
this.regular=0;
}
//Set the hours work for the week
HourlyEmployee(String fname, String lname, double rate, double h1, double h2, double h3, double h4)
{
super(fname,lname,rate,(h1+h2+h3+h4));
this.payrate=rate;
  
//Determine regular and overtime hours from each week  
if(h1>40)
{
this.overtime+=(h1-40);
h1-=40;
}
if(h2>40)
{
this.overtime+=(h2-40);
h2-=40;
}
if(h3>40)
{
this.overtime+=(h3-40);
h3-=40;
}
if(h4>40)
{
this.overtime+=(h4-40);
h4-=40;
}
this.regular= h1+h2+h3+h4;
  
}
  
//Calculate and return gross regular pay and overtime pay
public double getGross()
{
return ((regular*payrate )+(overtime*1.5*payrate));
}
  
//Calculate and return monthly taxes
public double getTax()
{
double gross=getGross();
double taxAmt=0;
  
    if(gross>0 && gross <=2000)
taxAmt=(gross/100)*10;
  
    if(gross>2000 && gross <=3500)
taxAmt=(gross/100)*15;
  
    if(gross>3500 && gross <=6000)
taxAmt=(gross/100)*28;
  
    if(gross>6000 && gross <=10000)
taxAmt=(gross/100)*31;
  
    if(gross>10000)
taxAmt=(gross/100)*36;
  
    return taxAmt;
}
  
//Return the Net value
public double getNet(){return getGross()-getTax();}
  
//Return string
@Override
public String toString()
{
return (super.toString()+String.format("\n%s %,.2f \n%s %,.2f \n%s %,.2f \n%s %,.2f \n%s %,.2f \n%s %,.2f \n%s %,.2f",
"Total Regular Hours: ",regular,
"Total Overtime hours: ",overtime,
"Monthly Regular Pay: ", (regular*payrate),
"Monthly Overtime Pay: ", (overtime*1.5*payrate),
"Monthly Gross Pay: ", getGross(),
"Monthly Taxes Pay: ", getTax(),
"Monthly Net Pay: ", getNet()));
}
}
