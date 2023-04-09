package PBOpraktek.UTS.soal3;

public class Knight extends Piece{
    public Knight(String color){
        super(color);
    }

    @Override
    public boolean isOnRule(Position newPosition){
        if (newPosition.x == this.position.x+1
                && newPosition.y == this.position.y+2){
            return true;
        }
        else if (newPosition.x == this.position.x-1
                && newPosition.y == this.position.y+2){
            return true;
        }
        else if (newPosition.x == this.position.x-2
                && newPosition.y == this.position.y+1){
            return true;
        }
        else if (newPosition.x == this.position.x-2
                && newPosition.y == this.position.y-1){
            return true;
        }
        else if (newPosition.x == this.position.x-1
                && newPosition.y == this.position.y-2){
            return true;
        }
        else if (newPosition.x == this.position.x+1
                && newPosition.y == this.position.y-2){
            return true;
        }
        else if (newPosition.x == this.position.x+2
                && newPosition.y == this.position.y+1){
            return true;
        }
        else return newPosition.x == this.position.x + 2
                    && newPosition.y == this.position.y - 1;
    }

    @Override
    public boolean isEatRule(Position newPosition, Piece pieceInNewPos) {
        return pieceInNewPos == null || !pieceInNewPos.color.equals(this.color);
    }

    public String toString(){
        return "Knight";
    }
}
