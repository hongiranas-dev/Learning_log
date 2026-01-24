public class Swapfunction {
  //shadowing 
  static int x=9;
  public static void main(String args[]){
    swap(5,10);
    //// understanding the scope
  {int c=40;
  c=70;
  { c=50;
    System.out.println(c);
  }
  System.out.println(c);
  }
  // trying the shadow variable
  System.out.println(x);//90
  //the variable x is shadowed
  int x=45;
  System.out.println(x);//45
  }
  
  static void swap(int a,int b){
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println(a);
    System.out.println(b);
    
  }
}