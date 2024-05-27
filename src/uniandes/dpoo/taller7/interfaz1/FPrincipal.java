package uniandes.dpoo.taller7.interfaz1;

import java.awt.BorderLayout;

import javax.swing.JFrame;



public class FPrincipal extends JFrame {


	public FPrincipal() {
		this.setSize(800, 600);
		this.setTitle("Juego LIGHTSOUT");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		this.setVisible(true);
	}
	public static void main(String[] args){
		new FPrincipal();

	}
}



