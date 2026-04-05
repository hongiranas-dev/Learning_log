import java.util.*;
public class patterns {
  public static void main(String[] args) {
    /* pattern 1
    ******
    ******
    ******
    ******
    ****** */
    int n=5;
    for(int i=0;i<n;i++){
      for(int j=0;j<=n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("                   ");
    /*pattern 2 */
    /* 
    *****
    ****
    ***
    **
    * */
   for(int i=n;i>0;i--){
    for(int j=0;j<i;j++){
       System.out.print("*");
    }
    System.out.println();
   }
   /*pattern 3
   1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5 */
    for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
      System.out.print(j+" ");
    }
     System.out.println( );
    }
    /*pattern 4
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    * */
   System.out.println(" ");
   for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
      System.out.print("*");
    }
    System.out.println();
  }
    for(int i=n;i>0;i--){
    for(int j=0;j<i;j++){
      System.out.print("*");
    }
    System.out.println();
   }
  }}
  

