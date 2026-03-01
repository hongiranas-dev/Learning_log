import java.util.*;
public class Ques_onfun4{
  /*Write a function to check if a given triplet is a Pythagorean 
   triplet or not. */
public static void main(String[] args) {
  triplet();
}
static void triplet(){
Scanner sc=new Scanner(System.in);
System.out.println("eneter a new num");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int sum1=num1*num1+num2*num2;
int sum2=num3*num3;
if(sum1==sum2){
  System.out.println("triplet");
}
else{
  System.out.println("not  triplet");
}
sc.close();


}
}
