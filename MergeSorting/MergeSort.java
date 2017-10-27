import java.util.Scanner;
/**
 *
 * @author Vignesh
 */
public class MergeSort {

	public static int[] sort(int[] A, int length){
		int mid=0;
		if(length==1)
			return A[0];
		mid = length/2;
		int[] leftSubArray = Arrays.copyOfRange(A, 0, mid-1);
		int[] rightSubArray = Arrays.copyOfRange(A, mid, length);
		int[] lhs = Sort(leftSubArray, leftSubArray.length);
		int[] rhs = Sort(rightSubArray,rightSubArray.length);

		return mergeArrays(lhs, rhs);
	}

	public static int[] mergeArrays(int[] A, int[] B){
		//Two-finger algorithm
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
		for(i=0;i<arrayLength;i++){
		    System.out.print(inputArray[i]);  
 	 	} 	 	

 	 	finalSortedArray = sort(inputArray,inputArray.length);

		for(i=0;i<arrayLength;i++){
		    System.out.print(finalSortedArray[i]);  
 	 	} 	 	
	}
}
