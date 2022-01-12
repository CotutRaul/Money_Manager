package program;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.*;


public class DatePanel {
	static String shortDate;
	JPanel datePanel;
	
	/**
	 * Class constructor which creates the top panel (the date/search panel).
	 */
	public DatePanel()
	{
		
		SimpleDateFormat formatter= new SimpleDateFormat("MM/yyyy");
		Date date = new Date(System.currentTimeMillis());
		shortDate=formatter.format(date);
		
		datePanel = new JPanel();
		//datePanel.setBackground(Color.WHITE);
		datePanel.setBounds(300,0,900,75);
		//datePanel.setLayout(new BoxLayout(datePanel, BoxLayout.X_AXIS));
		datePanel.setLayout(new FlowLayout(0));
		FramePanel.frame.add(datePanel);
		datePanel.add(Box.createHorizontalStrut(5));
		
		
		JLabel label = new JLabel("Date:");
		label.setFont(new Font("Times New Roman",Font.PLAIN,40));
		datePanel.add(label);
		datePanel.add(Box.createHorizontalStrut(10));
		
		JTextField shortDateField = new JTextField();
		shortDateField.setText(shortDate);
		shortDateField.setPreferredSize(new Dimension(100,50));
		shortDateField.setFont(new Font("Times New Roman",Font.PLAIN,25));
		datePanel.add(shortDateField);
//		datePanel.add(Box.createHorizontalGlue());
		
		JButton searchButton = new JButton("Search");
		searchButton.setPreferredSize(new Dimension(110,50));
		searchButton.setFont(new Font("Times New Roman",Font.PLAIN,25));
		datePanel.add(searchButton);
		searchButton.addMouseListener(new MouseListener()  
		{  
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					MoneyPanel.addMoneyFromDatabase(shortDateField.getText());
					shortDate=shortDateField.getText();
				} catch (Exception e3) {
					JOptionPane.showMessageDialog(null,"Incorrect search!","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {	
			}
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			@Override
			public void mouseExited(MouseEvent e) {			
			} 
		});
		
		
		
	}
}
