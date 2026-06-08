public class reversenum {
  static int reverse=0;
  public static void main(String[] args){
    rev(123);
    System.out.println(reverse);
  }
  static void rev(int n){
    if(n==0){
      return ;
    }
    else{
      
      reverse=reverse*10+n%10;
      
     rev(n/10);
  
    }
  }
}
