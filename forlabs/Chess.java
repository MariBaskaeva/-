import java.io. *;
import java.util.*;
import java.lang. *;

public class Chess{
	public static void main(String[] args){
		int[][] table = new int[8][8];
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < table[i].length; j++){
				table[i][j] = 0;
			}
		}
		int f = 1;
		for(int i = 0; i < 4; i++){
			table[i][f] = 1;
			fill(table, i, f);
			f += 2;
		}
		for(int i = 4; i < 8; i++){
			int a = findZero(table, i);
			table[i][a] = 1;
			fill(table, i, a);
		}
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < table[i].length; j++){
				System.out.print(table[j][i] + "\t");
			}
			System.out.println();
		}
	}

	static void fill(int[][] table, int column, int row){
		for(int i = 0; i < table.length; i++){
			if(table[column][i] == 0)
				table[column][i] = column + 100;
			if(table[i][row] == 0)
				table[i][row] = column + 100;
			if((column + i >= 0 && column + i < 8) && (row + i >= 0 && row + i < 8) && table[column + i][row + i] == 0)
				table[column + i][row + i] = column + 100;
			if((column + i >= 0 && column + i < 8) && (row - i >= 0 && row - i < 8) && table[column + i][row - i] == 0)
				table[column + i][row - i] = column + 100;
			if((column - i >= 0 && column - i < 8) && (row + i >= 0 && row + i < 8) && table[column - i][row + i] == 0)
				table[column - i][row + i] = column + 100;
			if((column - i >= 0 && column - i < 8) && (row - i >= 0 && row - i < 8) && table[column - i][row - i] == 0)
				table[column - i][row - i] = column + 100;
		}
	}
	static int findZero(int[][] table, int column){
		for(int i = 0; i < table[column].length; i++){
			if(table[column][i] == 0)
				return i;
		}
		return -1;
	}
}