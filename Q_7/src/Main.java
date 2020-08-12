import java.util.*;

public class Main{
	public static void main(String[] args){
		
		int to = 1;
		int i;
		
		for(i = 2; to <= 10002; i++){
			if(prime(i)){
				System.out.println(i);
				to++;
			}
		}
	}
	
	static boolean prime(int number){
		for(int i = 2; i < number/2; i++){
			if(i == number){
				continue;
			}
			
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
}
