package game;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * @author - Christopher Dillman 3/21/2014
 */
public class sudokuGUI {

	JFrame frame = new JFrame();
	JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, puzzlePanel, buttonPanel, instructionsPanel, helpPanel, solvePanel, checkCorrectPanel, newGamePanel;
	JButton btnInstructions, btnHelp, btnSolve, btnCheckCorrect, btnNewGame;
	static JTextField[][] grid1, grid2, grid3, grid4, grid5, grid6, grid7, grid8, grid9;
	int number = 1;
	boolean hadHelp = false, couldNotWin = false;

	public sudokuGUI(){
		frame.setLayout(new BorderLayout(20, 20)); //frame with 3 columns and 3 rows contains 9 panels
		frame.setBounds(250, 250, 0, 0);
		frame.setTitle("Sudoku by Christopher Dillman");


		puzzlePanel = new JPanel();
		puzzlePanel.setLayout(new GridLayout(3,3,20,20));

		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3,3,10,10));
		grid1=new JTextField[3][3];
		for(int y=0; y<3; y++){
			for(int x=0; x<3; x++){
				grid1[y][x]=new JTextField(y + "");
				grid1[y][x].setHorizontalAlignment(JTextField.CENTER);
				grid1[y][x].setPreferredSize(new Dimension(65,65));
				grid1[y][x].setFont(new Font(Font.DIALOG, Font.PLAIN, 25));
				panel1.add(grid1[y][x]);
			}	
		}
		panel1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		puzzlePanel.add(panel1);

		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3,3,10,10));
		grid2=new JTextField[3][3];
		for(int y=0; y<3; y++){
			for(int x=0; x<3; x++){
				grid2[y][x]=new JTextField(y + "");
				grid2[y][x].setHorizontalAlignment(JTextField.CENTER);
				grid2[y][x].setPreferredSize(new Dimension(65,65));
				grid2[y][x].setFont(new Font(Font.DIALOG, Font.PLAIN, 25));
				panel2.add(grid2[y][x]);
			}	
		}
		panel2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		puzzlePanel.add(panel2);

		panel3 = new JPanel();
		panel3.setLayout(new GridLayout(3,3,10,10));
		grid3=new JTextField[3][3];
		for(int y=0; y<3; y++){
			for(int x=0; x<3; x++){
				grid3[y][x]=new JTextField(y + "");
				grid3[y][x].setHorizontalAlignment(JTextField.CENTER);
				grid3[y][x].setPreferredSize(new Dimension(65,65));
				grid3[y][x].setFont(new Font(Font.DIALOG, Font.PLAIN, 25));
				panel3.add(grid3[y][x]);
			}	
		}
		panel3.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		puzzlePanel.add(panel3);

		panel4 = new JPanel();
		panel4.setLayout(new GridLayout(3,3,10,10));
		grid4=new JTextField[3][3];
		for(int y=0; y<3; y++){
			for(int x=0; x<3; x++){
				grid4[y][x]=new JTextField(y + "");
				grid4[y][x].setHorizontalAlignment(JTextField.CENTER);
				grid4[y][x].setPreferredSize(new Dimension(65,65));
				grid4[y][x].setFont(new Font(Font.DIALOG, Font.PLAIN, 25));
				panel4.add(grid4[y][x]);
			}	
		}
		panel4.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		puzzlePanel.add(panel4);

		panel5 = new JPanel();
		panel5.setLayout(new GridLayout(3,3,10,10));
		grid5=new JTextField[3][3];
		for(int y=0; y<3; y++){
			for(int x=0; x<3; x++){
				grid5[y][x]=new JTextField(y + "");
				grid5[y][x].setHorizontalAlignment(JTextField.CENTER);
				grid5[y][x].setPreferredSize(new Dimension(65,65));
				grid5[y][x].setFont(new Font(Font.DIALOG, Font.PLAIN, 25));
				panel5.add(grid5[y][x]);
			}	
		}
		panel5.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		puzzlePanel.add(panel5);

		panel6 = new JPanel();
		panel6.setLayout(new GridLayout(3,3,10,10));
		grid6=new JTextField[3][3];
		for(int y=0; y<3; y++){
			for(int x=0; x<3; x++){
				grid6[y][x]=new JTextField(y + "");
				grid6[y][x].setHorizontalAlignment(JTextField.CENTER);
				grid6[y][x].setPreferredSize(new Dimension(65,65));
				grid6[y][x].setFont(new Font(Font.DIALOG, Font.PLAIN, 25));
				panel6.add(grid6[y][x]);
			}	
		}
		panel6.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		puzzlePanel.add(panel6);

		panel7 = new JPanel();
		panel7.setLayout(new GridLayout(3,3,10,10));
		grid7=new JTextField[3][3];
		for(int y=0; y<3; y++){
			for(int x=0; x<3; x++){
				grid7[y][x]=new JTextField(y + "");
				grid7[y][x].setHorizontalAlignment(JTextField.CENTER);
				grid7[y][x].setPreferredSize(new Dimension(65,65));
				grid7[y][x].setFont(new Font(Font.DIALOG, Font.PLAIN, 25));
				panel7.add(grid7[y][x]);
			}	
		}
		panel7.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		puzzlePanel.add(panel7);

		panel8 = new JPanel();
		panel8.setLayout(new GridLayout(3,3,10,10));
		grid8=new JTextField[3][3];
		for(int y=0; y<3; y++){
			for(int x=0; x<3; x++){
				grid8[y][x]=new JTextField(y + "");
				grid8[y][x].setHorizontalAlignment(JTextField.CENTER);
				grid8[y][x].setPreferredSize(new Dimension(65,65));
				grid8[y][x].setFont(new Font(Font.DIALOG, Font.PLAIN, 25));
				panel8.add(grid8[y][x]);
			}	
		}
		panel8.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		puzzlePanel.add(panel8);

		panel9 = new JPanel();
		panel9.setLayout(new GridLayout(3,3,10,10));
		grid9=new JTextField[3][3];
		for(int y=0; y<3; y++){
			for(int x=0; x<3; x++){
				grid9[y][x]=new JTextField(y + "");
				grid9[y][x].setHorizontalAlignment(JTextField.CENTER);
				grid9[y][x].setPreferredSize(new Dimension(65,65));
				grid9[y][x].setFont(new Font(Font.DIALOG, Font.PLAIN, 25));
				panel9.add(grid9[y][x]);
			}	
		}
		panel9.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		puzzlePanel.add(panel9);

		frame.add(puzzlePanel, BorderLayout.WEST);

		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,1));

		/*
		 * Show instructions
		 */
		btnInstructions = new JButton("Instructions");
		btnInstructions.setPreferredSize(new Dimension(150,65));
		btnInstructions.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "The objective of sudoku is to enter a digit from 1 through 9 in every cell, in such a way that:\n"
						+ "\n" + "Each horizontal column contains each digit only once\n" + "Each vertical row contains each digit only once\n"
						+ "Each 3 by 3 square contains each digit only once\n\n" + "Several digits have already been entered and cannot be changed");
			}
		});

		instructionsPanel = new JPanel();
		instructionsPanel.setBounds(155, 65, 155, 65);
		instructionsPanel.add(btnInstructions);
		buttonPanel.add(instructionsPanel,BorderLayout.WEST);

		/*
		 * Fill in some numbers to help the user
		 */
		btnHelp = new JButton("Help Me");
		btnHelp.setPreferredSize(new Dimension(150,65));
		btnHelp.addActionListener(new ActionListener() {

			@Override
			/*
			 * outputs a partially filled grid, inputs an even more partially filled grid
			 */
			public void actionPerformed(ActionEvent e) {
				if (number > 9) { //if there are no numbers left to display
					JOptionPane.showMessageDialog(null, "The puzzle is already solved.");
					couldNotWin = true;
				}
				else {
					int[][] outputGrid = combineGrids();
					int[][] helpfulGrid = MainApp.help(outputGrid, number);
					number++;
					fillGui(helpfulGrid);
				}
				hadHelp = true;
			}
		});

		helpPanel = new JPanel();
		helpPanel.setBounds(155, 65, 155, 65);
		helpPanel.add(btnHelp);
		buttonPanel.add(helpPanel);

		/*
		 * Show the correct Answer
		 */
		btnSolve = new JButton("Show Answer");
		btnSolve.setPreferredSize(new Dimension(150,65));
		btnSolve.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int[][] inputGrid = MainApp.getSolvedGrid();
				fillGui(inputGrid);
				number = 10;
				couldNotWin = true;
			}
		});

		solvePanel = new JPanel();
		solvePanel.setBounds(155, 65, 155, 65);
		solvePanel.add(btnSolve);
		buttonPanel.add(solvePanel);

		/*
		 * Check to see if the puzzle was solved successfully
		 */
		btnCheckCorrect = new JButton("Finished");
		btnCheckCorrect.setPreferredSize(new Dimension(150,65));
		btnCheckCorrect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int[][] outputGrid = combineGrids();
				int[][] solvedGrid = MainApp.getSolvedGrid();
				
				int count = 0;
				boolean isCorrect = true;
				for(int y=0;y<9;y++){
					for(int x=0;x<9;x++){
						if (outputGrid[y][x] != solvedGrid[y][x]) {
							isCorrect = false;
							count++;
						}
					}
				}
				
				if (isCorrect == true && hadHelp == false && couldNotWin == false) {
					JOptionPane.showMessageDialog(null, "You have solved the puzzle!");
				}
				else if(isCorrect == true && hadHelp == true && couldNotWin == false) {
					JOptionPane.showMessageDialog(null, "With help, you have finished the puzzle.");
				}
				else if(isCorrect == true && couldNotWin == true) {
					JOptionPane.showMessageDialog(null, "The program solved the puzzle for you.");
				}
				else {
					JOptionPane.showMessageDialog(null, "The puzzle is not correct in " + count + " places.");
				}
			}
		});

		checkCorrectPanel = new JPanel();
		checkCorrectPanel.setBounds(155, 65, 155, 65);
		checkCorrectPanel.add(btnCheckCorrect);
		buttonPanel.add(checkCorrectPanel);
		
		
		/*
		 * Start a new game
		 */
		btnNewGame = new JButton("New Game");
		btnNewGame.setPreferredSize(new Dimension(150,65));
		btnNewGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int[][] newGrid = MainApp.makeSolution(new int[9][9], 0);
				newGrid = MainApp.makePuzzle(newGrid);
				fillGui(newGrid);
				number = 1;
			}
		});

		newGamePanel = new JPanel();
		newGamePanel.setBounds(155, 65, 155, 65);
		newGamePanel.add(btnNewGame);
		buttonPanel.add(newGamePanel);


		frame.add(buttonPanel, BorderLayout.EAST);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
	}

	public static void runGui() {
		new sudokuGUI();
	}

	public static void fillGui(int[][] inputGrid) {
		int[] square1 = {inputGrid[0][0],inputGrid[0][1],
				inputGrid[0][2], inputGrid[1][0] ,inputGrid[1][1],
				inputGrid[1][2], inputGrid[2][0], inputGrid[2][1],
				inputGrid[2][2]};
		int[] square2 = {inputGrid[0][3],inputGrid[0][4],
				inputGrid[0][5], inputGrid[1][3] ,inputGrid[1][4],
				inputGrid[1][5], inputGrid[2][3], inputGrid[2][4],
				inputGrid[2][5]};
		int[] square3 = {inputGrid[0][6],inputGrid[0][7],
				inputGrid[0][8], inputGrid[1][6] ,inputGrid[1][7],
				inputGrid[1][8], inputGrid[2][6], inputGrid[2][7],
				inputGrid[2][8]};
		int[] square4 = {inputGrid[3][0],inputGrid[3][1],
				inputGrid[3][2], inputGrid[4][0] ,inputGrid[4][1],
				inputGrid[4][2], inputGrid[5][0], inputGrid[5][1],
				inputGrid[5][2]};
		int[] square5 = {inputGrid[3][3],inputGrid[3][4],
				inputGrid[3][5], inputGrid[4][3] ,inputGrid[4][4],
				inputGrid[4][5], inputGrid[5][3], inputGrid[5][4],
				inputGrid[5][5]};
		int[] square6 = {inputGrid[3][6],inputGrid[3][7],
				inputGrid[3][8], inputGrid[4][6] ,inputGrid[4][7],
				inputGrid[4][8], inputGrid[5][6], inputGrid[5][7],
				inputGrid[5][8]};
		int[] square7 = {inputGrid[6][0],inputGrid[6][1],
				inputGrid[6][2], inputGrid[7][0] ,inputGrid[7][1],
				inputGrid[7][2], inputGrid[8][0], inputGrid[8][1],
				inputGrid[8][2]};
		int[] square8 = {inputGrid[6][3],inputGrid[6][4],
				inputGrid[6][5], inputGrid[7][3] ,inputGrid[7][4],
				inputGrid[7][5], inputGrid[8][3], inputGrid[8][4],
				inputGrid[8][5]};
		int[] square9 = {inputGrid[6][6],inputGrid[6][7],
				inputGrid[6][8], inputGrid[7][6] ,inputGrid[7][7],
				inputGrid[7][8], inputGrid[8][6], inputGrid[8][7],
				inputGrid[8][8]};
		int count = 0;
		for(int y=0; y<3; y++){
			for(int x=0; x<3; x++){
				grid1[y][x].setText(Integer.toString(square1[count]));
				grid2[y][x].setText(Integer.toString(square2[count]));
				grid3[y][x].setText(Integer.toString(square3[count]));
				grid4[y][x].setText(Integer.toString(square4[count]));
				grid5[y][x].setText(Integer.toString(square5[count]));
				grid6[y][x].setText(Integer.toString(square6[count]));
				grid7[y][x].setText(Integer.toString(square7[count]));
				grid8[y][x].setText(Integer.toString(square8[count]));
				grid9[y][x].setText(Integer.toString(square9[count]));
				grid1[y][x].setEditable(false);
				grid2[y][x].setEditable(false);
				grid3[y][x].setEditable(false);
				grid4[y][x].setEditable(false);
				grid5[y][x].setEditable(false);
				grid6[y][x].setEditable(false);
				grid7[y][x].setEditable(false);
				grid8[y][x].setEditable(false);
				grid9[y][x].setEditable(false);
				count++;
			}
		}
		cleanGrid(grid1);
		cleanGrid(grid2);
		cleanGrid(grid3);
		cleanGrid(grid4);
		cleanGrid(grid5);
		cleanGrid(grid6);
		cleanGrid(grid7);
		cleanGrid(grid8);
		cleanGrid(grid9);
	}

	/*
	 * Helps create a puzzle by replacing 0's with blank spaces
	 */
	public static JTextField[][] cleanGrid(JTextField[][] grid) {
		for (int y = 0; y<3; y++) {
			for (int x=0; x<3; x++) {
				String value = grid[y][x].getText();
				if (value.equals(Integer.toString(0))) {
					grid[y][x].setText("");
					grid[y][x].setEditable(true);
				}
			}
		}
		return grid;
	}
	
	/*
	 *Combines all 9 JTextField grids into 1 9x9 grid of integers 
	 */
		public static int[][] combineGrids() {
		int[][] outputGrid = new int[9][9];
		for (int i = 0; i<9; i++) {
			if (i == 0) {
				for (int y = 0; y<3; y++) {
					for (int x=0; x<3; x++) {
						if (grid1[y][x].getText().equals("")) {outputGrid[y][x] = 0;}
						else {outputGrid[y][x] = Integer.parseInt(grid1[y][x].getText());}}}}
			if (i == 1) {
				for (int y = 0; y<3; y++) {
					for (int x=3, xx=0; x<6; x++, xx++) { //recall that grid2 has boundries of [0][0] to [2][2]
						if (grid2[y][xx].getText().equals("")) {outputGrid[y][x] = 0;}
						else {outputGrid[y][x] = Integer.parseInt(grid2[y][xx].getText());}}}}	
			if (i == 2) {
				for (int y = 0; y<3; y++) {
					for (int x=6, xx=0; x<9; x++, xx++) {
						if (grid3[y][xx].getText().equals("")) {outputGrid[y][x] = 0;}
						else {outputGrid[y][x] = Integer.parseInt(grid3[y][xx].getText());}}}}
			if (i == 3) {
				for (int y = 3, yy=0; y<6; y++, yy++) {
					for (int x=0; x<3; x++) {
						if (grid4[yy][x].getText().equals("")) {outputGrid[y][x] = 0;}
						else {outputGrid[y][x] = Integer.parseInt(grid4[yy][x].getText());}}}}
			if (i == 4) {
				for (int y = 3, yy=0; y<6; y++, yy++) {
					for (int x=3, xx=0; x<6; x++, xx++) {
						if (grid5[yy][xx].getText().equals("")) {outputGrid[y][x] = 0;}
						else {outputGrid[y][x] = Integer.parseInt(grid5[yy][xx].getText());}}}}
			if (i == 5) {
				for (int y = 3, yy=0; y<6; y++, yy++) {
					for (int x=6, xx=0; x<9; x++, xx++) {
						if (grid6[yy][xx].getText().equals("")) {outputGrid[y][x] = 0;}
						else {outputGrid[y][x] = Integer.parseInt(grid6[yy][xx].getText());}}}}
			if (i == 6) {
				for (int y = 6, yy=0; y<9; y++, yy++) {
					for (int x=0; x<3; x++) {
						if (grid7[yy][x].getText().equals("")) {outputGrid[y][x] = 0;}
						else {outputGrid[y][x] = Integer.parseInt(grid7[yy][x].getText());}}}}
			if (i == 7) {
				for (int y = 6, yy=0; y<9; y++, yy++) {
					for (int x=3, xx=0; x<6; x++, xx++) {
						if (grid8[yy][xx].getText().equals("")) {outputGrid[y][x] = 0;}
						else {outputGrid[y][x] = Integer.parseInt(grid8[yy][xx].getText());}}}}
			if (i == 8) {
				for (int y = 6, yy=0; y<9; y++, yy++) {
					for (int x=6, xx=0; x<9; x++, xx++) {
						if (grid9[yy][xx].getText().equals("")) {outputGrid[y][x] = 0;}
						else {outputGrid[y][x] = Integer.parseInt(grid9[yy][xx].getText());}}}}
		}
		
		return outputGrid;
	}
}