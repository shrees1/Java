import java.sql.*;
import java.io.*;


public class Jdbc
{
Connection con;
 PreparedStatement st;
  ResultSet rs;
   static int ch;
    int sw;
      int sh;


 public Jdbc()
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
      System.out.println("\nEnter the roll no:");
      int roll=Integer.parseInt(br.readLine());
      
      System.out.println("\nEnter the name:");
      String name=br.readLine();

      System.out.println("\nEnter the address:");
      String address=br.readLine();

      System.out.println("\nEnter the course:");
      String course=br.readLine();

      st=con.prepareStatement("\ninsert into Student(rollNo,name,address,course) values(?,?,?,?)");
      
  
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
            System.out.println("\nrow inserted into the table\n");
            }
              else
              {
              System.out.println("unable");
              }
     }


  void showData()
  {
  System.out.println("\nDisplaying data from table:\n");
   try
    {
     st=con.prepareStatement("select * from Student");
      rs=st.executeQuery();
    
       while(rs.next())
        {
        System.out.println(rs.getInt(1)+"        "+rs.getString(2)+"        "+rs.getString(3)+"        "+rs.getString(4));
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
       System.out.println("What do you want to update? ");
        System.out.println("\n1.Update name\n2.Update address\n3.Update course");
         sh=Integer.parseInt(br.readLine());
     }
     catch(Exception ex)
     {
     System.out.println(ex.toString());
     }       

   
    
         
       if(sh==1)
       {  
         try
       {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter the roll no. whose name is to be changed?");
         int roll=Integer.parseInt(br.readLine());
          System.out.println("\nEnter the new name:");
           String name=br.readLine();
        
           st=con.prepareStatement("update Student set name= '"+name+"' where rollno=?");
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

    else if(sh==2)
    {
      try    
         {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("\nEnter the roll no of the Student whose address to be changed: ");
           int roll=Integer.parseInt(br.readLine());
            System.out.println("\nEnter the new address");
             String address=br.readLine();
    
        st=con.prepareStatement("update Student set address= '"+address+"'where rollno=?");
         st.setInt(1,roll);
          r=st.executeUpdate(); 
         }

          catch(Exception e3)
          {
           System.out.println(e3.toString());
          }
 
          if(r==1)
          {
          System.out.println("Updated");
          }
          else
          {
           System.out.println("Not updated");
          } 
    }

    else
      {
        try
        {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("\nEnter the roll no whose course to be changed?");
           int roll=Integer.parseInt(br.readLine());
            System.out.println("\nEnter the new course");
             String course=br.readLine();
 
               st=con.prepareStatement("update Student set course='"+course+"' where rollno=?");
                st.setInt(1,roll);
                 r=st.executeUpdate();
         }
         catch(Exception e9)
          {
           System.out.println(e9.toString());
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
   }

  
   void deleteData()
    {
    int r=0;
      try
      {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\nEnter the roll no. of Student whose record 2 be deleted");
         int roll=Integer.parseInt(br.readLine());
          System.out.println("Are you sure u wnt 2 delete this record from table?\n1.Yes\n2.No");
           sw=Integer.parseInt(br.readLine());
      
           if(sw==1)
           {
            st=con.prepareStatement("delete from Student where rollno=?");
             st.setInt(1,roll);
              r=st.executeUpdate();
           }
            
           else
           {
            showData(); 
           }
      }
        catch(Exception e4)
        {
         System.out.println(e4.toString());
        }  
      
          if(r==1)
            {
             System.out.println("record has been deleted from Student\n");
            }
          else
             {
              System.out.println("not deleted");
             }
 
    }



   public static void main(String a[])
   {
    Jdbc jd=new Jdbc();
     String ans;
     
      
    while(true)
     {
        ch=0;
         ans=null;
          ans="y";

          try
          {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("\nWhat do you want 2 do?\n1.Insert \n2.Display \n3.Update \n4.Delete\n5.Exit");
               System.out.println("\nEnter ur chioce:");
                ch=Integer.parseInt(in.readLine());
               
          }
           catch(Exception e5)
           {
            System.out.println(e5.toString());
           }

    

      
       switch(ch)
       {

        case 1:
        {

         try
         {
          BufferedReader n=new BufferedReader(new InputStreamReader(System.in));   
           while(ans.equals("Y")||ans.equals("y"))
          {
           jd.insertData();
            jd.showData();
             System.out.println("\nDo u wnt 2 insert more (y/n)?"); 
              ans=n.readLine();
          }
         }
           catch(Exception exp)
           {
            System.out.println(exp.toString());
           }
           System.out.println("The database is:");
            jd.showData();
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
        jd.showData();
        System.exit(0);
        }


        default:
        { 
         System.out.println("\nInvalid choice please try again:");
          break;
        }
      }
       
     }
        
   }
 }
