#include<iostream>
//#include<stdio.h>

using namespace std;

class Rect
{
private:
    int x,y;

public:
    void setting();
    int area();
};

void Rect::setting()
{
    //printf("Enter the Length l1:");
    cout<<"Enter the Length l1:";
    cin>>x;


    cout<<"Enter the Length l2:";
    cin>>y;
    //scanf("%d", &x);
    //x=a;
    //printf("Enter the Length l2:");
    //scanf("%d", &y);
    //y=b;
}

int Rect::area()
{
    return x*y;
}

int main()
{
    Rect rec;
    rec.setting();
    cout<<"The Area is : "<<rec.area();
    return 0;
}
