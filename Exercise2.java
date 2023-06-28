import java.io.Console;

public class Exercise2 {
    public static void main(String args[]) {
        int num1=0, num2=0;
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
        if(num1>num2){
            System.out.println("Luku "+num1+" on suurempi");
        }
        else{
            System.out.println("Luku "+num2+" on suurempi");
        }

        // System.out.println("Eka argumentti="+args[0]);
        // System.out.println("Toka argumentti="+args[1]);
    }
}
