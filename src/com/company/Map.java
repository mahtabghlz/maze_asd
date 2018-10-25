package com.company;

public class Map {

    protected int x;
    protected int y;
    protected String[][] gameBoard = {
            {"#"," ","#","#","#","#","#","#"," ","#"},
            {"#"," ","#"," "," "," "," "," "," ","#"},
            {"#"," ","#","#","#","#"," ","#"," ","#"},
            {"#"," "," ","#"," ","#","#","#"," ","#"},
            {"#","#"," "," ","#","#"," ","#"," ","#"},
            {"#"," "," "," ","#"," ","#","#"," ","#"},
            {"#"," ","#"," ","#"," ","#"," "," ","#"},
            {"#"," ","#"," "," "," "," "," "," ","#"},
            {"#"," ","#"," "," "," ","#","#"," ","#"},
            {"#","#","#","#","#","#","#","#","#","#"},
    };

//    public Map(int x, int y) {
//        this.x = x;
//        this.y = y;
//        gameBoard = new String[x][y];
//        for (int i = 0; i < x ; i++) {
//            for (int j = 0; j < y ; j++) {
//                gameBoard[i][j] = "+";
//            }
//        }
//    }


    public Map(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display(int ux, int uy){
        gameBoard[ux][uy] = "(*)";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.format("%6s", gameBoard[i][j]);
            }
            System.out.println("\n");
        }
    }

    public Boolean endOfGame(int x, int y, int ex, int ey){
        Boolean end = false;
        if(x == ex && y == ey)
            end = true;
        return end;
    }

    public void setMap(int x, int y){
        gameBoard[x][y] = " ";
    }
}
