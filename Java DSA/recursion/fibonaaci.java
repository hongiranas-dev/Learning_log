
public class fibonaaci {
  public static void main(String[] args) {
    int ans=fib(5);
    System.out.println(ans);
  }
  public static int fib(int 
    n){ 
    if(n==0){
      return 0;
    }
    else if(n==1){
      return 1;
    }
    else if(n==10){
      return 0;
    }
    else{
      return fib(n-1)+fib(n-2);
      
    }
  }
}
