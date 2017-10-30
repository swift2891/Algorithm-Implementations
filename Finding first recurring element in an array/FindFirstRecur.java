import java.util.*;


public class FindFirstRecur{

//This module divides the array into two halves and recursively divides each half until the input size is 1. 
//Then start merging them from bottom up.  
    
    public static int[] sort(int[] A, int length){
		int mid=0;
		if(length<2)
            return A;
		mid = length/2;
		int[] leftSubArray, rightSubArray, lhs, rhs;
                leftSubArray = new int[length];
                rightSubArray = new int[length];
                lhs = new int[length];
                rhs = new int[length];
                leftSubArray = Arrays.copyOfRange(A, 0, mid);
                System.out.println("");
                System.out.println("Left Sub Array: ");
                printArray(leftSubArray);
				rightSubArray = Arrays.copyOfRange(A, mid, length);
                System.out.println("");
                System.out.println("Right Sub Array: ");
                printArray(rightSubArray);    
                lhs = sort(leftSubArray, leftSubArray.length);
		rhs = sort(rightSubArray,rightSubArray.length);
		return mergeArrays(lhs, rhs);
	}
        
    public static int[] mergeArrays(int[] A, int[] B){
            //Two-finger algorithm
            int[] mergedArrays = new int[A.length+B.length];
            Arrays.fill(mergedArrays, '\0');
            int aPointer=0, bPointer = 0,k=0;

            while(aPointer<A.length && bPointer<B.length){
                if(A[aPointer] < B[bPointer]){
                    mergedArrays[k] = A[aPointer];
                    aPointer = aPointer+1;
                    k = k + 1;
                }
                else{
                    mergedArrays[k] = B[bPointer];
                    bPointer = bPointer+1;
                    k = k + 1;
                }
            }

            if(k < A.length+B.length){
                while(aPointer<A.length){
                    mergedArrays[k] = A[aPointer];
                    aPointer = aPointer+1;
                    k = k + 1;
                }
                while(bPointer<B.length){
                    mergedArrays[k] = B[bPointer];
                    bPointer = bPointer+1;
                    k = k + 1;
                }
            }
            else    
                System.out.println("MergedArray is of desired size.No loss.");
            System.out.println("");
            // System.out.println("The merged arrary: ");
            // printArray(mergedArrays);
            return mergedArrays;
    }

    //Print the given array:
    public static void printArray(int[] targetArray){
        System.out.print("[ ");
        for(int l=0;l<targetArray.length;l++)
    	    System.out.print(targetArray[l] + " ");  
        System.out.print("]");
    }


    public static int binarySearch(int[] sortedArray, int key){
    	System.out.println("\n"+"Searching for: "+key+" in array: "+"\n");
    	printArray(sortedArray);
    	int mid=0;
    	if(sortedArray.length<2){
    		if(sortedArray[mid] == key){
    		System.out.println("Success");
    		return sortedArray[mid];
    		}
    		else{
    			return 0;
    		}	
    	}
    	mid = sortedArray.length/2;
    	if(sortedArray[mid] == key){
    		System.out.println("Success");
    		return sortedArray[mid];
    	}
    	else if(sortedArray[mid]>key){
	 	 	System.out.println("\n"+"Doing BS on Left subarray: "+"\n");
	 	 	printArray(Arrays.copyOfRange(sortedArray,0,mid));
    		return binarySearch(Arrays.copyOfRange(sortedArray,0,mid),key);
    	}
    	else{
	 	 	System.out.println("\n"+"Doing BS on Right subarray: "+"\n");
	 	 	printArray(Arrays.copyOfRange(sortedArray,mid,sortedArray.length));
    		return binarySearch(Arrays.copyOfRange(sortedArray,mid,sortedArray.length),key);
    	}
    }  

    public static void main(String[] args) {
       	Scanner input = new Scanner(System.in);
		int[] inputArray, finalSortedArray;
		int i=0;
                int arrayLength = input.nextInt();
                inputArray = new int[arrayLength];
                finalSortedArray = new int[arrayLength];
		for(i=0;i<arrayLength;i++){
		    inputArray[i] = input.nextInt();  
 	 	}

 	 	System.out.println("The input Array is: ");
		printArray(inputArray);	 	

 	 	finalSortedArray = sort(inputArray,inputArray.length);
        System.out.println('\n');
        System.out.println('\n'+"The Final Merged Array is: ");
        printArray(finalSortedArray);

        int recurringElement=0; 
        int[] subarray = new int[finalSortedArray.length];
        for(int j=0;j<finalSortedArray.length-1;j++){
        	subarray = Arrays.copyOfRange(finalSortedArray,j+1,finalSortedArray.length);
        	System.out.println("The subarray is: "+"\n");	
        	printArray(subarray);
        	recurringElement = binarySearch(subarray,finalSortedArray[j]);
        	if(recurringElement == 0)
        		continue;
        	else
        		break;
        }

 	 	System.out.println("The recurring element is: " + recurringElement);
	} 
}

