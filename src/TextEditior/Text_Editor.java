package TextEditior;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.sound.sampled.spi.AudioFileWriter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Text_Editor extends JFrame implements ActionListener{

	private static final long serialversionUID = 1L;
	private JTextArea textArea;
	private JButton openButton, saveButton;
	
	public Text_Editor() {
		super("Text Editor");
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		getContentPane().add(buttonPanel,BorderLayout.PAGE_START);
		
		openButton = new JButton("open");
		openButton.addActionListener(this);
		buttonPanel.add(openButton);
		
		saveButton = new JButton("save");
		saveButton.addActionListener(this);
		buttonPanel.add(saveButton);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== openButton) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileFilter(new FileNameExtensionFilter("Text files","txt"));
			int returnVal = fileChooser.showOpenDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				try {
					FileReader reader = new FileReader(fileChooser.getSelectedFile());
					BufferedReader br = new BufferedReader(reader);
					String line;
					StringBuilder sb = new StringBuilder();
					while((line = br.readLine())!= null) {
						sb.append(line).append("\n");
					}
					textArea.setText(sb.toString());
					
					br.close();
					reader.close();
				} catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		} else if (e.getSource()== saveButton) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileFilter(new FileNameExtensionFilter ("Text files","txt"));
			int returnVal = fileChooser.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				try {
					FileWriter writer = new FileWriter
					(fileChooser.getSelectedFile());
					writer.write(textArea.getText());
					writer.close();
				} catch (IOException ex) {
					ex.printStackTrace();	
				}	
			}
		}
	}
	
	public static void main(String[] args) {
		new Text_Editor();
	}
}	
		

