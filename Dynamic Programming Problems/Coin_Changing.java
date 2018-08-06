import java.util.*;
import java.lang.Math.*;
public class Coin_Changing{
	int[] prevCalc;	
	
	public int optimalCoins(int[] denom, int n){
		prevCalc = new int[n+1];
		prevCalc[0] = 0;

		for(int i=1;i<=n;i++){
			if(i>=denom[0] && i<denom[1]){	
				prevCalc[i] = 1 + prevCalc[i-denom[0]];
			}
			if(i>=denom[1] && i<denom[2]){	
				prevCalc[i] = 1 + Math.min(prevCalc[i-denom[0]], prevCalc[i-denom[1]]);
			}
			if(i>=denom[2]){	
				prevCalc[i] = 1 + Math.min(prevCalc[i-denom[0]], 
					Math.min(prevCalc[i-denom[1]], prevCalc[i-denom[2]]));
			}
		}
		return prevCalc[n];		
	}

	public static void main(String args[]){
		Coin_Changing cc = new Coin_Changing();
		int[] denominations = {1, 5, 10};
		
		System.out.println("Optimal #Coins: "+
			cc.optimalCoins(denominations, 33));
	}
}