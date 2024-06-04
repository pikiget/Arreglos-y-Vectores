package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;


public class Bucle_For_Each extends JFrame {

	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bucle_For_Each frame = new Bucle_For_Each();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/*BUCLE for each*/
	public Bucle_For_Each() {
		
		String [] nombres = {"Maria","Juan","Jose","Pedro","Luis","Alberto","Gilberto","Joel","Luciana","Gabriela"};

		for(String i: nombres) {
			System.out.println("Nombre: " + i);
		}
	}

}
