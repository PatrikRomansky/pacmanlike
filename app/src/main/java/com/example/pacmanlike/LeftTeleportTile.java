package com.example.pacmanlike;

public class LeftTeleportTile extends Tile {
    public LeftTeleportTile() {
        super(0);
        type = "LeftTeleport";
        drawableId = R.drawable.leftteleport;
        fillMoves();
    }

    private void fillMoves(){
        possibleMoves.add(new Vector(1,0));
        possibleMoves.add(new Vector(-1,0));
    }

    @Override
    public String toString() {
        return "L";
    }
}
