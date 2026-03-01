import java.util.*;

public class StringsLS {
  public static void main(String[] args) {
    String name="hongirana";
    String  target="u";
    System.out.println(stringsearch(name,target));
    //important to take note on ot
    System.out.println(Arrays.toString(name.toCharArray()));
  }
  static boolean stringsearch(String name,String target){
  for(int i=0;i<name.length();i++){
    if(target==name){
      return true;
    }
  }
  return false;
  }
}
