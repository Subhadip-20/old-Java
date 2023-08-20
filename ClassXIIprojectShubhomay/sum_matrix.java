/* program coded by Shubhomay Kundu Poddar
 program to dispaly the sum of each row and column in their respective row and column from a two dimensional array
 */
import java.util.*; 

class sum_matrix
{

int mat[][]=new int[50][50]; 
int m,n;

sum_matrix()//default constructor

{

for(int i=0;i<50;i++)

{

for(int j=0;j<50;j++)
 mat[i][j]=0;
}

}

void read_row_column(int x,int y)

{

m=x; n=y;
}

void readmatrix()//taking user input in the array

{

Scanner sc=new Scanner(System.in);
 
System.out.println("Input the numbers in the array="); 

for(int i=0;i<m;i++)
{

for(int j=0;j<n;j++)
 mat[i][j]=sc.nextInt();
}

}

void show_mat()//dispalying the matrix

{

for(int i=0;i<m;i++)

{

for(int j=0;j<n;j++)

{

System.out.print(mat[i][j]+" ");

}

System.out.println();

}

}

   void summatrix()

{

       int sum1=0;



    for(int i=0;i<m;i++)
    {

        for(int j=0;j<n;j++)
        {
                
                System.out.print(mat[i][j]+" ");
                sum1=sum1+mat[i][j];
         }
         System.out.print(sum1);
         sum1=0;
         System.out.println();
    }
    
    
    
    String a="";
     int sum2=0;
    for(int i=0;i<n;i++)
    {
       
         for(int j=0;j<m;j++)
        {
               sum2=sum2+mat[j][i];
             
                
         }
        a=a+""+sum2+" ";
         sum2=0;
         
    }
    
    
    System.out.print(a);
   }

public static void main()

{

sum_matrix ob = new sum_matrix(); //creating object
Scanner sc = new Scanner(System.in);
System.out.println("Enter row and column"); 
int x =sc.nextInt();
int y= sc.nextInt();
 
ob.read_row_column(x,y); 
ob.readmatrix(); 
System.out.println("INPUT IS:");
ob.show_mat();
System.out.println("OUTPUT IS:");
ob.summatrix();
 

}

}
