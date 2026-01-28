#include <stdio.h>
int main(){
  int end,start,mid,target,i;
  int arr[5];
  printf("enter the 5 elements");
  for(i=0;i<5;i++){
    scanf("%d",&arr[i]);
  }
  printf("enter the target");
  scanf("%d",&target);
  start=0;
  end=5-1;
  while(start<=end){
    mid=(start+end)/2;
    if(arr[mid]==target){
      printf("%d found at",mid);
      return 0;
    }
    else if (target<arr[mid])
    {
      end=mid-1;
    }
    
    else{
      start=mid+1;
    }}
    printf("none");
    return 0;

}