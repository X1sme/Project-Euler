import java.util.*;

public class Main{
	
	public static void main(String[] args){
		
		int biggestPolindromic = 0;
		
		for(int i = 1 ; i < 999; i++){
			for(int j = 1; j < 999; j++){
				
				int valueInt = i*j;
				String valueStr = Integer.toString(valueInt);

				if(valueStr.length() > 1){
			
					if(reverseString(valueStr).equals(valueStr)){
						if(biggestPolindromic <= valueInt){
							biggestPolindromic = valueInt;
						}
					}
						
				}
				
			}
			
			
		}
		
		System.out.println(biggestPolindromic);
		
	}
	
	static StringBuilder product = new StringBuilder();
	
	static String reverseString(String reversedString){
		product.replace(0,product.length(), "");
		
		product.append(reversedString);
		return product.reverse().toString();
	}
}
