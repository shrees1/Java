import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyJFrame implements ActionListener
{
static JPanel pl;
static JFrame frm;

 JLabel l1,l2;
  JTextField tf1;
  
    JButton b1;
  
GridLayout gl;

  public MyJFrame()
  {
   pl=new JPanel();
    gl=new GridLayout(2,2);
     pl.setLayout(gl);
      pl.setBackground(Color.GREEN);

      l1=new JLabel("VIKASH");
      l2=new JLabel();

    tf1=new JTextField(30);
    
      
    b1=new JButton("submit");
    
   
     b1.addActionListener(this);
     
 
    pl.add(l1);
    pl.add(tf1);
 
    

    
 
    pl.add(l2);
    pl.add(b1);
   
  } 

 public void actionPerformed(ActionEvent evt)
 {
  
  if(evt.getSource()==b1)
   {
    MyJFrame1 mjf=new MyJFrame1();
     frm.setVisible(false);
      mjf.setVisible(true);
      
   } 
 } 


public static void main(String a[])
{
MyJFrame mj=new MyJFrame();
 frm=new JFrame("vikash weds delhiwali");
  frm.getContentPane().add(pl);
   frm.setVisible(true);
    frm.setSize(500,350);
}    
}