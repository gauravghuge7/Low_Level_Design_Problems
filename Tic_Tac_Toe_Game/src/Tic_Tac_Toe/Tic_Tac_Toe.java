package Tic_Tac_Toe;

import Board.Board;

import java.util.Arrays;

public class Tic_Tac_Toe implements Board {


    public Tic_Tac_Toe() {

        map.put("top", new Cell(0,1));
        map.put("left", new Cell(1, 0));
        map.put("right", new Cell(1, 2));
        map.put("down", new Cell(2, 1));


        map.put("left_top", new Cell(0, 0));
        map.put("left_down", new Cell(2, 0));
        map.put("down_right", new Cell(2, 2));
        map.put("top_right", new Cell(0, 2));


        map.put("middle", new Cell(1, 1));

        resetBoard();
    }


    @Override
    public void printBoard() {
        for(int i=0; i<3; i++) {
            System.out.print("|");
            for(int j=0; j<3; j++) {
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }

    @Override
    public boolean insertContent(String s, boolean place) {

        Cell cell = map.get(s);

        if(cell == null) {
            System.out.println(" Give wrong input ");
            return false;
        }

        int row = cell.row;
        int col = cell.col;

        if(place) {
            board[row][col] = 'O';
        }
        else {
            board[row][col] = 'X';
        }

        printBoard();

        return isGameEnd(row, col);

    }


    public boolean isGameEnd(int row, int col) {

        char ch = board[row][col];
        int checkWin = 0;
        for(int i=0; i<3; i++) {
            if(ch == board[row][i]) {
                checkWin++;
            }
        }

        if(checkWin == 3) return true;
        checkWin = 0;

        for(int i=0; i<3; i++) {
            if(ch == board[i][col]) {
                checkWin++;
            }
        }

        if(checkWin == 3) return true;
        checkWin = 0;

        for(int i=0; i<3; i++) {
            if (ch == board[i][i]) {
                checkWin++;
            }
        }

        if(checkWin == 3) return true;
        checkWin = 0;

        for(int i=2; i>=0; i--) {
            if (ch == board[i][i]) {
                checkWin++;
            }
        }

        if(checkWin == 3) return true;
        checkWin = 0;

        return false;
    }


    public void resetBoard() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
    }

    public void showCellNames() {


        /**
         * print the top row for inputs
         */
        System.out.print("|");
        System.out.print(" left_top  ");
        System.out.print("|");
        System.out.print("  top   ");
        System.out.print("|");
        System.out.print(" top_right  ");
        System.out.print("|");
        System.out.println();

        /**
         * print the second row
         */

        System.out.print("|");
        System.out.print("   left    ");
        System.out.print("|");
        System.out.print(" middle ");
        System.out.print("|");
        System.out.print("   right    ");
        System.out.print("|");
        System.out.println();

        System.out.print("|");
        System.out.print(" left_down ");
        System.out.print("|");
        System.out.print("  down  ");
        System.out.print("|");
        System.out.print(" down_right ");
        System.out.print("|");
        System.out.println();


    }


}
