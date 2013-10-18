class City
{
 public static void main(String args[])
  {
   String str0="kolkata";
   String str1="mumbai";
   String str2="chennai";
   String str3="banglore";
   String str4="delhi";
  String tmp=null;
	for (int i=0;i<5;i++)
   	 {
	   for(int j=i+1;j<5;j++)
	    {
		if(args[i]<args[j])
		tmp=args[i];
		args[i]=args[j];
		args[j]=tmp;
	    }
	  }
        for(int k=0;k<5;k++)
	{ 
         System.out.println("a[k]");
	}
      }
    }
   