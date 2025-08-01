package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Hello, " + fullName);
        System.out.println("I am learning Java to become proficient in backend development.");
        System.out.println("My career goal is to become a full-stack software engineer.");
    }
}
