class star
{
 public static void main(String a[])
 {
  int n=Integer.parseInt(a[0]);
  int i=0;int j=0;
  for( i=0;i<=n;i++)
  {
   for(j=0;j<=i;j++)
    {
     System.out.print("*");
    }
    System.out.println("");
  }
 
 for( i=0;i<=n;i++)
  {
   for( j=n;j>=i;j--)
    {
     System.out.print("*");
    }
    System.out.println("");
  }
 }
}