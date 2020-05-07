package strings_arrays;

/*
Su Doku (Japanese meaning number place) is the name given to a popular puzzle concept. Its origin is unclear,
but credit must be attributed to Leonhard Euler who invented a similar, and much more difficult, puzzle idea called
Latin Squares.

The objective of SuDoku puzzles, however, is to replace the blanks (or zeros) in a 9 by 9 grid in
such that each row, column, and 3 by 3 box contains each of the digits 1 to 9. The example shown in sudoku.ong in the
 'resources' folder in the this project shows a typical starting puzzle grid and its solution grid.

A well constructed SuDoku puzzle has a unique solution and can be solved by logic, although it may be necessary to
employ "guess and test" methods in order to eliminate options (there is much contested opinion over this). The
complexity of the search determines the difficulty of the puzzle; the example above is considered easy because it can
be solved by straight forward direct deduction.

The text file, found in the 'resources' directory of this project, contains fifty different Su Doku puzzles
ranging in difficulty, but all with unique solutions (the first puzzle in the file is the example shown in sudoku.png
found in the resources directory as well).

By solving all fifty puzzles find the sum of the 3-digit numbers found in the top left corner of each solution grid;
for example, 483 is the 3-digit number found in the top left corner of the solution grid above.

*/

// Extended ASCII characters 179-218
//enable unicode hex input keyboard hold down option alt key and type unicode


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SuDoku {
    public static void main(String[] args) {
        ReadFiles sudokuRead = new ReadFiles();
        sudokuRead.openSudokuFile();
        sudokuRead.readSudokuFile();
        sudokuRead.closeSudokuFile();

    }
}


//    public static void main(String[] args) throws IOException{
//
//        try{
//            Scanner input = new Scanner(new File("~/Documents/codingnomads/advanced_practice/src/main/" +
//                    "java/resources/sudoku_grid.txt"));
//            while(input.hasNextLine()){
//                String message = input.nextLine();
//                message = message.replace("0", " ");
//                String store[] = message.split("/");
//                for(int a = 0; a < store.length; a++){
//                    if((store[a]).contains("Grid"){
//                        String t[] = (store[a]).split("-");
//                        aStore = aStore + "_" + t[1];
//                    }
//                    if((store[a]).contains("B-"){
//                        String t[] = (store[a]).split("-");
//                        bStore = bStore + "_" + t[1];
//                    }
//                }
//                aFinal = aStore.split("_");
//                bFinal = bStore.split("-");
//            }
//            input.close();
//        } catch(Exception e){}
//    }
//}
class ReadFiles {
    String [] grid = new String[10];
    int i = 0;

    private Scanner readSudoku;
    public void openSudokuFile() {
        try {
            readSudoku = new Scanner(new File("/Users/nicola/Documents/codingnomads/advanced_practice/src" +
                    "/main/resources/sudoku_grid.txt"));
        } catch (Exception e) {
            System.out.println("File not found.");
        }
    }
    public void readSudokuFile() {
        try {
            while (readSudoku.hasNext()) {
                grid[i] = readSudoku.next();
                System.out.println(grid[i]);
                i++;
            }
        }catch (IndexOutOfBoundsException exc1) {
            System.out.println("Here is your Sudoku grid. Time to solve it.");
        }
    }
    public void closeSudokuFile() {
        readSudoku.close();
    }
}


    //read the sudoku grids from sudoku_grid.txt and pass it to an array

    //print out the array with break lines and ASCII characters to look like the sudoku game board

    //change any 0's to " "

    //set the program to read input from the user to change number in the grid with A2 B4 like commands

    //once there are 9 of each number in the array sout done with that problem and read the next sudoku grid

    // once all of the grids have been completed sum the first 3 numbers of every grid


