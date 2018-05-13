package checkers_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class About_Help_Dialog extends JDialog implements MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel background_panel;
	private String message;
	private JLabel messageTitle ,x_Button;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	public About_Help_Dialog(String what) {
		message =what;
		
		setSize(600, 450);
		setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		initComponents();
		addComponents();
		setVisible(true);
	}
	public void initComponents() {
		background_panel = new BGPanel();
		background_panel.setLayout(null);
		
		
		x_Button = new JLabel("CLOSE", SwingConstants.CENTER);
		x_Button.setBounds(0, 410, 600, 30);
		x_Button.setForeground(Color.white);
		x_Button.setFont(new Font("Helvetica", Font.BOLD, 25));
		x_Button.addMouseListener(this);
		
		messageTitle = new JLabel(message, SwingConstants.CENTER);
		messageTitle.setBounds(0, 10, 600, 50);
		messageTitle.setForeground(Color.white);
		messageTitle.setFont(new Font("Helvetica", Font.BOLD, 40));
		
		textArea = new JTextArea();
		
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(20, 70, 560,330);
		
		if(message.equals("ABOUT")) {
		
		}
		else if(message.equals("HELP")) {
			
		}
	}
	public void helpText() {
		
	}
	public void aboutText() {
		
	}
	public void addComponents() {
		add(background_panel);
	
		background_panel.add(x_Button);
		background_panel.add(messageTitle);
		background_panel.add(scrollPane);
	}
	private class BGPanel extends JPanel{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public BGPanel() {
			setSize(600, 450);
			setLayout(null);
		}
		Image board_image = new ImageIcon("src/images/main_menuBG.jpg").getImage();
		public void paintComponent(Graphics g) {
			g.drawImage(board_image, 0, 0, getWidth(), getHeight(), this);
		}
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		Object obj = arg0.getSource();
		
		if(obj == x_Button) {
			this.dispose();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Object obj = arg0.getSource();
		
		if(obj == x_Button) {
			x_Button.setFont(new Font("Helvetica", Font.BOLD, 30));
		}
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Object obj = arg0.getSource();
		
		if(obj == x_Button) {
			x_Button.setFont(new Font("Helvetica", Font.BOLD, 25));
		}
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
