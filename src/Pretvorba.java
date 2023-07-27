public class Pretvorba {
    private double celzije;
    private double fahrenheit;

    public Pretvorba(double celzije, double fahrenheit) {
        this.celzije = celzije;
        this.fahrenheit = fahrenheit;
    }

    public double getCelzije() {
        return celzije;
    }

    public void setCelzije(float celzije) {
        this.celzije = celzije;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double vFahrenheite(){
        double izracun = (this.celzije * 1.8) + 32;
        return izracun;
    }

    public double vCelzije(){
        double izracun = (this.fahrenheit - 32) / 1.8;
        return izracun;
    }

    //naredu bom class pretvorba ki bo imel dva fields
    // celzije in fahremheit
    // in v mainu odvisno kaj bo uporabnik napisu
    // te podatki bodo sli v konstruktor
    // in uporabli funkcijo in je to to
}
