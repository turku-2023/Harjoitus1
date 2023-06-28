import java.io.Console;

public class Exercise10 {
    /*
     * Tee ohjelma, joka kysyy käyttäjältä lainan summan, kuukausittaisen lyhennyssumman ja korkoprosentin. Ohjelma tulostaa näytölle lainanhoitosuunnitelman, eli jokaiselta kuukaudelta lyhennyksen suuruuden, maksetun koron ja jäljellä olevan lainasumman. Kuukaudessa on 30 360 korkopäivää. Lainaa lyhennetään kuukausittain lyhennyssumman verran ja samalla maksetaan kyseisenä kuukautena kertyneet lainan korot. Käytössä on siis tasalyhennys.
     */
    public static void main(String args[]) {
        double loan=0;
        double monthPayment=0;
        double leftLoan;
        double ratePros=0;
        int p;
        Console c=System.console();
        System.out.println("Anna lainasumma");
        loan=Double.parseDouble(c.readLine());
        System.out.println("Anna kuukausi lyhennyksen suuruus");
        monthPayment=Double.parseDouble(c.readLine());
        System.out.println("Anna korkoprosentti");
        ratePros=Double.parseDouble(c.readLine());
        p=(int) (loan/monthPayment);

        System.out.println("Maksueria on "+p);
        for (int x=1; x<=p; x++){
            System.out.println("ERA:"+x);
            leftLoan=loan-(x*monthPayment);
            System.out.println("Lyhennys="+monthPayment);
            double r=Math.round((ratePros/1200*leftLoan)*100)/100;
            System.out.println("Korko="+r);
            System.out.println("Jaljella oleva laina="+leftLoan);
            System.out.println("__________________________");

        }
    }
}
