package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map map = new Map(10, 10);
        User user = new User(0, 1);
        EndPoint endPoint = new EndPoint(0, 8);
        map.gameBoard[user.getU_X()][user.getU_Y()] = "(*)";
        map.gameBoard[endPoint.getEndX()][endPoint.getEndY()] = "end";

        do {
            map.display(user.getU_X(), user.getU_Y());
            System.out.println("enter move :");
            String move = scanner.next();

//            if (move.equals("s") && !map.gameBoard[user.getU_X() + 1][user.getU_Y()].equals("#"))
//                user.Move(move);
//            else System.out.println("try again");

            switch (move) {
                case "s":
                    if (!map.gameBoard[user.getU_X() + 1][user.getU_Y()].equals("#")) {
                        if (map.gameBoard[user.getU_X() + 1][user.getU_Y()].equals(" "))
                            map.setMap(user.getU_X(),user.getU_Y());
                        user.Move(move);
                        break;
                    }
                case "w":
                    if (!map.gameBoard[user.getU_X() - 1][user.getU_Y()].equals("#")) {
                        if (map.gameBoard[user.getU_X() - 1][user.getU_Y()].equals("(*)"))
                            map.setMap(user.getU_X(),user.getU_Y());
                        user.Move(move);
                        break;
                    }
                case "a":
                    if (!map.gameBoard[user.getU_X()][user.getU_Y() - 1].equals("#")) {
                        if (map.gameBoard[user.getU_X()][user.getU_Y() - 1].equals("(*)"))
                            map.setMap(user.getU_X(),user.getU_Y());
                        user.Move(move);
                        break;
                    }
                case "d":
                    if (!map.gameBoard[user.getU_X()][user.getU_Y() + 1].equals("#")) {
                        if (map.gameBoard[user.getU_X()][user.getU_Y() + 1].equals("(*)"))
                            map.setMap(user.getU_X(),user.getU_Y());
                        user.Move(move);
                        break;
                    }
                default:
                    System.out.println("this is '#' Please Try Again ...");
                    break;
            }

        } while (!map.endOfGame(user.getU_X(), user.getU_Y(), endPoint.getEndX(), endPoint.getEndY()));
        System.out.println("YOU WIIIIIIIIIIIIIIIIINNNNNNNNNNNNN............");
    }
}


