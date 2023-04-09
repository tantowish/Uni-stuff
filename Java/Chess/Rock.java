package PBOpraktek.UTS.soal3;

public class Rock extends Piece{

    public Rock(String color){
        super(color);
    }


    @Override
    public boolean isOnRule(Position newPosition){
        // Perubahan Di Sini
        // Cek dulu dengan IsInBoard dari Piece
        // Gunakan Keyword Super
        if(!super.isInBoard(position)){
            return false;
        }
        // Baru cek dengan aturan jalan rock/benteng
        return newPosition.x == this.position.x || newPosition.y == this.position.y;
    }

    @Override
    public boolean isEatRule(Position newPosition, Piece pieceInNewPos) {
        return pieceInNewPos == null;
    }

    public String toString(){
        return "Rock";
    }

}
