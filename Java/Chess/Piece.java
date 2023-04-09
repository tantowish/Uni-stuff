package PBOpraktek.UTS.soal3;

public class Piece {
    Position position;
    String color;
    Piece [][] board;

    public Piece(String color) {
        this.color = color;
        board = new Piece[8][8];
    }

    public boolean isInBoard(Position newPosition){
        return newPosition.x >= 0 && newPosition.y >= 0
                && newPosition.x < 8 && newPosition.y < 8;
    }

    public boolean isOnRule(Position newPosition){
        return true;
    }

    public boolean isEatRule(Position newPosition, Piece pieceInNewPos){
        return true;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Piece getPiece(Position position){
        return board[position.x][position.y];
    }

    public void setPiece(Piece piece, Position position){
        board[position.x][position.y] = piece;
        piece.setPosition(position);
    }

    public void move(Piece piece, Position newPosition){
        Position oldPosition = piece.position;
        if(piece.isInBoard(newPosition) && piece.isOnRule(newPosition) && piece.isEatRule(newPosition, getPiece(newPosition))){
            board[oldPosition.x][oldPosition.y] = null;
            board[newPosition.x][newPosition.y] = piece;
            piece.setPosition(newPosition);
            System.out.println(piece + " Berhasil Bergerak");
        }else{
            System.out.println(piece + " Gagal Bergerak");
        }
    }

    public void printBoard() {
        for (int i = 0; i < 8 ; i++ ) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[j][i] + "  |  ");
            }
            System.out.println();
        }
    }

}
