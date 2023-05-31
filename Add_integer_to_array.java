//Inserting elements
import java.util.Scanner;
class Add_integer_to_array
{
  public static void main(String[] args)
  {
    int a[]=new int[50];
    int i,m,n;
    System.out.println("enter no. of elements to be inserted:");
    Scanner in = new Scanner(System.in);
    n=in.nextInt();
    System.out.println("enter the array elements:");
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    System.out.println("enter the n0. of elements you want to add:");
    m=in.nextInt();
    System.out.println("enter the elements to add into an array:");
    for(i=n;i<n+m;i++)
    {
      a[i]=in.nextInt();
    }
    System.out.println("array elements after adding the eleemnts");
    for(i=0;i<n+m;i++)
    {
      System.out.println(a[i]+" ");
    }
  }
}
