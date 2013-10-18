class shame
{ 
public static void main(String a[])
 {
  int n=Integer.parseInt(a[0]);
 for(int i=2;i<n;i++)
  {
  while(n%1==0 || n%i==0)
  {
    
   System.out.println("No. is Not Prime");
  // break;
   i++;
  }

  while(n%1==0 || n%i!==0)
  {
   //i++;
   //System.out.println("No . is Prime");
   break;
   }
 }
 }
}