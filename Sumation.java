class Sumation
{
 public static void main(String a[])
 {
  int n,n1,n2;
  int sum=0;
  //System.out.println("enter the no.:");
  n=Integer.parseInt(a[0]);
  while(n>0)
  { 
  n1=n/10;
  n2=n%10;
  n=n1;
  sum=sum+n2;
  }
  System.out.println("sum is:" +sum); 
 }
}
