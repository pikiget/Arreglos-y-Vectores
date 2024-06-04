package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

public class Ejercicio_7 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_7 frame = new Ejercicio_7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*Leer por teclado una serie de 10 números enteros.
	 *La aplicación debe indicarnos si los números están ordenados de forma creciente,
	 *decreciente, o si están desordenados */
	public Ejercicio_7() {
		Scanner entrada = new Scanner(System.in);
		
		int[] arreglo= new int[10];
		boolean creciente=false, decreciente= false;
		
		
		System.out.println("Llenar el arreglo");
		for(int i=0; i<10; i++) {
			System.out.print((i+1) + ". Digite un número: ");
			arreglo[i] = entrada.nextInt();
		}
		for(int i=0; i<9; i++) {
			if(arreglo[i] < arreglo[i+1]) { //Crecinete 1,2,3,4,5 ....
				creciente= true;
			}
			if(arreglo[i] > arreglo[i+1]) { //Decreciente 5,4,3,2,1 .....
				decreciente=true;
			}
		}
		
		if(creciente == true && decreciente== false) {
			System.out.println("El arreglo esta en forma creciente");
		}
		else if(creciente == false && decreciente == true) {
			System.out.println("EL arreglo esta en forma decreciente");
		}
		else if(creciente == true && decreciente == true) {
			System.out.println("El arreglo esta desordenado");
		}
		else if(creciente == false && decreciente== false) {
			System.out.println("Todos loss números del arreglo son iguales");
		}
	}

}














