package com.company;

public class User {
    protected int U_X;
    protected int U_Y;

    //constractor vase ijade Useram


    public User(int u_X, int u_Y) {
        U_X = u_X;
        U_Y = u_Y;
    }

    //metod get vase protectam
    public int getU_X() {return U_X; }

    public int getU_Y() {return U_Y;}

    public void setU_X(int U_x) {
        this.U_X = U_x;
    }

    public void setU_Y(int U_y) {
        this.U_Y = U_y;
    }


    void Move(String move) {
        if (move.equals("s")) {
            setU_X(U_X + 1);
        } else if (move.equals("w")) {
            setU_X(U_X - 1);
        } else if (move.equals("a")) {
            setU_Y(U_Y - 1);
        } else if (move.equals("d")) {
            setU_Y(U_Y + 1);
        }
    }

//    void set_XY(int X, int Y) {
//        U_X = X;
//        U_Y = Y;
//    }
}
