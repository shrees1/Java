import java.awt.*;
import java.applet.*;

public class MyApplet extends Applet
{
Panel pl;
 TextField tf1,tf2; 
  Label l1,l2;
   Button b;

 public void init()
 {
  pl=new Panel();
   //pl.setBackGround(color.BLUE);
   add(pl);
    l1=new Label("Employee code");
     l2=new Label("Employee name");
   
       tf1=new TextField(30);
        tf2=new TextField(10);

          b=new Button("Save");
  
     pl.add(l1);
      pl.add(tf1);
       pl.add(l2);
        pl.add(tf2);
         pl.add(b);
 }
}