public class CalculatorModel {
    private int calculationValue ;
    private String Name ;
    private String SurnameName ;
    private String DateOfBirth ;



    public void addTwoNumber(int value1 , int value2){
        calculationValue = value1 + value2 ;

    }
    /*public void addTwoNumberMulti(int value1 , int value2){
        calculationValue = value1 * value2 ;
    }
     */
    public int getCalculationValue(){
        return calculationValue;
    }
}
