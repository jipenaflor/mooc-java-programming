
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};
        
        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        
        if ((name.equals(username[0]) && pass.equals(password[0])) || (name.equals(username[1]) && pass.equals(password[1]))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        
    }
}
