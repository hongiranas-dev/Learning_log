package Java.Bs;
public class code1 {
  public static void main(String[] args) {
    int arr[]={-9,1,3,5,9,33,54,67,89,90,121,345};
  int target=90;
  int a= BinarySearch(arr,target);
  System.out.println(a);
  }
  static int BinarySearch(int[] arr,int target){
    int start=0;
     int end=arr.length-1;
    while (start<end) {
      int mid=start+(end-start/2);
      if(target>arr[mid]){
        start=mid+1;  
      }
      else if(target<arr[mid]){
        end=mid-1;
      }
      else{
        return mid;
      }
    }
    return -1;
  }
}
