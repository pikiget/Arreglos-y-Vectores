package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

public class Ejercicio_10 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_10 frame = new Ejercicio_10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*Crear un programa que lea por teclado una tabla de 10 números enteros
	 *y desplace N posiciones en el arreglo(N es digitado por el usuario)
	 * */
	public Ejercicio_10() {
		Scanner entrada = new Scanner(System.in);
		int posicion, ultimo;
		int[] arreglo = new int[10];
		
		
		
		
		for(int i=0; i<10; i++) {
			System.out.print("Digite su número: ");
			arreglo[i] = entrada.nextInt();
		}

		System.out.print("Digite la cantidad de posiciones a dezplazar: ");
		posicion = entrada.nextInt();
		
		for(int vuelta=1; vuelta<=posicion; vuelta++) {
			ultimo = arreglo[9];
			for(int i=8;i>=0;i--) {
				arreglo[i+1] = arreglo[i];
			}
			
			arreglo[0] = ultimo;
		}
		
		System.out.println("EL ultimo resultante es: ");
		for(int i=0; i<10; i++) {
			System.out.println(i+". Elementos: " + arreglo[i]);
		}
	}
	

}
