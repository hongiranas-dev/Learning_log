public class permutations {
  public static void main(String[] args) {
    
    System.out.println(premuts("", "abc", 0));
    
  }
  static int premuts(String p,String up,int c){
    if(up.isEmpty()){
      System.out.println(p);
      return 1;
    }
    else{
      int count=0;
      char ch=up.charAt(0);
      for(int i=0;i<=p.length();i++){
        String f=p.substring(0, i);
        String s=p.substring(i, p.length());
        count=premuts(f+ch+s,up.substring(1),c+1)+count;
        
      }
      return count;
    }
  }
}
