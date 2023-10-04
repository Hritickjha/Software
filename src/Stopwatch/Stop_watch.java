package Stopwatch;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Stop_watch extends JFrame implements ActionListener{
	private JLabel timeLabel;
	private JButton startButton,stopButton,resetButton;
	private Timer timer;
	private int elapsedTime;
	
	public Stop_watch() {
		timeLabel = new JLabel("00:00:00",JLabel.CENTER);
		timeLabel.setFont(new Font("Arial",Font.PLAIN,50));
		timeLabel.setForeground(Color.red);
		
		startButton = new JButton("start");
		startButton.addActionListener(this);
		stopButton = new JButton("stop");
		stopButton.addActionListener(this);
		resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		
		JPanel buttonpanel = new JPanel();
		buttonpanel.setLayout(new GridLayout(1,3));
		buttonpanel.add(startButton);
		buttonpanel.add(stopButton);
		buttonpanel.add(resetButton);
		
		Container contentpane = getContentPane();
		 contentpane.setLayout(new BorderLayout());
		 contentpane.add(timeLabel,BorderLayout.CENTER);
		contentpane.add(buttonpanel,BorderLayout.SOUTH);
		
		//set up the timer
		timer = new Timer(1000,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				elapsedTime += 1000;
				upadeTimeLabel();
			}
		});
	}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()== startButton) {
		timer.start();
	}else if (e.getSource()== stopButton) {
		timer.stop();
	}else if(e.getSource()== resetButton) {
		timer.stop();
		elapsedTime = 0;
		upadeTimeLabel();
	}
}
private void upadeTimeLabel() {
	int hours = elapsedTime /3600000;
	int minutes = (elapsedTime %3600000)/60000;
	int seconds = (elapsedTime % 60000)/1000;
	String time = String.format
	("%02d:%02d:%02d",hours,minutes,seconds);
	timeLabel.setText(time);
}

	public static void main(String[] args) {
		Stop_watch Frame = new Stop_watch();
	Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Frame.setSize(300,250);
	Frame.setVisible(true);
	}

}
