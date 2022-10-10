import task1.Data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String login;
        String password;
        String confirmPassword;
        Scanner console = new Scanner(System.in);
        boolean dataConfirmed;
        do {
            System.out.print("login: ");
            login = console.nextLine();
            System.out.print("password: ");
            password = console.nextLine();
            System.out.print("confirm password: ");
            confirmPassword = console.nextLine();
            dataConfirmed = Data.isValidData(login, password, confirmPassword);
            System.out.println("Data confirmed: " + dataConfirmed);
        } while (!dataConfirmed);
    }
}