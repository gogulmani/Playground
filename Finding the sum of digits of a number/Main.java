#include <stdio.h>
int main() 
{
	int a,i,n,sum=0;
   scanf("%d",&a);
   i=a;
   while(i!=0)
   {
     n=i%10;
     sum=sum+n;
     i=i/10;
   }
   printf("%d",sum);
	return 0;
}