import java.util.*;
public class Ques_onfun1 {
  /*Write a program to print the circumference and area of a circle
   of radius entered by user by defining your own method.*/
   public static void main(String[] args) {
   circum();
   }
   static void circum(){
    System.out.println("eneter the number");
  Scanner sc=new Scanner(System.in);
   int  r=sc.nextInt();
   System.out.println("circum"+2*3.14*r);
   sc.close();
   }
}
