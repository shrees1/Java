class reverse
{
 public static void main(String a[])
 {
 StringBuffer s=new StringBuffer(a[0]);
 System.out.println("String is:"+s);
 int l=s.length();
 System.out.println("length is:"+l);
 StringBuffer c=new StringBuffer();
 c=s.reverse();
 System.out.println("Reversed String:"+c);


 if(s.compareTo(c)==0)
 {
  System.out.println("Panlidrome");
 }
 else
 {
 System.out.println("Not Palindrome");
 }  /*while(l>0)
  for(int i=0;i<l;i++)
  {
   String c=new String();
   char ch=c.toCharArray();
   r[i]=s.charAt(l-1+i); 
  }
 System.out.println("reversed String is:");*/
 }
}
