package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LLenar_Arreglo extends JFrame {

	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LLenar_Arreglo frame = new LLenar_Arreglo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

/*LLENAR UN ARREGLO*/
	public LLenar_Arreglo() {
		Scanner entrada = new Scanner (System.in);
		
		int nElementos;
		
		nElementos= Integer.parseInt(JOptionPane.showInputDialog("Cuantos elementos quiere que tenga su arreglo: "));
		
		char[] letras = new char [nElementos]; /*crea el arreglo de tipo char con N Elementos */
		
		System.out.println("Digite los elementos del arreglo: ");
		for (int i = 0; i < nElementos; i++) {
			System.out.println(". Digite el caracter: N°"+(i+1));			
			letras [i] = entrada.next().charAt(1); 
			/*next es un metodo que se utiliza para leer la próxima entrada*/ 
			/*charAt(0) obtiene el la letra o num es un posicion de indice 0*/ 
			/*y el caracter obtenido se posisiona en el [i] del arreglo 'letras' cada vez que el bucle avanza*/
		}
		
		
		System.out.println("\nLos caracteres del arreglo son: ");
		for ( int i = 0; i<nElementos; i++ ) {
			System.out.print(letras[i]+" ");
		}
		
	}

}
