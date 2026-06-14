public class printassci {
  public static void main(String[] args) {
    //pritning ascii chacherter
    assci("ab");
  }
  static void assci(String p){
    if(p.isEmpty()){
      System.out.println(p);
      return;
    }
    else{
      int ch=(int)p.charAt(0);
      System.out.println(ch);
      assci(p.substring(1));
    }
  }
}
