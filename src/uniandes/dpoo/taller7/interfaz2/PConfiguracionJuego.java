package uniandes.dpoo.taller7.interfaz2;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PConfiguracionJuego extends JPanel{
	
	private JPanel pConfig;
	private JLabel tamano;
	private JComboBox cuadricula;
	private JLabel dificultad;
	private JRadioButton facil;
	private JRadioButton medio;
	private JRadioButton dificil;
	
	public PConfiguracionJuego() {
		this.pConfig = new JPanel();
		this.pConfig.setLayout(new FlowLayout());
		this.tamano = new JLabel("Tamaño");
		this.add(tamano);
		this.cuadricula = new JComboBox();
		this.add(cuadricula);
		this.dificultad = new JLabel("Dificultad");
		this.add(dificultad);
		this.facil = new JRadioButton("Facil");
		this.add(facil);
		this.medio = new JRadioButton("Medio");
		this.add(medio);
		this.dificil = new JRadioButton("Dificil");
		this.add(dificil);
		

	}
	

}
