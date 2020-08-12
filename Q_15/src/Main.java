import java.util.*;

public class Main{
	public static void main(String[] args){
		
		System.out.println(test(3,1,4));
	}
	
	static int mainX = 1;
	static int mainY = 1;
	private static int test(int x, int y, int grid){
		
		int point = grid + 1;
		int path = point - y;
		
		if(x == point && y == 1){
			return 1;
		}
		
		if(x == point){
			return 0;
		}
		
		mainY = y;
		return path + test(x, y + 1, grid);
	}
	
	/**
	 11 12 13 23 33
	 11 12 22 32 33
	 11 12 22 23 33
	 11 21 22 32 33
	 11 21 22 23 33
	 11 21 31 32 33
	 **/
}
