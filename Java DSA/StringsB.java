public class StringsB {
public static void main(String[] args) {
  //String BUlDER
   StringBuilder s=new StringBuilder("Hello");
   System.out.println(s);
   
   //reversing a str
   System.out.println(s.reverse());

   //checking if the momry is updated
    System.out.println(s);
    
    //expermenting with the string
    String name="hongirana";
    System.out.println(name);
    System.out.println(name.toUpperCase());

    //checking the memory of strings
    System.out.println(name);   
    
    //checking its a pallindrome or not
    StringBuilder rev= new StringBuilder(s.reverse());
    if(rev==s){
      System.out.println("pallindrome");
    }
    else{
      System.out.println("not a pallindrome");
    }
    
    //pallindrome at another way
    String rev2="";
    for(int i=name.length()-1;i>=0;i--){
      rev2=rev2+name.charAt(i);
    }
    if(rev2.equals(name)){
      System.out.println("pallindrome");
    }
    else{
      System.out.println("not a pallindrome");
    }
   System.out.println("\n");
   System.out.println("using kunal methi");
    int start=0;
    int end=s.length()-1;
    String u="";
    while(start<end){
      
    }
  }
}
