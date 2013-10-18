import java.io.*;

public interface T1
{
public static input(int a,int b);
public void calcArea();
}

public class UseIt implements T1
{
int len,brd,area;

 public void input(int a,int b)
 {
 this.len=a;
 this.brd=b;
 }

 public void calcArea()
 {
 area=(len*brd);
 System.out.println("ARea is:"+area);
 }


public static void main(String a[])
{
BufferedReader br=new BufferedReader(InputStreamReader(System.in));
 int x,y; 
  x=y=0;
   UseIt ui=new UseIt();


 try
 {
  System.out.println("enter the length");
   int x=Integer.parseInt(readLine()); 
    System.out.println("enter the breadth");
     int y=Integer.parseInt(readLine()); 
 }
  catch(Exception e)
  {
   System.out.println("Exception caught");
  }

 ui.input(x,y);
 ui.calcArea();
}
}