#include<stdio.h>
int main(){
  char str[100];
  int vowels=0,conso=0,i=0;
  printf("ente r the str");
  gets(str);
  while( str[i]!='\0'){
  if((str[i]>='a'  &&  str[i]<='z')||
     (str[i]>='A'  &&  str[i]<='Z')){
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||
    str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U '){
     vowels++;
    }
    else{
      conso++;
    }
   
  }
  i++;

}
printf("%d vo, %d con",vowels,conso);
return 0;
}