import java.util.*;
public class set
{
      int arr[],n;
      
      set(int nn)
      {
          n=nn;
          arr=new int[n];
          
      }
      void readelements()
      {
          Scanner sc=new Scanner(System.in);
          for (int i=0;i<n;i++)
          {arr[i]=sc.nextInt();}
      }
      void displayelements()
      {
          for (int i=0;i<n;i++)
          {System.out.println(arr[i]);}
        }
      int getsize()
        {return n;}
      int has(int ele)
        {
            int k=0;
            for(int i=0;i<n;i++)
            {
                if (ele==arr[i])
                 k++;
             }
             if (k==1)
             return 1;
            else return 0;
        
        }
      set intersection(set d)
        {
            set ob3=new set(50);
            for(int i=0;i<n;i++)
            {
                for (int j=0;j<d.n;j++)
                {
                    if(arr[i]==d.arr[j])
                    ob3.arr[i]=arr[i];
                }
            }
            return ob3;
           
        }
        set union(set d)
        {
            set ob4=new set(100);
            for(int i=0;i<n;i++)
            {
                ob4.arr[i]=arr[i];
            }
            for(int i=0;i<d.n;i++)
            {
                ob4.arr[n+1]=d.arr[i];
            }
            return ob4;
           
            
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
