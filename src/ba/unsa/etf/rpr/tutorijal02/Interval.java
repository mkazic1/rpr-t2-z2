package ba.unsa.etf.rpr.tutorijal02;

import java.util.Objects;

public class Interval {
    private double pocetna_tacka;
    private double krajnja_tacka;
    private boolean pripadnost_pocetne;
    private boolean pripadnost_krajnje;

    public Interval(double pocetna_tacka, double krajnja_tacka, boolean pripadnost_pocetne, boolean pripadnost_krajnje) {
        if(pocetna_tacka>krajnja_tacka) throw new IllegalArgumentException("Pogresne vrijednosti!");
        this.pocetna_tacka = pocetna_tacka;
        this.krajnja_tacka = krajnja_tacka;
        this.pripadnost_pocetne = pripadnost_pocetne;
        this.pripadnost_krajnje = pripadnost_krajnje;
    }

    public Interval() {
        this.pocetna_tacka=0;
        this.krajnja_tacka=0;
        pripadnost_pocetne=false;
        pripadnost_krajnje=false;
    }

    public static Interval intersect(Interval i1, Interval i2) {
        Interval i3= new Interval();
        if(i1.isPripadnost_pocetne() && i2.isPripadnost_krajnje())
        if(i1.pocetna_tacka<i2.pocetna_tacka && i1.krajnja_tacka>i2.krajnja_tacka) {
            i3= new Interval(i1.pocetna_tacka, i2.krajnja_tacka, true, true);
        }
        return i3;
    }

    public Interval intersect(Interval interval) {
        Interval interval1=new Interval(interval.pocetna_tacka, interval.krajnja_tacka, interval.pripadnost_pocetne, interval.pripadnost_krajnje);
        return interval1;
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
        if(this.pripadnost_pocetne && this.pripadnost_krajnje) {
            if (v >= pocetna_tacka && v <= krajnja_tacka) return true;
        } else if(this.pripadnost_pocetne && !this.pripadnost_krajnje) {
            if(v>=pocetna_tacka && v<krajnja_tacka) return true;
        } else if(!this.pripadnost_pocetne && this.pripadnost_krajnje) {
            if(v>pocetna_tacka && v<=krajnja_tacka) return true;
        }
        return false;
    }

    public boolean isNull() {
        return this != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return Double.compare(interval.pocetna_tacka, pocetna_tacka) == 0 &&
                Double.compare(interval.krajnja_tacka, krajnja_tacka) == 0 &&
                pripadnost_pocetne == interval.pripadnost_pocetne &&
                pripadnost_krajnje == interval.pripadnost_krajnje;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pocetna_tacka, krajnja_tacka, pripadnost_pocetne, pripadnost_krajnje);
    }

    @Override
    public String toString() {
        return "[" +
                 + pocetna_tacka +
                "," + krajnja_tacka +
                ')';
    }

}
