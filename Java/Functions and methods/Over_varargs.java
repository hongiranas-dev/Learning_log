import java.util.Arrays;
public class Over_varargs {
  // trying variable arguement on java
  static void fun(String ...v){// can use int also
     System.out.println(Arrays.toString(v));
  }
  //multi variable
  static void drama(int a ,int b,String ...o){
  System.out.println(a);
  }
  //function overloading
  static void overloading(int a){
    System.out.println(a);
  }
  static void overloading(String a){
    System.out.println(a);
  }
  
  public static void main(String[] args) {
    System.out.println("its fun calling");
    fun("hongi","honnu","always sparkling");
    System.out.println();
    System.out.println("its drama calling");
    drama(5,10,"hello","world","java");
    System.out.println();
    System.out.println("overloading  1 func callling");
    overloading("hongirana always sparkles");
    System.out.println();
    System.out.println("its over loading two calling");
    overloading(5);
  }
}
