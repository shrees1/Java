class factorial
 {
   public static void main(String a[])
   {
    int n=Integer.parseInt(a[0]);
    int fact=1;
    if(n==0 || n==1)
     {
      System.out.println("Factorial is: "+ fact);
      //break;
     }

   else
    {
     for(int i=1;i<=n;i++)
      {
       fact=fact*i;  
      }
     System.out.println("Factorial is:" +fact);
    }
   }
 }