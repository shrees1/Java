class last
{
 public static void main(String a[])
 {
   int n=Integer.parseInt(a[0]);
   int c=1,u=0,v=0;int flag=0;
   while(n>10)
   {
     n=n/10;
     c=c+1;
   }
 System.out.println("digits :"+ c);
 

   int n1=Integer.parseInt(a[0]);
  System.out.println("digits are:"+ n1);


   int t=1;
   for(int l=1;l<c;l++)
   {
    t=t*10;
   }


    int n2=Integer.parseInt(a[0]);
    int o=0,n3=0,j,m,x;
    
   for(x=1;x<=c;x++)
  {
   for(j=1;j<=(x);j++)
   {
     u=n1%10;
     v=n1/10;
     n1=v;
    System.out.println("Digits are:"+u); 
   }
   
  // System.out.println("t is:" +t);
   for(m=1; m<=(x);m++)
   {
    o=n2/t;
   n3=n2%t;
   n2=n3;
   t=t/10;
   System.out.println("Digitszzzzz are:"+o);   
   }

  if(o==u)
  {
    System.out.println("////");
     flag=2; 
  }
 }


   if(flag==2)
   {
    System.out.println(" p ");
   }
   else
   {
   System.out.println("np");
   }
  } 
}