import java.util.*;

public class Main{
	public static void main(String[] args){
		
		int theLongestChain = 0;
		int theStartChain = 13;
		
		System.out.println(Integer.MIN_VALUE);
		for(int i = 13; i < 1000000; i++){
			int u = longChain(i);
			if(u > theLongestChain){
				theStartChain = i;
				theLongestChain = u;
				System.out.println(theStartChain);
				//System.out.println(theLongestChain);
			}
			
			//System.out.println(i);
		}
		
	}
	
	static int longChain(long startNumber){
		
		int chain = 0;
		
		while(true){
			
			chain++;
			
			if(startNumber == 1){
				break;
			}
			
			if(startNumber%2 == 0){
				startNumber /= 2;
			}else{
				startNumber = 3*startNumber + 1;
			}
			
		}
		
		return chain;
	}
}
