package PBOpraktek.UTS.soal3;

public class King extends Piece {

    public King(String color){
        super(color);
    }

    @Override
    public boolean isOnRule(Position newPosition){
        return newPosition.x == this.position.x + 1 && newPosition.y == this.position.y
                || newPosition.y == this.position.y + 1 && newPosition.x== this.position.x
                || newPosition.x == this.position.x - 1 && newPosition.y == this.position.y
                || newPosition.y == this.position.y - 1 && newPosition.x== this.position.x
                || newPosition.x == this.position.x + 1 && newPosition.y == this.position.y + 1
                || newPosition.x == this.position.x - 1 && newPosition.y == this.position.y - 1
                || newPosition.x == this.position.x + 1 && newPosition.y == this.position.y - 1
                || newPosition.x == this.position.x - 1 && newPosition.y == this.position.y + 1;
    }

    @Override
    public boolean isEatRule(Position newPosition, Piece pieceInNewPos) {
        return pieceInNewPos == null;
    }

    public String toString(){
        return "King";
    }
}
