import java.io.Console;

public class Exercise5 {
    public static void main(String[] args) {
        int[] numbers={0,0,0,0};  
        Console c = System.console();
       // System.out.println("Anna 1. luku"); 
       // numbers[0]=Integer.parseInt(c.readLine()); 
       // System.out.println("Taulukon 1. alkio="+numbers[0]);
       // System.out.println("Taulukon 2. alkio="+numbers[1]);
        for(int x=0; x<=3; x++){
            System.out.println("Anna "+(x+1)+". luku");
            numbers[x]=Integer.parseInt(c.readLine());
        }

        for(int x=0; x<=3; x++){
           System.out.println("Taulukon "+(x+1)+". alkio="+numbers[x]); 
        }

        for (int num : numbers) {
            System.out.println("Luku ="+num); 
        }
        for(int a=0; a<=3; a++){
            for(int b =a+1; b<=3; b++ ){
                if(numbers[a]>numbers[b]){
                    
                }
            }
        }
    }
}
