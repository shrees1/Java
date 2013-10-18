#include<iostream>
using namespace std;

class Building
{
 private:
 int rooms,floars,area;

 public:
 void set_rooms(int);
 int get_rooms();

 void set_floars(int);
 int get_floars();

 void set_area(int);
 int get_area();

 void setter();
 void getter(int);
};

class House:public Building
{
private:
int kitchen,balcony;

public:

void set_kitchen(int);
int get_kitchen();

void set_balcony(int);
int get_balcony();
};


class School:public House
{
 private:
 int classrm,office;

 public:

 void set_class(int);
 int get_class();

 void set_office(int);
 int get_office();
};



void Building::set_rooms(int num)
{
 rooms=num;
}

int Building::get_rooms()
{
    return rooms;
}

void Building::set_floars(int num)
{
    floars=num;
}

int Building::get_floars()
{
    return floars;
}

void Building::set_area(int num)
{
    area=num;
}

int Building::get_area()
{
    return area;
}


void House::set_kitchen(int num)
{
    kitchen=num;
}

int House::get_kitchen()
{
    return kitchen;
}

void House::set_balcony(int num)
{
    balcony=num;
}

int House::get_balcony()
{
    return balcony;
}


void School::set_class(int num)
{
    classrm=num;
}

int School::get_class()
{
    return classrm;
}

void School::set_office(int num)
{
    office=num;
}

int School::get_office()
{
    return office;
}


void Building::setter()
{
    int x;
    cout<<"Set School/House/Building\n";
    cout<<"Enter new setting input: ";
    cin>>x;
    getter(x);
}

void Building::getter(int x)
{
    cout<<"New setting input is :"<<x<<"\n";
}



int main()
{
    Building b1;
    House h1;
    School s1;

    b1.set_rooms(3);
    cout<<"The no. of rooms are:"<<b1.get_rooms()<<"\n";

    s1.set_class(4);
    cout<<"The no. of class rooms:"<<s1.get_class()<<"\n";
    s1.set_rooms(3);
    cout<<"The no. of rooms are:"<<s1.get_rooms()<<"\n";

    h1.set_area(500);
    cout<<"The area of house is:"<<h1.get_area()<<"\n";
    h1.set_kitchen(3);
    cout<<"The no. of kithens are:"<<h1.get_kitchen()<<"\n";


    h1.setter();
   // h1.getter();

    return 0;
}



