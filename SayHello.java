import java.io.Console;

public class SayHello {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Kerro nimesi");
        String fn = c.readLine();
        System.out.println("Terve " + fn);

        System.out.println("Anna kokonaisluku");
        try {
            int a = Integer.parseInt(c.readLine());
            System.out.println("Annoit luvun " + a);
        } catch (Exception e) {
            System.out.println("getMessage="+e.getMessage());
            System.out.println("hashCode="+e.hashCode());
            System.out.println("Et antanut kokonaislukua");
        }

    }
}