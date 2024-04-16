import java.util.*;
public class RemoveString {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter a string: ");
        String target = input.next();
        sentence = sentence.replace(" "+target,"");
        //sentence = sentence.substring(sentence.indexOf(target),sentence.indexOf(target)+target.length());
        System.out.print(sentence);
    }
}
