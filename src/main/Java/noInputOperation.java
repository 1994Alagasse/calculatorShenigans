public class noInputOperation implements CalcOperationsStrategy {

    @Override
    public double calculateOperation(double valueOne, double valueTwo){
        System.out.print("Gimme Input");
        return 0;
    }
}
