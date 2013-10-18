import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class MyJFrame2 extends JFrame implements ActionListener
{
static JPanel pl;
static JFrame frm;

 JLabel l1,l2;
  JTextField tf1;
  
    JButton b1;
  
GridLayout gl;
 int r;

  public MyJFrame2()
  {
   pl=new JPanel();
    gl=new GridLayout(2,2);
     pl.setLayout(gl);
      pl.setBackground(Color.GREEN);

      l1=new JLabel("reg no.");
      l2=new JLabel();

    tf1=new JTextField(30);
    
      
    b1=new JButton("submit");
    
   
     b1.addActionListener(this);
     
 
    pl.add(l1);
    pl.add(tf1);
 
    pl.add(l2);
    pl.add(b1);
   
   
   r=0;
  } 

 public void actionPerformed(ActionEvent evt)
 {
  
  if(evt.getSource()==b1)
  
     {
      try
       {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con=DriverManager.getConnection("jdbc:odbc:framedsn");
          PreparedStatement st=con.prepareStatement("insert into Student values (?)");
           st.setString(1,tf1.getText());
        
            r=st.executeUpdate();
             if(r==1)
           {
            JOptionPane.showMessageDialog(frm,"values insert");
           } 
           else
           {
            JOptionPane.showMessageDialog(frm,"values nt insert");
           }
            con.close();           
         }


        catch(Exception e)
        {
         JOptionPane.showMessageDialog(frm,"Exception");
          System.out.println("Exception::::::"+e);
        }
     }
   } 



 public static void main(String a[])
  {
  // MyJFrame2 std=  
    new MyJFrame2();
   /* frm=new JFrame("                                          ONLINE EXAMINATION    ");
     frm.getContentPane().add(pl);
      frm.setVisible(true);
       frm.setSize(500,600);*/
  }

}  


