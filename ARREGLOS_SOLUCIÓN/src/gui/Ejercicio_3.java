package gui;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

public class Ejercicio_3 extends JFrame {

	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_3 frame = new Ejercicio_3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*Leer 5 números por teclado, almacenarlos en un arreglo y 
	 *a continuación realizar la media de los números positivos,
	 *la media de los negativos y contar el número de ceros*/
	public Ejercicio_3() {
		Scanner entrada = new Scanner(System.in);
		
		float[] numero = new float [5];

		float sumaPosi=0,sumaNega=0,mediaPosi,mediaNega;
		int contPosi=0,contNega=0,cantCero=0;
		System.out.println("Guardar los números en un arreglo");
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1)+". Dijite su número");
			numero[i] = entrada.nextFloat();

			if(numero[i]==0) {
				cantCero++;
			}
			else if(numero[i]>0){
				sumaPosi += numero[i];
				contPosi++;
			}
			else {
				sumaNega += numero[i];
				contNega++;			}
		}
		
		if(contPosi == 0) {
			System.out.println("No se puede sacar la media de los números positivos");
		}
		else {
			mediaPosi = sumaPosi / contPosi;
			
			System.out.println("la media de los números positivos es: " + mediaPosi);
		}
		
		
		if(contNega == 0) {
			System.out.println("No se puede sacar la media de los números negativos");
		
		}
		else {
			mediaNega = sumaNega / contNega;
			System.out.println("La media de los npumeros negativos es: " + mediaNega);
		}
		
		System.out.println("La cantidad de ceros es: " + cantCero);
		
	}

}
