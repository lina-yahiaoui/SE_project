public class Division extends calculator {
    

public Double compute(double a, double b){

    if (b == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    }
    return a / b;
    }
}