//Class Marks
import java.io.*;
class Marks extends Student
{

int regnum,marks; 
String subject;

void inputdetails2()throws Exception//taking input of details

{
BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
System.out.print("\f");
System.out.println("Enter the Registration Number"); 
regnum=Integer.parseInt(sc.readLine());
System.out.print("\f"); 
System.out.println("Enter the Subject");
subject=sc.readLine(); 
System.out.print("\f"); 
System.out.println("Enter the marks obtained");
marks=Integer.parseInt(sc.readLine()); 
System.out.print("\f");
}

void show2()//dispalying details

{
System.out.println("Registration Number : "+regnum); 
System.out.println("Subject : "+subject); 
System.out.println("Marks : "+marks);


}


}