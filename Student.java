import java.awt.*;
import javax.swing;
//import java.awt.event.*;
//import java.sql.*;

public class Student 
{
static JPanel pl;
static JFrame frm;

JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34, l35, l36, l37, l38, l39, l40, l41, l42;
 JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
  JButton b1;
   JComboBox c1,c2,c3;
    JTextArea ta1;
  // int r;

  GridLayout gl;

  

 public Student()
 {
  pl=new Panel();
  gl=newGridLayout(15,3);
  pl.setLayout(gl);
  

   l1=new JLabel("Reristration No.");
   l2=new JLabel("Name");
   l3=new JLabel("Address");
   l4=new JLabel("DOJ");
   l5=new JLabel("PhOne No.");
   l6=new JLabel("Email");
   l7=new JPanel("Entry key");


   l8=new JPanel("");
   l9=new JPanel("");
   l10=new JPanel("");

   l11=new JPanel("");
   l12=new JPanel("");
   l13=new JPanel("");

   l14=new JPanel("");
   l15=new JPanel("");
   l16=new JPanel("");

   l17=new JPanel("");
   l18=new JPanel("");
   l19=new JPanel("");

   l20=new JPanel("");
   l21=new JPanel("");
   l22=new JPanel("");

   l23=new JPanel("");
   l24=new JPanel("");
   l25=new JPanel("");

   l26=new JPanel("");
   l27=new JPanel("");
   l28=new JPanel("");

   l29=new JPanel("");
   l30=new JPanel("");
   l31=new JPanel(""); 

   l32=new JPanel("");
   l33=new JPanel("");
   l34=new JPanel("");

   l35=new JPanel("");
   l36=new JPanel("");
   l37=new JPanel("");

   l38=new JPanel("");
   l39=new JPanel("");
   l40=new JPanel("");

   l41=new JPanel("");
   l42=new JPanel("");

  tf1=new JTextfield(50);
  tf2=new JTextfield(50);
  tf3=new JTextfield(12);
  tf4=new JTextfield(20);
  tf5=new JTextfield(20);

  ta1=new JTextArea(3,30);
  
   String[] DD={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",                 "26", "27", "28", "29", "30", "31"};
   
   String[] MM={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};

   String[] YY={"2012","2013"};

  c1=new JComboBox(DD);
  c2=new JComboBox(MM);
 // c3=new JComboBox(YY);

  b1=new JButton("Submit");


   pl.add(l8);
   pl.add(l9);
   pl.add(l10);


   pl.add(l11);
   pl.add(l12);
   pl.add(l13);

   pl.add(l1);
   pl.add(tf1);
   pl.add(l14);


   pl.add(l15);
   pl.add(l16);
   pl.add(l17); 

 
   pl.add(l18);
   pl.add(l19);
   pl.add(l20);


   pl.add(l2);
   pl.add(tf2);
   pl.add(l21);


   pl.add(l22);
   pl.add(l23);
   pl.add(l24);


   pl.add(l3);
   pl.add(ta1);
   pl.add(l25);


   pl.add(l26);
   pl.add(l27);
   pl.add(l28);


   pl.add(l4);
   pl.add(c1);
   //pl.add(c2);
   pl.add(l29);


   pl.add(l30);
   pl.add(l31);
   pl.add(l32);


   pl.add(l5);
   pl.add(tf3);
   pl.add(l33);


   pl.add(l34);
   pl.add(l35);
   pl.add(l36);


   pl.add(l6);
   pl.add(tf4);
   pl.add(l37);


   pl.add(l38);
   pl.add(l39);
   pl.add(l40);


   pl.add(l7);
   pl.add(tf5);
   pl.add(l41);


   pl.add(l41);
   pl.add(l42);
   pl.add(b1);

    
 } 

  public static void main(String a[])
  {
   Student st=new Student();
    frm=new JFrame("                                       ONLINE EXAMINATION    ");
     frm.getContentPane().add(pl);
      frm.setVisibility(true);
       frm.SetSize(400,500);
  }
}