public class CalcOperations {

    private final CalcOperationsStrategyFactory calcOperationsStrategyFactory = new CalcOperationsStrategyFactory();

    public double calculatorOperation(String operationType, double valueOne, double valueTwo){
        CalcOperationsStrategy calcOperationsStrategy = calcOperationsStrategyFactory.getCalcOperationsStrategy(operationType);

        return calcOperationsStrategy.calculateOperation(valueOne, valueTwo);
    }
}
