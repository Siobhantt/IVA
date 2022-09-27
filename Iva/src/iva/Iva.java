package iva;

import java.util.Scanner;

public class Iva {

	public static void main(String[] args) {
		/*Escribe un programa en el que declares una constante IVA de valor igual a 21.
		 *  A continuación, pídele un precio al usuario (recuerda que los precios contienen decimales) 
		 * y calcula cuál será el precio final con el IVA aplicado.*/
		
		//Declaramos la constante IVA y la variable en donde el usuario introducirá el precio
		final double valorIva = 21;
		double precioIntroducido;
		double precioFinal;
		
		//Invocamos el Scanner
		
		Scanner porcent = new Scanner(System.in);
		
		//Solicitamos el precio al usuario
		
		System.out.println("Introduzca el precio :");
		precioIntroducido = porcent.nextDouble();
		
		//Hacemos la operacion iva*precioIntroducido/100
		
		precioFinal = (valorIva *  precioIntroducido / 100) + precioIntroducido;
		
		
		System.out.println("El precio con IVA es: " + precioFinal);
		
		
		porcent.close();
		
		
		// TODO Auto-generated method stub

	}

}
