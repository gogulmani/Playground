#include<stdio.h>
#include<string.h>
int main()
{
  char s[1000];
  int i;
  gets(s);
  i=strlen(s);
  printf("%d",i);
  return 0;
}