package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double pocetna_tacka;
    private double krajnja_tacka;
    private boolean pripadnost_pocetne;
    private boolean pripadnost_krajnje;

    public Interval(double pocetna_tacka, double krajnja_tacka, boolean pripadnost_pocetne, boolean pripadnost_krajnje) {
        this.pocetna_tacka = pocetna_tacka;
        this.krajnja_tacka = krajnja_tacka;
        this.pripadnost_pocetne = pripadnost_pocetne;
        this.pripadnost_krajnje = pripadnost_krajnje;
    }

    public double getPocetna_tacka() {
        return pocetna_tacka;
    }

    public void setPocetna_tacka(double pocetna_tacka) {
        this.pocetna_tacka = pocetna_tacka;
    }

    public double getKrajnja_tacka() {
        return krajnja_tacka;
    }

    public void setKrajnja_tacka(double krajnja_tacka) {
        this.krajnja_tacka = krajnja_tacka;
    }

    public boolean isPripadnost_pocetne() {
        return pripadnost_pocetne;
    }

    public void setPripadnost_pocetne(boolean pripadnost_pocetne) {
        this.pripadnost_pocetne = pripadnost_pocetne;
    }

    public boolean isPripadnost_krajnje() {
        return pripadnost_krajnje;
    }

    public void setPripadnost_krajnje(boolean pripadnost_krajnje) {
        this.pripadnost_krajnje = pripadnost_krajnje;
    }

    public boolean isIn(double v) {

    }


    public boolean isNull() {
    }
}
