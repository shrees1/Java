class star1
{
 public static void main(String a[])
 {
  int n=Integer.parseInt(a[0]);
  int i=0;int j=0;
  for( i=n;i>=0;i--)
  {
   for(j=n;j>=i;j--)
    {
    System.out.print(" ");
    }
    System.out.print("*");
   System.out.println();
   }
   System.out.println();
 }
}
