package hw7.connector;

import hw7.model.Complex;
import hw7.service.ComplexService;

public class ComplexConnector {
    private ComplexService complexService = new ComplexService();

    public Complex createComplex(double re, double im) {
        return complexService.createComplex(re, im);
    }
}
