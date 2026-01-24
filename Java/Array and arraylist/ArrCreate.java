import java.util.*;
public class ArrCreate {
  public static void main(String[] args){
    //creating an array method 1
    int[] arr=new int[5];
    arr[0]=1;
    arr[2]=3;
    arr[4]=4;
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
    // in;put method 2
    int [] arr1={1,2,3,4,5};
    //output  method 2
    for(int i : arr1){      
      System.out.println(i);// here the i representes the every element in arr
    }
    System.out.println();
    //input method 3
    System.out.println("eneter only 5 elemnts10");
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
        // output method 2(very unique)
        System.out.println(Arrays.toString(arr));
    }
    System.out.println("print the 3rd array");
    for(int i:arr){
    System.out.println(i);
    }
      //he spoke about null

    // arr using objects- string
    System.out.println("enter the new element");
    String[] str=new String[4];
    for(int i=0;i<str.length;i++){
    str[i]=sc.next();
  }
  //output method 1
    System.out.println(Arrays.toString(str));
    System.out.println();
    //output method 2
 for(String i:str){
  System.out.println(i);

  
sc.close();

 
  
 }}}
  
  

