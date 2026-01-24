import java.util.*;
public class Armstrong {
  public static void main(String[] args) {
     System.out.println("eneter a number");
   Scanner sc=new  Scanner(System.in);
    int a=sc.nextInt();
    armstrong(a);
    sc.close();
  }
  static void armstrong(int a){
   
    int n=a;
    int sum=0;
    while(n!=0){
       int rem=n%10;
       sum=sum+rem*rem*rem;
       n=n/10;}
    
    if(sum==a){
      System.out.println("armstrong");
    }
    else{
      System.out.println("not armstrong");
    }
  }
}
