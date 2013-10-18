import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class Jdbcdemo
{
Connection con;
PreparedStatement st;
ResultSet rs;
static Scanner s;

 public Jdbcdemo()
 {
 try
  {
   con=null;
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   con=DriverManager.getConnection("jdbc:odbc:mydsn");
  }
  catch(Exception e)
  {
  System.out.println("unable to connect to database"+e);
  } 
 }

  void insertData()
  {
   int r=0;
    try
     {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("\nenter the roll no\n");
      int roll=Integer.parseInt(br.readLine());
      
      System.out.println("\nenter the name\n");
      String name=br.readLine();

      System.out.println("\nenter the address\n");
      String address=br.readLine();

      System.out.println("\nenter the course\n");
      String course=br.readLine();

      st=con.prepareStatement("\ninsert into student(rollNo,name,address,course) values(?,?,?,?)");
  
      st.setInt(1,roll);
       st.setString(2,name);
        st.setString(3,address);
         st.setString(4,course);
   
       r=st.executeUpdate();         
      }
    
         catch(Exception e1)
         {
         System.out.println(e1.toString());
         }

            if(r==1)
            {
            System.out.println("\n row insertedinto the table\n");
            }
              else
              {
              System.out.println("unable");
              }
     }

  void showData()
  {
  System.out.println("\ndisplayin data from table\n");
   try
    {
     st=con.prepareStatement("select * from Student");
      rs=st.executeQuery();
    
       while(rs.next())
        {
        System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4));
         System.out.println();
        }
    }
      catch(Exception e2)
      {
      System.out.println(e2.toString());
      }
  }


  void updateData()
  {
   int r=0;
    try    
     {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
      System.out.println("\nenter the roll no of the student whose address to be changed: ");
       int roll=Integer.parseInt(br.readLine());
        System.out.println("\nenter the new address");
         String address=br.readLine();
    
      st=con.prepareStatement("update student set address= '"+address+"'where rollno=?");
       st.setInt(1,roll);
        r=st.executeUpdate(); 
     }
      catch(Exception e3)
       {
       System.out.println(e3.toString());
       }
 
       if(r==1)
        {
         System.out.println("updated");
        }
       else
        {
         System.out.println("not updated");
        }   
   }

  
   void deleteData()
    {
    int r=0;
     try
      {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the roll no. of student whose record 2 be deleted: \n");
         int roll=Integer.parseInt(br.readLine());
    
         st=con.prepareStatement("delete from student where rollno=?");
         st.setInt(1,roll);
         r=st.executeUpdate(); 
      }
        catch(Exception e4)
        {
         System.out.println(e4.toString());
        }  
      
          if(r==1)
            {
             System.out.println("record has been deleted from student\n");
            }
          else
             {
              System.out.println("not deleted");
             }
 
    }



   public static void main(String a[])
   {
    Jdbcdemo jd=new Jdbcdemo();
     //String ans="y";
      s=new Scanner(System.in);
       int ch;
     

     while(true)
     {
        System.out.println("\n\nwhat do you want 2 do?\n1.Insert \n2.Display \n3.Update \n4.Delete \n5.Exit\n");
         ch=s.nextInt();      
     
      

      
     switch(ch)
     {

      case 1:
      {

         
        //while(ans.equals("Y")||ans.equals("y"))
        {
        jd.insertData();
         jd.showData();
        // System.out.println("\n do u wnt 2 insert more (y/n)?"); 
          //ans=s.nextLine();
        }
       break;
       }
    
       case 2:
       {  
        jd.showData();
         break;
       }


       case 3:
       {
       jd.updateData();
       jd.showData();
       break;
       }    
      
     

        case 4:
        {
        jd.deleteData();
        jd.showData();
         break;  
        }

        case 5:
        {
        
        System.out.println("fianl table is:");
        jd.showData();
        System.out.println("thankyou");
        System.exit(0);
        }
 
        default:
        {
         System.out.println("invalid chioce");
         break;
        }
      }
     }   
   }
 }
