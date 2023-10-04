package coding_software;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HangmanGame extends JFrame implements ActionListener{
	private String[] words = {"hangman","java","swing","programming","openai"};
	private String wordToGuess;
	private int guessesLeft = 6;
	private StringBuilder hiddenword;
	
	private JLabel hiddenwordLabel;
	private JLabel guessesLeftLabel;
	private JTextField guesstTextField;
	private JButton guessButton;
	
	public HangmanGame() {
		setTitle("Hangman Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		hiddenwordLabel = new JLabel();
		guessesLeftLabel = new JLabel("Guesses Left:"+ guessesLeft);
		guesstTextField = new JTextField(10);
		guessButton = new JButton("Guess");
		guessButton.addActionListener(this);
		guesstTextField.addActionListener(this);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		mainPanel.add(hiddenwordLabel);
		mainPanel.add(guessesLeftLabel);
		mainPanel.add(guesstTextField);
		mainPanel.add(guessButton);
		
		getContentPane().add(mainPanel);
		initializeGame();
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private void initializeGame() {
		wordToGuess = words[(int)(Math.random()* words.length)];
		hiddenword = new StringBuilder();
		for(int i = 0; i < wordToGuess.length(); i++) {hiddenword.append("_");	
		}
		hiddenwordLabel.setText(hiddenword.toString());
		guessesLeft = 6;
		guessesLeftLabel.setText("guessesLeft:"+guessesLeft);
	}
	private void updateHiddenWord(char guess) {
		boolean found = false;
		for(int i = 0; i<wordToGuess.length(); i++) {
			if(wordToGuess.charAt(i)==guess) {
				hiddenword.setCharAt(i, guess);
				found = true;
			}
		}
		hiddenwordLabel.setText(hiddenword.toString());
	if (!found) {
		guessesLeft--;
		guessesLeftLabel.setText("Guesses Left:"+ guessesLeft);
		if(guessesLeft == 0) {
			endgame("you lose! The word was:"+ wordToGuess);	
		}
	}else if(hiddenword.toString().equals(wordToGuess)) {
		endgame("congratulations! you won!");
	}
}
	private void endgame(String message) {
		guesstTextField.setEnabled(false);
		guessButton.setEnabled(true);
		guesstTextField.requestFocus();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == guessButton||e.getSource() == guesstTextField) {
			String guessText = 	guesstTextField.getText();
			if(guessText.length()>0) {
				char guess = guessText.charAt(0);
				updateHiddenWord(guess);
				guesstTextField.setText(" ");
			}
		}		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(HangmanGame :: new);
	}
}


