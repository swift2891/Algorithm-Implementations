//Program to return the first recurring element, Just using Arrays:
/*
**author: Vigneshwar Padmanaban
*/
import java.util.*;
public class FindFirstRecur{

    //The module 'sort' divides the array into two halves and recursively divides each half until the input size is 1. 
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
				rightSubArray = Arrays.copyOfRange(A, mid, length);
                lhs = sort(leftSubArray, leftSubArray.length);
		rhs = sort(rightSubArray,rightSubArray.length);
		return mergeArrays(lhs, rhs);
	}

    //Merges two sorted arrays: Two finger or pointer algorithm:       
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
          
    	return mergedArrays;
    }

    //This module check if there are elements on either sides and compare them with key value:
	public static int checksides(int[] originalSorted,int[] receivedArray, int key,int arrayOffset){
		if(arrayOffset>0){
			if(arrayOffset!=originalSorted.length-1){
    			if(originalSorted[arrayOffset-1]==key || originalSorted[arrayOffset+1]==key){
    				return key;
    			}
    			else
    				return 0;
			}
			else {
				if(originalSorted[arrayOffset-1]==key){
    				return key;
    			}
    			else
    				return 0;	
			}
		}
		else{
			if(originalSorted[1]==key){
				return key;	
			}
			else
				return 0;
		}
  	} 

    //Binary search
    public static int binarySearch(int[] originalSorted,int[] receivedArray, int key,int arrayOffset){
    	int mid=0;
    	mid = receivedArray.length/2;
    	if(receivedArray.length<2){
    		return checksides(originalSorted,receivedArray,key,arrayOffset);
    	}
    	else if(receivedArray[mid] == key){
    		if(originalSorted[mid+arrayOffset-1]==key || originalSorted[mid+arrayOffset+1]==key){
    				return key;
    			}
    			else
    				return 0;
    	}
    	else if(receivedArray[mid]>key){
    		return binarySearch(originalSorted,Arrays.copyOfRange(receivedArray,0,mid),key,arrayOffset);
    	}
    	else {
			return binarySearch(originalSorted,Arrays.copyOfRange(receivedArray,mid,receivedArray.length),key,mid+arrayOffset);
    	}
    } 

    //Driver function:
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
 	 	finalSortedArray = sort(inputArray,inputArray.length);
        int recurringElement=0; 
        int[] subarray = new int[inputArray.length];
        for(int j=0;j<inputArray.length-1;j++){
        	recurringElement = binarySearch(finalSortedArray,finalSortedArray,inputArray[j],0);
        	if(recurringElement > 0)
        		break;
        }
 	 	System.out.println("The recurring element is: " + recurringElement);
	} 
}
