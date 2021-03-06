import java.util.*;

public class DiffLang
{
 static Scanner s;


 static void displayValue(Locale currentLocale, String key)
 {
  ResourceBundle labels=ResourceBundle.getBundle("LabelsBundle",currentLocale);
   String value=labels.getString(key);
   System.out.println("Locale="+currentLocale.toString()+"key="+key+","+"value="+value);
 }




 static void iterateKeys(Locale currentLocale)
 {
  ResourceBundle labels=ResourceBundle.getBundle("LabelsBundle",currentLocale);
   Enumeration bundlekey=labels.getKeys();

     
    while(bundlekey.hasMoreElements())
    {
     String key=(String)bundlekey.nextElement();
      String value=labels.getString(key);
       System.out.println("key="+key+","+"value="+value);
    }
  }



 public static void main(String a[])
 {
 s=new Scanner(System.in);
  int ch,sw;
 Locale[] supportedLocales={Locale.FRENCH,Locale.GERMAN,Locale.ENGLISH};


  while(true)
  {

  System.out.println("\n\nWhat do u want 2 do?\n1.One items in differnt lang. \n2.Differnt items in 1 language. \n3. No thanx. ");
   ch=s.nextInt();

  switch(ch)
  {
   case 1:
    {
     System.out.println("\nWhich item do u wish 2 c in French, German n Engish:\n1.s1\n2.s2\n3.s3\n4.s4\n");
      sw=s.nextInt();
  
      switch(sw)
       {
         case 1:
         {
          System.out.println("\nthe s1 values in French,German n English : ");
            for(int i=0;i<supportedLocales.length;i++)
             {
              displayValue(supportedLocales[i],"s1"); 
             }
           break;       
         }


         case 2:
         {
           System.out.println("\nthe s2 values in French,German n English : ");
            for(int i=0;i<supportedLocales.length;i++)
             {
              displayValue(supportedLocales[i],"s2"); 
             }
            break;
         }


         case 3:
         {
          System.out.println("\nthe s3 values in French,German n English : ");
            for(int i=0;i<supportedLocales.length;i++)
             {
             displayValue(supportedLocales[i],"s2"); 
             }
          break;
         }



         case 4:
         {
          System.out.println("\nthe s4 values in French,German n English : ");
           for(int i=0;i<supportedLocales.length;i++)
            {
            displayValue(supportedLocales[i],"s2"); 
            }
          break;
         }

         default:
         {
          System.out.println("\nincorrect choice");
          break;
         }
 
        
       }
        break;
      }


      case 2:
      {
       System.out.println("In which language u wnt 2 c the disk, computer, moniter n keyboard:\n1.French\n2.German\n3.English");
        int pc=s.nextInt(); 
 
          switch(pc)
          {
           
            case 1:
            {
             System.out.println("\n the disk,computer,moniter n keyboard in French language:");
              iterateKeys(supportedLocales[0]);
               break;
            }

            case 2:
            {
             System.out.println("\n the disk,computer,moniter n keyboard in German language:");
              iterateKeys(supportedLocales[1]);
               break;
            }        
 
            case 3:
            {
             System.out.println("\n the disk,computer,moniter n keyboard in English language:");
              iterateKeys(supportedLocales[2]);
                break;
            }
          
            default:
            {
             System.out.println("\nInvalid choice");
              break;
            }
          }
         break;
      }
  

      case 3:
      {
       System.exit(0);
      }

      default:
      {
       System.out.println("invalid choice");
        System.exit(0);
      }
   }
  }
 }
     
} 