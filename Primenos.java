class Primenos
{
 public static void main(String a[])
 {
  
  int n=Integer.parseInt(a[0]);
  int m=Integer.parseInt(a[1]);

  // System.out.println("No. of Prime no:" +a[0]);
  // System.out.println("No. of Composite no:"+ a[1]);

   int i, flag=0,count=0,c=1;

for(int j=n;j<=m;j++)
 {
  for(i=2;i<(j-1);i++)
  {
    if(j%i==0)
     {
         count=count+1; 
         break;   
     }
    flag=1;
   }
     
     if(flag==0)
    {
    // c=c +1;  
    }
   }
   System.out.println("No. of Prime no:" +((m-n+1)-count));
   System.out.println("No. of Composite no:"+ count); 
      }
 }

