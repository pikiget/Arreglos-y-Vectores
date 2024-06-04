package gui;


import java.awt.EventQueue;
import javax.swing.JFrame;


public class Intruccion extends JFrame {

	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intruccion frame = new Intruccion();
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
	public Intruccion() {
		
		/*int [] numeros = new int [3];
		
		numeros[0] = 7;
		numeros[1] = 10;
		numeros[2] = 13;
		
		for(int i = 0; i<3; i++) {
			System.out.println(numeros[i]);
		}*/
		
		int [] numeros =  {5,7,9,10};
		
		for(int i = 0; i < 4; i++ ) {
			System.out.println(numeros[i]);
		}
	}

}
