package frame;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreateFrame {

	private JFrame frame;
	private JLabel seoulMap;
	private JLabel gyonggiMap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateFrame window = new CreateFrame();
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
	public CreateFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("MyTravel");
		frame.getContentPane().setBackground(new Color(255, 250, 250));
		frame.setBounds(100, 100, 842, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ImageIcon img = new ImageIcon("C:\\Users\\jongm\\Desktop\\study\\workspace\\team04\\Image2\\seoul.png");
		ImageIcon img2 = new ImageIcon("C:\\Users\\jongm\\Desktop\\study\\workspace\\team04\\Image2\\Gyeonggi.png");
		Image changing = img.getImage();
		Image changed = changing.getScaledInstance(650, 420, java.awt.Image.SCALE_SMOOTH);
		Image changing2 = img2.getImage();
		Image changed2 = changing2.getScaledInstance(650, 420, java.awt.Image.SCALE_SMOOTH);
		ImageIcon newimg = new ImageIcon(changed);
		ImageIcon newimg2 = new ImageIcon(changed2);

		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(new Color(255, 250, 240));
		menuPanel.setBounds(674, 10, 140, 275);
		frame.getContentPane().add(menuPanel);
		menuPanel.setLayout(null);

		RoundButton btnNewButton = new RoundButton("내 맛집");
		btnNewButton.setSelectedIcon(
				new ImageIcon("C:\\Users\\jongm\\Desktop\\study\\workspace\\team04\\Image2\\button.png"));
		btnNewButton.setFont(new Font("굴림체", Font.BOLD, 15));
		btnNewButton.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton.setBounds(12, 20, 116, 50);
		menuPanel.add(btnNewButton);

		RoundButton btnNewButton_1 = new RoundButton("내 여행지");
		btnNewButton_1.setSelectedIcon(
				new ImageIcon("C:\\Users\\jongm\\Desktop\\study\\workspace\\team04\\Image2\\button.png"));
		btnNewButton_1.setFont(new Font("굴림체", Font.BOLD, 15));
		btnNewButton_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1.setBounds(12, 110, 116, 50);
		menuPanel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\jongm\\Desktop\\study\\workspace\\team04\\Image2\\Home.png"));
		btnNewButton_2.setBounds(40, 190, 60, 60);
		menuPanel.add(btnNewButton_2);

		JPanel userPanel = new JPanel();
		userPanel.setBackground(new Color(240, 255, 240));
		userPanel.setBounds(674, 295, 140, 146);
		frame.getContentPane().add(userPanel);
		userPanel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("회원정보");
		lblNewLabel_1.setBounds(38, 62, 57, 15);
		userPanel.add(lblNewLabel_1);

		JPanel panel = new JPanel();
		panel.setBounds(0, 10, 663, 431);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel mapPanel = new JPanel();
		mapPanel.setBounds(12, 10, 650, 431);
		mapPanel.setLayout(null);
		frame.getContentPane().add(mapPanel);
		seoulMap = new JLabel("123", newimg, JLabel.CENTER);
		seoulMap.setBounds(0, 0, 650, 431);
		mapPanel.add(seoulMap);
		mapPanel.setVisible(false);

		JPanel mapPanel2 = new JPanel();
		mapPanel2.setBounds(12, 10, 650, 431);
		mapPanel2.setLayout(null);
		frame.getContentPane().add(mapPanel2);
		gyonggiMap = new JLabel("1234", newimg2, JLabel.CENTER);
		gyonggiMap.setBounds(0, 0, 650, 431);
		mapPanel2.add(gyonggiMap);
		mapPanel2.setVisible(false);

		JButton btnNewButton_3 = new JButton("Gyeonggi");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mapPanel2.setVisible(true);
				panel.setVisible(false);
			}
		});
		btnNewButton_3.setBackground(SystemColor.activeCaptionText);
		btnNewButton_3.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_3.setBounds(350, 140, 200, 120);
		panel.add(btnNewButton_3);

		JButton btnNewButton_3_1 = new JButton("Seoul");
		btnNewButton_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mapPanel.setVisible(true);
				panel.setVisible(false);
			}
		});
		btnNewButton_3_1.setBackground(SystemColor.activeCaptionText);
		btnNewButton_3_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_3_1.setBounds(100, 140, 200, 120);
		panel.add(btnNewButton_3_1);
		
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mapPanel.setVisible(false);
				mapPanel2.setVisible(false);
				panel.setVisible(true);
			}
		});

	}

	public void pass(ImagePanel panel) {

	}
}
