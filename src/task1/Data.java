package task1;

import task1.exceptions.WrongLoginException;
import task1.exceptions.WrongPasswordException;

public class Data {

    public static boolean isValidLogin(String login) throws WrongLoginException {
        String pattern = "\\w{1,20}";
        if (login.matches(pattern)) {
            return true;
        } else {
            throw new WrongLoginException("Неверный логин");
        }
    }

    private static boolean isValidPassword(String password) throws WrongPasswordException {
        String pattern = "\\w{1,20}";
        if (password.matches(pattern)) {
            return true;
        } else {
            throw new WrongPasswordException("Неверный пароль");
        }
    }

    private static boolean isPasswordConfirmed(String password, String confirmPassword) throws WrongPasswordException {
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    public static boolean isValidData(String login, String password, String confirmPassword) {

        try {
            return isValidLogin(login) &&
                    isValidPassword(password) &&
                    isPasswordConfirmed(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}
