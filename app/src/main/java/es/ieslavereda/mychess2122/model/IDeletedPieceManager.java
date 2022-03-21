package es.ieslavereda.mychess2122.model;

import es.ieslavereda.mychess2122.model.ChessType;
import es.ieslavereda.mychess2122.model.Piece;

public interface IDeletedPieceManager {
    void add(Piece piece);
    void remove(Piece piece);
    int count(ChessType chessType);
}