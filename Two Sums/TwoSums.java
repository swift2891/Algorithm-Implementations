import java.util.*;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        int i, j;
        int res[] = new int[2];
        int l = nums.length;
        System.out.println("length= "+l);
        for(i=0;i<=l-2;i++){
            for(j=i+1;j<=l-1;j++){
            	System.out.println("Checking"+nums[i]+" and "+nums[j]);
                if(nums[i]+nums[j]==target){
                    System.out.println("Success: "+i+" "+j);
                    
                    res[0] = i;
                    res[1] = j;	
                    
                }
            }
        }
        return(res);
    }

    public static void main(String[] args){
    	int[] a = {3, 2, 4};
    	int[] result = new int[2];
    	result = twoSum(a, 6);
    	// System.out.println(result[0]+result[1]);
    }
}
