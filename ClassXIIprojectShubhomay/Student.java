/*program coded by Shubhomay Kundu Poddar
 program to implement the concept of inheritance between two classes and display all the member details
 */
import java.util.*; 
import java.io.*;
    //class Student
class Student
    {

        String name,sex; 
        int age;
        
        void inputdetails1()//taking user input of details
        {
            System.out.print("\f");
            Scanner sd=new Scanner(System.in);
            System.out.println("Enter the name of the Student"); 
            name=sd.nextLine();
            System.out.print("\f"); 
            System.out.println("Enter the gender"); 
            sex=sd.nextLine();System.out.print("\f"); 
            System.out.println("Enter the age"); 
            age=sd.nextInt();
            System.out.print("\f");
        }

        void show1()//dispalying details
        {

            System.out.print("\f"); 
            System.out.println("Name : "+name); 
            System.out.println("Sex : "+sex); 
            System.out.println("Age : "+age);
        }


}

