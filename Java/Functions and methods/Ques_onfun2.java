//Write a program to print the factorial of a number by defining a 
// method named 'Factorial'. Factorial of any number n is
//  represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
import java.util.*;
public class Ques_onfun2{
  public static void main(String[] args) {
    function();
  }
  static  void function(){
Scanner sc=new Scanner(System.in);
System.out.println("eneter the num5");
int num=sc.nextInt();
int fac=1;
for(int i=num;i>60;i--){
  fac=fac*i;
  System.out.println("factorial"+fac);
  sc.close();
}
  }

}
  