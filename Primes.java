class Primes
{
 public static void main(String  a[])
 {
  int n=Integer.parseInt(a[0]);
  int count=1;
   for(int i=3;i<=n;i++)
    {
    for(int j=2;j<i;)
     {
       while(i%j==0)
       {
        break;
       }
        //break;
      j++;
     }   
       
       if(i%j!=0)
        {
         //System.out.println("No. is Prime");
           count =count+1;
           break;
           //System.exit(0);
          //}
          }        
       }
        System.out.println("No. of Prime No.: "+count);
     
  }
}