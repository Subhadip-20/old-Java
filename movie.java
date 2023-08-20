import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class movie
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean login = false;
    static String moviename[] = {"Avengers: Endgame(2019) ","Captain Marvel(2019)","Shazam! (2019)", "Toy Story 4 (2019)","Godzilla: King of the Monsters (2019)", "Dark Phoenix (2019)","Joker(2019)","Spider-Man: Far from Home (2019)","Spider-Man: Into the Spider-Verse (2018)","Star Wars: The Rise of Skywalker (2019)"};
    static double rating[] = {9.1,9.0,8.8,8.6,8.9, 9.0,9.4,8.8,9.1,8.8};
    static String shrt_mov[]=new String[10];
    static int n;
    String date;
    static String tic[]={"Platinum Seat","Gold Seat","Silver Seat","Normal Seat"};
    static int price[]={110,100,90,80,75};
    static movie ob=new movie();
    static String nam="";
    static int l,tamt=0;
    movie()
    {
        shrt_mov[0]="AVG";
        shrt_mov[1]="CPM";
        shrt_mov[2]="SZM";
        shrt_mov[3]="TS4";
        shrt_mov[4]="GKM";
        shrt_mov[5]="DRP";
        shrt_mov[6]="JKR";
        shrt_mov[7]="SFH";
        shrt_mov[8]="SSV";
        shrt_mov[9]="SWR";
        
    }
    void welcome()
    {
        Date date = new Date();
        System.out.println("\n          ******************************************************************************************************");
        System.out.println("          *                                                                                                    *");
        System.out.println("          *                                                                                                    *");
        System.out.println("          *      ----------------------------------------------------------------------------------------      *");
        System.out.println("          *      |      ##########################################################################      |      *");
        System.out.println("          *      |      ********************* WELCOME TO OUR BOOK MY SHOW*************************      |      *");
        System.out.println("          *      |      ##########################################################################      |      *");
        System.out.println("          *      |                                                                                      |      *");
        System.out.println("          *      |                      CURRENT DATE  - " +date.toString()+"                    |      *");
        System.out.println("          *      |                                                                                      |      *");
        System.out.println("          *      |          --- Chose one of the following options to proceed ahead ----                |      *");
        System.out.println("          *      |                                                                                      |      *");
        System.out.println("          *      |                 1 - Login to use our services                                        |      *");
        System.out.println("          *      |                 2 - Book your ticket                                                 |      *");
        System.out.println("          *      |                 3-  View available movie list                                        |      *");
        System.out.println("          *      |                 4 - Logout                                                           |      *");
        System.out.println("          *      |                 5 - exit                                                             |      *");
        System.out.println("          *      ----------------------------------------------------------------------------------------      *");
        System.out.println("          *                                                                                                    *");
        System.out.println("          *                                                                                                    *");
        System.out.println("          ******************************************************************************************************");
    }
    public  void display_chart()
    {          
        System.out.println(" The list of movies available to us are\n");
        System.out.println("Movie name                                      Code name");
        System.out.println("Avengers: Endgame(2019)                         "+shrt_mov[0]);
        System.out.println("Captain Marvel(2019)                            "+shrt_mov[1]);
        System.out.println("Shazam! (2019)                                  "+shrt_mov[2]);
        System.out.println("Toy Story 4 (2019)                              "+shrt_mov[3]);
        System.out.println("Godzilla: King of the Monsters (2019)           "+shrt_mov[4]);
        System.out.println("Dark Phoenix (2019)                             "+shrt_mov[5]);
        System.out.println("Joker(2019)                                     "+shrt_mov[6]);
        System.out.println("Spider-Man: Far from Home (2019)                "+shrt_mov[7]);
        System.out.println("Spider-Man: Into the Spider-Verse (2018)        "+shrt_mov[8]);
        System.out.println("Star Wars: The Rise of Skywalker (2019)         "+shrt_mov[9]);
        System.out.println(" Movie name \t\t\t\t" + " Rating out of 10 \n");
        for (int i=0;i<10;i++)
        {
            System.out.println(shrt_mov[i]+" \t\t\t\t\t "+rating[i]);
        }
        System.out.println();
        
    }
    void display1()
    {
         System.out.println("                                                                                                     ");
         System.out.println("         ******    ****    ****  ***   ***      ****     ****  ***  ***      ***** ***   ***   ****  ***      ****      ***      ");
         System.out.println("         **   **  **  **  **  ** **  ***         ** ** ** **    **  **       **     **   **   **  **  **     ** **     **        ");
         System.out.println("         ******   **  **  **  ** *****           **  ***  **      **         *****  *******   **  **   **   **   **   **         ");
         System.out.println("         **   **  **  **  **  ** **  ***         **       **      **            **  **   **   **  **    ** **     ** **          ");
         System.out.println("         ******    ****    ****  ***   ***      ***       ***    ****        ***** ***   ***   ****      ****     ****           ");
    }
    void SignUp()throws IOException
    {      
        System.out.println("PLEASE SIGNUP TO USE OUR SERVICES \n");
        System.out.print("Enter your name                      : ");
        a:for(;;)
        {           
           String fd = br.readLine();
           if(Character.isLetter(fd.charAt(0)))
            break a;
            else
            System.out.print("Re enter your name ");
        } 
        System.out.print("\nEnter your Email-ID                  : ");
        String dsd = br.readLine();
        System.out.print("\nEnter your Password                  : ");
        String h = br.readLine();
        System.out.print("\nRe-enter password                    : ");
        outer: while(true)
        {
            String check=br.readLine();
            if(check.equalsIgnoreCase(h))
            { 
                System.out.println("ACCOUNT CREATED SUCCESSFULLY"); 
                break outer;
            }
            else System.out.println("Re-enter password ");
        }
        login=true;
    }
    public void bookticket()throws IOException
    {
        int c=0,xfat=0,p=0;
        double a,b;
        double y;
        if(login == true)
        {

            Date date = new Date(); 
            System.out.println("**************************************************************************************************");
            System.out.println("############################WELCOME TO BOOK MY SHOW BOOKING SYSTEM################################");
            System.out.println("**************************************************************************************************");
            System.out.println();
            System.out.println("Follow the following steps to book your ticket \n");
            System.out.println("MOVIE ");
            System.out.println();
            ob.display_chart();
            System.out.println("Enter the name of the movie in their code name");
            d:for(;;)
            {
                nam=br.readLine();
                if(nam.equalsIgnoreCase(shrt_mov[0])||nam.equalsIgnoreCase(shrt_mov[1])||nam.equalsIgnoreCase(shrt_mov[2])||nam.equalsIgnoreCase(shrt_mov[3])||nam.equalsIgnoreCase(shrt_mov[4])||nam.equalsIgnoreCase(shrt_mov[5])||nam.equalsIgnoreCase(shrt_mov[6])||nam.equalsIgnoreCase(shrt_mov[7])||nam.equalsIgnoreCase(shrt_mov[8])||nam.equalsIgnoreCase(shrt_mov[9]))
                break d;
                else
                {
                    System.out.println("Wrong input");
                    System.out.println("Re-Enter the name of the movie with correct code name");
                    ob.display_chart();
                }
            }
            System.out.println("Enter the number of people");
            int n=Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++)
            {
            System.out.println("Enter the package from the bellow list(number)");
            for(int j=0;j<4;j++)
            System.out.println((j+1)+"."+tic[j]+"\t"+price[j]);
            z:for(;;)
            {
            l=Integer.parseInt(br.readLine())+1;
            if(l>=1&&l<=4)
            break z;
            else 
            {
                System.out.println("Re-Enter the package name below corectly");
                for(int j=0;j<4;j++)
            System.out.println((j+1)+tic[j]+"\t"+price[j]);
            }
        }
        tamt+=price[i];
    }
    System.out.println("Your Total Balance is "+tamt);
    System.out.println("Thank you for using BookMyShow....");
    System.out.println("Hope you enjoyed............");
        }   
        else
        {
            System.out.println("You are not logged in .\nPlease login to continue ");
            
        }
    
}
 

public static void main()throws IOException
{
    Scanner sc=new Scanner(System.in);
    
    ob.display1();
    ob.welcome();
    first:for(;;)
        {         
            n=Integer.parseInt(br.readLine()); 
            System.out.print("\u000c");
            switch(n)
            {
                case 1:
                ob.display1();
                ob.SignUp();
                ob.welcome();
                break;
                
                case 2:
                ob.display1();
                ob.bookticket();
                ob.welcome();
                break ;
                
                case 3:
                ob.display1();
                ob.display_chart();
                ob.welcome();
                break;
                
                case 4:
                login = false;
                ob.display1();
                ob.welcome();
                break;

                case 5:
                if(login == false)
                {
                    System.out.println("Thank you for using our service \nPlease visit again");
                    System.exit(0);
                    break first;
                }
                else
                {
                    System.out.println("You are still logged in . Logout then try exit ");
                    ob.welcome();
                    continue first;
                }
                default:
                System.out.println("Sorry you have entered a wrong value . Please RE-ENTER ");
                ob.welcome();
                continue first;
            }
        }
        System.out.println("Bye Bye....");
        System.exit(0);
}
}
