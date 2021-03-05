package com.example.pacmanlike;

public class Home {
    // Singleton
    public static Home instance;

    public static int SIZE_X = 3;
    public static int SIZE_Y = 2;

    // How does a home look like? This is signature in terms of making how does the tiles look like.
    // We can check them in parse
    public static String[][] SIGNATURE = {{"S0","S0","S0"},{"A1","A2","A3"}};

    Vector firstCoords;
    Vector lastCoords() {return new Vector(firstCoords.x + SIZE_X, firstCoords.y + SIZE_Y);}

    public Home(int x, int y) throws Exception {
        firstCoords = new Vector(x,y);

        if (instance == null) {
            instance = this;
        }
    }
}
