class palin
{
 public static void main(String a[])
 {
  int n=Integer.parseInt(a[0]);
  // String n=a[0];
  int count=2,p=1,m,l=1,l1=1,d=1,q=0,x=0,x1=0;
   if(n<10)
   {
    count=1;
   }
  while(n>10)
   {
     n=n/10;
     if(n>10)
     {
      count=count+1;
     }
   }
   System.out.println("Total no. of digits :"+ count);
  for(int j=1;j<count;j++)
   {
     p=p*10;
   }
   System.out.println("max is :"+ p);
 
  
  m=Integer.parseInt(a[0]);
  System.out.println("No:"+ m);

  l=m/p;
  
  System.out.println("1st is :"+ l);
 // System.out.println("remainder :"+ q);



for(int k=1;k<count;k++)
{ 
 q=m%p;
  //System.out.println("remainder :"+ q);
  while(q>10)
{
  d=d+1;
 //System.out.println("D is :"+ d);
 break;
 }
 q=q/10; 
//System.out.println("D is :"+ d);
}
   System.out.println("D is :"+ d);

for(int t=1;t<=d;t++)
{
for(int e=1;e<=t;e++)
 {
  l=m/p;
  l1=m%p;
  m=l1;
  p=p/10;
 }
 System.out.println(" digit :"+ l);
 
int u=Integer.parseInt(a[0]);

for(int f=1;f<=t;f++)
{
x=u/10;
x1=u%10;
u=x;
}
System.out.println("Last digit is:"+x1);
}

if(l!=x1)
{
 System.out.println("No. is not Palindrome");
 System.exit(0);
//break;

}
  else
  {
   System.out.println("No. is palindrome");
   System.exit(0);
  }
   
 }
}