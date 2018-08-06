//Bottom Up Approach

public class Fibonacci{
	static int table[];
	public static void computeFibo(int n){
		//Create Table(for storing)
		table = new int[n+2];

		//Base cases
		table[0] = 0; 
		table[1] = 1;
		table[2] = 1;
			
		//Iterative cases
		if(n>2){
			for(int i=3;i<=n;i++){
				table[i] = table[i-1]+table[i-2];
			}
		}
		System.out.println(n+" Fibo#:"+table[n]);
		
	}
	
	public static void main(String[] args){
	
	Fibonacci.computeFibo(3);
	
	}
}