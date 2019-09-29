package linrarymanagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class firstpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstpage window = new firstpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public firstpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 50, 204));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		
		JLabel lblLibrarian = new JLabel("Librarian");
		lblLibrarian.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblLibrarian.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblLibrarian.setIcon(new ImageIcon("D:\\eclipsejavacodes\\linrarymanagement\\image\\administrator_male_240px.png"));
		lblLibrarian.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLibrarian.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrarian.setBounds(10, -23, 226, 268);
		panel_3.add(lblLibrarian);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(116)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(108, Short.MAX_VALUE))
				.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(62)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))
					.addGap(82))
		);
		panel_2.setLayout(null);
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAdmin.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblAdmin.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setBounds(10, -23, 238, 268);
		panel_2.add(lblAdmin);
		lblAdmin.setIcon(new ImageIcon("D:\\eclipsejavacodes\\linrarymanagement\\image\\admin_settings_male_240px.png"));
		
		JLabel lblLibraryManagementSystem = new JLabel("Library Management System");
		lblLibraryManagementSystem.setForeground(new Color(255, 255, 255));
		lblLibraryManagementSystem.setFont(new Font("Perpetua Titling MT", Font.BOLD, 26));
		
		JLabel lblNewLabelfv = new JLabel("");
		lblNewLabelfv.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelfv.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabelfv.setIconTextGap(2);
		lblNewLabelfv.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabelfv.setIcon(new ImageIcon("D:\\eclipsejavacodes\\linrarymanagement\\image\\library_64px.png"));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(98)
					.addComponent(lblNewLabelfv, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblLibraryManagementSystem, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(73, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLibraryManagementSystem, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabelfv, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(32))))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		frame.getContentPane().add(panel);
		frame.setBounds(100, 100, 790, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
