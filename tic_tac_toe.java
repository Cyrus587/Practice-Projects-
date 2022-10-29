import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.List;
public class tic_tac_toe {
    static ArrayList<Interger>playerPositions = new ArrayList<Interger>();
    static ArrayList<Interger>cpuPositions = new ArrayList<Interger>();

	public static void main(String[] args) {
		char [][] gameBoard = {{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'}, //make a 2d array build board
                {' ','|',' ','|',' '}};
        printGameBoard(gameBoard);
        
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter you placement (1-9):");
            int playerpos = scan.nextInt();

        
            placePeice(gameBoard,playerpos,"player");
            Random rand = new Random();
            int cpuPos = rand.nextInt(9) +1;
            placePeice(gameBoard,  cpuPos, "cpu");
            printGameBoard(gameBoard);
        }




   


            

         



    


        
        
    
    public static void printGameBoard(char [][] gameBoard){
        for(char[] row: gameBoard){
            for(char c: row){
                System.out.print(c);
            }
            System.out.println();
            
        }
    }
    public static void placePeice(char [][] gameBoard, int pos, String user){
        char symbol =' ';
        if(user.equals("player")){
            symbol = 'X';
        } else if(user.equals("cpu")) {
            symbol = 'O';
        }
          
          switch(pos){
            case 1:
                gameBoard[0][0] =symbol;
                break;
            case 2:
                gameBoard[0][2] =symbol;
                break;
            case 3:
                gameBoard[0][4] =symbol;
                break;
            case 4:
                gameBoard[2][0] =symbol;
                break;
            case 5:
                gameBoard[2][2] =symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break; 
          }
          public static String checkWinner(){
              List topRow = Array.asLsit(1,2,3);
              List midRow = Array.asLsit(4,5,6);
              List botRow= Arrays.asList(1,2,3);
              List leftCol = Array.asLsit(1,4,7);
              List midCol = Array.asList(2,5,8);
              List rightCol = Array.asList(3,6,9);
              List cross1 = Array.asList(1,5,9);
              List cross2 = Array.asList(7,5,3);
              
              List<List> winning = new ArrayList<List>();
              
              winning.add(topRow);
              winning.add(midRow);
              winning.add(botRow);
              winning.add(leftCol);
              winning.add(rightCol);
              winning.add(cross1);
              winning.add(cross2);

              return "";
              
            }
          
            





              /*for(List List: winning ){
                  if(playerPositions.containsAll(List)){
              return "Congradulations you've won";
              }else if(cpuPositions.containsAll(List)){    
                  return "CPU wins ";
              }else if(playerPositions.size()+cpuPositions.size()==9);
                    }
    
          return "";*\





            printGameBoard(gameBoard);
        

        
        printGameBoard(gameBoard);
    }
        
    
}








        /*printGameBoard(gameBoard);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement (1-9):");
        int pos = scan.nextInt();

        System.out.println(pos);
        placePeice(gameBoard, pos,"player");


        printGameBoard(gameBoard);



        if(user.equals("Player")){
            Symbol = 'x';
        } else if(user.equals("Player")){
            Symbol = '0';
        }
        switch(pos){
            case 1:
                gameBoard[0][0] ='X';
                break;
            case 2:
                gameBoard[0][2] ='X';
                break;
            case 3:
                gameBoard[0][4] ='X';
                break;
            case 4:
                gameBoard[2][0] ='X';
                break;
            case 5:
                gameBoard[2][2] ='X';
                break;
            case 6:
                gameBoard[2][4] = 'X';
                break;
            case 7:
                gameBoard[4][0] = 'X';
                break;
            case 8:
                gameBoard[4][2] = 'X';
                break;
            case 9:
                gameBoard[4][4] = 'X';
                break;
            default



        }
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
    }*/

