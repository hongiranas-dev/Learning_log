import java.util.Arrays;
public class Bubble {
  public static void main(String[] args) {
   System.out.println("Bubble Sort");
   int arr[] = {5, 1, 4, 2, 8};
   for(int i=0;i<arr.length;i++){
    for(int j=1;j<arr.length-i;j++){
      if(arr[j]>arr[j+1]){
        int temp=arr[j+1];
        arr[j+1]=arr[j];
        arr[j]=temp;
      }
    }
   }
  System.out.println("Sorted Array: " + Arrays.toString(arr));
}
}
  
