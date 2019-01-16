package pl.gb.edu.codecool.view;

import pl.gb.edu.codecool.exception.BadIntegerNumberException;

import java.util.Scanner;

public class ViewUtil {

    String getStringValue() {
        return getUserChoice();
    }

    public int getIntegerValue() {
        int id;
        while (true) {
            try {
                id = getInteger();
                break;
            } catch (BadIntegerNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        return id;
    }

    private int getInteger() throws BadIntegerNumberException {
        int number;
        try {
            number = Integer.parseInt(getUserChoice());
        } catch (NumberFormatException e) {
            throw new BadIntegerNumberException("Podałeś złą wartość. Spróbuj ponownie!");
        }
        return number;
    }

    public String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void closeApplication() {
        System.out.println("No to kończymy! Pa!");
        System.exit(0);
    }
}
