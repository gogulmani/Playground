#include<stdio.h>
int main()
{
  int n,a,r,t1,t2,b;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=1; r=2;
    t1=(n+1)/2;
    b=a*pow(r,t1-1);
    printf("%d",b);
  }
  else
  {
      a=1;r=3;
    t2=n/2;
    b=a*pow(r,t2-1);
    printf("%d",b);
  }
  return 0;
}
