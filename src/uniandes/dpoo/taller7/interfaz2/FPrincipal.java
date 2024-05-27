package uniandes.dpoo.taller7.interfaz2;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class FPrincipal extends JFrame {
	JPanel pConfig;
	JPanel pIniciar;
	JPanel pEstado;

	public FPrincipal() {
		this.setSize(800, 600);
		this.setTitle("Juego LIGHTSOUT");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.pConfig = new PConfiguracionJuego();
		this.add(pConfig, BorderLayout.NORTH);
		this.pIniciar = new PBotonesIniciar();
		this.add(pIniciar,BorderLayout.EAST);
		this.pEstado = new PEstadoJuego();
		this.add(pEstado,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new FPrincipal();

	}
}



