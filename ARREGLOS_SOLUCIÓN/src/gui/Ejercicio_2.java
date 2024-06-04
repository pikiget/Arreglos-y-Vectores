package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

public class Ejercicio_2 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_2 frame = new Ejercicio_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*Leer 5 números, guardaelos en un arreglo y mostrarlos en el orden inverso al introducido*/
	public Ejercicio_2() {
		Scanner entrada = new Scanner(System.in);
		
		float [] numeros = new float [5];
		
		System.out.println("guardar los datos en un arreglo");
		
		for(int i=0 ; i < 5 ; i++) {
			System.out.print((i + 1) + ".Digite su número: ");
			numeros[i] = entrada.nextFloat();
		}
		System.out.println("\nImprimir los elementos del arreglo en orden inverso");
		
		for(float i=4; i>=0; i--) {
			
			System.out.println(i); 
		}
	}
}
