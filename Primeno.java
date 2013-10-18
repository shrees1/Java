class Primeno
{
 public static void main(String a[])
 {
  int n=Integer.parseInt(a[0]);
    int i, flag=0,count=0,c=1;

for(int j=3;j<=n;j++)
 {
  for(i=2;i<=(j-1);i++)
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
     c=c +1;  
    }
   }
   System.out.println("No. of Prime no:" +(n-count-1));
   System.out.println("No. of Composite no:"+ count);
      }
 }

