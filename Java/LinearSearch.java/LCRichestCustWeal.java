public class LCRichestCustWeal {
  public static void main(String[] args) {
    /*input=[[1,2,3],[5.4.6]]
    output=15
     */
    int[][] arr={{1,2,3},{5,6,4}};
    
    int max=0;
    for(int i=0;i<arr.length;i++){
    int sum=0;
    for(int j=0;j<arr[i].length;j++){
      sum=sum+arr[i][j];
    }
    if(sum>max){
      max=sum;
    }
    }
    System.out.println(max);
  }
}
