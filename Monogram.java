import java.util.*;
public class Monogram {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first = input.next();
        System.out.print("Enter your middle initial: ");
        String middle = input.next();
        System.out.print("Enter your last name: ");
        String last = input.next();
        System.out.print("\nYour monogram is: "+first.toLowerCase().charAt(0)+last.toUpperCase().charAt(0)+middle.toLowerCase());
        input.close();
    }
}
