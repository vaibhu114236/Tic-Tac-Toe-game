import java.util.Scanner;
public class tictactoe {
    static char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameEnded = false;

        printBoard();

        while (!gameEnded) {
            System.out.println("Player " + currentPlayer + ", enter a number (1-9): ");
            int move = scanner.nextInt();

            if (makeMove(move)) {
                printBoard();

                if (checkWin()) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameEnded = true;
                } else if (isDraw()) {
                    System.out.println("It's a draw!");
                    gameEnded = true;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }

    static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
        System.out.println();
    }

    static boolean makeMove(int move) {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;

        if (move < 1 || move > 9) return false;
        if (board[row][col] == 'X' || board[row][col] == 'O') return false;

        board[row][col] = currentPlayer;
        return true;
    }

    static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    static boolean checkWin() {
        // Rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer &&
                    board[i][1] == currentPlayer &&
                    board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer &&
                            board[1][i] == currentPlayer &&
                            board[2][i] == currentPlayer)) {
                return true;
            }
        }

        // Diagonals
        if ((board[0][0] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer &&
                        board[1][1] == currentPlayer &&
                        board[2][0] == currentPlayer)) {
            return true;
        }

        return false;
    }

    static boolean isDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] != 'X' && board[i][j] != 'O')
                    return false;
        return true;
    }
}
