import java.util.Scanner;
 
class Person
{
 Scanner s;
  String name,address;
   int mobileno;
    
   int a;


 public Person()
 {
 s=new Scanner(System.in); 
  name=address=null;
   mobileno=0;
    
 }

 public void acceptData()
 {
  System.out.println("enter the name:");
   name=s.nextLine();
    System.out.println("enter the address:");
     address=s.nextLine();
      System.out.println("enter the mobile no:");
       mobileno=s.nextInt();
 }      

 public void displayData()
 {
  
  System.out.println("name:" +name);
   System.out.println("address:" +address);
    System.out.println("mobile no" +mobileno);
     
 }
}

class Customer extends Person
{
int outstanding_amt;
 public Customer()
  {
   System.out.println("Customers detail");
    outstanding_amt=0;  
  } 
 
 public void acceptData()
 {
 super.acceptData();
  System.out.println("enter the outstandin amt");
   outstanding_amt=s.nextInt();
 }
 
 
 public void displayData()
 {
 super.displayData();
  System.out.println("outstandin amot" +outstanding_amt); 
   System.out.println();
 }
} 


class Dealer extends Person
{
 int amt_sold,shopno;
  public Dealer()
  {
   System.out.println("Dealers detail");
    amt_sold=0;
     shopno=0;  
  } 
 public void acceptData()
 {
 super.acceptData();
  System.out.println("enter the amt sold");
   amt_sold=s.nextInt();
    System.out.println("enter the shop no:");
     shopno=s.nextInt();
 }
 
 public void displayData()
  {
   super.displayData();
    System.out.println("amount sold:" +amt_sold);
     System.out.println("shpno:"+ shopno);
   
  }
} 



class Cdealer
{
static Scanner s;
public static void main(String a[])
{
 s=new Scanner(System.in);
  int ch;
   System.out.println("whose detail u want 2 c: \n1.Customer \n2.Dealer:");
    ch=s.nextInt(); 
      
 switch(ch)
 {
  
   case 1:
   {
    Customer c=new Customer();
     c.acceptData();
      c.displayData();
       break;
   }

   case 2:
   {
    Dealer d=new Dealer();
     d.acceptData();
      d.displayData();
       break;
   }

   


   default:
   {
   System.out.println("Invalid choice");
    break;
   }

  
  }
 /*System.out.println("do u wnt 2 continue:\n1.Continue \n2.Exit"); 
  int sw=s.nextInt();
   switch(sw)
    {
    case 2:
     {
      System.out.println("thankyou");
       System.exit(0);
     }    
    

    default:
     {
      System.out.println("invalid choice");
     }
    }
 }
 
System.out.println("do u wnt 2 continue:\n1.Continue \n2.Exit");
  int sw=s.nextInt();
   switch(sw)
   {
    
    case 1:
     {
      goTo switch(ch);
     }
    
    case 2:
     {
      System.out.println("thankyou");
       break; 
     }
   }*/
}
}
}




