package hw7.service;

public interface Calculable<T> {
    void sum(T arg);
    void multiply(T arg);
    void divide(T arg);
    void subtraction(T arg);
    T getResult();
}
