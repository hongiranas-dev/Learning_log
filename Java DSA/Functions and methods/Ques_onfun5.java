import java.util.*;
public class Ques_onfun5 {
  /*Write a function that returns all 
  prime numbers between two given numbers.*/
  public static void main(String[] args) {
    prime();
  }
  static  void prime(){
    System.out.println("eneter a num1");
    Scanner sc =new Scanner(System.in);
    int num1=sc.nextInt();
    System.out.println("eneter a num2");
    int num2=sc.nextInt();
    for(int i=num1;i<num2;i++){
      for(int j=2;j<i;j++){
        if(i%j==0){
          break;
        }else{
          System.out.println(i);
        }
          
        }
      }
      sc.close();
    }

  }

  

