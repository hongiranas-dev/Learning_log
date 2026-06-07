public class factorialrecursion {
  public static void main(String[] args){
    System.out.println(fac(15));
  }
  static int  fac(int n){
    if(n==0){
      return 1;
    }
    else{
      return n*fac(n-1);
    }
   
  }
}
