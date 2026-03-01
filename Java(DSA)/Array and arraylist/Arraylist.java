import java.util.*;
public class Arraylist {
  public static void main(String[] args) {
    /*arraylist -similar (doesnt allow primitive )
    to array you can add infitiy same dtype as you want
    > using wrapper class
    >how?
    >eg ehrn thr 50per is reached,it doubles the size of array
     it copies the og elemnent and add simultanlsy */
    
    ArrayList<Integer> list=new ArrayList<Integer>(4);

    //list is reference variable
    list.add(2);
    list.add(4);
    list.add(0);
    list.add(100);
    list.add(8);
    list.add(100);
    list.add(6);

    // out 1 (it interally calls arrays.tostring as well)
    System.out.println(list);

    //many functions poosiblw similar to python
    System.out.println(list.contains(6));//checks and return boolean
   
    //set- inserrt the elment at the index
    list.set(0,99);
    System.out.println(list);
    
    // removing the element
    list.remove(6);
    System.out.println(list);

    //input 2
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr top 5 elemnts");
    for(int i=0;i<5;i++){
     //adding the new element tot he list
     list.add(sc.nextInt());
     //u have to comment the first add part
    }
    //output 2
    for(int i=0;i<5;i++){
    //get the elemnt from index
    System.out.println(list.get(i)); 
  sc.close();
   }
 }
}
