public class SwapinArray {
  static void swap(int[] arr,int a,int b){
    arr[a]=arr[a]+arr[b];
    arr[b]=arr[a]-arr[b];
    arr[a]=arr[a]-arr[b];
    System.out.println("swapeed");
    for(int i:arr){
      System.out.print(i);
    }
  }
  public static void main(String[] args) {
    System.out.println("its oringinal");
    int[] arr={1,2,3,4,5,6};
    for(int i:arr){
      System.out.print(i);
    }
    swap(arr,3,4);
  }
}
