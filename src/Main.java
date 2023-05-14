import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import UI.UI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChessMatch cm = new ChessMatch();
        Scanner sc = new Scanner(System.in);
        while (true) {
           try {
               UI.clearScreen();
               UI.printBoard(cm.getPieces());

               System.out.println();
               System.out.println("Source: ");
               ChessPosition src = UI.readChessPosition(sc);

               System.out.println("Target: ");
               ChessPosition target = UI.readChessPosition(sc);


               ChessPiece capturedPiece = cm.performChessMove(src, target);
           } catch (ChessException chessException) {
               System.out.println(chessException.getMessage());
               sc.nextLine();
           } catch (InputMismatchException e) {
               System.out.println(e.getMessage());
               sc.nextLine();
           }
        }
    }
}