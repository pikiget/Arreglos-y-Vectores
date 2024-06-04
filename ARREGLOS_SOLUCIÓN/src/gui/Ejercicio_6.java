package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

public class Ejercicio_6 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_6 frame = new Ejercicio_6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*Leer los datos correspondiente a dos tablas de 12
	 *elementos numéricos, y mezclarlos en una tercera de la forma:
	 *3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
	 */
	public Ejercicio_6() {
		Scanner entrada = new Scanner(System.in);
		
		float A[],B[],C[];
		
		A = new float [12];
		B = new float [12];
		C = new float [24];
		
		System.out.println("Ingresar datos de la tabla A: ");
		for(int i=0; i<12; i++) {
			System.out.println((i+1)+". Digite un número: ");
			A[i]=entrada.nextFloat();
		}
		
		System.out.println("Ingresar datos de la tabla B: ");
		for(int i=0; i<12; i++) {
			System.out.println((i+1)+". Digite un número");
			B[i]=entrada.nextFloat();		}
	
	
		/*MEZCLAR LAS TABLAS 3 DE A Y 3 DE B ASI CONSECUTIVAMENTE*/
		/*UTILIZAMOS EL ITERADOR I PARA A Y B*/
		/*UTILIZAMOS EL ITERADOR J PARA C*/
		
		int i=0;
		int j=0;
		
		while(i<12) {
			//Copiar los 3 elementos de a[]
			for(int k=0;k<3;k++) {
				C[j] = A[i+k];
				j++;
			}
			//Ahora, copiamos 3 elementos de B[]
			for(int k=0;k<3;k++) {
				C[j] = B[i+k];
				j++;
			}
			
			i+=3;
		}
		
	    System.out.println("El arreglo es:");
	    for (i=0; i<24;i++) {
	    	System.out.println(C[i]);
	    }
	
	}

}






























