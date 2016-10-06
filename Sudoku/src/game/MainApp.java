package game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import game.sudokuGUI;


/**
 * @author Christopher Dillman
 *
 */
public class MainApp {
	static int sudokuGrid[][] = new int[][] { //array of arrays
		{0,0,0,0,0,0,0,0,0}, 	//[y][x]: [0][0],[0][1]...
		{0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0}}; 	//...[8][7],[8][8]
	static int[][] solvedGrid = makeSolution(sudokuGrid, 0);

	public static void main(String[] args) {		
		int[][] puzzleGrid = new int[9][9];
		
		for(int y=0; y<9;y++) {
			for (int x=0;x<9;x++) {
				puzzleGrid[y][x] = solvedGrid[y][x];
			}
		}
		
		puzzleGrid = makePuzzle(puzzleGrid);
		
		printGrid(puzzleGrid);  //show the unsolved puzzle
		System.out.println();
		System.out.println("Solved Grid:");
		printGrid(solvedGrid);
		sudokuGUI.runGui();
		sudokuGUI.fillGui(puzzleGrid);
	}

	/*
	 * Prints a grid
	 */
	public static void printGrid(int[][] grid) {
		System.out.println();
		for (int y = 0; y<9; y++) {
			for (int x = 0; x<9; x++) {
				System.out.print(grid[y][x]);
			}
			System.out.println();
		}
	}
		
	/*
	 * Creates a valid sudoku puzzle
	 */
	public static int[][] makeSolution(int[][] grid, int index) {
		if (index > 80)
			return grid;

		int x = index % 9;
		int y = index / 9;

		List<Integer> numbers = new ArrayList<Integer>(); //makes a list of numbers of 1 through 9
		for (int i = 1; i <= 9; i++) numbers.add(i);
		Collections.shuffle(numbers); //shuffle the numbers

		while (numbers.size() > 0) {
			int number = getNextNumber(grid, x, y, numbers);
			if (number == -1)
				return null;

			grid[y][x] = number;
			int[][] tmpgrid = makeSolution(grid, index + 1);
			if (tmpgrid != null)
				return tmpgrid;
			grid[y][x] = 0;
		}

		return null;
	}

	public static int[][] makePuzzle(int[][] grid) {
		Random rand = new Random();
		
		for(int i = 0; i < 50; i++) {
			int y = rand.nextInt(9);
			int x = rand.nextInt(9);
			if (grid[y][x] != 0) {
				grid[y][x] = 0;
			}
			else {
				i--;
			}
			
		}
		
		return grid;
	}

	/*
	 * Returns true if a grid is valid for a sudoku puzzle
	 */
	public static boolean validateGrid(int y, int x, int[][] grid) {
		String str = "";
		for (int i = 0; i<9;i++) {
			str+=Integer.toString(grid[y][i]);	//Checks for repeating numbers horizontally
			str+=Integer.toString(grid[i][x]);	//vertically
			str+=Integer.toString(grid[(y/3)*3+i/3][(x/3)*3+i%3]); //in a 3x3 square
		}

		//Remove the digits at [y][x] locations and return true if the string is 3 shorter than it was
		return str.length() - str.replace(Integer.toString(grid[y][x]), "").length() == 3;
	}

	public static int getNextNumber(int[][] grid, int x, int y, List<Integer> numbers) {
		while (numbers.size() > 0) {
			int count = 0;
			int number = numbers.remove(0);
			for (int i=0;i<3;i++) {
				if (i == 0) {
					for (int xx = 0; xx < 9; xx++) {
						if (grid[y][xx] == number) { //check each x row and column y for repeating x's
							count--;
						}
					}
					count++;
				}
				else if (i == 1) {
					for (int yy = 0; yy < 9; yy++) {
						if (grid[yy][x] == number) { //check each y row at column x for repeating y's
							count--;
						}
					}
					count++;
				}
				else if(i == 2) {
					int x1 = x < 3 ? 0 : x < 6 ? 3 : 6;
					int y1 = y < 3 ? 0 : y < 6 ? 3 : 6;
					for (int yy = y1; yy < y1 + 3; yy++) {
						for (int xx = x1; xx < x1 + 3; xx++) {
							if (grid[yy][xx] == number)
								count--;
						}
					}
					count++;
				}
			}
			if (count == 3){
				return number;
			}
		}
		return -1;
	}
	
	public static int[][] help(int[][] grid, int number) {
		for (int y = 0; y<9; y++) {
			for (int x = 0; x<9; x++) {
				if (solvedGrid[y][x] == number) {
					grid[y][x] = number;
				}
			}
		}
		return grid;
	}
	
	public static int[][] getSolvedGrid() {
		return solvedGrid;
	}
}