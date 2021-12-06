public class main {
   public static void main(String [] args){
      CalculatorWiew calculatorWiew = new CalculatorWiew();
      CalculatorModel calculatorModel = new CalculatorModel();
      CalculationController calculationController = new CalculationController(calculatorWiew , calculatorModel);
      calculatorWiew.setVisible(true);
   }
}
