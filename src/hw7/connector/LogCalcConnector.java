package hw7.connector;

import hw7.model.Complex;
import hw7.service.CalcComplexService;
import hw7.service.LogCalcService;
import hw7.service.Loggable;

public class LogCalcConnector {
    private LogCalcService logCalcService;
    private CalcComplexService calcComplexService;

    public LogCalcConnector(Complex firstComplex, Loggable logger) {
        this.calcComplexService = new CalcComplexService(firstComplex);
        this.logCalcService = new LogCalcService(this.calcComplexService, logger);
    }

    public void sum(Complex arg) {
        logCalcService.sum(arg);
    }

    public void multiply(Complex arg) {
        logCalcService.multiply(arg);
    }

    public void divide(Complex arg) {
        logCalcService.divide(arg);
    }

    public void subtraction(Complex arg) {
        logCalcService.subtraction(arg);
    }

    public Complex getResult() {
        return logCalcService.getResult();
    }
}
