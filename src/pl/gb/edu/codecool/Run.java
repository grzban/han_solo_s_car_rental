package pl.gb.edu.codecool;

import pl.gb.edu.codecool.controller.MainMenuController;
import pl.gb.edu.codecool.view.MainMenu;

public class Run {

    public static void main(String[] args) {

        MainMenu mainMenu = new MainMenu();
        MainMenuController mainMenuController = new MainMenuController(mainMenu);
        while (true) {
            mainMenuController.addMainMenuHandler();
        }
    }
}
