public class mini {
  public static void main(String[] args) {
  int arr[]={1,2,3,-4,8};
  int min=10000;
  for(int i=0;i<5;i++){
    if(arr[i]<min){
      min=arr[i];
    }
  }
  System.out.println(min);
  }
  
}

