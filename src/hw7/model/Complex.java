package hw7.model;

public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public String toString() {
        String str;
        if (im == 0) str = re + "";
        else if (re == 0) str = im + "i";
        else if (im < 0) str = re + " - " + (-im) + "i";
        else str = re + " + " + im + "i";
        return str;
    }
}
