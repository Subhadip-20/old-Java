import java.io.*;
class library
{
public static void main()throws IOException
{
   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    int a,d,e,f,h,i,amt,tamt=0,j,l,m,n,p=0,q,r,t,u,w,x;
    String b,c,g="y",o,s,v,ans="y";
    System.out.println(" YOU HAVE TO LOG IN FIRST");
    System.out.println();
    System.out.print(" ENTER YOUR NAME :");
    b=br.readLine();
    System.out.println();
    System.out.print(" ENTER YOUR email ID :");
    c=br.readLine();
    System.out.println();
    System.out.print(" ENTER YOUR PASSWORD:");
    d=Integer.parseInt(br.readLine());
    System.out.println();
    System.out.print(" RE-ENTER YOUR PASSWORD:");
    e=Integer.parseInt(br.readLine());
    System.out.println();
       if(d!= e)
       {
           System.out.println(" PLEASE USE SAME PASSWORD:");
           System.exit(0);
        }
        
        else
       {
           System.out.println(" LOGIN SUCCESSFUL");
          
        }
        
       
System.out.println("            ------------------------------------------------------------------------------------------");
System.out.println("            |                                                                                        |");
System.out.println("            |********************************WELCOME TO LIBRARY**************************************|");
System.out.println("            |                                                                                        |");
System.out.println("            |                                                                                        |");
System.out.println("            |                                PRESS 1 TO ISSUE A BOOK                                 |");
System.out.println("            |                                PRESS 2 TO RETURN A BOOK                                |");
System.out.println("            |                                PRESS 3 TO LOG OUT                                      |");
System.out.println("            |                                PRESS 4 TO EXIT                                         |");
System.out.println("            |                                                                                        |");
System.out.println("            |                                                                                        |");
System.out.println("            ------------------------------------------------------------------------------------------");
System.out.print("                  ENTER YOUR CHOICE:");
                    a=Integer.parseInt(br.readLine());
System.out.println();
                    if(a==1)
                        {
           
            System.out.println(" NOW YOU CAN TAKE BOOKS");
                System.out.println("            ------------------------------------------------------------------------------------------");
                System.out.println("            |                                                                                        |");
                System.out.println("            |                                                                                        |");
                System.out.println("            |                                PRESS 1 FOR COMIC BOOK                                  |");
                System.out.println("            |                                PRESS 2 FOR EDUCATIONAL BOOK                            |");
                System.out.println("            |                                PRESS 3 FOR OTHERS                                      |");
                System.out.println("            |                                                                                        |");
                System.out.println("            |                                                                                        |");
                System.out.println("            ------------------------------------------------------------------------------------------");
                System.out.print  ("                 ENTER YOUR CHOICE:");
                f=Integer.parseInt(br.readLine());
                System.out.println();
                if (f==1)
                {
                    System.out.println("THE CATEGOERY CONTAIN THIS BOOK"); 
                    System.out.println();
                      System.out.println();  
              System.out.println("1. THE AMAZING SPIDERMAN");
              System.out.println("2. HARRY POTTER VOL 1");
            System.out.println("3. TRANSFORMER THE AGE OF EXTINCTION");
            System.out.println("4. AVENGERS : INFINITY WAR");
            System.out.println("5. HOME ALONE 1");
            System.out.println("6. BABY'S DAY OUT - CHINA");
            System.out.println("7. AMERICAN PIE : THE BETA'S HOUSE");
            System.out.println("8. WOLVERINE VOL 1");
            System.out.println("9. THE PREDATOR");
            System.out.println("10. CAPTAIN AMERICA");
            System.out.print(" CHOOSE YOUR BOOK BY ENTERING THE NUMBER: ");
          h=Integer.parseInt(br.readLine());
          if(h<=10)
          { System.out.println();
           System.out.print(" CHOOSE THE NUMBER OF DAYS:");   
           i=Integer.parseInt(br.readLine());
           System.out.println();
           System.out.println("FOR COMIC BOOK Rs 8 PER DAY");
           amt=8*i;
           tamt=tamt+amt;
          
        }
           else
           {
           System.out.println("ENTER BETWEEN 1 TO 10");
           
        }
        
    }

     if (f==2)
       {
          System.out.println("THE CATEGOERY CONTAIN THIS BOOK"); 
          System.out.println();
         System.out.println();
          System.out.println("1. COMPUTER APPLICATION ");
          System.out.println("2. PHYSICS 10");
          System.out.println("3. CHEMISTRY 10");
          System.out.println("4. BIOLOGY 10");
          System.out.println("5. MATHEMETICS 10");
          System.out.println("6. BENGALI 10");
          System.out.println("7. ENGLISH LANGUAGE 10");
          System.out.println("8. ENGLISH LITERATURE 10");
          System.out.println("9. HISTORY 10");
          System.out.println("10.GEOGRAPHY 10");
          System.out.print(" CHOOSE YOUR BOOK BY ENTERING THE NUMBER: ");
          j=Integer.parseInt(br.readLine());
          if(j<=10)
          {System.out.println();
           System.out.print(" CHOOSE THE NUMBER OF DAYS : ");   
          int k=Integer.parseInt(br.readLine());
           System.out.println();
           System.out.println("FOR EDUCATIONAL BOOK Rs 6 PER DAY");
           amt=6*k;
           tamt=tamt+amt;
          
        }
           else
           {
           System.out.println("ENTER BETWEEN 1 TO 10");
           
        }
        
    }

     if (f==3)
       {
          System.out.println("THE CATEGOERY CONTAIN THIS BOOK"); 
          System.out.println();
          
          System.out.println("1. DRAWING BOOK ");
          System.out.println("2. ART ATTACK ");
          System.out.println("3. GAMES");
          System.out.println("4. HARRY POTTER VOL 2");
          System.out.println("5. HOME ALONE 5");
          System.out.println("6. AMAZING SPIDERMAN VOL 2");
          System.out.println("7. SHARK NIGHT 1");
          System.out.println("8. SPIDERMAN HOMECOMING VOL 1");
          System.out.println("9. SPIDERMAN VOL 3");
          System.out.println("10.STORY BAYWATCH");
          System.out.print(" CHOOSE YOUR BOOK BY ENTERING THE NUMBER: ");
        l=Integer.parseInt(br.readLine());
          if(l<=10)
          {System.out.println();
           System.out.print(" CHOOSE THE NUMBER OF DAYS: ");   
           m=Integer.parseInt(br.readLine());
           System.out.println();
           System.out.println("FOR EDUCATIONAL BOOK Rs 5 PER DAY");
        
           amt=5*m;
           tamt=tamt+amt;
          
        }
           else{
           System.out.println("ENTER BETWEEN 1 TO 10");
           
        }
        
    }

}
     if(a==2)
       {
           
            System.out.println(" NOW YOU CAN RETURN BOOKS");
     System.out.println("            ------------------------------------------------------------------------------------------");
     System.out.println("            |                                                                                        |");
     System.out.println("            |                                                                                        |");
     System.out.println("            |                                PRESS 1 FOR COMIC BOOK                                  |");
     System.out.println("            |                                PRESS 2 FOR EDUCATIONAL BOOK                            |");
     System.out.println("            |                                PRESS 3 FOR OTHERS                                      |");
     System.out.println("            |                                                                                        |");
     System.out.println("            |                                                                                        |");
     System.out.println("            ------------------------------------------------------------------------------------------");
     System.out.print("                  ENTER YOUR CHOICE:");
     n=Integer.parseInt(br.readLine());
     System.out.println();
     if(n==1)
     {
         
      System.out.print("ENTER THE NUMBER OF DAY: ");
        p=Integer.parseInt(br.readLine());
      System.out.println();
      System.out.print("ENTER THE NUMBER OF BOOKS: ");
        r=Integer.parseInt(br.readLine());
      System.out.println("RATE IS Rs 7 PER DAY");
      q=(7*p*r);
    tamt=tamt+q;
}
 if(n==2)
     {
         System.out.println("ENTER THE NAME OF THE BOOK");
      s=br.readLine();
      System.out.print("ENTER THE NUMBER OF DAY: ");
      t=Integer.parseInt(br.readLine());
      System.out.println();
     System.out.print("ENTER THE NUMBER OF BOOKS: ");
      u=Integer.parseInt(br.readLine());
      System.out.println("RATE IS Rs 8 PER DAY");
      q=8*t*u;
    tamt=tamt+q;
}
if(n==3)
     {
         System.out.println("ENTER THE NAME OF THE BOOK: ");
      v=br.readLine();
      System.out.print("ENTER THE NUMBER OF DAY: ");
      w=Integer.parseInt(br.readLine());
      System.out.println();
      System.out.print("ENTER THE NUMBER OF BOOKS: ");
      x=Integer.parseInt(br.readLine());
      System.out.println("RATE IS Rs 7 PER DAY");
      q=(7*w*x);
    tamt=tamt+q; 
    }
    
}
if(a==3)
{   b="";
    c="";
    d=0;
    e=0;
}
if (a==4)
{
    System.out.println("YOU ARE HOPELESS");
    System.exit(0);
}

    System.out.print("YOUR TOTAL AMOUNT IS   "+tamt);
}
}


 







