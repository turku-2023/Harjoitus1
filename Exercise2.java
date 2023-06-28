import java.io.Console;

public class Exercise2 {
    public static void main(String args[]) {
        int num1 = 0, num2 = 0;
        Console c = System.console();
        System.out.println("Anna eka luku");
        try {
            num1 = Integer.parseInt(c.readLine());
        } catch (Exception e) {
            System.out.println("Et antanut kokonaislukua");
        }
        System.out.println("Anna toinen luku");
        try {
            num2 = Integer.parseInt(c.readLine());
        } catch (Exception e) {
            System.out.println("Et antanut kokonaislukua");
        }
        System.out.println("Valitse ");
        System.out.println("1=Tulostetaan pienempi ");
        System.out.println("2=Tulostetaan suurempi ");

        try {
            int choice = Integer.parseInt(c.readLine());
            if (choice == 1) {
                //smaller();
            } else if (choice == 2) {
                bigger(num1,num2);
            } else {
                System.out.println("Väärä valinta");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        // System.out.println("Eka argumentti="+args[0]);
        // System.out.println("Toka argumentti="+args[1]);
    }

    private static void bigger(int a, int b) {
        if (a > b) {
            System.out.println("Luku " + a + " on suurempi");
        } else {
            System.out.println("Luku " + b + " on suurempi");
        }
    }
}
