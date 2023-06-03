package todolist.views;

import java.util.Scanner;

public class WelcomeViews {
    public static void main(String[] args) {
        ShowWelcomeView();
    }

    public static void ShowWelcomeView() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Welcome to My To Do Apps");
        System.out.println("========================");
        System.out.println();
        System.out.println("[1] - Login Page");
        System.out.println("[2] - Create Account");
        System.out.println("[0] - Exit");
        System.out.println();
        System.out.println("Input Menu (number)");
        Integer menu = inputScanner.nextInt();

        switch (menu) {
            case 1 :
            LoginView.ShowLoginPage();
            break;
            case 2 :
            UserView.ShowUserMain();
            break;
            case 0 :
            WelcomeViews.ShowWelcomeView();
            break;
        }
        inputScanner.close();
    }
}