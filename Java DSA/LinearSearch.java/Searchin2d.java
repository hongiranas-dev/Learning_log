public class Searchin2d {
  public static void main(String[] args) {
    int[][] arr={{1,2,3},{3,4,5}};
    int target=3;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(target==arr[i][j]){
          System.out.println(i+"   "+j);
        }
      }// if you want to declare it interally iwth return:
      //return int[][] arr{i,j};
       // same do fo returning max
    }
  }
}
