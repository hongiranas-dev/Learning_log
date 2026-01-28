#include <stdio.h>
int add(int a,int b){
  return a+b;
}
int sub(int a,int b){
  return a-b;
} 
int mul(int a,int b){
  return a*b;
}
int div(int a,int b){
  return a/b;
}
int mod(int a,int b){
  return a%b;
}
int main(){
  printf("enet the a,b, coice");
  int a,b,choice;
  scanf("%d%d%d",&a,&b,&choice);
  switch(choice){
    case 1:
    printf("%d",add(a,b));
    break;
    case 2:
    printf("%d",sub(a,b));
    break;
    case 3:
    printf("%d",mul(a,b));
    break;
    case 4:
    printf("%d",mod(a,b));
    break;
    case 5:
    printf("%d",div(a,b));
    break;
    default:
    printf("you havr");

  }
  return 0;
}
