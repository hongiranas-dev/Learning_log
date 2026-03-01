//input from two numbers
import java.util.*;
public class Revision1{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  String name=sc.nextLine();
  
  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.println("sum is:");
  System.out.println("sum"+(a+b));
  System.out.println("name"+ name);
  sc.close();
  // understanding the scope
  {int c=40;
  c=70;
  { c=50;
    System.out.println(c);
  }
  System.out.println(c);
  }
  
}
}