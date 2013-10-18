class prime
{
 public static void main(String args[])
 {
  int a=Integer.parseInt(args[0]);
  int flag=0;
 // System.out.println("Enter ur no:");
  System.out.println("you have entered :"+ args[0]);
  for(int i=2;i<=a-1;i++)
  {
   if(a%i==0)
   {
    flag=1;
    break; 
   }
  }

  if(flag==1)
    {
      System.out.println("Not a Prime no.");
    }
  else
   {
      System.out.println("prime no.");
   }
 }
}
