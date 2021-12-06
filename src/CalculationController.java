import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationController {
    private CalculatorWiew theView;
    private CalculatorModel themodel ;

    public CalculationController(CalculatorWiew theView, CalculatorModel themodel) {
        this.theView = theView;
        this.themodel = themodel;

        this.theView.addCalculationListner(new CalculateListener());
    }

    class CalculateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber , secondNumber ;

            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                themodel.addTwoNumber(firstNumber , secondNumber);

                theView.setSolution(themodel.getCalculationValue());
            }catch (NumberFormatException ex){
                theView.displayErrorMessage("Please enter convinient number");
            }

        }
    }
}
