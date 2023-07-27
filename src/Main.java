import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Iz katere v katero enoto zelite pretvorbo:");
        System.out.println();
        System.out.println("1. Celzije --> Fahrenheite");
        System.out.println("2. Fahrenheite --> Celzije");
        System.out.println("-----------------------------");
        int cifra = sc.nextInt();
        //tuki zgori zdej dobimo v kaj hoemo pretvorit


        // in funkcija vrne temperaturo, zdej jo mormo pa se pretvorit


        System.out.println("-----------------------------");

        Scanner scanner = new Scanner(System.in);
        if(cifra == 1){
            //izpisemo napisite stopinje celzije da pretvorim v fahrenheite
            System.out.println("Napisite °C da pretvorimo v °F");

        }
        else if (cifra == 2) {
            //izpisemo napisite fahrneheite da pretvorim v celzije
            System.out.println("Napisite °F da pretvorimo v °C");

        }
        else{
            System.out.println("Nekaj je slo narobe");
        }

        Scanner scannner = new Scanner(System.in);

        double temperatura = scannner.nextDouble();
        //tuki mamo temperaturo

        System.out.println("-----------------------------");
        if (cifra == 1){
            System.out.println(temperatura + "°C = " + Pretvorba.CelzijavFahrenheite(temperatura) + "°F");
        } else if (cifra == 2) {
            System.out.println(temperatura + "°F = " +  Pretvorba.FahrenheitvCelzije(temperatura) + "°C ");
        }
        else{
            System.out.println("Nekje je bila napaka");
        }








    }




}