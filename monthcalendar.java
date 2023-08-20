import java.io.*;
class monthcalendar
{
    public static void main() throws IOException
    {
     int n=0;
     String S="",x="";
        InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);     
        System.out.println("Enter the year");
        int y = Integer.parseInt(br.readLine());
         System.out.println("Enter the month(full month name required)");
        S = br.readLine();
         System.out.println("Enter the 1st day name of the month(full day name required)");
        x = br.readLine();
        S=S.toUpperCase();
        x=x.toUpperCase();
       String D[] ={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
        for(int i=0;i<7;i++)
        {
            if(x.equals(D[i]))
            { 
                n=i;
                break;
        }
    }
        
    if(S.equals("JANUARY")||S.equals("MARCH")||S.equals("MAY")||S.equals("JULY")||S.equals("AUGUST")||S.equals("OCTOBER")||S.equals("DECEMBER"))
        {
            int j=0;
            for(int i=n;i<7;i++)
            {
                System.out.println("Date"+"\t"+"Day");
                System.out.println((j++)+"\t"+D[i]);
                if(i==6)
                {
                    i=0;
                }
                if(j==31)
                {
                    break;
                }
            }
        }
         if(S.equals("APRIL")||S.equals("JUNE")||S.equals("SEPTEMBER")||S.equals("NOVEMBER"))
        {
            int j=0;
            for(int i=n;i<7;i++)
            {
                System.out.println("Date"+"\t"+"Day");
                System.out.println((j++)+"\t"+D[i]);
                if(i==6)
                {
                    i=0;
                }
                if(j==30)
                {
                    break;
                }
            }
        }
        if(S.equals("FEBRUARY"))
        {
            if(y%4==0)
            {
                int j=0;
            for(int i=n;i<7;i++)
            {
                System.out.println("Date"+"\t"+"Day");
                System.out.println((j++)+"\t"+D[i]);
                if(i==6)
                {
                    i=0;
                }
                if(j==29)
                {
                    break;
                }
                
        }
        
    }
    else if(y%4!=0)
    {  
        int j=0;
            for(int i=n;i<7;i++)
            {
                System.out.println("Date"+"\t"+"Day");
                System.out.println((j++)+"\t"+D[i]);
                if(i==6)
                {
                    i=0;
                }
                if(j==28)
                {
                    break;
                }
            }
        
}
}
}
}
