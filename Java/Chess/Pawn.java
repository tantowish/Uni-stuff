package PBOpraktek.UTS.soal3;

public class Pawn extends Piece{
    public Pawn(String color){
        super(color);
    }

    @Override
    public boolean isOnRule(Position newPosition){
        if(color.equals("Putih")){
            return newPosition.x == this.position.x
                    && newPosition.y == this.position.y + 1;
//                    || newPosition.x == this.position.x
//                    && newPosition.y == this.position.y + 2;
        }else{
            return newPosition.x == this.position.x
                    && newPosition.y == this.position.y - 1;
//                    || newPosition.x == this.position.x
//                    && newPosition.y == this.position.y - 2;
        }
    }

    @Override
    public boolean isEatRule(Position newPosition, Piece pieceInNewPos) {
        return pieceInNewPos == null;
    }

    public String toString(){
        return "Pawn";
    }

}
