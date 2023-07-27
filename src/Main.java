import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Iz katere v katero enoto zelite pretvorbo:");
        System.out.println();
        System.out.println("1. Celzije --> Fahrenheite");
        System.out.println("2. Fahrenheite --> Celzije");
        int cifra = sc.nextInt();
        System.out.println("Vpisite temperaturo...");

        Scanner scanner = new Scanner(System.in);
        float temperatura = scanner.nextFloat();
        double temperaturaa = (double) temperatura;

        if(cifra == 1){//tuki imamo celzije in mormo v fahrenheite
            Pretvorba pretvorba = new Pretvorba(temperaturaa,0);
            System.out.println(pretvorba.vFahrenheite());
        }
        else if (cifra == 2){//tuki imamo fahrenheite in mormo v celzije
            Pretvorba pretvorba = new Pretvorba(0, temperaturaa);
            System.out.println(pretvorba.vCelzije());

        }
        else{
            System.out.println("Nekaj je slo narobe");
        }
    }
}