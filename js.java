import java.util.*;
class js
{ public static void main()
  {Scanner sc=new Scanner (System.in);
    System.out.println("Enter the size");
    int n=sc.nextInt();
    int a[][]=new int[n][n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++)
      { for(int j=0;j<n;j++)
        { a[i][j]=sc.nextInt();
        }
      }System.out.println("Original Matrix");
    for(int i=0;i<n;i++)
      { for(int j=0;j<n;j++)
        {System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }int arr[]=new int[n*n];int k=0;
        for(int i=0;i<n;i++)
      { for(int j=0;j<n;j++)
        { if(i==0||j==0||i==n-1||j==n-1)
          { arr[k]=a[i][j];k++;
          }
        }
      }
      for(int i=1;i<=k;i++)
      { for(int j=0;j<k-1;j++)
          { if(arr[j]<arr[j+1])
            { int temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
            }
          }
      } int l=0;
      for(int i=0;i<n;i++)
      { for(int j=0;j<n;j++)
        { if(i==0||j==0||i==n-1||j==n-1)
          { if(i<=j)
            {  a[i][j]=arr[l];l++;}
          }
        }
      }
         k--;     
      for(int i=0;i<n;i++)
      { for(int j=0;j<n;j++)
        { if(i==0||j==0||i==n-1||j==n-1)
          { if(i>j)
            {  a[i][j]=arr[k];k--;}
          }
        }
      }
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      for(int i=0;i<n;i++)
      { for(int j=0;j<n;j++)
        {System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
  }
}