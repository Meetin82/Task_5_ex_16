package ru.vsu.cs.semenov_d_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int h = readNum();
        
        if (isNumberPositive(h)) {
            System.out.print("The number does not match the condition.");
            return;
        }

        printFigure(h);
    }

    private static void printFigure(int h) {
        for (int i = 0; i < h; i++) {
            printSpacesBeforeFigure(h, i);
            for (int k = h; k > i; k--) {
                printSpaceOrBackSlash(k);
            }
            System.out.println();
        }
    }

    private static void printSpacesBeforeFigure(int h, int i) {
        for (int j = h - i; j < h; j++) {
            System.out.print(" ");
        }
    }

    private static void printSpaceOrBackSlash(int k) {
        if (k % 2 == 0) {
            System.out.print(" ");
        } else {
            System.out.print("\\");
        }
    }

    private static boolean isNumberPositive(int num) {
        return num < 1;
    }

    private static int readNum() {
        System.out.print("Enter h (h >= 1): ");
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }
}
