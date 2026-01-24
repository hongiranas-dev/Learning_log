import java.util.*;
public class ArgumentString {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your name");
    String name=sc.nextLine();
    //passing a string as an arguement
    String statement=greet(name);
    System.out.println(statement);
    sc.close();
  }
  static String greet(String name){
  return name;
  }
}
