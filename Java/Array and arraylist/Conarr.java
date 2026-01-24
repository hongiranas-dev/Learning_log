import java.util.*;
public class Conarr {
public static void main(String[] args) {
  
  int[] nums={1,2,3,4,5};
  
  int ans[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
           
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        System.out.println(Arrays.toString(ans));
  //step 2:
        int[] n={1,2,3,4,5};
        int anss[]=new int[2*n.length];
        
        for(int i=0;i<nums.length;i++){
           
            anss[i]=n[i];
            
        }
        for(int i=0;i<nums.length;i++){
           
            anss[i]=n[i];
            
        }
        System.out.println(Arrays.toString(anss));

}}