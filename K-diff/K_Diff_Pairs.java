import java.util.Arrays;
import java.util.Collections;
import java.lang.*;

class K_Diff_Pairs {

    public int findPairs(int[] nums, int k) {

        if(nums.length==0)
            return 0;

        //Sorting Array:
    	Arrays.sort(nums);
    	printArray(nums);

    	//Remove Duplicates:
    	int[] distinct_nums;
    	int[] distinct_nums1 = new int[nums.length];
    	int prevDuplicate;
    	distinct_nums1[0] = nums[0];
    	prevDuplicate  = nums[0];
    	int index=1, duplicateCount=0, distinctDuplicate=-1;
    	for(int i=0;i<nums.length-1;i++){
    		if(nums[i] != nums[i+1]){
    			distinct_nums1[index] = nums[i+1];
    			index += 1;
    		}
    		else{
    			if(i==0)
    			 	distinctDuplicate += 1;
    			System.out.println("\n"+"prev: "+prevDuplicate+" current: "+nums[i]);
    			if(prevDuplicate != nums[i])
  	 	 			distinctDuplicate += 1;
  	 	 		duplicateCount += 1;	
    		}
    	}

    	if(k==0)
    		return distinctDuplicate+1;

    	distinct_nums=Arrays.copyOfRange(distinct_nums1, 0, nums.length-duplicateCount);
    	printArray(distinct_nums);

    	//Find K-Diff Pairs:
    	int count=0;
    	loop1:for(int j=0;j<distinct_nums.length-1;j++){
    		loop2:for(int l=j+1;l<distinct_nums.length;l++){
    			System.out.println("\n"+"Comparing "+distinct_nums[j]+" Vs "+distinct_nums[l]);
    			if (Math.abs(distinct_nums[j] - distinct_nums[l]) == k){
    				count += 1;
    				break;
	    		}
	    		else if (Math.abs(distinct_nums[j] - distinct_nums[l]) > k){
    				break;	
	    		}
			}
    	}
        return count;
    }
    
    //Print the given array:
	public static void printArray(int[] targetArray){
    	System.out.println("\n");
    	System.out.print("[ ");
    	for(int l=0;l<targetArray.length;l++)
	   		 System.out.print(targetArray[l] + " ");  
    	System.out.print("]");
	}

    public static void main(String args[]){
    	int[] input = {1, 1, 1, 1, 1};
    	printArray(input);
    	K_Diff_Pairs o = new K_Diff_Pairs();
    	System.out.println("\n"+o.findPairs(input, 0));
    }
}










