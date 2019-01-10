package pl.gb.edu.codecool;

import pl.gb.edu.codecool.controller.MainMenuController;
import pl.gb.edu.codecool.view.Menus;

public class Run {

    public static void main(String[] args) {

        Menus menus = new Menus();
        MainMenuController mainMenuController = new MainMenuController(menus);
        while (true) {
            mainMenuController.addMainMenuHandler();
        }
    }
}
