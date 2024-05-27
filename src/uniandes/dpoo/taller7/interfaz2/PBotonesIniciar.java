package uniandes.dpoo.taller7.interfaz2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PBotonesIniciar extends JPanel{

	private JButton bNuevo;
	private JButton bReinicar;
	private JButton bTop10;
	private JButton bCambiarJugador;

	public PBotonesIniciar() {
		this.setLayout(new GridLayout(4, 1, 10, 10));
		this.bNuevo = new JButton("NUEVO");
		this.add(bNuevo);
		this.bReinicar = new JButton("REINICIAR");
		this.add(bReinicar);
		this.bTop10 = new JButton("TOP-10");
		this.add(bTop10);
		this.bCambiarJugador = new JButton("CAMBIAR JUGADOR");
		this.add(bCambiarJugador);



	}


}
