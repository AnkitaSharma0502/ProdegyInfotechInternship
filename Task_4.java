package ProdegyInfoTechInternship;

import java.util.Scanner;

public class Task_4 {

	
	    private static final int GRID_SIZE = 9;

	    public static void main(String[] args) {
	        int[][] board = {
	            {7, 0, 2, 0, 5, 0, 6, 0, 0},
	            {0, 0, 0, 0, 0, 3, 0, 0, 0},
	            {1, 0, 0, 0, 0, 9, 5, 0, 0},
	            {8, 0, 0, 0, 0, 0, 0, 9, 0},
	            {0, 4, 3, 0, 0, 0, 7, 5, 0},
	            {0, 9, 0, 0, 0, 0, 0, 0, 8},
	            {0, 0, 9, 7, 0, 0, 0, 0, 5},
	            {0, 0, 0, 2, 0, 0, 0, 0, 0},
	            {0, 0, 7, 0, 4, 0, 2, 0, 3}
	        };

	        Scanner scanner = new Scanner(System.in);
	        
	        while (!isBoardFull(board)) {
	            printBoard(board);
	            System.out.print("Enter a row (1-9): ");
	            int row = scanner.nextInt() - 1;
	            System.out.print("Enter a column (1-9): ");
	            int col = scanner.nextInt() - 1;
	            System.out.print("Enter a number (1-9): ");
	            int num = scanner.nextInt();

	            if (isValidMove(board, row, col, num)) {
	                board[row][col] = num;
	            } else {
	                System.out.println("Invalid move. Try again.");
	            }
	        }

	        printBoard(board);
	        System.out.println("Congratulations! You solved the Sudoku puzzle.");
	        scanner.close();
	    }

	    private static void printBoard(int[][] board) {
	        for (int row = 0; row < GRID_SIZE; row++) {
	            if (row % 3 == 0 && row != 0) {
	                System.out.println("-----------");
	            }
	            for (int col = 0; col < GRID_SIZE; col++) {
	                if (col % 3 == 0 && col != 0) {
	                    System.out.print("|");
	                }
	                System.out.print(board[row][col] == 0 ? " " : board[row][col]);
	            }
	            System.out.println();
	        }
	    }

	    private static boolean isValidMove(int[][] board, int row, int col, int num) {
	        for (int i = 0; i < GRID_SIZE; i++) {
	            if (board[row][i] == num || board[i][col] == num) {
	                return false;
	            }
	        }

	        int boxRowStart = row - row % 3;
	        int boxColStart = col - col % 3;

	        for (int r = boxRowStart; r < boxRowStart + 3; r++) {
	            for (int d = boxColStart; d < boxColStart + 3; d++) {
	                if (board[r][d] == num) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    private static boolean isBoardFull(int[][] board) {
	        for (int row = 0; row < GRID_SIZE; row++) {
	            for (int col = 0; col < GRID_SIZE; col++) {
	                if (board[row][col] == 0) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}

