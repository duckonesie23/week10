import java.util.*;

public class AccountSetup{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String username = "";
        String password = "";
        System.out.print("Enter a user name: ");
        username = input.next();
        while(password.length()<=8){
            System.out.print("Enter a password that is at least 8 characters: ");
            password = input.next();
        }
        System.out.print("Your user name is "+username.toLowerCase()+" and your password is "+password.toLowerCase());
        input.close();
    }
}