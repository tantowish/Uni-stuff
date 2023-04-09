package PBOpraktek.UTS.soal3;

public class Bishop extends Piece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean isOnRule(Position newPosition){
        return Math.abs(newPosition.x - this.position.x)
                == Math.abs(newPosition.y - this.position.y);
    }

    @Override
    public boolean isEatRule(Position newPosition, Piece pieceInNewPos) {
        return pieceInNewPos == null;
    }

    public String toString(){
        return "Bishop";
    }
}
