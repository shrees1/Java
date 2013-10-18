class Prime
{
 public static void main(String a[])
 {
  int n=Integer.parseInt(a[0]);
  int i,flag=0;

  for(i=2;i<=n-1;i++)
  {
    if(n%i==0)
     {
      System.out.println("no. is not prime");
      flag=1;
      //System.exit(0);
      break;
     }
   }
 
     if (flag==0)
    {
     System.out.println("no .is prime");
      // break;
    }
  
 }
}
