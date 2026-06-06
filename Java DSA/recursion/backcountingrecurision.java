public class backcountingrecurision {
  public static void main(String[] args){
  back(5);
  }
  // n=5 5 4 3 2 1
  static void back(int n){
    if(n==0){
      return;
    }
    System.out.println(n);
    back(n-1);
    
  }
}
