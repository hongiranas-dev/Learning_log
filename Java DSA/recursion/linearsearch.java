public class linearsearch {
  public static void main(String[] args) {
    int[] arr={4,89,67,5,3};
    int target=7;
    System.out.println(ls(arr,target,0));
  }
  static int ls(int[] arr,int target,int i){
  if(i==arr.length){
    return -1;
  }
  else if(arr[i]==target){
    return i;
  }else{
    return ls(arr,target,i+1);
  }
  }

}
