public class Pretvorba {

    public static double CelzijavFahrenheite(double celzije){
        double izracun = (celzije * 1.8) + 32;
        return izracun;
    }

    public static double FahrenheitvCelzije(double fahrenheit){
        double izracun = (fahrenheit - 32) / 1.8;
        return izracun;
    }

}





