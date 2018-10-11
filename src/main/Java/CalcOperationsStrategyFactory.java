public class CalcOperationsStrategyFactory {

    private final CalcOperationsStrategy additionOperationsStrategy = new AdditionOperation();
    private final CalcOperationsStrategy subtractionOperationStrategy = new SubtractionOperation();
    private final CalcOperationsStrategy divisionOperationStrategy = new DivisionOperation();
    private final CalcOperationsStrategy multiplicationOperationStrategy = new MultiplicationOperation();
    private final CalcOperationsStrategy noInputOperationStrategy = new noInputOperation();

    public CalcOperationsStrategy getCalcOperationsStrategy(String operationType) {
        switch (operationType) {
            case "Addition": return additionOperationsStrategy;
            case "Subtration": return subtractionOperationStrategy;
            case "Division": return divisionOperationStrategy;
            case "Multiplication": return multiplicationOperationStrategy;
            default: return noInputOperationStrategy;
        }
    }
}
