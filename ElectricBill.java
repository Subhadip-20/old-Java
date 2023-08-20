import java.util.*;
public class ElectricBill
{   
String n="";
int units;
double bill;


void accept()
{Scanner sc=new Scanner(System.in);
System.out.println("ENTER YUOR NAME AND THE NUMBER OF UNITS CONSUMED");
n=sc.nextLine();
units=sc.nextInt();
}
void calculate()
{if (units<=100)
bill=2*units;
if(units>100&&units<=300)
bill=3*units;
if(units>300)
{bill=5*units;
bill=bill+2.5/100*bill;}
}
 void print()
{System.out.println("YOUR NAME :"+n);
System.out.println("NUMBER OF UNITS CONSUMED : "+ units);
System.out.println("BILL AMOUNT : "+bill);}
public static void main()
{ElectricBill ob=new ElectricBill();
ob.accept();
ob.calculate();
ob.print();
}
}
