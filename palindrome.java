class palindrome
{
	public static void main(String args[])
	{
	//int l;
	String s=(args[0]);
	int n=s.length();
        //String c[]=new String[n];
        char c[]=new char[n];
	for(int i=0;i<n;i++)
{
       c[i]=s.charAt(n-1-i);
}
	String s1=c[i].toString();
        System.out.println(s);
        if(s1.compareTo(s)==0)	
	           System.out.println(" palindroeme");
		   else {
			System.out.println("string isn't palindroewm");
			}
	}

}