import java.util.*;
/*Write a function to find 
if a number is a palindrome or not. Take number as parameter. */
public class Ques_onfun3{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    pal(num);
    sc.close();
  }
  static void pal(int a){
    int b=a;
    int rev=0;
    while(b>0){
      rev=b%10+rev*10;
      b=b/10;
    }
    if(rev==a){
      System.out.println(("pallindrome"));
    }
    else{
      System.out.println("false");
    }
  
    }}
    
  