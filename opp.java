class digit
{
 public static void main(String a[])
 {
  int p=Integer.parseInt(a[0]);
  int p2=0,p1=0,count=1;

  System.out.println("No. is:"+ p);
 
   while(p>10)
    {
     p2=p%10;
     p=p/10;
     count=count+1;
     System.out.println("no. is:"+ p2);
    }
 System.out.println("no. is:"+ p);
 System.out.println("No of digits is:"+ count);
 }
}