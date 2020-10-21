package view;

import java.awt.event.KeyEvent;
import java.io.IOException;
import model.Matrix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    Matrix matrix;

    public MainFrame() {
        setLookAndFeel();
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        matrix = new Matrix(0, 0);
        valueSlider.setMajorTickSpacing(valueSlider.getMaximum()/4);
        valueSlider.setMinorTickSpacing(valueSlider.getMaximum() /100);
        valueSlider.setPaintTicks(true);
        valueSlider.setPaintLabels(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        maxValueTextField = new javax.swing.JTextField();
        minValueTextField = new javax.swing.JTextField();
        valueSlider = new javax.swing.JSlider();
        maxValueLabel = new javax.swing.JLabel();
        minValueLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        matrixTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Parameters"));

        maxValueTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        maxValueTextField.setToolTipText("Introduce an Integer");
        maxValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                maxValueTextFieldKeyReleased(evt);
            }
        });

        minValueTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        minValueTextField.setToolTipText("Introduce an Integer");
        minValueTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                minValueTextFieldKeyReleased(evt);
            }
        });

        valueSlider.setSnapToTicks(true);
        valueSlider.setToolTipText("Max Value to Show in Matrix");
        valueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valueSliderStateChanged(evt);
            }
        });

        maxValueLabel.setText("Max Value:");

        minValueLabel.setText("Min Value:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(valueSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maxValueLabel)
                            .addComponent(minValueLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minValueLabel))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxValueLabel))
                .addGap(30, 30, 30)
                .addComponent(valueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        matrixTextArea.setEditable(false);
        matrixTextArea.setColumns(10);
        matrixTextArea.setRows(10);
        matrixTextArea.setTabSize(4);
        jScrollPane2.setViewportView(matrixTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jLabel1.setText("By Ignacio Marín & Jesús Lárez");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Square Matrix");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maxValueTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maxValueTextFieldKeyReleased

        checkTextFieldMax(evt);
        if (evt.isConsumed()) {
            return;
        }
        updateMatrix();
        updateSlider();

    }//GEN-LAST:event_maxValueTextFieldKeyReleased

    private void minValueTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minValueTextFieldKeyReleased

        checkTextFieldMin(evt);
        if (evt.isConsumed()) {
            return;
        }
        updateMatrix();
        updateSlider();
    }//GEN-LAST:event_minValueTextFieldKeyReleased

    private void valueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valueSliderStateChanged
        showMatrix();
        System.out.println(valueSlider.getValue());
    }//GEN-LAST:event_valueSliderStateChanged

    private void setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea matrixTextArea;
    private javax.swing.JLabel maxValueLabel;
    private javax.swing.JTextField maxValueTextField;
    private javax.swing.JLabel minValueLabel;
    private javax.swing.JTextField minValueTextField;
    private javax.swing.JSlider valueSlider;
    // End of variables declaration//GEN-END:variables

    private void updateMatrix() {

        matrix.updateMatrix(Integer.parseInt(maxValueTextField.getText()),
                Integer.parseInt(minValueTextField.getText()));
        showMatrix();
    }

    private void showMatrix() {
        matrixTextArea.setText(matrix.getValues(valueSlider.getValue()));
    }

    private void updateSlider() {
        valueSlider.setMaximum(Integer.parseInt(maxValueTextField.getText()));
        valueSlider.setMinimum(Integer.parseInt(minValueTextField.getText()));
        valueSlider.setValue((Integer.parseInt(maxValueTextField.getText()) +
                Integer.parseInt(minValueTextField.getText())) / 2);

        valueSlider.setMajorTickSpacing((valueSlider.getMaximum()- valueSlider.getMinimum()) /4);
        System.out.println((valueSlider.getMaximum()- valueSlider.getMinimum()) /4);
        valueSlider.setMinorTickSpacing((valueSlider.getMaximum()- valueSlider.getMinimum()) /100);
        
        try{
            valueSlider.setLabelTable(valueSlider.createStandardLabels(
                (valueSlider.getMaximum()- valueSlider.getMinimum())/4,valueSlider.getMinimum()));
            
        }catch(IllegalArgumentException e){
            
        }
        
    }

    private void checkTextFieldMax(KeyEvent evt) {
        Pattern pattern = Pattern.compile("^[-+]?[0-9]\\d*\\.?[0]*$");
        Matcher maxMatcher = pattern.matcher(maxValueTextField.getText());
        if (maxValueTextField.getText().length() > 6){
            JOptionPane.showMessageDialog(null, "Max number of digit reached");
        }else if (isTextFieldEmpty() || !maxMatcher.find() || isMinHigherThanMax() ||
                maxValueTextField.getText().length() > 6) {
            evt.consume();  // ignore event
        }

    }

    private void checkTextFieldMin(KeyEvent evt) {
        Pattern pattern = Pattern.compile("^[-+]?[0-9]\\d*\\.?[0]*$");
        Matcher minMatcher = pattern.matcher(minValueTextField.getText());
        if (minValueTextField.getText().length() > 6){
            JOptionPane.showMessageDialog(null, "Max number of digit reached");
        }
        else if (isTextFieldEmpty() || !minMatcher.find() || isMinHigherThanMax() || 
                minValueTextField.getText().length() > 6){
            evt.consume();  // ignore event
        }
    }
    private boolean isTextFieldEmpty() {

        return (maxValueTextField.getText().isEmpty()
                || minValueTextField.getText().isEmpty());
    }

    private boolean isMinHigherThanMax() {
        return Integer.parseInt(minValueTextField.getText())
                > Integer.parseInt(maxValueTextField.getText());
    }
}