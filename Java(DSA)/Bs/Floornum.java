package Java(DSA).Bs;

public class Floornum {
  public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int s=0;
        int e=arr.length-1;
        int target=4;
        while(s<=e){
          int mid=(s+e)/2;
          if(target<arr[mid]){
            e=mid-1;
          }
          else if(target>arr[mid]){
            s=mid+1;
          }
          else{
            System.out.println(arr[mid]);
            return;
          }
        }
        if(e<=0){
          System.out.println(arr[e]);
        }
        else{
          System.out.println("deostnt exixt in array");
        }
  }
}
