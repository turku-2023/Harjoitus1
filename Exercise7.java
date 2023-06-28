import java.io.Console;

public class Exercise7 {
    public static void main(String args[]) {
        int number = 0;
        int sum = 0;
        int calc=1;
        Console c = System.console();
        while (number != -1) {
            sum = sum + number;
            System.out.println("Anna "+calc+". luku");
            try {
                number = Integer.parseInt(c.readLine());
                if(number<-1){
                    System.out.println("Annoit negatiivisen luvun, anna uusi luku");
                    sum = sum - number;
                    calc--;
                }
            } catch (Exception e) {
                System.out.println("Virhe. Anna luku uudestaan");
                sum=sum - number;
                calc--;
            }
            calc++;
            
            // tai lyhyemmin
            // sum += number;
        }
        System.out.println("Antamiesi lukujen summa=" + sum);
    }
}
