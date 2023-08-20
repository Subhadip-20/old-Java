import java.util.*;
class Library_Management
{
Scanner sc=new Scanner(System.in);
 static String name,school,book,date;
 static int z=0,my_class,choice,year;
 void introduction()
 {   System.out.println("Welcome to our Library");
     System.out.println("Tribeni Tissues Vidyapith");
     System.out.println("Chandrahati-712504");
     System.out.println();
     System.out.println("Our library is enriched with a variety of books");
     System.out.println();
    }
    void register()
{       System.out.println();
        System.out.println("###########*###########*###########*###########*###########*###########");
        System.out.println();
        System.out.println("Want to issue interesting book ?");
        System.out.println();
        System.out.println("Enter 1 to register");
        System.out.println("Otherwise, Enter 2 to exit");
        int i=sc.nextInt();
        if(i==1)
        {System.out.println("Now enter your name");
            name=sc.nextLine();
            name=sc.nextLine();
           System.out.println("Enter your password(4-digit)");
           int password=sc.nextInt();
           for(int j=0;j<name.length();j++)
           {char ch = name.charAt(j);
               z+=(int)ch;
            }
         System.out.println("Enter name of your school/college(if any)"); 
         school=sc.nextLine();
         school=sc.nextLine();
         System.out.println("Enter your Class (if any) ");
         my_class=sc.nextInt();
         System.out.println("Enter th Date(DD.MM)");
         date=sc.nextLine();
         date=sc.nextLine();
          System.out.println("Enter the Year(YYYY)");
          year=sc.nextInt();
           System.out.println("Registration complete");
            System.out.println();
             System.out.println("********************************************************************************************************");
              System.out.println("Now, when your Registration is complete you are a member of your library.");
               System.out.println("Here you are welcomed, choose the book you like the most.");
              }
              else if(i==2)
              { System.out.println("Regestration can not be carried on.");
                System.exit(0);
            }
            else
            { System.out.println("Wrong input.............Regestration can not be carried on.");
                 System.exit(0);
            }
            
    }
    void science_fiction()
    {String[] book_array={"dune series","a space odyssey","a starship stoppers","ignited minds","journey to the centre of the earth","around the  world in eighty days","twenty thousand leagues under the sea","the machine","he war of the worlds","ralph",};
    System.out.println("Hmmm, interisting, you are a science lover............");
     System.out.println("So, for you we have a large variety of SCIENCE FICTION books.");
      System.out.println("Issue the one you like the most");
       System.out.println("Books available :");
        System.out.println("A. DUNE SERIES");
        System.out.println("B. A SPACE ODYSSEY");
        System.out.println("C. A STARSHIP STOPPERS");
        System.out.println("D. IGNITED MINDS");
        System.out.println("E. JOURNEY TO THE CENTER OF THE EARTH");
        System.out.println("F. AROUND THE WORLDS IN EIGHTY DAYS");
        System.out.println("G. TWENTY THOUSAND LEAGUES UNDER THE SEA");
        System.out.println("H. THE MACHINE");
        System.out.println("I. THE WAR OF THE WORLDS");
        System.out.println("J. RALPH");
        System.out.println();
        System.out.println("Enter the name of the book that you want to issue:(IN CAPITALS)");
        book=sc.nextLine();
        book=sc.nextLine();
        for(int l=0;l<10;l++)
        {
            if(book.equalsIgnoreCase(book_array[l]))
            {
                System.out.println("Thanks for issuing the books:"+book+"");
                 System.out.println();
                  System.out.println("######################################################################NOTE######################################################################");
                   System.out.println();
                    System.out.println("1. You have to return the books within 20 days, otherwise you have to pay a fine of RS 10 per day");
                     System.out.println("2. In case f any damage to the book you have to pay thrice the actual amount of the book");
                      System.out.println();
                       System.out.println("Thanks for visiting");
                       break;
                       
                
}
else if(l>8)
{ System.out.println("Enetr the name of the book corectly..........");
 System.out.println("Sorry, restart");
 System.exit(0);}
 
    
}
    }
    void mathematics()
    {String[] book_array={"CONCISE MATHEMATICS","EUCLIDS ELEMENT","WHAT IS MATHEMATICS ?","THE PRINCIPAL OF RUSSEL","FLATLAND","THE MAN WHO KNEWS THE INFINITY","MEN OF MATHEMATICS","CATEGORIES OF WORKING MATHEMATICS","FERMAT'S MATHEMATICS","JOW YO SOLVE IT",};
    System.out.println("YES , I THINK I UNDERSTOOD THAT YOU LIKE MATHEMATICS");
    System.out.println("THE BOOKS AVAILABLE ARE:");
    System.out.println("A. CONCISE MATHEMATICS");
    System.out.println("B. EUCLID'S MATHEMATICS");
    System.out.println("C. WHAT IS MATHEMATICS");
    System.out.println("D. THE PRINCIPLE OF MATHEMATICS");
    System.out.println("E. FLATLAND");
    System.out.println("F. THE MAN WHO KNEW INFINITY");
    System.out.println("G. MEN OF MATHEMATICS");
    System.out.println("H. CATEGOERIES FOR WORKING MATHEMATICS");
    System.out.println("I. FERMAT'S MATHEMATICS");
    System.out.println("J. HOW TO SOLVE IT");
    System.out.println();
    System.out.println("ENTER THE AME OF THE BOOK THAT YOU WANT TO ISSUE : (IN CAPITALS)");
    book=sc.nextLine();
    book=sc.nextLine();
    for (int l=0; l<10; l++)
    {
        if(book.equalsIgnoreCase(book_array[l]))
        {
            System.out.println("THANKS FOR ISSUING BOOKS:"+book+"");
            System.out.println();
            System.out.println("####################################NOTE####################################");
            System.out.println();
            System.out.println("1. YOU HAVE TO RETURN THE BOOKS WITHIN 20 DAYS, OTHERWISE YOU HAVE TO PAY A FINE OF RS. 10 FOR EACH DAY");
            System.out.println("2. IN CASE OF ANY DAMAGE TO THHE BOOK YOU HAVE TO PAY THE THRICE THE ACTUAL AMOUNT OF THE BOOK");
            System.out.println();
            System.out.println("THANS FOR VISITING");
            break;
        }
        else if(l<8)
        {
            System.out.println("ENTER THE NAME OF THE BOOK CORECTLY..........");
            System.out.println("SORRY RESTART");
            System.exit(0);
        }
        
    
    
    }
}
void literature()
{String[] book_array={"TO KILL A MOCKINBIRD","PRIDE AND PREJUDICE","THE GREAT GTASBY","WUTHERING HEIGHTS","THE LORD OF FLIES","A TALE OF THE TWO CITIES","JANE EYRE","NINETEEN EIGHTY-FOUR","GREAT EXPECTATION","HARRY POTTER SERIES",};
System.out.println();
System.out.println("YES, I THINK I UNDERSTOOD THAT YOU LIKE LITERATURE");
System.out.println("THE BOOKS AVAILABLE FOR YOU ARE:");
System.out.println("A. TO KILL A MONKINBIRD");
System.out.println("B. PRIDE AND PREJUDICE");
System.out.println("C. THE GREAT GTASBY");
System.out.println("D. WUTHERING HEIGHTS");
System.out.println("E. THE LORD OF FLIES");
System.out.println("F. A TALE OF THE TWO CITIES");
System.out.println("G. JANE EYRE");
System.out.println("H. NINETEEN EIGHTY-FOUR");
System.out.println("I. GREAT EXPECTATION");
System.out.println("J. HARRY POTTER SERIES");
System.out.println();
System.out.println("ENTER THE NAME OF THE BOOK THAT YOU WANT TO ISSUE (IN CAPITALS)");
book =sc.nextLine();
book =sc.nextLine();
for ( int l= 0; l<10; l++)
{
if(book.equalsIgnoreCase(book_array[l]))
{System.out.println("THANKS FOR ISSUING THE BOOK:"+book+"");
System.out.println();
System.out.println("###################################################################NOTE###################################################################");
System.out.println();
System.out.println("1. YOU HAVE TO RETURN THE BOOKS WITHIN 20 DAYS, OTHERWISE YOU HAVE TO PAY A FINE OF RS. 10 FOR EACH DAY");
System.out.println("2. IN CASE OF ANY DAMAGE TO THHE BOOK YOU HAVE TO PAY THE THRICE THE ACTUAL AMOUNT OF THE BOOK");
System.out.println();
System.out.println("THANS FOR VISITING");
            break;
}
else if(l<8)
{System.out.println("ENTER THE NAME OF THE BOOK CORECTLY...........");
System.out.println("SORRY RE-START");
System.exit(0);
}

}
}
void story()
{String[] book_array={"AESHOP'S FABLES","JACK IN THE BEANSTAL","THE CAT IN THE HAT","LITTLE RED RIDDING HOOD","THE UGLY DUCKLING","THUMBELINA","HOW TO CATCH A STAR","THE JUNGLE BOOK","CINDRELLA","ROOM ON THE BEOOM",};
System.out.println("YES, I THINK I UNDERSTOOD THAT YOU LIKE STORY BOOKS");
System.out.println("THE BOOKS AVAILABLE FOR YOU ARE: ");
System.out.println("A. AESHOP'S FABLES");
System.out.println("B. JACK AND THE BEANSTALK");
System.out.println("C. THE CAT IN THE HAT");
System.out.println("D. LITTLE RED RIDDNG HOOD");
System.out.println("E. THE UGLY DUCKLING");
System.out.println("F. THUMBELINA");
System.out.println("G. HOW TO CATCH A STAR");
System.out.println("H. THE JUNGLE BOOK");
System.out.println("I. CINDRELLA");
System.out.println("J. ROOM ON THE BROOM");
System.out.println();
System.out.println("ENTER THE NAMES OF THE BOOK THAT YOU WANT TO ISSUE (IN CAPITLAS) ");
book=sc.nextLine();
book=sc.nextLine();
for(int l= 0; l<10; l++)
{
if(book.equalsIgnoreCase(book_array[l]))
{System.out.println("THANKS FOR ISSUING THE BOOK:"+book+"");
System.out.println();
System.out.println("###################################################################NOTE###################################################################");
System.out.println();
System.out.println("1. YOU HAVE TO RETURN THE BOOKS WITHIN 20 DAYS, OTHERWISE YOU HAVE TO PAY A FINE OF RS. 10 FOR EACH DAY");
System.out.println("2. IN CASE OF ANY DAMAGE TO THHE BOOK YOU HAVE TO PAY THE THRICE THE ACTUAL AMOUNT OF THE BOOK");
System.out.println();
System.out.println("THANS FOR VISITING");
            break;
}
else if(l<8)
{System.out.println("ENTER THE NAME OF THE BOOK CORECTLY...........");
System.out.println("SORRY RE-START");
System.exit(0);
}

}
}

void detective ()
{String[] book_array={"MURDER ON THE ORIENT EXPRESS","THE BIG SLEEP","THE MOONSTONE","THE MALTASE FALCON","DEATH ON THE NILE","AND THEN THERE WERE NONE","THE MURDER OF THE RODGER ACKROYD","THE MYSTERIOS AFFAIRS AT STYLES","THE HOUND OF THE BASKERVILES","THE BACK ECHO",};
System.out.println("YES, I THINK I UNDERSTOOD THAT YOU LIKE DETECTIVE BOOKS");
System.out.println("THE BOOKS AVAILABLE FOR YOU ARE :");
System.out.println("A. MURDER ON THE ORIENT EXPRESS");
System.out.println("B. THE BIG SLEEP");
System.out.println("C. THE MOONSTONE");
System.out.println("D. THE MALTASE FALCON");
System.out.println("E. DEATH ON THE NILE");
System.out.println("F. AND THEN THERE WERE NONE");
System.out.println("G. THE MURDER OF THE RODGER ACKROYD");
System.out.println("H. THE MYSTERIOS AFFAIRS AT STYLES");
System.out.println("I.THE HOUND OF THE BASKERVILES ");
System.out.println("J. THE BACK ECHO");
System.out.println();
System.out.println("ENTER THE NAMES OF THE BOOK THAT YOU WANT TO ISSUE (IN CAPITLAS) ");
book=sc.nextLine();
book=sc.nextLine();
for(int l= 0; l<10; l++)
{
if(book.equalsIgnoreCase(book_array[l]))
{System.out.println("THANKS FOR ISSUING THE BOOK:"+book+"");
System.out.println();
System.out.println("###################################################################NOTE###################################################################");
System.out.println();
System.out.println("1. YOU HAVE TO RETURN THE BOOKS WITHIN 20 DAYS, OTHERWISE YOU HAVE TO PAY A FINE OF RS. 10 FOR EACH DAY");
System.out.println("2. IN CASE OF ANY DAMAGE TO THHE BOOK YOU HAVE TO PAY THE THRICE THE ACTUAL AMOUNT OF THE BOOK");
System.out.println();
System.out.println("THANS FOR VISITING");
            break;
}
else if(l<8)
{System.out.println("ENTER THE NAME OF THE BOOK CORECTLY...........");
System.out.println("SORRY RE-START");
System.exit(0);
}

}
}
void gk()
{String book_array[]={"ENERA GENERA GENERAL KNOWLEDGE 2019","LUCENT'S GENERAL KNOWLDGE","STUDENTS ENCYCLOPEDIA",};

}
public static void main()
{Library_Management ob=new Library_Management();
ob.introduction();
ob.register();
ob.science_fiction();
ob.mathematics();
ob.literature();
ob.story();
ob.detective();

}
    }