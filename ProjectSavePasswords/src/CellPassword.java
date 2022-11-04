import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.security.KeyStore.PasswordProtection;

import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class CellPassword {
	
	static int countPassword = 0;
	protected ImageIcon image;
	int index;
	String name;
	String password;
	
	
	JLabel nameJLabel;

	JLabel passwordJLabel;
	
	JButton buttonCopy = new JButton("");
	JButton buttonView = new JButton("");
	JPanel panelPassword = new JPanel();
	
	
	
	
	// Constructor WITHOUT image
	public CellPassword(String name,String password) {
		this.image =new ImageIcon("D:/Eclipse IDE folder/WorkspaceEclipse/PasswordSaveProgram/src/ru135553II000da1c378cfcb8d3060818bc24eae53864.jpg");
		methodConstructor(name,password);
		
		
	}
	public void methodConstructor(String name,String password) {
		countPassword++;
		this.index = countPassword;
		this.name = name;
		this.password = password;
		
		buttonCopy.setIcon(new ImageIcon(""));
		
		panelPassword.setVisible(true);
		panelPassword.setLayout(new GridLayout(1,2));
		panelPassword.setMaximumSize(new Dimension(MainClassForProgram.scrollPanel.getWidth(),(int)(MainClassForProgram.scrollPanel.getHeight()*0.1)));
		panelPassword.setMinimumSize(new Dimension(MainClassForProgram.scrollPanel.getWidth(),(int)(MainClassForProgram.scrollPanel.getHeight()*0.1)));
		
		nameJLabel = new JLabel(index+") "+name);
		
		
		
		JPanel nameJPanel= new JPanel();
		nameJPanel.setLayout(new BoxLayout(nameJPanel, BoxLayout.X_AXIS));
		nameJPanel.add(nameJLabel);
		panelPassword.add(nameJPanel);
		
		
		
		JPanel mainPanel = new JPanel();
		
		JPanel view = new JPanel();
		view.setLayout(new BoxLayout(view,BoxLayout.X_AXIS));
		view.add(buttonView);
		mainPanel.add(view);
		//panelPassword.add(view);
		
		passwordJLabel = new JLabel(password);
		passwordJLabel.setLayout(new BoxLayout(passwordJLabel, BoxLayout.X_AXIS));
		passwordJLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		passwordJLabel.setMinimumSize(new Dimension((int)(panelPassword.getWidth()*1),(int)(panelPassword.getHeight()*0.5)));
		mainPanel.add(passwordJLabel);
		panelPassword.add(passwordJLabel);
	
		JPanel copy = new JPanel();
		copy.add(buttonCopy);
		mainPanel.add(copy);
		//panelPassword.add(copy);
		
		buttonCopy.addActionListener(new CopyActionButton());
		buttonView.addActionListener(new ViewActionButton());
		panelPassword.add(mainPanel);
		
		System.out.println("Create");
		
		
	}
	
	// Constructor WITH image
	public CellPassword(String name,String password, ImageIcon image) {
		this.image = image;
		methodConstructor(name,password);
		
		
	}
	
	 JLabel getPasswordJLabel() {
		return passwordJLabel;
	}
	
	
	
	
	public JPanel getJPanelCell(){
		return panelPassword;
	}
	class CopyActionButton extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			String myString = password;
			StringSelection stringSelection = new StringSelection(myString);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);
			System.out.println("Copy");
			
		}
		
	}
	class ViewActionButton extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Success");
			JLabel area =getPasswordJLabel();
			if(area.getText().charAt(0)!='*') {
				int countPoint = area.getText().length();
				String point = "";
				for (int i = 0;i<countPoint;i++) {
					point+="*";
				}
				area.setText(point);
				area.setFont(new Font("Times New Roman", Font.BOLD, 19));
				MainClassForProgram.frame.revalidate();
			
			}else {
				area.setText(password);
				area.setFont(new Font("Times New Roman", Font.BOLD, 14));
				
			}
			
			System.out.println("Success");
		
		}
		
	}
	
}
