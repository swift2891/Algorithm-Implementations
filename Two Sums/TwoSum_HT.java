import java.util.*;

public class TwoSum_HT{
	
	public static int[] twoSum(int[] nums,int target){
		int[] res={0,0};
        Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();  
        for(int i=0;i<nums.length;i++){
            ht.put(nums[i],i);
        }
		System.out.println("Size: "+ht.size());
        for(int i=0;i<nums.length;i++){
            res[0] = i;
            if(ht.get(target-nums[i])!=null){
				System.out.println("i:"+i+"Inside"+ht.get(target-nums[i]));
                res[1] = ht.get(target-nums[i]);     
                return res;
            }
        }
        return res;
	}

	public static void main(String[] args){
		int[] a = {3, 2, 4};
    	int[] result = new int[2];
    	result = twoSum(a, 6);
    	System.out.println(result[0]+","+result[1]);
	}

}