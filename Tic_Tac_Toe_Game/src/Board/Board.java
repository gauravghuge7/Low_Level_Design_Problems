package Board;

import java.util.HashMap;



public interface Board {

    public class Cell {

        public int row;
        public int col;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }


    HashMap<String, Cell> map = new HashMap<>();

    char[][] board = new char[3][3];
    public void printBoard();

    public boolean insertContent(String s, boolean place);



}
