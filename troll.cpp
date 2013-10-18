#include<stdio.h>
//#include<conio.h>
int main()
{
clrscr();
int a,n,i,num=0;
cout<<"How many numbers do you want to enter.\n";
cin>>n;
for(i=n-1;i>=0;i--)
{
cout<<"Enter the digit \n";
cin>>a;
num=num+a*(pow(10,i));
}
cout<<"The number is \t"<<num;
getch();
return 0;
}
