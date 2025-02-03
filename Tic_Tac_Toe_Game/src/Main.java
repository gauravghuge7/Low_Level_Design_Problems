import Tic_Tac_Toe.Tic_Tac_Toe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Tic_Tac_Toe game = new Tic_Tac_Toe();
        boolean isGameEnd = false;
        boolean isZero = true;


        /**
         *   Print the board Directions
         */

        game.showCellNames();

        while(!isGameEnd) {

            String cell = scan.next();

            /**
             *  is Zero or Cross
             */
            if(isZero) {
                if(game.insertContent(cell, isZero)) {
                    System.out.println("Zero is Win");
                    isGameEnd = true;
                }
                isZero = false;
            }
            else {
                if(game.insertContent(cell, isZero)) {
                    System.out.println("Cross is Win");
                    isGameEnd = true;
                }
                isZero = true;
            }



            if(isGameEnd) {
                System.out.println(" You Want to the Restart the Game if yes write true otherwise false");

                isGameEnd = !scan.nextBoolean();

                if(!isGameEnd) {
                    System.out.println("Game is Restarted");
                }
                game.resetBoard();
            }
        }

        scan.close();

    }
}