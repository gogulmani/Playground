#include<stdio.h>
int main()
{
	long int a,i,fact=1;
    scanf("%ld",&a) ;
   for(i=1;i<=a;i++)
   {
       fact*=i; 
   }
   printf("%ld",fact); 
} 
  