package android.com;


import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        // write your code here
        char i[][]=new char [3][3];
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        int counter= 0;
        char player1 = 'o';
        char player2 = 'x';
        int j,k;
        outer:
        for(j=0;j<i.length;j++) {
            for (k = 0; k < i[j].length; k++) {
                if (counter == 0) {
                    System.out.println("Input Player 1(your symbol is o)");
                    char input1 = a.next(".").charAt(0);
                    System.out.println("which row? 0 or 1 or 2?");
                    int row = c.nextInt();
                    System.out.println("which column? 0 or 1 or 2?");
                    int col = d.nextInt();
                    if (row == 0 || row == 1 || row == 2 && col == 0 || col == 1 || col == 2) {
                        i[row][col] = input1;
                        System.out.println(" " + i[0][0] + "   | " + i[0][1] + "  | " + i[0][2] + " ");
                        System.out.println("__________________");
                        System.out.println(" " + i[1][0] + "   | " + i[1][1] + "  | " + i[1][2] + " ");
                        System.out.println("__________________");
                        System.out.println(" " + i[2][0] + "   | " + i[2][1] + "  | " + i[2][2] + " ");
                        counter = counter + 1;
                    }
                } else {
                    if (counter == 1) {
                        System.out.println("Input Player 2(your symbol is x)");
                        char input2 = b.next(".").charAt(0);
                        System.out.println("which row? 0 or 1 or 2?");
                        int row = c.nextInt();
                        System.out.println("which column? 0 or 1 or 2?");
                        int col = d.nextInt();
                        if (row == 0 || row == 1 || row == 2 && col == 0 || col == 1 || col == 2) {
                            i[row][col] = input2;
                            System.out.println(" " + i[0][0] + "   | " + i[0][1] + "  | " + i[0][2] + " ");
                            System.out.println("__________________");
                            System.out.println(" " + i[1][0] + "   | " + i[1][1] + "  | " + i[1][2] + " ");
                            System.out.println("__________________");
                            System.out.println(" " + i[2][0] + "   | " + i[2][1] + "  | " + i[2][2] + " ");
                            counter = counter - 1;
                        }
                    }
                }
                if(i[0][0] == i[0][1] && i[0][0] == i[0][2] && i[0][1]==i[0][2]) {
                    switch (i[0][0]) {
                        case 'o':
                            System.out.println("Player 1 wins");
                            break outer;
                        case 'x':
                            System.out.println("player 2 wins");
                            break outer;
                    }
                }
                if(i[0][0] == i[1][0] && i[0][0] == i[2][0] && i[1][0]==i[2][0]) {
                    switch (i[0][0]) {
                        case 'o':
                            System.out.println("Player 1 wins");
                            break outer;
                        case 'x':
                            System.out.println("player 2 wins");
                            break outer;
                    }
                }
                if(i[0][0] == i[1][0] && i[0][0] == i[2][0] && i[1][0]==i[2][0]) {
                        switch (i[0][0]) {
                            case 'o':
                                System.out.println("Player 1 wins");
                                break outer;
                            case 'x':
                                System.out.println("player 2 wins");
                                break outer;
                        }
                }
                if(i[1][0] == i[1][1] && i[1][0] == i[1][2] && i[1][1]==i[1][2]) {
                    switch (i[1][0]) {
                        case 'o':
                            System.out.println("Player 1 wins");
                            break outer;
                        case 'x':
                            System.out.println("player 2 wins");
                            break outer;
                    }
                }
                if(i[0][1] == i[1][1] && i[0][1] == i[2][1] && i[1][1]==i[2][1]) {
                    switch (i[0][1]) {
                        case 'o':
                            System.out.println("Player 1 wins");
                            break outer;
                        case 'x':
                            System.out.println("player 2 wins");
                            break outer;
                    }
                }
                if(i[2][0] == i[2][1] && i[2][0] == i[2][2] && i[2][1]==i[2][2]) {
                    switch (i[2][0]) {
                        case 'o':
                            System.out.println("Player 1 wins");
                            break outer;
                        case 'x':
                            System.out.println("player 2 wins");
                            break outer;
                    }
                }
                if(i[0][2] == i[1][2] && i[0][2] == i[2][2] && i[1][2]==i[2][2]) {
                    switch (i[0][2]) {
                        case 'o':
                            System.out.println("Player 1 wins");
                            break outer;
                        case 'x':
                            System.out.println("player 2 wins");
                            break outer;
                    }
                }
                if(i[0][0] == i[1][1] && i[0][0] == i[2][2] && i[1][1]==i[2][2]) {
                    switch (i[0][0]) {
                        case 'o':
                            System.out.println("Player 1 wins");
                            break outer;
                        case 'x':
                            System.out.println("player 2 wins");
                            break outer;
                    }
                }
                if(i[0][2] == i[1][1] && i[0][2] == i[2][0] && i[1][1]==i[2][0]) {
                    switch (i[0][2]) {
                        case 'o':
                            System.out.println("Player 1 wins");
                            break outer;
                        case 'x':
                            System.out.println("player 2 wins");
                            break outer;
                    }
                }
                    }
                }
            }
        }
//151 lines of code