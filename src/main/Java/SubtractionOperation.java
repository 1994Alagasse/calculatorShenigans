public class SubtractionOperation implements CalcOperationsStrategy {

    @Override
    public double calculateOperation(double valueOne, double valueTwo){
        System.out.println(valueOne - valueTwo);
        return valueOne - valueTwo;
    }
}
