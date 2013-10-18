#include<iostream>
using namespace std;


int main()
{
int a,b,i,flag=1;
cout<<"Enter the lower no: ";
cin>>a;

cout<<"Enter the upper bound: ";
cin>>b;

cout<<"You have entered "<<a<<" & "<<b<<"\n";

while(a<b)
{
    for(i=2;i<=b/2;i++)
    {
        if (a%i==0)
            {
                flag=0;
                break;
            }
            break;
        //else
            //flag=0;
            //flag=1;

    }       //break;

    if(flag)
            cout<<a<<"\n";
            //break;

a++;
}
return 0;
}
