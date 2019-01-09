package pl.gb.edu.codecool.view;

public class MainMenu {

    public void printMainMenu() {
        System.out.println("Wypożyczalnia pojazdów Hana Solo");
        System.out.println("1. lista obecnie dostępnych pojazdów");
        System.out.println("2. dodanie pojazdu do listy dostępnych pojazdów");
        System.out.println("3. usunięcie pojazdu z listy dostępnych pojazdów");
        System.out.println("4. szczegóły pojazdu");
        System.out.println("5. wypożyczanie pojazdu");
        System.out.println("6. zwrot pojazdu");
    }

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
