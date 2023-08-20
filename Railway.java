import java.io.*;
import java.util.*;
public class Railway
{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String berth[] = new String[400];
    static String trainame[] = {" Super fast mail "," Arijit express "," Vector35 express ", " iota fast express "," Maitri tour mail ", " Naini45k express "," Gandhi express "," Netaji express "," sin cos express "," limit tour express "};
    static String train;
    static String trno[] = {"124584","457823","457123","484534","464853", "468546","468746","587455","478564","565645"};
    static String station[] = {" Howrah   "," Mumbai   ", " Delhi     "," Hyderabad "," Bengaluru "," Patna    "," Jaipur    "," Srinagar  "," Darjeeling "," Guawhati "};
    static String sho[] = new String[10];
    static int distance[] = {0,10,15,28,38,45,55,68,79,89,99,111,129,139,150};
    String abc[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    static String  monthreal[] = new String[12];
    static String today[] = new String[400];
    static String name[] = new String[400];
    static int age[] = new int[400];
    static String sex[]= new String[400];
    static String address[]= new String[400];
    static double  pnr[]= new double[400];
    static double fare[] = new double[400];
    String Berth[] = new String[400];
    static String from,to,trn,month;
    static int n,passenger,child,adult,c1,c2,year,day,g,g1,day1,year1,d3,m3,y3,totday;
    String date;

    static boolean login = false;
    Railway()
    {
        for(int i=0;i<12;i++)
        {
            monthreal[i] = abc[i];
        }
        g=0;
        login = false;
        day=0;
        year =0;
        from="";
        to="";
        n=0;
        child = 0;
        adult = 0;
        trn = "";
        monthreal[0] = "Jan";
        monthreal[0] = "Feb";
        monthreal[0] = "Mar";
        monthreal[0] = "Apr";
        monthreal[0] = "May";
        monthreal[0] = "Jun";
        monthreal[0] = "Jul";
        monthreal[0] = "Aug";
        monthreal[0] = "Sep";
        monthreal[0] = "Oct";
        monthreal[0] = "Nov";
        monthreal[0] = "Dec";
        sho[0] = "HWH";
        sho[1] = "MUM";
        sho[2] = "DLH";
        sho[3] = "HYD";
        sho[4] = "BNG";
        sho[5] = "PTN";
        sho[6] = "JIP";
        sho[7] = "SRN";
        sho[8] = "DAR";
        sho[9] = "GUA";
    }
    void welcome()
    {
        Date date = new Date();
        System.out.println("\n******************************************************************************************************");
        System.out.println("*                                                                                                    *");
        System.out.println("*                                                                                                    *");
        System.out.println("*      ----------------------------------------------------------------------------------------      *");
        System.out.println("*      |      ##########################################################################      |      *");
        System.out.println("*      |      ************** WELCOME TO OUR RAILWAY RESERVATION SYSTEM******************      |      *");
        System.out.println("*      |      ##########################################################################      |      *");
        System.out.println("*      |                                                                                      |      *");
        System.out.println("*      |                      CURRENT DATE  - " +date.toString()+"                    |      *");
        System.out.println("*      |                                                                                      |      *");
        System.out.println("*      |          --- Chose one of the following options to proceed ahead ----                |      *");
        System.out.println("*      |                                                                                      |      *");
        System.out.println("*      |                 1 - Login to use our services                                        |      *");
        System.out.println("*      |                 2 - Book your ticket                                                 |      *");
        System.out.println("*      |                 3 - Search reserved ticket by PNR number                             |      *");
        System.out.println("*      |                 4 - view train and station list                                      |      *");
        System.out.println("*      |                 5 - cancel reserve ticket                                            |      *");
        System.out.println("*      |                 6 - Logout                                                           |      *");
        System.out.println("*      |                 7 - exit                                                             |      *");
        System.out.println("*      ----------------------------------------------------------------------------------------      *");
        System.out.println("*                                                                                                    *");
        System.out.println("*                                                                                                    *");
        System.out.println("******************************************************************************************************");
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
    void seperate()
    {
        Date date = new Date();
        String s = date.toString();
        int a,b;
        a = s.indexOf(' ');
        b = 7;
        month = s.substring(a,b);
        for(int i=0;i<12;i++)
        {
            if((month.trim()).equalsIgnoreCase(monthreal[i]))
            {
                g=i+1;
                break;
            }
        }
        year = Integer.parseInt((s.substring(s.lastIndexOf(' ') , s.length())).trim());
        int d = s.indexOf(' ' , 4);
        day = Integer.parseInt((s.substring(d , 10)).trim());
        System.out.println(day);
    }
    public void input(int c1 ,int c2, int adult , int child , int xfat)throws IOException
    {
        int c=0;
        double a,b;
        double y;
        for(int n=0;n<adult;n++)
           {
               System.out.print("\n\nEnter the name of the passenger          : ");
               a:for(;;)
               {                  
                  name[n] = br.readLine();
                  if(Character.isLetter(name[n].charAt(0)))
                   break a;
                  else                 
                   System.out.print("\nRE-enter the name of the passenger       : ");                  
               }
                System.out.print("\nEnter your Berth(AC/GENERAL/CHAIR CAR)   :");
               aa: for(;;)
               {
                  Berth[n]= br.readLine();
                  if(Berth[n].equalsIgnoreCase("AC") || Berth[n].equalsIgnoreCase("GENERAL") || Berth[n].equalsIgnoreCase("CHAIR CAR"))
                   break aa;
                   else
                   System.out.print("\nRE-enter your Berth(AC/GENERAL/CHAIR CAR):");
               }
               System.out.print("\nEnter the age of passenger               : ");
                b:while(true)
                {                  
                  age[n] = Integer.parseInt(br.readLine());
                  if((age[n]>=18)&&(age[n]<=100))
                   break b;
                   else
                   System.out.print("\nRE-enter the age of passenger               : ");
                  }
                System.out.print("\nEnter the sex of the passenger(male/female)           : ");
               c: for(;;)
               {
                 sex[n] = br.readLine();
                 if((sex[n].equalsIgnoreCase("male")) || (sex[n].equalsIgnoreCase("female")))
                  break c;
                  else
                   System.out.print("\nRE-enter the sex of the passenger(male/female)           : ");
                }
                System.out.print("\nEnter the address of the passenger       : ");
                address[n] = br.readLine();
                System.out.print("\nEnter the date of journey");
                System.out.print("\nFormat : DD/MM/YYYY" + "\nIf day or month is single digit please add a zero before it : ");
                today[n] = br.readLine();
                String d="";
                d=Math.random() + "";
                int l = d.indexOf('.');
                String gh = d.substring((l+1) , 8);
                int h = Integer.parseInt(gh);
                pnr[n] = Math.round(h);
                System.out.print("\nYOUR PNR NUMBER IS : " + Math.rint(pnr[n]));
               if(c1>c2)              
                    
                {  
                    
                    fare[n] = xfat*(distance[c1] - distance[c2]);
                    y=fare[n];
                    a = 3*fare[n]/100;
                    b = 4*fare[n]/100;
                    fare[n] = y+a+b;
                    System.out.print("\nYour service tax         : " +a) ;
                    System.out.print("\nYour family planning tax : " + b);
                    System.out.print("\n                                +");
                    System.out.print("\n---------------------------------");
                    System.out.print("\nTOTAL FARE               : " + fare[n]);
                }
                else
                {
                    fare[n] = xfat*(distance[c2] - distance[c1]);
                    y=fare[n];
                    a = 3*fare[n]/100;
                    b = 4*fare[n]/100;
                    fare[n] = y+a+b;
                    System.out.print("\nYour service tax         : " +a) ;
                    System.out.print("\nYour family planning tax : " + b);
                    System.out.print("\n                                +");
                    System.out.print("\n---------------------------------");
                    System.out.print("\nTOTAL FARE               : " + fare[n]);
                }          
             }
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
            System.out.println("########################WELCOME TO SOUTH EASTERN RAILWAY BOOKING SYSTEM###########################");
            System.out.println("**************************************************************************************************");
            System.out.println();
            System.out.println("Follow the following steps to book your ticket \n");
            System.out.println("STATION " + " \tSTATION CODE");
            one:for(int i=0;i<10;i++)
            {
                System.out.println(""+ station[i] +"\t\t"+ sho[i]);
            }
            int k=-1;
           two : for(;;)
            {
                 System.out.print("\nPlease enter your starting station code from the following options : ");      
                 from = (br.readLine()).toUpperCase();
                 a:for(int i=0;i<400;i++)
                 {
                  if(from.equalsIgnoreCase(sho[i])==true )
                  {
                      k=1;
                   break a;
                }
                  
                }
                if(k==1)
                 break two;
                else
                  {
                      System.out.print("\nRE-ENTER starting station code");
                  }
            }
            int yu=-9;
            three:while(true)
            {
                System.out.print("\nPlase enter your arrival station code                              : ");
                to = (br.readLine()).toUpperCase();   
                d:for(int i=0;i<400;i++)
                 {
                if(to.equalsIgnoreCase(sho[i])==true){
                    yu=1;
                 break d;}
                
               }
               if(yu==1)
               break three;
               else
                {
                    System.out.print("\nRE-ENTER arrival station code");
                }
            }
               
                                
                
                    
            four:for(int i=0;i<10;i++)
            {
                if(from.equalsIgnoreCase(sho[i]))
                {
                    c1 = i;
                    break;
                }
            }
            five:for(int i=0;i<10;i++)
            {
                if(to.equalsIgnoreCase(sho[i]))
                {
                    c2 = i;
                    break;
                }
            }      
            System.out.println("Select train from the list given :");
            System.out.println("Train \n");
            six: for(int i=0;i<10;i++)
            {
                System.out.println(""+(i+1) + " . " +trainame[i]);
            }
            System.out.print("\nYour selected train is                 : ");
            int sd = Integer.parseInt(br.readLine());
            train = trainame[sd-1];
            c++;
            System.out.print("\nEnter the number of adult passenger  : ");
            adult = Integer.parseInt(br.readLine());
            for(int i=0;i<adult;i++)
            {
             xfat=50;
             System.out.print("\nEnter the information of adult passenger number " + (i+1));
             input(c1,c2,adult,child,xfat);
            }
            System.out.print("\nEnter the number of child passenger  : ");
            child = Integer.parseInt(br.readLine());
            for(int i=0;i<child;i++)
            {
             xfat=25;
             System.out.print("\nEnter the information of child passenger number " + (i+1));
             input(c1,c2,adult,child,xfat);
            }
           
        }
        else
        {
            System.out.println("You are not logged in .\nPlease login to continue ");
        }
    }

    public void search()throws IOException
    {
        if(login == true)
        {
        double enumb=0.0;
        int y = -1,r=-1,n=-1,m=-9;
        System.out.println("Please enter your TICKET PNR NUMBER to view your ticket ");
        enumb = Double.parseDouble(br.readLine());       
        for(int i=0;i<400;i++)
        {
            if(enumb == pnr[i])
            {
                y=i;
                break;
            }
        }
        for(int i=0;i<400;i++)
        {
            if(from.equalsIgnoreCase(sho[i]))
            {
                r=i;
                break;
            }
        }
        for(int i=0;i<400;i++)
        {
            if(enumb == pnr[i])
            {
                n=i;
                break;
            }
        }
        if((y>=0)&&(y<=adult))
        {
            System.out.println("\n\nYour ticket is displayad as follows ");
            System.out.println("*********************************************************************************");
            System.out.println("*  STARTING STATION      - " +  station[r] + "("+from+")");
            System.out.println("*  DESTINATION STATION   - " +  station[n] + "("+to+")");
            System.out.println("*  TRAIN NAME            - " + train);
            System.out.println("*  TRAIN NUMBER          - " + trno[y]);
            System.out.println("*  BERTH TYPE            - " + Berth[y]);
            System.out.println("*  NAME                  - " + name[y] );
            System.out.println("*  AGE                   - " + age[y]  );
            System.out.println("*  ADDRESS               - " + address[y]);
            System.out.println("*  SEX                   - " + sex[y]  );
            System.out.println("*  PNR                   - " + pnr[y] );
            System.out.println("*  FARE                  - " + fare[y]);
            System.out.println("*********************************************************************************");
            System.out.println("\n                           #####################");
            System.out.println("                           ****HAPPY JOURNEY****");
            System.out.println("                           #####################");
        }
        else
        {
            System.out.println("Your PNR number was not found in our list ");
            System.out.println("Either contact us or rebook your ticket ");
        }
      }
      else
        System.out.println("Sorrry !!! You are not logged in please login to exit");
    }

    public void deleteFromArray(int i,double a[]){
        for(int j=i+1; i<a.length;i++)
        {
            a[j-1]=a[j];
        }
        a[i-1]=0;
        }
        
    
    public void cancel()throws IOException
    {
        if(login == true)
        {
        double p=0;
        int g=0;
        int z=-1,m=-8,count = 0;
        System.out.println("Please enter your PNR number ");
        p = Double.parseDouble(br.readLine());       
        for(;;)
        {
            if(p == pnr[count])
            {
                System.out.println("Your Reservation was found \nPlease follow our instructions to cancel your journey ");
                z=count;
                deleteFromArray(count,pnr);
                System.out.print("Your reservation was` cancelled!!ENJOYY!!!!!!!!!!!!!!!!!!!!!!!!!!!!:");
                break;
            }
            else
            {
                System.out.println("Your reservation was not found .\nRe-enter your PNR number to cancel your ticket\n\n");
                System.out.println("Please enter your PNR number ");
                p = Integer.parseInt(br.readLine());
                g++;
            }
            if(g==2)
             break;
            count ++;
        }
        day1 = Integer.parseInt(today[z].substring(0 , today[z].indexOf('/')));
        g1 = Integer.parseInt(today[z].substring(today[z].indexOf('/') + 1 , today[z].indexOf('/' , 3)));
        year1 = Integer.parseInt(today[z].substring(today[z].lastIndexOf('/')+1 , today[z].length()));
        if(day>day1)
            d3=day-day1;
        else
        {
            d3 = day+30 - day1;
            g = g-1;
        }
        if(g>g1)
            m3 = g - g1;
        else
        {
            m3 = g+12 - g1;
            year = year - 1;
        }
        y3 = year - year1;
        totday = d3 / 365 + m3 /12 + y3;
        System.out.println(totday);

      }
      else
        System.out.println("Sorrry !!! You are not logged in please login to exit");
    }
    public  void display_chart()
    {          
        System.out.println(" The list of trains available to us are\n");
        System.out.println(" Train name \t\t" + " Train number \n");
        for (int i=0;i<10;i++)
        {
            System.out.println(trainame[i] + " \t" + trno[i]);
        }
        System.out.println();
        System.out.println("\n The stations on the way\n");
        System.out.println(" Station\t" + "Station\t" + "\tDistance from ");
        System.out.println(" name   \t" + "code  \t"  + "\tfrom Howrah\n");
        for(int i=0;i<10;i++)
        {
            System.out.println(station[i] + "\t" + sho[i] + "\t\t" + distance[i]);
        }
    }

    public static void main(String args[])throws IOException
    {       
        Railway ob = new Railway(); 
        ob.welcome();
        first:for(;;)
        {         
            n=Integer.parseInt(br.readLine()); 
            System.out.print("\u000c");
            switch(n)
            {
                case 1:
                ob.SignUp();
                ob.welcome();
                break;

                case 2:
                ob.bookticket();
                ob.welcome();
                break;

                case 3:
                ob.search();
                ob.welcome();
                break;

                case 4:
                ob.display_chart();
                ob.welcome();
                break;

                case 5:
                ob.cancel();
                ob.welcome();
                break;

                case 6:
                login = false;
                ob.welcome();
                break;

                case 7:
                if(login == false)
                {
                    System.out.println("Thank you for using our service \nPlease visit again");
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
                continue first;
            }
        }
    }
}
