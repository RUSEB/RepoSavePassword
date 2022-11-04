package test;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.tools.Tool;

import org.w3c.dom.views.AbstractView;


public class P extends JFrame{
	public P() {
	}
	
	static JFrame frame = new JFrame();
	static JPanel scrollPanel = new JPanel();
	
	public static void main(String[] args) {
		go();
		
		
	}

	
	
	
	public static void go() {
		
		frame.getContentPane().add(P.createPanels());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolKit.getScreenSize();
		frame.setBounds(dimension.width/2-400, dimension.height/2-300, 800, 600);
		frame.setResizable(false);
		frame.setVisible(true);
		try {
			ImageIcon image = new ImageIcon("D:/Eclipse IDE folder/WorkspaceEclipse/PasswordSaveProgram/src/ru135553II000da1c378cfcb8d3060818bc24eae53864.jpg");
			frame.setIconImage(image.getImage());
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
	
	
	
	
	
	static public JPanel createPanels() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		
		JScrollPane scroll = new JScrollPane();
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVisible(true);
		
		JPanel searchPanel = new JPanel(new FlowLayout());
		JTextField search = new JTextField(50);
		
		JLabel labelSearch = new JLabel("Поиск");
		searchPanel.add(labelSearch);
		searchPanel.add(search);
		
		
		GridLayout gridLayoutS = new GridLayout(0,1,0,0);
		scrollPanel.setLayout(gridLayoutS);
		
		
		scroll.setColumnHeaderView(searchPanel);
		scroll.setViewportView(scrollPanel);
		
		JPanel menuPanel = new JPanel();
		GridLayout gridLayout = new GridLayout(17,1);
		menuPanel.setLayout(gridLayout);
		JPanel[] panelsList = new JPanel[17];
		
		for(int i = 0;i<17;i++) {
			panelsList[i] = new JPanel();
			menuPanel.add(panelsList[i]);
			switch (i) {
			case 0: {
				
				panelsList[i].add(MenuPanels.menuStr);
				break;
			}
			case 7:{
				
				panelsList[i].add(MenuPanels.createCellButton);
				MenuPanels.createCellButton.addActionListener(new CreateButtonAction());
				
				break;
			}
			case 8:{
				panelsList[i].add(MenuPanels.editCellButton);
				break;
			}
			case 9:{
				panelsList[i].add(MenuPanels.changeAccount);
				break;
			}
			case 16:{
				JPanel settingsButton = new JPanel();
				settingsButton.setLayout(new GridLayout(1,3));
				JPanel panel1 = new JPanel();
				JPanel panel2 = new JPanel();
				JPanel panel3 = new JPanel();
				panel1.add(MenuPanels.settings);
				panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
				settingsButton.add(panel1);
				settingsButton.add(panel2);
				settingsButton.add(panel3);
				panelsList[i].add(settingsButton);
				break;
				
			}
			}
			
			
		}
		
		
		mainPanel.add(menuPanel,BorderLayout.WEST);
		mainPanel.add(scroll,BorderLayout.CENTER);
		
		
		
		return mainPanel;
	}
	
	
	
	class MenuPanels{
		
		
		static JLabel menuStr = new JLabel("Меню");
		
		
		static JButton createCellButton = new JButton("Добавить пароль");
		
		
		static JButton editCellButton = new JButton("  Редактировать  ");
		
		
		static JButton changeAccount = new JButton("   Совсем скоро   ");
		
		
		static JButton settings = new JButton("@");
		
	}
	
	


}


class CreateButtonAction extends AbstractAction{
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		P.scrollPanel.add(createCell("VK", "GRI$#$@E%%"));
		System.out.println("Cell create");
		P.frame.revalidate();
	}
	public JPanel createCell(String name,String password) {
		CellPassword cell = new CellPassword(name,password);
		return cell.getJPanelCell();
	}
	
}


















