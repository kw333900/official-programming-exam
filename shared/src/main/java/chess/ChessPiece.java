package chess;

import java.util.Collection;
import java.util.Objects;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {

    private final ChessGame.TeamColor pieceColor;
    private final PieceType type;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.pieceColor = pieceColor;
        this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {

        return new piece_moves_calculator().calculate_piece_moves(board, myPosition);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChessPiece that = (ChessPiece) o;
        return pieceColor == that.pieceColor && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceColor, type);
    }



     /*
    knight:
    up_right (row+2, col+1)
    down_right (row-2, col+1)
    down_left (row-2, col-1)
    up_left (row+2, col-1)

    right_up (row+1, col+2)
    right_down (row-1, col+2)
    left_down (row-1, col-2)
    left_up (row+1, col-2)
     */





    /*
    white_pawn:
    if enemy:
        up_right (row+1, col+1)
        up_left (row+1, col-1)
    if (row+1, col) is empty:
        if on row 2:
            if up_twice (row+2, col) is empty:
                add both to list
    if next_position.getRow() == 8:
        add all promo types to list




    black_pawn:
    if enemy:
        down_right (row-1, col+1)
        down_left (row-1, col-1)
     */

}
