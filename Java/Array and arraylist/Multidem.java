import java.util.*;

public class Multidem {
  public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();

    //inistialisation
    for(int i=0;i<3;i++){
    list.add(new ArrayList<>());
    }

    //adding elemnts
    System.out.println("enter the elemnts");
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        list.get(i).add(sc.nextInt());
      }
     
    }
    //output 1
    System.out.println(list);
sc.close();
  }
}
