package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejercicio_1 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_1 frame = new Ejercicio_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

/*EJERCICIO N°1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido*/

	public Ejercicio_1() {
		
		Scanner entrada = new Scanner(System.in);
		
		float [] numeros = new float[5];
		
		System.out.println("Guardando los datos en el arreglo");
		
		for (int i=0; i<5;i++) {
			System.out.print((i+1)+". Digite un número: ");
			numeros[i] = entrada.nextFloat();
		}
		System.out.println("\nImprimir los elementos del arreglo");
		
		for(float i: numeros) {
			
			System.out.println(i); 
		}
	
	}

}
