#include<stdio.h>
#include<stdlib.h>
#define MAX 3

void push(int);
int pop();
void display();
int Isfull();
int Isempty();
int setter(int);

int a[MAX];
int top=-1,i,item;
//int setter(int u)
//{
  //  full=u;
//}


void main()
{
 int ch,p;

 //printf("Enter the size of array : ");
 //scanf("%d", &n);
 //setter(n);
 //top=0;
 //full=n-1;

 /*printf("The size of array is : %d\n", n);

 for(i=0;i<n;i++)
 {
  printf("Enter the %d element : ", i);
  scanf("%d", &a[i]);
 }

 printf("The Array is : ");
 for(i=0;i<n;i++)
 {
  printf("%4d", a[i]);
  //scanf("%d", &a[i])
 }*/

 while(1)
 {
 printf("\nEnter your Choise: \n");
 printf("1. Push\n2. Pop\n3. display\n4. IsFull\n5. IsEmpty\n6. Exit\n");
 scanf("%d", &ch);

// printf("")

 switch(ch)
 {
     case 1:
     {
         printf("Enter the element : ");
         scanf("%d", &p);
         push(p);
         //top=top+1;
         break;
     }

     case 2:
     {
         pop();
         //printf("One Element is popped");
         //top=top-1;
         break;
     }

     case 3:
     {
         printf("Elements of Array is : ");
         display();
         break;
     }

     case 4:
     {
         Isfull();
         break;
     }

     case 5:
     {
         Isempty();
         break;
     }

     case 6:
     {
         printf("You are now exiting the program ");
         exit(1);
     }

     default:
     {
         printf("You have entered the wrong choise, please  insert carefully ");
         break;
     }
  }
 }
}

void push(int x)
{
    if(Isfull()==1)
    {
        //printf("Array is full : STACK OVERFLOW\n");
        return;
    }
    else
    {
    top=top+1;
    a[top]=x;
    }
}

int pop()
{
    //printf("The popped element is : %d\n", a[top]);
    if(Isempty()==1)
    {
      //  printf("Array is empty : STACK UNDERFLOW\n");
        return;
    }
    else
    {
    item=a[top];
    //return a[top];
    top=top-1;
    return item;
    }
}

void display()
{
    for(i=0;i<=top;i++)
         {
             //Isempty();
             printf("%4d", a[i]);
         }
}

int Isfull()
{
     if(top==MAX-1)
         {
              printf("Stack Overflow");
              return 1;
         }
      else
      {
          printf("Stack is not FULL ");
          return 0;
      }
}

int Isempty()
{
         if(top==-1)
         {
             printf("Stack Underflow");
             return 1;
         }
         else
         {
          printf("More elements can be popped \n");
          return 0;
         }

}
