import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Book sciLit = new Book("hello", "my", "name");
        sciLit.setAuthor("Charles Darwin");
        sciLit.setTitle("Origin of Species");
        sciLit.setDescription("on Evolution");
        sciLit.setInStock("Unavailable");
        sciLit.setPrice(5.99);

        Book history = new Book("Dereliction of Duty", "H.R. McMaster", "on the Handling of The Vietnam War");
        System.out.println(sciLit.getDisplayText());
        System.out.println(sciLit.getPrice(sciLit.getInStock()));
    }
}
