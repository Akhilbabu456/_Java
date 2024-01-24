package BigCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

  JFrame jf = new JFrame("Calculator");
  JLabel displayLabel = new JLabel();
  boolean isOperatorClicked = false;
  String oldValue;
  String newValue;
  float result;
  int choice;

  JButton sevenbutton;
  JButton eightbutton;
  JButton ninebutton;
  JButton fourbutton;
  JButton fivebutton;
  JButton sixbutton;
  JButton onebutton;
  JButton twobutton;
  JButton threebutton, equalbutton, clearbutton;
  JButton dotbutton, zerobutton, plusbutton, minusbutton, divbutton, mulbutton, squarebutton, remainderbutton, modulusbutton;

  public Calculator() {
    jf.setSize(450, 600);
    jf.setLocation(500, 300);
    jf.setBackground(Color.GRAY);
    jf.setLayout(null);

    displayLabel.setBounds(20, 30, 390, 60);
    displayLabel.setBackground(Color.GRAY);
    displayLabel.setOpaque(true);
    displayLabel.setForeground(Color.WHITE);
    displayLabel.setFont(new Font(null, 0, 25));
    displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    jf.add(displayLabel);

    sevenbutton = new JButton("7");
    sevenbutton.setBounds(20, 150, 60, 60);
    sevenbutton.addActionListener(this);
    sevenbutton.setFont(new Font(null, 0, 40));
    jf.add(sevenbutton);

    eightbutton = new JButton("8");
    eightbutton.setBounds(130, 150, 60, 60);
    eightbutton.addActionListener(this);
    eightbutton.setFont(new Font(null, 0, 40));
    jf.add(eightbutton);

    ninebutton = new JButton("9");
    ninebutton.setBounds(240, 150, 60, 60);
    ninebutton.addActionListener(this);
    ninebutton.setFont(new Font(null, 0, 40));
    jf.add(ninebutton);

    fourbutton = new JButton("4");
    fourbutton.setBounds(20, 250, 60, 60);
    fourbutton.addActionListener(this);
    fourbutton.setFont(new Font(null, 0, 40));
    jf.add(fourbutton);

    fivebutton = new JButton("5");
    fivebutton.setBounds(130, 250, 60, 60);
    fivebutton.addActionListener(this);
    fivebutton.setFont(new Font(null, 0, 40));
    jf.add(fivebutton);

    sixbutton = new JButton("6");
    sixbutton.setBounds(240, 250, 60, 60);
    sixbutton.addActionListener(this);
    sixbutton.setFont(new Font(null, 0, 40));
    jf.add(sixbutton);

    onebutton = new JButton("1");
    onebutton.setBounds(20, 350, 60, 60);
    onebutton.addActionListener(this);
    onebutton.setFont(new Font(null, 0, 40));
    jf.add(onebutton);

    twobutton = new JButton("2");
    twobutton.setBounds(130, 350, 60, 60);
    twobutton.addActionListener(this);
    twobutton.setFont(new Font(null, 0, 40));
    jf.add(twobutton);

    threebutton = new JButton("3");
    threebutton.setBounds(240, 350, 60, 60);
    threebutton.addActionListener(this);
    threebutton.setFont(new Font(null, 0, 40));
    jf.add(threebutton);

    dotbutton = new JButton(".");
    dotbutton.setBounds(20, 450, 60, 60);
    dotbutton.addActionListener(this);
    dotbutton.setFont(new Font(null, 0, 40));
    jf.add(dotbutton);

    zerobutton = new JButton("0");
    zerobutton.setBounds(130, 450, 60, 60);
    zerobutton.addActionListener(this);
    zerobutton.setFont(new Font(null, 0, 40));
    jf.add(zerobutton);

    equalbutton = new JButton("=");
    equalbutton.setBounds(240, 450, 60, 60);
    equalbutton.addActionListener(this);
    equalbutton.setFont(new Font(null, 0, 40));
    jf.add(equalbutton);

    divbutton = new JButton("/");
    divbutton.setBounds(350, 150, 60, 60);
    divbutton.addActionListener(this);
    divbutton.setFont(new Font(null, 0, 40));
    jf.add(divbutton);

    mulbutton = new JButton("x");
    mulbutton.setBounds(350, 250, 60, 60);
    mulbutton.addActionListener(this);
    mulbutton.setFont(new Font(null, 0, 40));
    jf.add(mulbutton);

    minusbutton = new JButton("-");
    minusbutton.setBounds(350, 350, 60, 60);
    minusbutton.addActionListener(this);
    minusbutton.setFont(new Font(null, 0, 40));
    jf.add(minusbutton);

    plusbutton = new JButton("+");
    plusbutton.setBounds(350, 450, 60, 60);
    plusbutton.addActionListener(this);
    plusbutton.setFont(new Font(null, 0, 40));
    jf.add(plusbutton);

    clearbutton = new JButton("C");
    clearbutton.setBounds(350, 100, 60, 40);
    clearbutton.setBackground(Color.RED);
    clearbutton.setForeground(Color.WHITE);
    clearbutton.setFont(new Font(null, 0, 30));
    clearbutton.addActionListener(this);
    jf.add(clearbutton);

    squarebutton = new JButton("X^2");
    squarebutton.setBounds(20, 100, 60, 40);
    squarebutton.addActionListener(this);
    squarebutton.setFont(new Font(null, 0, 15));
    jf.add(squarebutton);

    remainderbutton = new JButton("Re");
    remainderbutton.setBounds(130, 100, 60, 40);
    remainderbutton.addActionListener(this);
    remainderbutton.setFont(new Font(null, 0, 15));
    jf.add(remainderbutton);

    modulusbutton = new JButton("%");
    modulusbutton.setBounds(240, 100, 60, 40);
    modulusbutton.addActionListener(this);
    modulusbutton.setFont(new Font(null, 0, 20));
    jf.add(modulusbutton);

    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String ar[]) {
    Calculator cal = new Calculator();
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == sevenbutton) {
      if (isOperatorClicked) {
        displayLabel.setText("7");
        isOperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "7");
      }
    } else if (e.getSource() == eightbutton) {
      if (isOperatorClicked) {
        displayLabel.setText("8");
        isOperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "8");
      }
    } else if (e.getSource() == ninebutton) {
      if (isOperatorClicked) {
        displayLabel.setText("9");
        isOperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "9");
      }
    } else if (e.getSource() == fourbutton) {
      if (isOperatorClicked) {
        displayLabel.setText("4");
        isOperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "4");
      }
    } else if (e.getSource() == fivebutton) {
      if (isOperatorClicked) {
        displayLabel.setText("5");
        isOperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "5");
      }
    } else if (e.getSource() == sixbutton) {
      if (isOperatorClicked) {
        displayLabel.setText("6");
        isOperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "6");
      }
    } else if (e.getSource() == onebutton) {
      if (isOperatorClicked) {
        displayLabel.setText("1");
        isOperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "1");
      }
    } else if (e.getSource() == twobutton) {
      if (isOperatorClicked) {
        displayLabel.setText("2");
        isOperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "2");
      }
    } else if (e.getSource() == threebutton) {
      if (isOperatorClicked) {
        displayLabel.setText("3");
        isOperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "3");
      }
    } else if (e.getSource() == zerobutton) {
      if (isOperatorClicked) {
        displayLabel.setText("0");
        isOperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "0");
      }
    } else if (e.getSource() == dotbutton) {
      displayLabel.setText(displayLabel.getText() + ".");
    } else if (e.getSource() == clearbutton) {
      displayLabel.setText(" ");
    } else if (e.getSource() == plusbutton) {
      isOperatorClicked = true;
      choice = 1;

      oldValue = displayLabel.getText();
    } else if (e.getSource() == minusbutton) {
      isOperatorClicked = true;
      choice = 2;

      oldValue = displayLabel.getText();
    } else if (e.getSource() == divbutton) {
      isOperatorClicked = true;
      choice = 3;

      oldValue = displayLabel.getText();
    } else if (e.getSource() == mulbutton) {
      isOperatorClicked = true;
      choice = 4;

      oldValue = displayLabel.getText();
    } else if (e.getSource() == squarebutton) {
      isOperatorClicked = true;
      choice = 5;

      oldValue = displayLabel.getText();
    } else if (e.getSource() == remainderbutton) {
      isOperatorClicked = true;
      choice = 6;

      oldValue = displayLabel.getText();
    } else if (e.getSource() == modulusbutton) {
      isOperatorClicked = true;
      choice = 7;

      oldValue = displayLabel.getText();
    } else if (e.getSource() == equalbutton) {
      switch (choice) {
        case 1:
          newValue = displayLabel.getText();
          float oldValueF;
          oldValueF = Float.parseFloat(oldValue);
          float newValueF = Float.parseFloat(newValue);
          result = oldValueF + newValueF;
          displayLabel.setText(result + "");
          break;
        case 2:
          newValue = displayLabel.getText();

          oldValueF = Float.parseFloat(oldValue);
          newValueF = Float.parseFloat(newValue);
          result = oldValueF - newValueF;
          displayLabel.setText(result + "");
          break;
        case 3:
          newValue = displayLabel.getText();

          oldValueF = Float.parseFloat(oldValue);
          newValueF = Float.parseFloat(newValue);
          result = oldValueF / newValueF;
          displayLabel.setText(result + "");
          break;
        case 4:
          newValue = displayLabel.getText();

          oldValueF = Float.parseFloat(oldValue);
          newValueF = Float.parseFloat(newValue);
          result = oldValueF * newValueF;
          displayLabel.setText(result + "");
          break;
        case 5:
          oldValueF = Float.parseFloat(oldValue);
          result = oldValueF * oldValueF;
          displayLabel.setText(result + "");
          break;
        case 6:
          newValue = displayLabel.getText();

          oldValueF = Float.parseFloat(oldValue);
          newValueF = Float.parseFloat(newValue);
          result = oldValueF % newValueF;
          displayLabel.setText(result + "");
          break;
        case 7:
          newValue = displayLabel.getText();

          oldValueF = Float.parseFloat(oldValue);
          newValueF = Float.parseFloat(newValue);
          result = (oldValueF / newValueF) * 100;
          displayLabel.setText(result + "");
          break;
        default:
          displayLabel.setText("Error");
          break;
      }
    }
  }
}
