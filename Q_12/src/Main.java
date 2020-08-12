import java.util.*;

public class Main{
	public static void main(String[] args){
		
		int awal = 0;
		for(int i = 1; true; i++){
			int banyakFaktor = jumlahFaktor(awal += i);
			System.out.println(banyakFaktor);
			if(banyakFaktor > 500){
				System.out.println(awal);
				break;
			}
		}
	}
	
	private static int jumlahFaktor(int number){
	
		int jumlahFaktor = 0;
		int param = number;
		for(int i = 1; i <= param; i++){
			if(number%i == 0){
				jumlahFaktor++;
				if(i != 1 && i != param){
					jumlahFaktor ++;
				}
				param = number/i;
			}
		}
		
		return jumlahFaktor;
	}
}
