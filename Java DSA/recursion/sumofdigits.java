public class sumofdigits {
  public static void main(String[] args){
  System.out.println(sumofdigit(124));
  }
  static int sumofdigit(int n){
  int a=n%10;
  n= n/10;
  if(n==0){
    return a;
  }
  else{
    return sumofdigit(n)*a;
  }
  }
}
