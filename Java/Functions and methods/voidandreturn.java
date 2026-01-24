import java.util.*;
public class voidandreturn {
  public static void main(String[] args) {
  // void function which doesnt return anything 
  display();
  //function with returning value
  int sum=sum(); 
  System.out.println("the sum is,"+sum);/*if u dont write
  the int sum it wont diplay the sum*/ 
  }
  static void display(){
  System.out.println("hello world");
  }
  static int sum(){
    Scanner sc= new Scanner(System.in);
  System.out.println("eneter a ");
  int a=sc.nextInt();
  System.out.println("enter b");
  int b=sc.nextInt();
  int sum=a+b;
  sc.close();
  return sum;
  }
}
