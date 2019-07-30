#include<stdio.h>
int main()
{
  int a,b,f1=1,f2=-1,i; 
  scanf("%d",&a); 
  for(i=1;i<=a;i++)
  {
    b=f1+f2;
    printf("%d ",b); 
    f2=f1;
    f1=b;
  }
  return 0;
}