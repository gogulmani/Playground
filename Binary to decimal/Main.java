#include<stdio.h>
#include<math.h>
int main()
{
  int n,sum=0,r=0,k=0;
  scanf("%d",&n);
  while(n>0)
  {
    r=n%10;
    sum=sum+r*pow(2,k);
    k=k+1;
    n=n/10;
  }
  printf("%d",sum);
  return 0;
}