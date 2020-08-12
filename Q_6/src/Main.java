import java.util.*;

public class Main{
	public static void main(String[] args){
		
		int sumOfNumber = 0;
		for(int i = 1; i <= 100; i++){
			sumOfNumber += i;
		}
		int sumOfSquare = 0;
		for(int i = 1; i <= 100; i++){
			sumOfSquare += square(i);
		}
		
		System.out.println(square(sumOfNumber) - sumOfSquare);
	}
	
	static int square(int number){
		return number * number;
	}
}
