import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        String user_name;

        System.out.print("Jericho Gamis: ");
        user_name = user_input.next();

        System.out.println("Jericho Gamis: " + user_name);
    }
}
