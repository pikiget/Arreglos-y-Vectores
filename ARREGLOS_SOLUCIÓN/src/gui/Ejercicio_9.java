package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

public class Ejercicio_9 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_9 frame = new Ejercicio_9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*Crear un programa que lea por teclado una tabla de 10 números enteros
	 *y la desplace una posición hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero
	 *y asi sucesivamente. El último pasa a ser el primero */
	public Ejercicio_9() {
		Scanner entrada = new Scanner(System.in);
		
		int[] tabla = new int[10];
		int ultimo;
		
		System.out.println("Llenar el arreglo");
		for(int i=0; i<10; i++) {
			System.out.print((i+1) + ". Digite un número: ");
			tabla[i] = entrada.nextInt();
		}
		
		ultimo = tabla[9];
		for(int i=8;i>=0;i--) { //avanzar una posicion abajo en el arreglo
			tabla[i+1] = tabla[i];
		}
	
		tabla[0] = ultimo; //Ponemos el ultimo elemento como primero
		
		System.out.println("El nuevo arreglo es: ");
		for(int i=0;i<10;i++) {
			System.out.println(i + "Número: " + tabla[i]);
		}
	}

}
