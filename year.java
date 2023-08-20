import java.io.*;
public class year
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        String month[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        System.out.println("ENTER THE YEAR");
         int year =Integer.parseInt(br.readLine());
          System.out.println("ENTER THE MONTH");
         String monthh =br.readLine();
          System.out.println("ENTER THE FIRST DAY");
         String first =br.readLine();
         int dayno[]={31,28,31,30,31,30,31,31,30,31,30,31};
         String day[]={"MONDAY","TUESDAY","WEDNESSDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
         if (year%4==0)
         {
             dayno[1]=29;
             
         }
         for(int i=0;i<month.length;i++)
         {
             if(month[i].equalsIgnoreCase(monthh))
             {
                 System.out.println("THE MONTH HAS "+dayno[i]+" days");
             }
         }
         
    }
}
