package Chess;

import BoardGame.Position;

public class ChessPosition {
    private char column; //abcdefgh
    private int row; //12345678

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8)
            throw new ChessException("Error instancing ChessPosition. Valid values are from a1 to h8");

        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    private int getMatrixRow(int row) {
        return 8 - row;
    }

    private int getMatrixColumn(int row) {
        return column - 'a';
    }

    protected Position toPosition() {
        return new Position(this.getMatrixRow(row), this.getMatrixColumn(column));
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
