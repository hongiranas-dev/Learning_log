


  

// QUESTION:- 
//Construct the linked list from arr and return the head of the linked list.

class Node{
 int data;
 Node next;


// craeting contrutcr
Node(int data,Node next){
 this.data=data;
 this.next=next;
}

Node(int data){
 this.data=data;
 this.next=null;
}
}
public class Returnhead {
public static void main(String[] args) {
 int[] arr={1,2,3,4,5};
 Node head=new Node(arr[0]);
 Node temp=head;
 System.out.print(arr[0]);
 for(int i=1;i<arr.length;i++){
  temp.next=new Node(arr[i]);
  temp=temp.next;
  System.out.print(" ");
  System.out.print(temp.data);
 }
 
 
}
}
