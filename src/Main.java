import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import UI.UI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChessMatch cm = new ChessMatch();
        Scanner sc = new Scanner(System.in);
        while (true) {
            UI.printBoard(cm.getPieces());

            System.out.println();
            System.out.println("Source: ");
            ChessPosition src = UI.readChessPosition(sc);

            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);


            ChessPiece capturedPiece = cm.performChessMove(src, target);
        }
    }
}