/* program coded by Shubhomay Kundu Poddar
 program to calculate the total sales of a salesman using concept of inheritance
 */
import java.util.*; 
//Class Run (To execute)
class Run
{
public static void main()
{
Scanner sd=new Scanner(System.in);
System.out.println("Enter the name of the Salesman"); 
String nn=sd.nextLine();
System.out.println("Enter the Address"); 
String dd=sd.nextLine();
System.out.println("Enter the product name"); 
String pn=sd.nextLine();
System.out.println("Enter the Bill number");
int bill=sd.nextInt();
System.out.println("Enter the Price of the Product"); 
double pp=sd.nextDouble();
System.out.println("Enter the quantity"); 
int qq=sd.nextInt();
System.out.println("Enter the previous Sales"); 
double ps=sd.nextDouble();
Sales ob=new Sales();
ob.readDetails(nn,dd);
ob.readDetails(bill,qq,pp);
ob.readDetails(ps,pn);

ob.Show();
System.out.println(ob.calculate());


System.out.println("---------------------------------------------------------------------------------");
}
}

//Class Salesman
class Salesman
{
String name; 
String address; 

Salesman()//default constructor
{
    name=""; 
    address="";
}
void readDetails(String n,String ad)//parameterized constructor
{
    name=n; 
    address=ad;
}
void Show()//printing details of salesman
{
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println("Name :"+name); 
    System.out.println("Address :"+address);
    System.out.println("---------------------------------------------------------------------------------");
}
}


//Class Sales
class Sales extends Salesman
{
int billno,qty;
double price,psales; 
String pname;

void readDetails(int b,int q,double p)//inputting details
{
billno=b; 
qty=q;
price=p; 

}

void readDetails(double s,String pr)
{
psales=s; 
pname=pr;
}


double calculate()//calculating total amount
{
double total=0;
total=((price*qty)+psales); 
return total;
}

void Show()//displaying all details of salesman
{
super.Show();
System.out.println("Product Name :"+pname); 
System.out.println("Bill Number :"+billno); 
System.out.println("Price :"+price); 
System.out.println("Quantity :"+qty); 
System.out.println("Previous Sales :"+psales);

System.out.println("---------------------------------------------------------------------------------");


}

}




