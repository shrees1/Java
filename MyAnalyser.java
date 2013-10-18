import java.lang.reflect.*;

class MyClass
{
 public MyClass()
 {
  System.out.println("No Argument Constructor");
 }

 public MyClass(int a, String s, float b)
 
 {
 System.out.println("Argument Constructor");
 }
}



class MyAnalyser
{
 public static void main(String a[])
 {
 Class cl=MyClass.class;
  Constructor[] myConstructor=cl.getConstructors();
   int count=0;


  while(count<myConstructor.length)
  {
  System.out.println(cl.getName());
   Class[] ConstructorParameterTypes=myConstructor[count].getParameterTypes();

    for(int i=0;i<ConstructorParameterTypes.length;i++)
     {
      String ParameterString=ConstructorParameterTypes[i].getName();
       System.out.println(ParameterString+" ");
    }
    System.out.println();
    count++;
  }
 }
}