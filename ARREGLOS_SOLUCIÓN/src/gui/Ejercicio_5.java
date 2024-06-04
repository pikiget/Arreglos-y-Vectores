package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
public class Ejercicio_5 extends JFrame {

	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_5 frame = new Ejercicio_5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*Leer por teclado dos tablas de 10 números enteros
	 *y mezclarlas en una tercera de la forma: el 1° de A.
	 *el 1° de B, el 2° de A, el 2° de B, etc */
	public Ejercicio_5() {
		
		Scanner entrada = new Scanner(System.in);
		
		int a[],b[],c[];
		
		a = new int [10];
		b = new int [10];
		c = new int [20];
		
		System.out.println("Ingresar datos en la tabla A: ");
		
		for(int i = 0; i < 10; i ++) {
			System.out.println((i + 1) + ". Digite su número");
			a[i] = entrada.nextInt();
		}
		
		System.out.print("Ingresar datos en la tasbla B: " + "\n");
		for(int i=0; i<10; i++) {
			System.out.println((i + 1) + ". Digite su número");
			b[i] = entrada.nextInt();
		}
		
		//Mezcalr las tablas
		//vamos tilizar el iterador i para a  y b
		//y el iterador J para el arreglo C
		
		int j = 0;
		for (int i = 0; i<10; i++) {
			c[j] = a[i];
			j++;
			c[j] = b[i];
			j++;
		}
		
		System.out.println("\n el tercer arreglo es: ");
		for(int i =0; i<20; i++) {
			System.out.println(c[i]);
		}
	}

}
