import java.util.Arrays;

public class Confusions {
  //use function to show pass by refernce for non primitive dtypes
 static void change(int[] nigga){
  nigga[0]=99;
    
    System.out.println("printing the instisation array");
    System.out.println(Arrays.toString(nigga));
 }
 public static void main(String[] args) {
  int[] nigga={1,2,3,4};
  System.out.println(Arrays.toString(nigga));
 }
}