public class Stringsrecursion {
     public static void main(String[] args) {
      // printing the subsets
      subsets("", "abc");
     }
     static void subsets(String p,String up){
      if(up.isEmpty()){
        System.out.println(p);
        return;
      }
      else{
        char ch=up.charAt(0);
        subsets(p+ch, up.substring(1));
        subsets(p, up.substring(1));
      }
     }
}
