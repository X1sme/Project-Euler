import java.util.*;

public class Main{
	
	public static void main(String[] args){
		
		boolean divisible = false;
		
		for(int i = 20; !divisible;){
			
			for(int j = 1; j <= 20; j++){
				
				if(i%j != 0){
					i += (i%j);
					break;
				}

				if(j == 20){
					System.out.println(i);
					divisible = true;
				}
			}
		}
	}
}
