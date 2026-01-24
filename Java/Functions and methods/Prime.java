//prime number checker
import java.util.*;
public class Prime {

  static void prime(){
    Scanner sc=new Scanner(System.in);
      System.out.println("enter a num");
      int n=sc.nextInt();
      if(n<=1){
        System.out.println("not prime");
      }
      else{
        for(int i=2;i<n;i++){
         if(n%i==0){
          System.out.println("not prime");
          break;
          }
          else{
            System.out.println("prime");
          }
         }

      }
      sc.close();
    }
    
  
    public static void main(String[] args) {
      prime();
      
    }
  
  }

