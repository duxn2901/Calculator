package calc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;


public class CalculatorUI {

    // Fields
    private JFrame frame;
    private JTextField display;
    private JPanel buttonPanel;

    private HashMap<JButton, String> operatorButtons;
    private HashMap<JButton, String> numberButtons;
    // private CalculatorLogic logic;

    private double firstOperand;
    private String operator;
    // private boolean startNewNumber;

    //actionlistener for buttons
    ActionListener numberListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonText = numberButtons.get(e.getSource());
            display.setText(display.getText() + buttonText);
        }
    };

    // Constructor
    public CalculatorUI() {
        initializeUI();
    }

    // Initialize the UI
    private void initializeUI() {
        // call createFrame(), createDisplay(), createButtonPanel()
        createFrame();
        createDisplay();
        createButtonPanel();
        frame.setVisible(true);
        attachNumberButtonListeners();
    }

    // Create the main frame
    private void createFrame() {
        // setup JFrame (size, layout, title, close operation)
        frame = new JFrame("Calculator");
        frame.setSize(350,550);
        frame.setLayout(new BorderLayout());
        
    }

    // Create the display field
    private void createDisplay() {
        // create JTextField for output
        display = new JTextField("");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 60));
        display.getCaret().setVisible(false);
        display.setFocusable(false);
        display.setBorder(BorderFactory.createEmptyBorder(40, 5, 5, 5));
        frame.add(display, BorderLayout.NORTH);
    }

    // Create the button panel
    private void createButtonPanel() {
        // call createNumberButtons() and createOperatorButtons()
        // add buttons to panel
        // set GridLayout
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 4, 2, 2));
        createButtons();
        frame.add(buttonPanel, BorderLayout.CENTER);
    }
    

    //create all buttons
    private void createButtons() {
        String[][] gridLabels = {
            {"%", "CE", "C", "DEL"},
            {"1/x", "pow2", "sqrt", "/"},
            {"7", "8", "9", "*"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "+"},
            {"±", "0", ".", "="}
        };
        numberButtons = new HashMap<>();
        operatorButtons = new HashMap<>();
        for (String[] row : gridLabels) {
            for (String label : row) {
                JButton button = new JButton(label);
                
                if (label.matches("\\d")) {
                    numberButtons.put(button, label);
                }
                else operatorButtons.put(button, label);
                buttonPanel.add(button);
            }
        }

    }

    private void attachNumberButtonListeners() {
        for (JButton button : numberButtons.keySet()) {
            button.addActionListener(numberListener);
        }
    }

    private void createNumberButtons() {
        // create buttons, store them, attach listeners
    }

    // Create operator buttons (+, -, *, /, =, C, etc.)
    private void createOperatorButtons() {
        // create buttons, attach listeners
    }

    // Attach listeners to all buttons
    private void attachButtonListeners() {
        // loop through buttons and attach ActionListeners
    }

    // Handle a button click
    private void handleButtonClick(String buttonLabel) {
        // determine if it's a number or operator
        // call handleNumberButton() or handleOperatorButton()
    }

    // Handle number button click
    private void handleNumberButton(String number) {
        // append number to display
    }

    // Handle operator button click
    private void handleOperatorButton(String operator) {
        // store operator and operands
        // call CalculatorLogic
        // update display
    }

    // Optional helper: clear display
    private void clearDisplay() {
        // reset display and state
    }

    // Optional helper: update display
    private void updateDisplay(double value) {
        // set display text
    }
}
