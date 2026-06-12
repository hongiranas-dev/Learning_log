public class removea {
  public static void main(String[] args) {
    StringBuilder s=new StringBuilder("abbbbbaacdrtia");
    removechar(s,0);
    System.out.println(s);
  }
  static void removechar(StringBuilder s,int i ){
    if(i==s.length()){
      return;
    }
    if(s.charAt(i)=='a'){
      s.deleteCharAt(i);
      removechar( s,i);
    }
    else{
      removechar(s, i+1);
    }
    
  }
}
