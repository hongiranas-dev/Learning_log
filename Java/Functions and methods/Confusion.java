public class Confusion {
  public static void main(String[] args) {
    int con=change(10);
    System.out.println(con);
    change1(3);
    change2(8);
  }

  static int change(int a){
    a=20;
    return a;
  }
  static void change1(int b){
  b=0;
  System.out.println("check whtehet you are getting an input or not");
  System.out.println(b);
}
static void change2(int c){
  System.out.println("printing change2 ");
    System.out.println(c);
  }
  

}
