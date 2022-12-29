# Tic-Tac-Toe
A two-player game of Tic-Tac-Toe implemented in Java.

### Running the game

To run the game, compile and run the TicTacToeRunner class. You will be prompted to enter the row and column of your move as integers. The game will continue until a player wins or all spaces are filled. The game will then display the result and exit.

### Testing the game
To test the game's methods, compile and run the TicTacToeTester class. This will perform various tests on the TicTacToeClass methods to ensure they are working as intended

### Playing the game with a GUI
To play the game with a graphical user interface (GUI), compile and run the TicTacToeGUI class. This will open a window with a 3x3 grid of buttons representing the Tic-Tac-Toe board. You can click on a button to place an "X" there, and the computer will automatically place an "O" on the board. The game will continue until a player wins or all spaces are filled, at which point a message will be displayed and the program will exit.

### Code structure
The game consists of four Java classes:

- TicTacToeClass: Contains the core logic of the game, including methods for checking the game state (e.g. isWinner, isFull), making moves, and displaying the board.
- TicTacToeRunner: A simple text-based runner for the game. Allows two players to take turns making moves and displays the board after each move.
- TicTacToeTester: A class for testing the TicTacToeClass methods to ensure they are working correctly.
- TicTacToeGUI: A GUI version of the game that allows a player to make moves by clicking on buttons representing the board spaces. The computer makes its moves automatically.

### Notes

- The board is represented as a 2D array of characters, with 'X', 'O', and ' ' (blank space) representing the three possible states of each space.
- The isValid method checks if a given row and column corresponds to a valid, unoccupied space on the board.
- The isWinner method checks if a given player ('X' or 'O') has won the game by having three of their pieces in a row, column, or diagonal.
- The isFull method checks if all spaces on the board are occupied.
- The isCat method checks if the game is a tie, i.e. all spaces are occupied and no player has won.
- The playMove method allows a player to place their piece ('X' or 'O') at a given row and column on the board.
- The displayBoard method displays the current state of the board on the console.

#### Resources used 

- Java documentation: To refresh my knowledge of the Java programming language and its syntax, I would refer to the official Java documentation at https://docs.oracle.com/en/java/.

- Tutorials on object-oriented programming: To familiarize myself with the concepts of classes and objects in Java, I might look for online tutorials or resources that explain the fundamentals of object-oriented programming.

- Examples of Tic-Tac-Toe implementations in Java: To see how other people have implemented Tic-Tac-Toe in Java and get some ideas for my own implementation, I might search for examples or code snippets online.