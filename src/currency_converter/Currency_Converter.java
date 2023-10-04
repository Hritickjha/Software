package currency_converter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Currency_Converter extends JFrame {
	private JLabel amountLabel,fromLabel,toLabel,resultLabel;
	private JTextField amountField;
	private JComboBox<String> fromComboBox, toComboBox;
	private JButton convertButton;
	private DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
	
	private final String[] currencies = {"USD","EUR","JPY","GBP","CAD","AUD","CHF","CNY","INR"};
	private double [] exchangeRates = {1.00,0.84,109.65,0.72,1.27,1.30,0.92,6.47,87.14};
	
	public Currency_Converter () {
		setTitle("currency Converter");
		setLayout(new GridLayout(4,2));
		
		amountLabel = new JLabel("Amount :");
		add(amountLabel);
		
		amountField = new JTextField();
		add(amountField);
		
		fromLabel = new JLabel("From:");
		add(fromLabel);
		
		fromComboBox = new JComboBox<>(currencies);
		add(fromComboBox);
		
		toLabel = new JLabel("To:");
		add(toLabel);
		
		toComboBox = new JComboBox(currencies);
		add(toComboBox);
		
		convertButton = new JButton("convert");
		add(convertButton);
		
		resultLabel = new JLabel();
		add(resultLabel);
		
convertButton.addActionListener(new ActionListener() {
	@Override
	public  void actionPerformed(ActionEvent e) {
		try {
			double  amount = Double.parseDouble(amountField.getText());
			String fromCurrency =(String)fromComboBox.getSelectedItem();
			String toCurrency=(String)toComboBox.getSelectedItem();
			double exchangeRate=exchangeRates[getIndex(toCurrency)]
				/exchangeRates[getIndex(fromCurrency)];
			double result = amount *exchangeRate;
			resultLabel.setText(decimalFormat.format(result)+" "+ toCurrency);
		}catch(Exception ex) {
			resultLabel.setText("Invalid input");
			
		}
	}
});
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
		
	private int getIndex(String currency) {
		for (int i=0; i < currencies.length; i++) {
			if(currency.equals(currencies[i])) {
				return i;
			}
		}
		return -1;
	}	

	public static void main(String[] args) {
		new Currency_Converter();
	}
}