public class Hamming_Distance{

    public int hammingDistance(int x, int y) {
    	String result;
    	int dist=0;

    	result = Integer.toBinaryString(x^y);
    	String[] resultArray = result.split("");

	   	//Calculate the Distance from xor output
    	for(int i=0;i<resultArray.length;i++){
    		if(Integer.parseInt(resultArray[i])==1)
    			dist++;
    	}
    	return dist;
    }

	public static void main(String args[]){

		Hamming_Distance hd = new Hamming_Distance();
		System.out.println(hd.hammingDistance(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
}