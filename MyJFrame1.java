import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyJFrame1 extends JFrame 
{
static JPanel pl;
static JFrame frm;

 JLabel l1,l2;
  JTextField tf1;
  
    JButton b1;
  
GridLayout gl;

  public MyJFrame1()
  {
  super("vikash weds delhiwali");
   pl=new JPanel();
    gl=new GridLayout(2,2);
     pl.setLayout(gl);
      pl.setBackground(Color.GREEN);

      l1=new JLabel("Delhiwali");
      l2=new JLabel();

    tf1=new JTextField(30);
    
      
    b1=new JButton("next");
    
   
    // b1.addActionListener(this);
     
 
    pl.add(l1);
    pl.add(tf1);
 
    

    
 
    pl.add(l2);
    pl.add(b1);

  getContentPane().add(pl);
   setVisible(true);
    setSize(450,350);
   
  } 




public static void main(String a[])
{
new MyJFrame1();
}    
}