public class bsrecursion {
  public static void main(String[] args){
  int target=5;
  int array[]={1,2,3,4,5,6,7,8,9};
  int s=0;
  int e=array.length;
  System.out.println(bs(array,s,e,target));
  }
  static int bs(int[] arr,int s,int e,int target){
    int mid=s+(e-s)/2;
    
    if(target==arr[mid]){
      return mid;
    }
    else if(target<arr[mid]){
      return bs(arr,s,mid-1,target);
    }
    else if(target>arr[mid]){
      return bs(arr,  mid+1,e,target);
    }
    else{
      return -1;
    }
  }
  
}
