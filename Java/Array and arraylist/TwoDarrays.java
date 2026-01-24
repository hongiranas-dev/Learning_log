import java.util.*;
public class TwoDarrays {
  //we must specify the no of rows ,columns are not mandatory
   public static void main(String[] args) {
    /* can also declare as {{1,2,3},
                        {3,4}} so ol may vary so beetre not declare the column */
    int[][] arr=new int[3][4];
    //input 1
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        arr[i][j]=sc.nextInt();
      }}
    //output 1
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]);
        //for the array strutrutue println at end
      }
      //here
      System.out.println();
    }
    //output 2 (weird one gonna chatgpt it soon)
    System.out.println(Arrays.toString(arr));

    //output 2 (actual)
    System.out.println("printing the output2");
    for(int i=0;i<arr.length;i++){
      System.out.println(Arrays.toString(arr[i]));
    }
    
    //output 3
    System.out.println("omg its output 3");
    for(int[] i:arr ){
      //iportant line
      System.out.println(Arrays.toString(i));
    }
    
    sc.close();
    }
   }

