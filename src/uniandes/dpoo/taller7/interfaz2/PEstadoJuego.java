package uniandes.dpoo.taller7.interfaz2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PEstadoJuego extends JPanel{

	private JLabel lJugadas;
	private JTextField tNumJugadas;
	private JLabel lJugadores;
	private JTextField tNumJugadores;


	public PEstadoJuego() {
		this.setLayout(new FlowLayout());
		this.lJugadas = new JLabel("Jugadas");
		this.add(lJugadas);
		this.tNumJugadas = new JTextField();
		this.add(tNumJugadas);
		this.lJugadores = new JLabel("Jugadores");
		this.add(lJugadores);
		this.tNumJugadores = new JTextField();
		this.add(tNumJugadores);



	}


}
