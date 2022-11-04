package test;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.Button;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import java.awt.Insets;

public class Frame_F extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame_F() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setAutoscrolls(false);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(20, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Меню");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		
		JButton btnNewButton = new JButton("New button");
		panel_6.add(btnNewButton);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_7.add(btnNewButton_1);
		
		JPanel panel_8 = new JPanel();
		panel_1.add(panel_8);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_8.add(btnNewButton_2);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_1.add(panel_11);
		
		JPanel panel_11_1 = new JPanel();
		panel_1.add(panel_11_1);
		
		JPanel panel_11_2 = new JPanel();
		panel_1.add(panel_11_2);
		
		JPanel panel_11_3 = new JPanel();
		panel_1.add(panel_11_3);
		
		JPanel panel_11_4 = new JPanel();
		panel_1.add(panel_11_4);
		
		JPanel panel_11_5 = new JPanel();
		panel_1.add(panel_11_5);
		
		JPanel panel_11_6 = new JPanel();
		panel_1.add(panel_11_6);
		
		JPanel panel_11_7 = new JPanel();
		panel_1.add(panel_11_7);
		
		JPanel panel_11_8 = new JPanel();
		panel_1.add(panel_11_8);
		
		JPanel panel_11_9 = new JPanel();
		panel_1.add(panel_11_9);
		
		JPanel panel_11_10 = new JPanel();
		panel_1.add(panel_11_10);
		panel_11_10.setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_11_10.add(panel_13);
		panel_13.setLayout(new BoxLayout(panel_13, BoxLayout.X_AXIS));
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(Frame2.class.getResource("/images/png-clipart-gear-icon-gears-file-transport-transportation-thumbnailк.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_13.add(btnNewButton_5);
		
		JPanel panel_14 = new JPanel();
		panel_11_10.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_11_10.add(panel_15);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setColumnHeaderView(panel);
		
		JLabel lblNewLabel = new JLabel("Поиск");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(50);
		
		
		
		
		//THIS
		JPanel panel_2 = new JPanel();
		
		
		
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JPanel panel_12 = new JPanel();
		panel_2.add(panel_12);
	}
}
