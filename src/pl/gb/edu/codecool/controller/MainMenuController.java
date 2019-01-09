package pl.gb.edu.codecool.controller;

import pl.gb.edu.codecool.view.MainMenu;

import java.util.Scanner;

public class MainMenuController {

    MainMenu mainMenu;

    public MainMenuController(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
        mainMenu.printMainMenu();
    }

    public void addMainMenuHandler() {

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        switch (choice) {
            case "q":
                System.out.println("No to pa");
                System.exit(0);
                break;
            case "1":
                System.out.println("1. lista obecnie dostępnych pojazdów");

                break;
            case "2":
                System.out.println("2. dodanie pojazdu do listy dostępnych pojazdów");
                break;
            case "3":
                System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
                break;
            case "4":
                System.out.println("4. szczegóły pojazdu");
                break;
            case "5":
                System.out.println("5. wypożyczanie pojazdu");
                break;
            case "6":
                System.out.println("6. zwrot pojazdu");
                break;
            default:
                System.out.println("Wybierz inną opcję");
                break;
        }
    }
}
