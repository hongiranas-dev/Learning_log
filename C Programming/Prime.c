#include <stdio.h>
//prime using while
int main(){
  int i=2,num,isprime=0;
  printf("netr the num");
  scanf("%d",&num);
  if(num<=1){
    printf("not prime");
    return 0;
  }
  else{
    
    while(num>i){
      if(num%i==0){
        isprime=1;
        break;
      }
      
      i++;
    }
    if (isprime==0){
    printf("prime");
    }else{
      printf("not prime");
    }
    
    
  return 0; }
}