public class countzero {
  public static void main(String[] args){
    
    System.out.println(countzero(200, 0));
    
    
  }
  static int countzero(int n,int c){
    if(n==0){
      return c ;
    }

    if((n%10)==0){
      c++;
    }
    
     return countzero(n/10, c);

    
  }
}
