public class Magic_Index{
	public boolean checkMagic(int[] inputArray, int l, int r){
		
		int mid = l+((r-l)/2);
		if(l<0 || r>inputArray.length-1)
			return false;
		if(inputArray[mid] == mid)
			return true;
		if(l==r){
			if(inputArray[l]==l)
				return true;
			else
				return false;
		}
		if(inputArray[mid] > mid){
		//Recurse Left
			return checkMagic(inputArray, l, mid-1);	
		}

		if(inputArray[mid] < mid){
		//Recurse Right
			return checkMagic(inputArray, mid+1, r);	
		}
	return false;
	}

	public static void main(String[] args){
		Magic_Index mi = new Magic_Index();
		int[] ip = {-10, -6, -4, -3, -2};	
		System.out.println(mi.checkMagic(ip, 0, ip.length-1));	
	}
}