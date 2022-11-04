package test;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CellPassword {
	
	protected ImageIcon image;
	String name;
	String password;
	protected JPanel jpanel;
	JButton buttonCopy = new JButton("Копировать");
	JPanel panelPassword = new JPanel();
	
	
	
	// Constructor WITHOUT image
	public CellPassword(String name,String password) {
		this.name = name;
		this.password = password;
		this.image =new ImageIcon("D:/Eclipse IDE folder/WorkspaceEclipse/PasswordSaveProgram/src/ru135553II000da1c378cfcb8d3060818bc24eae53864.jpg");
		buttonCopy.addActionListener(new CopyActionButton());
		panelPassword.setVisible(true);
		System.out.println("Create");
		
		
		
	}
	
	// Constructor WITH image
	public CellPassword(String name,String password, ImageIcon image) {
		this.name = name;
		this.password = password;
		this.image = image;
		buttonCopy.addActionListener(new CopyActionButton());
		
		
	}
	
	public JPanel getJPanelCell(){
		panelPassword.add(buttonCopy);
		return panelPassword;
	}
	static class CopyActionButton extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Copy");
			
		}
		
	}
	
}
