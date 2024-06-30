package hw7.service;

import hw7.model.Complex;

public class ComplexService {
    public Complex createComplex(double re, double im) {
        return new Complex(re, im);
    }
}
