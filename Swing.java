import java.awt.*;
import javax.swing.*;

class Swing
{
static JPanel pl;
static JFrame frm;

 JLabel l1, l2, l3, l4, l5,l6;
  JTextField tf1;
   JPasswordField pf1;
    JButton b1,b2;
  
GridLayout gl;

  public Swing()
  {
   pl=new JPanel();
    gl=new GridLayout(5,2);
     pl.setLayout(gl);
      pl.setBackground(Color.GREEN);

      l1=new JLabel("Username");
       l2=new JLabel("Password");
        l3=new JLabel("");
         l4=new JLabel("");
          l5=new JLabel("");
           l6=new JLabel("");  

    tf1=new JTextField(30);
     pf1=new JPasswordField(20);
      
    b1=new JButton("Login");
     b2=new JButton("Signup");
 
    pl.add(l1);
    pl.add(tf1);
 
    pl.add(l2);
    pl.add(pf1);

    pl.add(l3);
    pl.add(l4);

    pl.add(l5);       
    pl.add(l6);
 
    pl.add(b1);
    pl.add(b2);
   
  }  


public static void main(String a[])
{
Swing sw=new Swing();
 frm=new JFrame("                        CLIX");
  frm.getContentPane().add(pl);
   frm.setVisible(true);
    frm.setSize(500,350);
}    
}