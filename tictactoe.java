import java.util.Scanner;
public class TicTacToe {
	public static void main(String args) {
		char [][] gameBoard = {{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'}, //make a 2d array build board
				{' ','|',' ','|',' '}};
		for(char [] row : gameBoard) {
			for (char c: row) {
				System.out.println(c);
            }
                System.out.println();
		}
			
    }
    public static void printGameBoard(char [][] gameBoard){
        for(char[] row: gameBoard){
            for(char c: row){
                System.out.print(c);
            }
            System.out.println();

            }
        }
    }
}