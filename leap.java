class leap
{
 public static void main(String a[])
 {
   int n=Integer.parseInt(a[0]);
    if((n%4==0 && n%100!=0)|| (n%400==0))
    {
      System.out.println("LEAP YEAR");
    }
   else
   {
     System.out.println("NOT A LEAP YEAR");
   }
 }
}