package hw7.service;

import hw7.model.Complex;

public class CalcComplexService implements Calculable<Complex> {
    private double re;
    private double im;
    private ComplexService service = new ComplexService();
    private Complex calcResult;

    public CalcComplexService(Complex firstComplex) {
        this.calcResult = firstComplex;
    }

    @Override
    public void sum(Complex arg) {
        re = calcResult.getRe() + arg.getRe();
        im = calcResult.getIm() + arg.getIm();
        calcResult = service.createComplex(re, im);
    }

    @Override
    public void multiply(Complex arg) {
        re = calcResult.getRe() * arg.getRe() - calcResult.getIm() * arg.getIm();
        im = calcResult.getRe() * arg.getIm() + calcResult.getIm() * arg.getRe();
        calcResult = service.createComplex(re, im);
    }

    @Override
    public void divide(Complex arg) {
        if (arg.getRe() == 0 && arg.getIm() == 0) {
            System.out.println("Для корректного деления у делителя " + 
                               "хотя бы одна из частей (действительная или " + 
                               "мнимая) должна быть ненулевой!");
        }

        double divider = arg.getRe() * arg.getRe() + arg.getIm() * arg.getIm();
        re = (calcResult.getRe() * arg.getRe() + calcResult.getIm() * arg.getIm()) / divider;
        im = (calcResult.getIm() * arg.getRe() - calcResult.getRe() * arg.getIm()) / divider;
        calcResult = service.createComplex(re, im);
    }

    @Override
    public void subtraction(Complex arg) {
        re = calcResult.getRe() - arg.getRe();
        im = calcResult.getIm() - arg.getIm();
        calcResult = service.createComplex(re, im);
    }

    @Override
    public Complex getResult() {
        return calcResult;
    }

    // @Override
    // public void clear() {
    //     this.calcResult = service.createComplex(0, 0);
    // }
}
