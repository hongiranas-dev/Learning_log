import java.util.*;
public class FindMax {
  
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int[] arr= new int[5];
  //input
  System.out.println("enter 5 ekment");
  for(int i=0;i<arr.length;i++){
     arr[i]=sc.nextInt();
  }
  int max=0;
  for(int i:arr){
    if(i>max){
      max=i;
    }
    else{
      i++;
    }
  }
  sc.close();
  System.out.println(max);
  
  }
}
