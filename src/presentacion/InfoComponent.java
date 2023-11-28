/**
 * 
 * Kelas ini merupakan kelas panel yang berisi JLabel untuk
 * menginformasikan kondisi yang sedang terjadi pada arena
 * permainan.
 * 
 * @author Chicuazuque-Sierra
 * @version 1.0 25/11/2023
 * 
 */
package presentacion;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoComponent extends JPanel {

	private JLabel currentPlayer;

	/**
	 * 
	 * konstruktor kelas InfoComponent
	 * 
	 */
	public InfoComponent() {
		currentPlayer = new JLabel("Turno: " + GomokuGUI.getFirstName()
				+ " | Color ficha: Negra | Total movimientos: 0");
		currentPlayer.setFont(new Font("SansSerif", Font.PLAIN, 20));
		currentPlayer.setForeground(Color.WHITE);
		add(currentPlayer);
		setBackground(Color.BLACK);
	}

	public JLabel getCurrentPlayer() {
		return currentPlayer;
	}

	/**
	 *
	 * method ini digunakan untuk mensetting info kembali ke
	 * nilai semua sebelum permainan dimainkan
	 *
	 */
	public void clearInfo() {
		currentPlayer.setText("Turno: " + GomokuGUI.getFirstName()
				+ " | Color ficha: Negra | Total movimientos: 0");
	}
}
