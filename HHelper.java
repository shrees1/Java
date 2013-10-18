import java.util.*;

class Person
{
String str1,str2,name,address;
int number; 


public Person()
 {
 System.out.println();
 }

 public void mobileNo(int num)
  {
   
  number=num;
  }
 public void setName(String nm)
  {
  name=nm;
  }
 public void setAddress(String add)
  {
  address=add;
  }
public void acceptData(String st)
  {
  
  str1=st;
  }
 public void displayData()
  {
  
  str2=stt;
  }
}

 class Customer extends Person
{
 public Customer()
  { 
   System.out.println("Customers Detail:");  
  }
 public void mobileNo(int num)
 {
  super.mobileNo(num);  
 } 
 public void setName(String nm)
 {
  super.setName(nm); 
 }
 public void setAddress(String add)
 {
 super.setAddress(add); 
 }
public void acceptData(String st)
 {
 super.acceptData(st); 
 }
 public void displayData(String stt)
 {
 super.displayData(stt); 
 } 
}

 class Dealer extends Person
{
 public Dealer()
  { 
   System.out.println("Dealers Detail:");  
  }
 public void mobileNo(int num)
 {
  super.mobileNo(num);  
 } 
 public void setName(String nm)
 {
  super.setName(nm); 
 }
 public void setAddress(String add)
 {
 super.setAddress(add); 
 }
public void acceptData(String st)
 {
 super.acceptData(st); 
 }
 public void displayData(String stt)
 {
 super.displayData(stt); 
 } 
}



class HHelper
{
static Scanner s;
 
 public static void main(String a[])
  {
  int num;
   String nm,add;
  
  s=new Scanner(System.in);
  Customer cs=new Customer();
  Dealer dl=new Dealer();
  

  num=s.nextInt();
  System.out.println("enter phone no:");
  cs.mobileNo(num);
  

  nm=s.nextLine();
  System.out.println("enter name:");
  cs.setName(nm);
  
  
  add=s.nextLine();
  System.out.println("enter address:");
  cs.setAddress(add);
  

  st=s.nextLine();
  System.out.println("enter address:");
  c.setAddress();
  d.setAddress(); 

 System.out.println("enter phone no:");
 dl.mobileNo(num);


 System.out.println("enter name:");
 dl.setName(nm);
 

 System.out.println("enter address:");}
 dl.setAddress(add);
 }