import java.util.ArrayList;

public class Arraylistrecursion {
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    int[] arr={2,4,6,7,6,9};
    int target =6;
    System.out.println(search(arr,target,0,list));
  }
  static ArrayList<Integer> search(int[] arr,int target,int i, ArrayList<Integer> list){
    if(i==arr.length){
      return list;
    }
    if(arr[i]==target){
      list.add(i);
    }
    
      return search(arr,target,i+1,list);
    
  }
}
