import java.util.*;
public class Collection
{
   int arr[],len;
   Collection()
   {
   }
   Collection(int a)
   {
       len=a;
       arr=new int[len];
       
   }
   void inparr()
   {
          Scanner sc=new Scanner(System.in);
          for (int i=0;i<len;i++)
          {arr[i]=sc.nextInt();}
          sc.close();
      }
      Collection common(Collection d)
      {
          Collection ob3=new Collection(50);
            for(int i=0;i<len;i++)
            {
                for (int j=0;j<d.len;j++)
                {
                    if(arr[i]==d.arr[j])
                    ob3.arr[i]=arr[i];
                }
            }
            return ob3;
      }
      void arrange()
      {
          int temp=0;
           for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr.length-i-1;j++)
        {if(arr[j]>arr[j+1])
            {   temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
        void display()
        {           for(int i=0;i<len;i++)
            System.out.println(arr[i]);
        }
        void removeduplicate()
	{
	   int length = arr.length; 
        int n= length;
	     int[] temp = new int[length];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
         
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
	 }
}
