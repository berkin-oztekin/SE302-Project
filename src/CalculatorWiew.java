import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorWiew extends JFrame {
    private JTextField firstnumber = new JTextField(10);
    private JLabel additional = new JLabel("+");
    private JTextField secondnumber = new JTextField(10);
    private JButton calcualteButton = new JButton("Calculate");
    private  JTextField calsolution = new JTextField(10);

    /*
    private JTextField firstnumber1 = new JTextField(10);
    private JLabel multiplier = new JLabel("*");
    private JTextField secondnumber2 = new JTextField(10);
    private JButton CalcualteButton1 = new JButton("Calculate");
    private  JTextField calsolution1 = new JTextField(10);

     */

    public CalculatorWiew() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500 , 500);

        calcPanel.add(firstnumber);
        calcPanel.add(additional);
        calcPanel.add(secondnumber);
        calcPanel.add(calcualteButton);
        calcPanel.add(calsolution);

        this.add(calcPanel);

    }
    public int getFirstNumber(){
        return Integer.parseInt(firstnumber.getText());
    }
    public int getSecondNumber(){
        return Integer.parseInt(secondnumber.getText());
    }
    public void setSolution(int solution){
         calsolution.setText(Integer.toString(solution));
    }
    void addCalculationListner(ActionListener listener){
        calcualteButton.addActionListener(listener);
    }
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this , errorMessage);
    }
}
