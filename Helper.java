import java.util.*;
 
abstract class Polygon
{
float dim1,dim2,dim3;
 public Polygon(float a, float b)
 {
  dim1=a;
  dim2=b;
 }
 public Polygon(float a, float b,float c)
 {
  dim1=a;
  dim2=b;
  dim3=c;
 }
 abstract float area();
 abstract float volume();
}

class Square extends Polygon
{
 Square(float s)
 {
 super(s,s);
 }
 
 float area()
 {
 return (dim1*dim2);
 }

 float volume()
 {
 return 0.0F;
 }
}

class Cylinder extends Polygon
{
Cylinder(float r,float h)
 {
 super(r,h);
 }
float area()
 {
 return ((float)2*3.14F*dim1*dim2);
 }
float volume()
 {
 return((float)3.14F*dim1*dim2*dim2);
 }
}


class Cuboid extends Polygon
{
Cuboid(float l,float b,float h)
{
super(l,b,h);
}

float volume()
{
return (dim1*dim2*dim3);
}
 
float area()
{
return (2*dim1*dim2+2*dim2*dim3+2*dim3*dim1);
}
}

class Helper
{
static Scanner s;

public static void main(String a[])
{
Polygon p;
System.out.println("1. Square\n2. cylinder\n3. Cuboid");
System.out.println("enter your choice");
s=new Scanner(System.in);
int ch=s.nextInt();

switch(ch)
{

case 1:
{
System.out.println("enter the no.");
float n1=s.nextInt();
Square sq=new Square(n1);
p=sq;
System.out.println("area is:"+p.area());
break;
}

case 2:
{
System.out.println("enter the no.");
float x=s.nextInt();
System.out.println("enter the no.");
float y=s.nextInt();
Cylinder c=new Cylinder(x,y);
p=c;
System.out.println("area of cylinder:"+p.area());
System.out.println("volume of cylinder:"+p.volume());
break;
}

default:
{
System.out.println("invalid choice");
break;
}

case 3:
{
System.out.println("what u wnt 2 compute");
System.out.println("1.area\n2.volume");
int sw=s.nextInt();
switch(sw)
{
case 1:
{
System.out.println("enter the no.");
float x=s.nextInt();
System.out.println("enter the no.");
float y=s.nextInt();
System.out.println("enter the no.");
float z=s.nextInt();
Cuboid cu=new Cuboid(x,y,z);
p=cu;
System.out.println("area of cuboid:"+p.area());
break;
}
case 2:
{
System.out.println("enter the no.");
float x=s.nextInt();
System.out.println("enter the no.");
float y=s.nextInt();
System.out.println("enter the no.");
float z=s.nextInt();
Cuboid cu=new Cuboid(x,y,z);
p=cu;
System.out.println("area of cuboid:"+p.volume());
break;
}
default:
{
System.out.println("Invalid choice");
break;
}
}
}

}

}
}