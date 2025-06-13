The provided Java program is a simple implementation of the classic Tic Tac Toe game for two players (Player X and Player O). It uses a 3x3 grid represented by a 2D character array and allows players to take turns entering their moves via the console.

Board Representation
The game board is stored in a 2D array named board, initialized with characters '1' through '9'. Each number represents a cell position on the board. Players choose a number to make their move, and the corresponding number is replaced with either 'X' or 'O', depending on the current player.

Game Flow
The main() method is the starting point. It initializes the scanner for input, prints the board, and starts a loop that continues until the game ends. On each turn, the program:
Prompts the current player to enter a number from 1 to 9.
Calls the makeMove() method to update the board.
If the move is valid, it prints the updated board and checks for a win or draw.
If there's a winner, it prints the winning message and ends the loop.
If the game is a draw (all cells filled with no winner), it prints a draw message.
If neither condition is met, it switches to the other player using the switchPlayer() method.

Move Validation
The makeMove(int move) method ensures that:
The entered number is between 1 and 9.
The selected cell is not already occupied by 'X' or 'O'.
If the move is valid, the current player's symbol is placed in the chosen cell.

Win and Draw Conditions
The checkWin() method checks all possible winning combinations:
Three in a row (horizontal)
Three in a column (vertical)
Diagonals
If any of these contain the same symbol ('X' or 'O'), it returns true.
The isDraw() method loops through the board to check if all cells are filled without a winner. If so, it declares the game a draw.

Conclusion
This program is a well-structured example of a console-based game. It demonstrates core Java concepts like arrays, loops, conditionals, input handling, and methods. With a few enhancements, such as input validation for non-numeric entries or replay options, it can be made even more user-friendly and robust.
