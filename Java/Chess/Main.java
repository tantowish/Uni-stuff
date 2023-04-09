package PBOpraktek.UTS.soal3;

public class Main {
    public static void main(String[] args){
        // King
        King rajaPutih = new King("Putih");
        King rajaHitam = new King("Hitam");

        // Queen
        Queen ratuPutih = new Queen("Putih");
        Queen ratuHitam = new Queen("Hitam");

        // Rock
        Rock bentengPutih1 = new Rock("Putih");
        Rock bentengPutih2 = new Rock("Putih");
        Rock bentengHitam1 = new Rock("Hitam");
        Rock bentengHitam2 = new Rock("Hitam");

        // Knight
        Knight kudaPutih1 = new Knight("Putih");
        Knight kudaPutih2 = new Knight("Putih");
        Knight kudaHitam1 = new Knight("Hitam");
        Knight kudaHitam2 = new Knight("Hitam");

        // Bishop
        Bishop menteriPutih1 = new Bishop("Putih");
        Bishop menteriPutih2 = new Bishop("Putih");
        Bishop menteriHitam1 = new Bishop("Hitam");
        Bishop menteriHitam2 = new Bishop("Hitam");

        // Pawn
        Pawn pionPutih1 = new Pawn("Putih");
        Pawn pionPutih2 = new Pawn("Putih");
        Pawn pionPutih3 = new Pawn("Putih");
        Pawn pionPutih4 = new Pawn("Putih");
        Pawn pionPutih5 = new Pawn("Putih");
        Pawn pionPutih6 = new Pawn("Putih");
        Pawn pionPutih7 = new Pawn("Putih");
        Pawn pionPutih8 = new Pawn("Putih");
        Pawn pionHitam1 = new Pawn("Hitam");
        Pawn pionHitam2 = new Pawn("Hitam");
        Pawn pionHitam3 = new Pawn("Hitam");
        Pawn pionHitam4 = new Pawn("Hitam");
        Pawn pionHitam5 = new Pawn("Hitam");
        Pawn pionHitam6 = new Pawn("Hitam");
        Pawn pionHitam7 = new Pawn("Hitam");
        Pawn pionHitam8 = new Pawn("Hitam");

        // buat papan catur baru
        // Catur putih di atas
        // Catur hitam di bawah
        Piece game = new Piece("putih");

        // Papan Catur
        game.setPiece(rajaPutih, new Position(3,0));
        game.setPiece(ratuPutih, new Position(4,0));
        game.setPiece(bentengPutih1, new Position(0,0));
        game.setPiece(bentengPutih2, new Position(7,0));
        game.setPiece(kudaPutih1, new Position(1,0));
        game.setPiece(kudaPutih2, new Position(6,0));
        game.setPiece(menteriPutih1, new Position(2,0));
        game.setPiece(menteriPutih2, new Position(5,0));
        game.setPiece(pionPutih1, new Position(0,1));
        game.setPiece(pionPutih2, new Position(1,1));
        game.setPiece(pionPutih3, new Position(2,1));
        game.setPiece(pionPutih4, new Position(3,1));
        game.setPiece(pionPutih5, new Position(4,1));
        game.setPiece(pionPutih6, new Position(5,1));
        game.setPiece(pionPutih7, new Position(6,1));
        game.setPiece(pionPutih8, new Position(7,1));

        game.setPiece(rajaHitam, new Position(4,7));
        game.setPiece(ratuHitam, new Position(3,7));
        game.setPiece(bentengHitam1, new Position(0,7));
        game.setPiece(bentengHitam2, new Position(7,7));
        game.setPiece(kudaHitam1, new Position(1,7));
        game.setPiece(kudaHitam2, new Position(6,7));
        game.setPiece(menteriHitam1, new Position(2,7));
        game.setPiece(menteriHitam2, new Position(5,7));
        game.setPiece(pionHitam1, new Position(0,6));
        game.setPiece(pionHitam2, new Position(1,6));
        game.setPiece(pionHitam3, new Position(2,6));
        game.setPiece(pionHitam4, new Position(3,6));
        game.setPiece(pionHitam5, new Position(4,6));
        game.setPiece(pionHitam6, new Position(5,6));
        game.setPiece(pionHitam7, new Position(6,6));
        game.setPiece(pionHitam8, new Position(7,6));

        // Move

        game.move(pionPutih1, new Position(0,2)); // Berhasil
        game.move(kudaPutih1, new Position(2,2)); // berhasil
        game.move(kudaPutih1, new Position(3,4)); // berhasil
        game.move(kudaPutih1, new Position(4,6)); // berhasil



                /*
        game.move(pionPutih2, new Position(1,3)); // Berhasil
        game.move(pionPutih4, new Position(3,2)); // Berhasil
        game.move(kudaHitam1, new Position(2,5)); // Berhasil
        game.move(menteriPutih1, new Position(1,1)); // Berhasil
        game.move(bentengPutih1, new Position(0,2)); // Gagal karena ada pion 1
        game.move(pionHitam4, new Position(3,4)); // Berhasil
        game.move(ratuHitam, new Position(3,5)); // Berhasil
        game.move(ratuHitam, new Position(7,5)); // Berhasil
        game.move(rajaHitam, new Position(3,7)); // Berhasil
        game.move(bentengHitam1, new Position(0,4)); // Berhasil tapi melompat seperti kuda
        game.move(bentengHitam1, new Position(7,4)); // Berhasil
        game.move(kudaHitam1, new Position(1,3)); // Berhasil Memakan Pawn Putih 2
        game.move(pionPutih1, new Position(1,3)); // Gagal (Seharusnya berhasil bisa memakan kuda) * belum selesai

         */

        game.printBoard();
    }

}

