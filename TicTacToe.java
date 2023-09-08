import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        // first of all you set the board dimensions
        char[][] board = new char[3][3];
        // now allocate white spaces to this board
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[row].length;col++)
            {
                board[row][col] = ' ';
            }
        }

        // first chance is of player X, so set it
        char thePlayer = 'X';
        // make a counter to track if game is over
        boolean gameIsOverNow = false;
        Scanner sc = new Scanner(System.in);

        // run a loop to play the game till the game is not over
        while(!gameIsOverNow){
            /*for visual representation, print the board so that the player
            can choose where to place his move*/
            printingTheBoard(board);

            // asking from the user, where to place his move, enter the indexes
            System.out.println("The player " + thePlayer + " entered this index: ");
            System.out.println("Enter the row:");
            int enterRow = sc.nextInt();
            System.out.println("Enter the column:");
            int enterCol = sc.nextInt();

            // you can only have your move if that index or position is empty on the board,
            // so check if board's index is empty
            if(board[enterRow][enterCol] == ' '){
                // if the move is valid, we are placing the element on the board
                board[enterRow][enterCol] = thePlayer;
                // if, after entering the element, player has won, then display it
                gameIsOverNow = gotTheWin(board, thePlayer); // check if player won

                if(gameIsOverNow){
                    System.out.println("The player " + thePlayer + " has won the game. Kudos!");
                }else{
                    thePlayer = (thePlayer == 'X')?'O':'X'; // to change the player,
                    // if the player was O then, player is X now, and vice versa
                }
            }else{
                System.out.println("Nope, not a valid move. Try again please");
            }
        }
        // printing the final board after the game
    }

    public static void printingTheBoard(char[][] board){
        for(int row=0;row<board.length;row++)
        {
            System.out.println("-----------");
            for(int col=0;col<board[row].length;col++)
            {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
    public  static boolean gotTheWin(char[][] board, char player){
        // check whether the rows are filled with the same player or not
        for(int row=0; row<board.length;row++)
        {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }

        // check whether the cols are filled with the same player or not
        for(int col=0; col<board[0].length;col++)
        {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }

        /* check whether the diagonals are filled with the same player or not */
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return  true;
        }
        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }
}