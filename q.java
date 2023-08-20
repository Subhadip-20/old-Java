import java.util.*;
public class q
{
    static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int getPivot(int arr[], int start, int end)
    {
        int pivot=start;
        start++;  
        while(start<=end)
        {
            if((arr[start]>arr[pivot])&&(arr[pivot]>arr[end]))
            {
                swap(arr,start,end);
            }
            if(arr[start]<=arr[pivot])
            start++;
            if(arr[end]>=arr[pivot])
            end--;
        }
        if(arr[end]<arr[pivot])
        {
            swap(arr,end, pivot);
            
            pivot=end;
        }
        return pivot;
    }
    static void qsort(int arr[],int start, int end)
    {
       if(start>=end)
        return;
        else
        {
            int pivot=getPivot(arr,start,end);
            qsort(arr,start,pivot-1);
            qsort(arr,pivot+1,end);
        }
    }
    public static void main()
    {
        //int p[]=new int[2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array1");
        //p[0]=sc.nextInt();
        //p[1]=sc.nextInt();
        
        //swap(p,0,1);
        //System.out.println(p[0]+""+p[1]);
        
        
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int g[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        g[i]=sc.nextInt();
        qsort(g,0,n-1);
        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++)
        System.out.println(g[i]);
    }
}
