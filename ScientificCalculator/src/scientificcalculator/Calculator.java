/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package scientificcalculator;
//package methods;

/**
 *
 * @author Muhammad Ahmad
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        btnOn.setEnabled(false);
    }
    
    double value1, value2, result;
    String opr;
    
    
    public void arithmeticOperation() {
        value2 = Double.parseDouble(OutputField.getText());
        
        if (opr == "+") {
            result = value1 + value2;
            OutputField.setText(Double.toString(result));
        } else if (opr == "-") {
            result = value1 - value2;
            OutputField.setText(Double.toString(result));
        } else if (opr == "*") {
            result = value1 * value2;
            OutputField.setText(Double.toString(result));
        } else if (opr == "/") {
            result = value1 / value2;
            OutputField.setText(Double.toString(result));
        } else if (opr == "X^Y") {
            result= Math.pow(value1, value2);
            OutputField.setText(Double.toString(result));
        }
        value1 = 0;
    }
    
    // Enable Function
    public void enable() { // Calculator Enable 
        OutputField.setEnabled(true);
        
        btnOn.setEnabled(false); // On btn Disable
        btnOff.setEnabled(true); // Off btn Enable
        
        btnDot.setEnabled(true);
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
        btnEqual.setEnabled(true);
        btnDivide.setEnabled(true);
        btnPercentage.setEnabled(true);
        btnMultiply.setEnabled(true);
        btnPlus.setEnabled(true);
        btnMinus.setEnabled(true);
        btn10Exp.setEnabled(true);
        btnExp.setEnabled(true);
        backSpace.setEnabled(true);
        btnClear.setEnabled(true);
        btnLog.setEnabled(true);
        btnCube.setEnabled(true);
        btnSquare.setEnabled(true);
        btnDivideN.setEnabled(true);
        btnSin.setEnabled(true);
        btnCos.setEnabled(true);
        btnTan.setEnabled(true);
        btnPower.setEnabled(true);
        
        btnFibonacci.setEnabled(true);
        btnFactorial.setEnabled(true);        
               
    }
    
    // Disable Function
    public void disable() { // Calculator Disable
        OutputField.setText("");
        prevValue.setText("");
        OutputField.setEnabled(false);
        
        btnOn.setEnabled(true); // On btn Enable
        btnOff.setEnabled(false); // Off btn Disable
        
        btnDot.setEnabled(false);
        btn0.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        
        btnEqual.setEnabled(false);
        btnDivide.setEnabled(false);
        btnPercentage.setEnabled(false);
        btnMultiply.setEnabled(false);
        btnPlus.setEnabled(false);
        btnMinus.setEnabled(false);
        btn10Exp.setEnabled(false);
        btnExp.setEnabled(false);
        backSpace.setEnabled(false);
        btnClear.setEnabled(false);
        btnLog.setEnabled(false);
        btnCube.setEnabled(false);
        btnSquare.setEnabled(false);
        btnDivideN.setEnabled(false);
        btnSin.setEnabled(false);
        btnCos.setEnabled(false);
        btnTan.setEnabled(false);
        btnPower.setEnabled(false);
        
        btnFibonacci.setEnabled(false);
        btnFactorial.setEnabled(false);        
               
    }
    
    // Factorial Function
    public void factorial() {
        double input = Double.parseDouble(OutputField.getText());
        double factorial = 1;
        prevValue.setText(input + " " + "(n!)");
        
        while (input != 0) {
            factorial = factorial * input;
            input--;
        }
        
        OutputField.setText("");
        OutputField.setText(OutputField.getText() + factorial);
    }
    
    // Fibonacci Series Function
    public void fibonacciSeries() {
        double input = Double.parseDouble(OutputField.getText());
        int n1 = 0, n2 = 1, n3, i;    
        
        prevValue.setText(input + " " + "(nΦ)");
        
        OutputField.setText("");
        if (1 <= input) {
            OutputField.setText(OutputField.getText() + n1 + " " + n2);
        } else {
             OutputField.setText(OutputField.getText() + "0");
        }
        
        for (i = 2; i <= input; ++i) {    
         n3 = n1 + n2;
         n1 = n2;    
         n2 = n3;
         OutputField.setText(OutputField.getText() + " " + n3);
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        OutputField = new javax.swing.JTextField();
        btnOn = new javax.swing.JRadioButton();
        btnOff = new javax.swing.JRadioButton();
        btnClear = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnCube = new javax.swing.JButton();
        btnSquare = new javax.swing.JButton();
        btnDivideN = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPower = new javax.swing.JButton();
        btnFibonacci = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btnPercentage = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btn10Exp = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        backSpace = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        prevValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        OutputField.setEditable(false);
        OutputField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OutputField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        OutputField.setMargin(new java.awt.Insets(2, 10, 2, 10));

        buttonGroup.add(btnOn);
        btnOn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOn.setText("On");
        btnOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnActionPerformed(evt);
            }
        });

        buttonGroup.add(btnOff);
        btnOff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOff.setText("Off");
        btnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOffActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clr");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLog.setText("log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnCube.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCube.setText("n³");
        btnCube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCubeActionPerformed(evt);
            }
        });

        btnSquare.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSquare.setText("n²");
        btnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareActionPerformed(evt);
            }
        });

        btnDivideN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDivideN.setText("1/n");
        btnDivideN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideNActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPower.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPower.setText("X^Y");
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });

        btnFibonacci.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFibonacci.setText("nΦ");
        btnFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFibonacciActionPerformed(evt);
            }
        });

        btnSin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnFactorial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFactorial.setText("n!");
        btnFactorial.setMargin(new java.awt.Insets(2, 14, 2, 14));
        btnFactorial.setMaximumSize(new java.awt.Dimension(54, 28));
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        btnCos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btnPercentage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPercentage.setText("%");
        btnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMinus.setText("−");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnMultiply.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMultiply.setText("×");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        btn10Exp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn10Exp.setText("10x");
        btn10Exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ExpActionPerformed(evt);
            }
        });

        btnTan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnDivide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDivide.setText("÷");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        backSpace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backSpace.setText("D");
        backSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSpaceActionPerformed(evt);
            }
        });

        btnExp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExp.setText("exp");
        btnExp.setActionCommand("");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        prevValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        prevValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        prevValue.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prevValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OutputField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnCube, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnSquare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(btnDivideN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnPower, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnFibonacci, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 3, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn10Exp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnFactorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prevValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OutputField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOff)
                    .addComponent(btnOn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFibonacci, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btnFactorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn10Exp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPower, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCube, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDivideN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnActionPerformed
        enable(); // Enable Calculator Call
    }//GEN-LAST:event_btnOnActionPerformed

    private void btnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOffActionPerformed
        disable(); // Disable Calculator Call
    }//GEN-LAST:event_btnOffActionPerformed

    // Cube Btn Function 
    private void btnCubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCubeActionPerformed
        double cube = Double.parseDouble(OutputField.getText());
        prevValue.setText(cube + "³");
        cube = cube * cube * cube;
        OutputField.setText("");
        OutputField.setText(OutputField.getText() + cube);
    }//GEN-LAST:event_btnCubeActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        OutputField.setText(OutputField.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        OutputField.setText(OutputField.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    // Multiply Btn Function 
    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        if (value1 != 0 ){
            value1 = value1 * Double.parseDouble(OutputField.getText());
        } else {
            value1 =  Double.parseDouble(OutputField.getText());
        }
        
        OutputField.setText("");
        prevValue.setText(value1 + " " + "(×)");
        opr = "*";
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        OutputField.setText(OutputField.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    // Square Btn Function 
    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareActionPerformed
        double square = Double.parseDouble(OutputField.getText());
        prevValue.setText(square + "²");
        square = square * square;
        OutputField.setText("");
        OutputField.setText(OutputField.getText() + square);
    }//GEN-LAST:event_btnSquareActionPerformed

    // Clear Btn Function 
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        OutputField.setText("");
        prevValue.setText("");
        value1 = 0;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        OutputField.setText(OutputField.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        OutputField.setText(OutputField.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        OutputField.setText(OutputField.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        OutputField.setText(OutputField.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        OutputField.setText(OutputField.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        OutputField.setText(OutputField.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        OutputField.setText(OutputField.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        OutputField.setText(OutputField.getText() + ".");
    }//GEN-LAST:event_btnDotActionPerformed

    // Back Space Btn Function 
    private void backSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSpaceActionPerformed
        String backSpace = null;
        
        if (OutputField.getText().length() > 0) {
            StringBuilder input = new StringBuilder(OutputField.getText());
            input.deleteCharAt(OutputField.getText().length() - 1);
            backSpace = input.toString();
            OutputField.setText(backSpace);
        }
    }//GEN-LAST:event_backSpaceActionPerformed

    // Plus Btn Function 
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        value1 = value1 + Double.parseDouble(OutputField.getText());
        OutputField.setText("");
        prevValue.setText(value1 + " " + "(+)");
        opr = "+";
    }//GEN-LAST:event_btnPlusActionPerformed

    // Minus Btn Function 
    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        if(value1 != 0 ){
            value1 = value1 - Double.parseDouble(OutputField.getText());

        } else{
            value1 =  Double.parseDouble(OutputField.getText());
        }
        
        OutputField.setText("");
        prevValue.setText(value1 + " " + "(-)");
        opr = "-";
    }//GEN-LAST:event_btnMinusActionPerformed

    // Divide Btn Function 
    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        if (value1 != 0 ) {
            value1 = value1 / Double.parseDouble(OutputField.getText());

        } else {
            value1 =  Double.parseDouble(OutputField.getText());
        }
        
        OutputField.setText("");
        prevValue.setText(value1 + " " + "(÷)");
        opr = "/";
    }//GEN-LAST:event_btnDivideActionPerformed

    // Percentage Btn Function 
    private void btnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentageActionPerformed
        double input = Double.parseDouble(OutputField.getText());
        prevValue.setText(input + " " + "(%)");
        double percentage = input / 100;
        OutputField.setText("");
        OutputField.setText(OutputField.getText() + percentage);
    }//GEN-LAST:event_btnPercentageActionPerformed

    // Equal to Btn Function 
    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        arithmeticOperation(); // Call Basic Arthimatic Operation Function
        prevValue.setText("");
    }//GEN-LAST:event_btnEqualActionPerformed

    // Log Btn Function 
    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        double input = Double.parseDouble(OutputField.getText());
        prevValue.setText(input + " " + "(Log)");
        double log = Math.log10(input);
        OutputField.setText("");
        OutputField.setText(OutputField.getText() + log);
    }//GEN-LAST:event_btnLogActionPerformed

    // Exponent Btn Function 
    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        double input = Double.parseDouble(OutputField.getText());
        prevValue.setText(input + " " + "(exp)");
        double exp = Math.exp(input);
        OutputField.setText("");
        OutputField.setText(OutputField.getText() + exp);
    }//GEN-LAST:event_btnExpActionPerformed

    // Divide N Btn Function 
    private void btnDivideNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideNActionPerformed
        double input = Double.parseDouble(OutputField.getText());
        prevValue.setText("(1/" + input + ")");
        double nValue = 1 / input;
        OutputField.setText("");
        OutputField.setText(OutputField.getText() + nValue);
    }//GEN-LAST:event_btnDivideNActionPerformed

    // Power Btn Function 
    private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerActionPerformed
        value1 = Double.parseDouble(OutputField.getText());
        OutputField.setText("");
        prevValue.setText(value1 + " " + "(power)");
        opr = "X^Y";
    }//GEN-LAST:event_btnPowerActionPerformed

    // Factorial Btn Function 
    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        factorial(); // Factorial Function Call
    }//GEN-LAST:event_btnFactorialActionPerformed

    // Fibonacci Btn Function 
    private void btnFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFibonacciActionPerformed
        fibonacciSeries(); // Fibonacci Series Function Call
    }//GEN-LAST:event_btnFibonacciActionPerformed

    // 10X EXP btn Function 
    private void btn10ExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ExpActionPerformed
        double input = Double.parseDouble(OutputField.getText());
        prevValue.setText(input + " " + "(pow)");
        result = Math.pow(10, input);
        OutputField.setText(Double.toString(result));
    }//GEN-LAST:event_btn10ExpActionPerformed

    // Sin Btn Function 
    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        double input = Double.parseDouble(OutputField.getText());
        prevValue.setText(input + " " + "(sin)");
        double sin = Math.sin(input);
        OutputField.setText("");
        OutputField.setText(OutputField.getText() + sin);
    }//GEN-LAST:event_btnSinActionPerformed

    // Cos Btn Function 
    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        double input = Double.parseDouble(OutputField.getText());
        prevValue.setText(input + " " + "(cos)");
        double cos = Math.cos(input);
        OutputField.setText("");
        OutputField.setText(OutputField.getText() + cos);
    }//GEN-LAST:event_btnCosActionPerformed

    // Tan Btn Function 
    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        double input = Double.parseDouble(OutputField.getText());
        prevValue.setText(input + " " + "(tan)");
        double tan = Math.tan(input);
        OutputField.setText("");
        OutputField.setText(OutputField.getText() + tan);
    }//GEN-LAST:event_btnTanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OutputField;
    private javax.swing.JButton backSpace;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10Exp;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnCube;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnDivideN;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnFibonacci;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JRadioButton btnOff;
    private javax.swing.JRadioButton btnOn;
    private javax.swing.JButton btnPercentage;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPower;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnTan;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel prevValue;
    // End of variables declaration//GEN-END:variables
}
