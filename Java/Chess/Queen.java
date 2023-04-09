package PBOpraktek.UTS.soal3;

public class Queen extends Piece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean isOnRule(Position newPosition){
        return newPosition.x == this.position.x || newPosition.y == this.position.y
                || Math.abs(newPosition.x - this.position.x) == Math.abs(newPosition.y - this.position.y);
    }

    @Override
    public boolean isEatRule(Position newPosition, Piece pieceInNewPos) {
        return pieceInNewPos == null;
    }

    public String toString(){
        return "Queen";
    }
}
