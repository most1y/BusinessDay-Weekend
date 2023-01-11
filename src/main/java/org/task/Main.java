package org.task;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.print("Choose one day of the week in English and CAPITAL first letter: ");
        switch (day.nextLine()) {

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println(" = Business day :)");

            case "Saturday", "Sunday" -> System.out.println(" = Weekend :)");

            default -> System.out.println("Your answer contains error!");
        }
    }
}