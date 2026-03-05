import java.util.*;
public class Code1 {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the target");
    int target=sc.nextInt();
     int  a= Linear( target);
     System.out.println(a);
    sc.close();
  }
  static int Linear(int target){
  Scanner sc=new Scanner(System.in);
    int arr[]={1,2,3,4,5};
    
    for(int i=0;i<arr.length;i++){
    if(target==arr[i]){
      sc.close();
      return i;
    }
    
  } sc.close();
    return -1;
    
 
   
   }
  }
  

