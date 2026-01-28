#include <stdio.h>
#include <math.h>
struct point
{
  float x;
  float y;
};

int main(){
 struct point p1,p2;
 float dis;
 printf("enetr the p1 coor");
 scanf("%f%f",&p1.x,&p1.y);
 printf("enetr the p2 coor");
 scanf("%f%f",&p2.x,&p2.y);
 dis=sqrt((p2.x-p1.x)*(p2.x-p1.x)+((p2.y-p1.y)*(p2.y-p1.y)));
 printf("%f",dis);
return 0;
}