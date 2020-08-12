import java.util.*;

public class Main{
	public static void main(String[] args){
		long result = 0;
		for(long i = 2; i < 2000000; i++){
			if(prime(i)){
				System.out.println(i);
				result += i;
			}
		}
		
		System.out.println(result);
	}
	
	private static boolean prime(long number){
		for(int i = 2; i <= number/2; i++){
			
			if(number%i ==0){
				return false;
			}
			
		}
		
		return true;
	}
}
