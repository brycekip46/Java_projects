package programs;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	public Calculator() {
		super("Calculator");
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 400, 200);
		topPanel.setLayout(null);
		JTextArea input = new JTextArea();
		input.setBounds(20, 20, 350, 150);
		input.setFont(new Font("MV Boli",Font.BOLD,20));
		input.setLineWrap(true);
		input.setWrapStyleWord(true);

		topPanel.add(input);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 200, 400, 400);

		bottomPanel.setLayout(new GridLayout(5, 4));
		JButton clearButton = new JButton("AC");
		JButton divButton = new JButton("/");
		JButton multiButton = new JButton("X");
		JButton eraseButton = new JButton();
		JButton sevButton = new JButton("7");
		JButton eightButton = new JButton("8");
		JButton nineButton = new JButton("9");
		JButton minusButton = new JButton("-");
		JButton fourButton = new JButton("4");
		JButton fiveButton = new JButton("5");
		JButton sixButton = new JButton("6");
		JButton addButton = new JButton("+");
		JButton oneButton = new JButton("1");
		JButton twoButton = new JButton("2");
		JButton threeButton = new JButton("3");
		JButton equalButton = new JButton("=");
		JButton percentButton = new JButton("%");
		JButton zeroButton = new JButton("0");
		JButton deciButton = new JButton(".");
		JButton equalsButton = new JButton("=");

		bottomPanel.add(clearButton);
		bottomPanel.add(divButton);
		bottomPanel.add(multiButton);
		bottomPanel.add(eraseButton);
		bottomPanel.add(sevButton);
		bottomPanel.add(eightButton);
		bottomPanel.add(nineButton);
		bottomPanel.add(minusButton);
		bottomPanel.add(fourButton);
		bottomPanel.add(fiveButton);
		bottomPanel.add(sixButton);
		bottomPanel.add(addButton);
		bottomPanel.add(oneButton);
		bottomPanel.add(twoButton);
		bottomPanel.add(threeButton);
		bottomPanel.add(equalButton);
		bottomPanel.add(percentButton);
		bottomPanel.add(zeroButton);
		bottomPanel.add(deciButton);
		bottomPanel.add(equalsButton);

		setLayout(null);
		add(topPanel);
		add(bottomPanel);
		setSize(400, 635);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}

}
