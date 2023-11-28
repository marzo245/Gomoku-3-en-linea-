/**
 * Kelas ini merupakan kelas frame serta berisi main method.
 * Kelas ini berisi segala komponen yang ditampilkan pada frame. 
 * 
 * @author Chicuazuque-Sierra
 * @version 1.0 25/11/2023
 */
package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import dominio.BoardComponent;
import dominio.GameController;

public class GomokuGUI extends JFrame implements ActionListener {
	private static GomokuGUI gomokuGUI;

	private static JPanel menu;
	private static TitleComponent title;
	private static JButton play2PlayerButton;
	private static JButton playWithComputerButton;
	private static JButton playMachineVsMachineButton;
	private static JButton exitButton;
	private static JPanel panel;
	private static BoardComponent boardComponent;
	private static InfoComponent infoComponent;
	private static ScoreComponent scoreComponent;
	private static ButtonComponent buttonComponent;
	private static TimerComponent timerComponent;
	private static String firstName;
	private static String secondName;

	public GomokuGUI() {
		setTitle("Gomoku");
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		getContentPane().setBackground(Color.BLACK);

		constructMainDisplay();

		add(menu, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);

		setVisible(true);
	}

	public void constructMainDisplay() {
		Dimension size = new Dimension(800, 600);

		menu = new JPanel();
		menu.setPreferredSize(size);
		menu.setLayout(null);
		menu.setBackground(Color.BLACK);

		JPanel container = new JPanel();
		container.setLayout(new GridLayout(5, 1));
		container.setBackground(Color.BLACK);
		menu.add(container);
		container.setPreferredSize(size);

		title = new TitleComponent();

		play2PlayerButton = new JButton("Jugador vs Jugador");
		play2PlayerButton.setForeground(Color.WHITE);
		play2PlayerButton.setFont(new Font("SansSerif", Font.PLAIN, 48));
		play2PlayerButton.setOpaque(false);
		play2PlayerButton.setContentAreaFilled(false);
		play2PlayerButton.addActionListener(this);
		play2PlayerButton.setFocusPainted(false);

		playWithComputerButton = new JButton("Jugador vs Computador");
		playWithComputerButton.setForeground(Color.WHITE);
		playWithComputerButton.setFont(new Font("SansSerif", Font.PLAIN, 48));
		playWithComputerButton.setOpaque(false);
		playWithComputerButton.setContentAreaFilled(false);
		playWithComputerButton.addActionListener(this);
		playWithComputerButton.setFocusPainted(false);

		playMachineVsMachineButton = new JButton("Computador vs Computador");
		playMachineVsMachineButton.setForeground(Color.WHITE);
		playMachineVsMachineButton.setFont(new Font("SansSerif", Font.PLAIN, 48));
		playMachineVsMachineButton.setOpaque(false);
		playMachineVsMachineButton.setContentAreaFilled(false);
		playMachineVsMachineButton.addActionListener(this);
		playMachineVsMachineButton.setFocusPainted(false);

		exitButton = new JButton("Exit");
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("SansSerif", Font.PLAIN, 48));
		exitButton.setOpaque(false);
		exitButton.setContentAreaFilled(false);
		exitButton.addActionListener(this);
		exitButton.setFocusPainted(false);

		container.add(title);
		container.add(play2PlayerButton);
		container.add(playWithComputerButton);
		container.add(playMachineVsMachineButton);
		container.add(exitButton);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		container.setBounds((screenSize.width - size.width) / 2, (screenSize.height - size.height) / 2, size.width,
				size.height);

		panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));
		panel.setBackground(Color.BLACK);
		JLabel about1 = new JLabel("Creado por Diego Chicuazuque y Yeltzyn Sierra");
		about1.setForeground(Color.WHITE);
		about1.setFont(new Font("SansSerif", Font.PLAIN, 10));
		panel.add(about1);
		JLabel about2 = new JLabel("Proyecto de POOB 2023-2");
		about2.setForeground(Color.WHITE);
		about2.setFont(new Font("SansSerif", Font.PLAIN, 10));
		panel.add(about2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exitButton) {
			int optionValue = JOptionPane.showConfirmDialog(null, "Estas seguro de salir del juego?", "Confirm Exit",
					JOptionPane.OK_CANCEL_OPTION);
			if (optionValue == 0) {
				System.exit(0);
			}
		} else {
			remove(menu);
			remove(panel);

			Dimension boardSize = new Dimension(600, 600);

			panel = new JPanel();
			add(panel, BorderLayout.CENTER);
			panel.setPreferredSize(boardSize);
			panel.setBackground(Color.BLACK);
			panel.setLayout(null);

			boardComponent = new BoardComponent();
			panel.add(boardComponent);
			boardComponent.setPreferredSize(boardSize);

			infoComponent = new InfoComponent();
			scoreComponent = new ScoreComponent();
			buttonComponent = new ButtonComponent();
			timerComponent = new TimerComponent();

			add(infoComponent, BorderLayout.NORTH);
			add(scoreComponent, BorderLayout.EAST);
			add(buttonComponent, BorderLayout.SOUTH);
			add(timerComponent, BorderLayout.WEST);

			revalidate();
			boardComponent.setBounds((panel.getWidth() - boardSize.width) / 2,
					(panel.getHeight() - boardSize.height) / 2, boardSize.width, boardSize.height);
			revalidate();

			if (e.getSource() == play2PlayerButton) {
				GameController.setIsPlayWithComputer(false);
				GameController.setIsPlayOnliComputer(false);
			} else if (e.getSource() == playWithComputerButton) {
				GameController.setIsPlayWithComputer(true);
				GameController.setIsPlayOnliComputer(false);
			} else if (e.getSource() == playMachineVsMachineButton) {
				GameController.setIsPlayOnliComputer(true);
			}
			welcomeScreen();
		}
	}

	public static void main(String[] args) {
		gomokuGUI = new GomokuGUI();
	}

	public static BoardComponent getBoardComponent() {
		return boardComponent;
	}

	public static InfoComponent getInfoComponent() {
		return infoComponent;
	}

	public static String getFirstName() {
		return firstName;
	}

	public static String getSecondName() {
		return secondName;
	}

	/**
	 * 
	 * method ini dipanggil setelah pemain memilih mode bermain dan tepat sebelum
	 * permainan dimulai. Method ini dialog tempat pemain untuk memasukkan nama
	 * serta
	 * mengatur kapan timer permainan berjalan
	 * 
	 */
	public static void welcomeScreen() {
		if (!GameController.getPlayOnliComputer()) {
			firstName = JOptionPane.showInputDialog(null,
					"Bienvenido a GOMOKU!", "Ingresa el nombre del jugador uno");
			firstName = firstName == null ? "Primer jugador" : firstName;
			firstName = firstName.equals("Ingresa el nombre jugador 1") ? "Primer jugador"
					: firstName;

			infoComponent.clearInfo();

			/*
			 * jika pemain memilih bermain melawan komputer, maka setelah dia, yaitu
			 * pemain pertama memasukkan nama maka timer permainan dimulai
			 */
			if (GameController.getIsPlayWithComputer()) {
				TimerComponent.getTimer().start();
			}

			/*
			 * jika tidak bermain melawan komputer, maka pemain kedua memasukkan namanya
			 * dan setelah namanya dimasukkan timer permainan dimulai
			 */
			if (!GameController.getIsPlayWithComputer()) {
				secondName = JOptionPane.showInputDialog(null,
						"Bienvenido a GOMOKU!", "Ingresa el nombre  del jugador dos");
				secondName = secondName == null ? "Segundo jugador" : secondName;
				secondName = secondName.equals("Ingresa el nombre jugador 2") ? "Segundo jugador"
						: secondName;
				TimerComponent.getTimer().start();
			}
		} else {
			TimerComponent.getTimer().start();
		}

	}

	/**
	 * 
	 * method ini dipanggil ketika pemain berada dalam arena permainan dan
	 * ingin kembali ke menu utama. method ini menghapus komponen-komponen yang
	 * berada pada frame ketika permainan berlangsung dan mengubah tampilan
	 * menjadi menu utama dengan memanggil method constructMainDisplay() untuk
	 * membuat komponen pada menu utama
	 * 
	 */
	public void mainMenu() {
		gomokuGUI.remove(panel);
		gomokuGUI.remove(infoComponent);
		gomokuGUI.remove(scoreComponent);
		gomokuGUI.remove(buttonComponent);
		gomokuGUI.remove(timerComponent);

		constructMainDisplay();

		gomokuGUI.add(menu, BorderLayout.CENTER);
		gomokuGUI.add(panel, BorderLayout.SOUTH);

		gomokuGUI.revalidate();
		GameController.restartGame();

	}

	public static GomokuGUI getGomokuGUI() {
		return gomokuGUI;
	}
}
