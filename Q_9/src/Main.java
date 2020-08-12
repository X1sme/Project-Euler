import java.util.*;

public class Main{
	public static void main(String[] args){
		int a1 = 3;
		int a2 = 4;
		int result = 5;
		
		for(int i = 1; true; i++){
			int jumlah = square(i) + square(a2);
			int akar;
			if((akar = akar(jumlah)) != 0){
				System.out.println(i + " + " + a2 + " + " + akar);
				if(i < a2 && a2 < akar){
					if(i + a2 + akar == 1000){
						System.out.println(i*a2*akar);
						break;
					}
				}
			}
			
			if(i == a2){
				a2++;
				i = 1;
			}
		}
		
		
	}
	
	private static int square(int number){
		return number*number;
	}
	
	private static int akar(int number){
		for(int i = 2; true; i++){
			if(square(i) == number){
				return i;
			}
			
			if(square(i) > number){
				return 0;
			}
		}
	}
}
