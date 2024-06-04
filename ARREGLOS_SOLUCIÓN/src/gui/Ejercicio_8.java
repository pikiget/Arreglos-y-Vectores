package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

public class Ejercicio_8 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_8 frame = new Ejercicio_8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*Diseñar una aplicacion que declare una tabla de 10 elementos enteros.
	 *Leer mediante el teclado 8 números
	 *Después se debe pedir un número y una posicion, insertarlo en la posicion indicada, 
	 *desplazando los que estén detrás
	 **/
	public Ejercicio_8() {
		Scanner entrada = new Scanner(System.in);
		int[] tabla = new int[10];
		int numero, posicion;

		System.out.println("Ingresar datos a la tabla");	
		for(int i=0; i<8; i++) {
			System.out.print((i+1)+". Digite un número: ");
			tabla[i]=entrada.nextInt();
		}

		System.out.println("\nDigite un número: ");
		numero = entrada.nextInt();
		System.out.print("Digite una posicicion del (1-10)");
		posicion = entrada.nextInt();
		
		//Correr una posicion los elementos detras de la posicion que el usuario quiere
		for(int i=7; i>=posicion; i--) {
			tabla[i+1] = tabla[i];
		}
		tabla[posicion] = numero; //insertamos el numero en la posicion requerida
		
		System.out.println("El nuevo arreglo es:");
		for(int i=0; i<9; i++) {
			System.out.println("Posicion "+(i+1)+": " + tabla[i]);
		}
		
			
		
	}

}
