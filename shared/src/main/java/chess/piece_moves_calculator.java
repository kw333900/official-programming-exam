package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class piece_moves_calculator {



    public piece_moves_calculator (){

    }


    /*
    pseudocode for return list of valid moves for a piece:
    - determine piece type
    - if piece is in bounds, check all of its directions
    - if space is empty, add to list
    - if space is not empty, check if enemy, if enemy add to list and break
    - return list after all directions
     */




    public Collection<ChessMove> calculate_piece_moves (ChessBoard board, ChessPosition myPosition) {
        ArrayList<ChessMove> list_of_valid_moves = new ArrayList<>();
        ChessPiece piece = board.getPiece(myPosition);







        /*
    bishop:
    up_right (row+1, col+1)
    down_right (row-1, col+1)
    down_left (row-1, col-1)
    up_left (row+1, col-1)
     */
        if (piece.getPieceType() == ChessPiece.PieceType.BISHOP) {


            // up_right (row+1, col+1):
            ChessPosition next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() + 1, next_position.getColumn() + 1);
            }


            // down_right (row-1, col+1):
            next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() - 1, next_position.getColumn() + 1);
            }


            // down_left (row-1, col-1):
            next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() - 1, next_position.getColumn() - 1);
            }


            // up_left (row+1, col-1):
            next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() + 1, next_position.getColumn() - 1);
            }


            return list_of_valid_moves;
        }


        if (piece.getPieceType() == ChessPiece.PieceType.ROOK) {


            // up (row+1, col):
            ChessPosition next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn());
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() + 1, next_position.getColumn());
            }


            // right (row, col+1):
            next_position = new ChessPosition(myPosition.getRow(), myPosition.getColumn() + 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow(), next_position.getColumn() + 1);
            }


            // down (row-1, col):
            next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn());
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() - 1, next_position.getColumn());
            }


            // left (row, col-1):
            next_position = new ChessPosition(myPosition.getRow(), myPosition.getColumn() - 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow(), next_position.getColumn() - 1);
            }


            return list_of_valid_moves;
        }


        if (piece.getPieceType() == ChessPiece.PieceType.QUEEN) {


            // up (row+1, col):
            ChessPosition next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn());
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() + 1, next_position.getColumn());
            }


            // right (row, col+1):
            next_position = new ChessPosition(myPosition.getRow(), myPosition.getColumn() + 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow(), next_position.getColumn() + 1);
            }


            // down (row-1, col):
            next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn());
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() - 1, next_position.getColumn());
            }


            // left (row, col-1):
            next_position = new ChessPosition(myPosition.getRow(), myPosition.getColumn() - 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow(), next_position.getColumn() - 1);
            }

// ---------------------------------------------division between queen movements-------------------------------------------------------
            // up_right (row+1, col+1):
            next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() + 1, next_position.getColumn() + 1);
            }


            // down_right (row-1, col+1):
            next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() - 1, next_position.getColumn() + 1);
            }


            // down_left (row-1, col-1):
            next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() - 1, next_position.getColumn() - 1);
            }


            // up_left (row+1, col-1):
            next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 1);
            while (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                    break;
                }
                next_position = new ChessPosition(next_position.getRow() + 1, next_position.getColumn() - 1);
            }


            return list_of_valid_moves;
        }


        if (piece.getPieceType() == ChessPiece.PieceType.KING) {


            // up (row+1, col):
            ChessPosition next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn());
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // right (row, col+1):
            next_position = new ChessPosition(myPosition.getRow(), myPosition.getColumn() + 1);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // down (row-1, col):
            next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn());
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // left (row, col-1):
            next_position = new ChessPosition(myPosition.getRow(), myPosition.getColumn() - 1);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }

// ---------------------------------------------division between king movements-------------------------------------------------------
            // up_right (row+1, col+1):
            next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 1);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // down_right (row-1, col+1):
            next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 1);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // down_left (row-1, col-1):
            next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 1);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // up_left (row+1, col-1):
            next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 1);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            return list_of_valid_moves;
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
        if (piece.getPieceType() == ChessPiece.PieceType.KNIGHT) {


            // right_up (row+1, col+2):
            ChessPosition next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 2);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // right_down (row-1, col+2):
            next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 2);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // left_down (row-1, col-2):
            next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 2);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // left_up (row+1, col-2):
            next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 2);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }

// ---------------------------------------------division between knight movements-------------------------------------------------------
            // up_right (row+2, col+1):
            next_position = new ChessPosition(myPosition.getRow() + 2, myPosition.getColumn() + 1);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // down_right (row-2, col+1):
            next_position = new ChessPosition(myPosition.getRow() - 2, myPosition.getColumn() + 1);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // down_left (row-2, col-1):
            next_position = new ChessPosition(myPosition.getRow() - 2, myPosition.getColumn() - 1);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            // up_left (row+2, col-1):
            next_position = new ChessPosition(myPosition.getRow() + 2, myPosition.getColumn() - 1);
            if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                if (board.getPiece(next_position) == null) {
                    list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                } else {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }
            }


            return list_of_valid_moves;
        }



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
        if (piece.getPieceType() == ChessPiece.PieceType.PAWN) {


            if (piece.getTeamColor() == ChessGame.TeamColor.WHITE) {


                // up and up_twice:
                ChessPosition next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn());
                if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                    ChessPosition up_twice_position = new ChessPosition(myPosition.getRow() + 2, myPosition.getColumn());
                    if (board.getPiece(next_position) == null) {
                        if (next_position.getRow() == 8) {
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.QUEEN));
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.ROOK));
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.BISHOP));
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.KNIGHT));
                        } else if (myPosition.getRow() == 2 && board.getPiece(up_twice_position) == null) {
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                            list_of_valid_moves.add(new ChessMove(myPosition, up_twice_position, null));
                        } else {
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                        }
                    }
                }


                // up_right (row+1, col+1):
                next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 1);
                if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (board.getPiece(next_position) != null && piece.getTeamColor() != next_piece.getTeamColor() && next_position.getRow() == 8) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.QUEEN));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.ROOK));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.BISHOP));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.KNIGHT));

                    } else if (board.getPiece(next_position) != null && piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }


                // up_left (row+1, col-1):
                next_position = new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 1);
                if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (board.getPiece(next_position) != null && piece.getTeamColor() != next_piece.getTeamColor() && next_position.getRow() == 8) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.QUEEN));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.ROOK));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.BISHOP));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.KNIGHT));

                    } else if (board.getPiece(next_position) != null && piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }


            }


            if (piece.getTeamColor() == ChessGame.TeamColor.BLACK) {


                // down and down_twice:
                ChessPosition next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn());
                if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                    ChessPosition down_twice_position = new ChessPosition(myPosition.getRow() - 2, myPosition.getColumn());
                    if (board.getPiece(next_position) == null) {
                        if (next_position.getRow() == 1) {
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.QUEEN));
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.ROOK));
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.BISHOP));
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.KNIGHT));
                        } else if (myPosition.getRow() == 7 && board.getPiece(down_twice_position) == null) {
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                            list_of_valid_moves.add(new ChessMove(myPosition, down_twice_position, null));
                        } else {
                            list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                        }
                    }
                }


                // down_right (row-1, col+1):
                next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 1);
                if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (board.getPiece(next_position) != null && piece.getTeamColor() != next_piece.getTeamColor() && next_position.getRow() == 1) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.QUEEN));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.ROOK));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.BISHOP));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.KNIGHT));

                    } else if (board.getPiece(next_position) != null && piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }


                // down_left (row-1, col-1):
                next_position = new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 1);
                if (next_position.getRow() > 0 && next_position.getRow() < 9 && next_position.getColumn() > 0 && next_position.getColumn() < 9) {
                    ChessPiece next_piece = board.getPiece(next_position);
                    if (board.getPiece(next_position) != null && piece.getTeamColor() != next_piece.getTeamColor() && next_position.getRow() == 1) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.QUEEN));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.ROOK));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.BISHOP));
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, ChessPiece.PieceType.KNIGHT));

                    } else if (board.getPiece(next_position) != null && piece.getTeamColor() != next_piece.getTeamColor()) {
                        list_of_valid_moves.add(new ChessMove(myPosition, next_position, null));
                    }
                }


            }
            return list_of_valid_moves;
        }








        return list_of_valid_moves;


    }





//        return List.of();
    }


