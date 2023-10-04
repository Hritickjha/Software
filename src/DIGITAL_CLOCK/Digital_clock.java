package DIGITAL_CLOCK;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Digital_clock extends JFrame {
	private JLabel timelabel;
	private JLabel dateLabel;
	public Digital_clock() {
		setTitle("Digital clock");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
//create a panel to hold the time and date labels
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		panel.setLayout(new BorderLayout());
//create a label to display the time
		timelabel = new JLabel();
		timelabel.setFont(new Font("Arial",Font.PLAIN,60));
		timelabel.setVerticalAlignment(SwingConstants.CENTER);
		timelabel.setForeground(Color.RED);
//create a label to display the data
		dateLabel = new JLabel();
		timelabel.setFont(new Font("Arial", Font.PLAIN,60));
		timelabel.setVerticalAlignment(SwingConstants.CENTER);
		dateLabel.setForeground(Color.WHITE);
//Add the time and date labels to the panel
		panel.add(timelabel,BorderLayout.CENTER);
		panel.add(dateLabel, BorderLayout.SOUTH);
//Set the panel's background color
		panel.setBackground(Color.BLACK);
//Add the panel to the frame
		add(panel);
/*Use a Timer to update the time and date labels every second */
		Timer timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateTimeAndDate();
			}
		});
		timer.start();
		}
	private void updateTimeAndDate() {
	//Get the current time and Format it
	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat timeformatter = new SimpleDateFormat("HH:mm:ss");
	String time = timeformatter.format(calendar.getTime());
	//Get the current date and format it
	SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE,MMM dd,yyy");
	String date = dateFormatter.format(calendar.getTime());
	//update the time and date labels
	timelabel.setText(time);
	dateLabel.setText(date);
}
	public static void main(String[] args) {
		Digital_clock clock = new Digital_clock();
		clock.setVisible(true);
	}	
}

