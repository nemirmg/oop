package hw7.service;

import hw7.model.Complex;

public class LogCalcService implements Calculable<Complex> {
    private Calculable<Complex> calc;
    private Loggable logger;

    public LogCalcService(Calculable<Complex> calc, Loggable logger) {
        this.calc = calc;
        this.logger = logger;
    }

    @Override
    public void sum(Complex arg) {
        logger.log(String.format("Текущий результат (%s) суммируем с новым числом (%s)", calc.getResult(), arg));
        calc.sum(arg);
        logger.log(String.format("Итог операции: %s", calc.getResult()));
    }

    @Override
    public void multiply(Complex arg) {
        logger.log(String.format("Текущий результат (%s) умножаем на новое число (%s)", calc.getResult(), arg));
        calc.multiply(arg);
        logger.log(String.format("Итог операции: %s", calc.getResult()));
    }

    @Override
    public void divide(Complex arg) {
        logger.log(String.format("Текущий результат (%s) делим на новое число (%s)", calc.getResult(), arg));
        calc.divide(arg);
        logger.log(String.format("Итог операции: %s", calc.getResult()));
    }

    @Override
    public void subtraction(Complex arg) {
        logger.log(String.format("Из текущего результата (%s) вычитаем новое число (%s)", calc.getResult(), arg));
        calc.subtraction(arg);
        logger.log(String.format("Итог операции: %s", calc.getResult()));
    }

    @Override
    public Complex getResult() {
        logger.log(String.format("Результат вычислений: %s", calc.getResult()));
        return calc.getResult();
    }
    
}
