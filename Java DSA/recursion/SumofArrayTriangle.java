import java.util.Arrays;

public class SumofArrayTriangle {
  public static void main(String[] args) {
    int[] arr={1, 2, 3, 4, 5 };
    
    Sumofarr( arr);
  }
static void Sumofarr(int[] arr){
  if(arr.length-1==0){
    return;
  }
  int[] temp=new int[arr.length-1];
  for(int i=0;i<arr.length-1;i++){
     temp[i]= arr[i]+ arr[i+1];

  }
  Sumofarr(temp);
  System.out.println(Arrays.toString(temp));
  
}
   
}
  
  
