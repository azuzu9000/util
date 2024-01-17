package com.dev.util_program;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println("Hello, " + input);
    }
}
