import java.util.*;
import java.util.Random;
import java.lang.Math;

public class Ejercicio1_2 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		//otra cosa importante es que sacaremos valores aleatorios de 1 a 100 asi que de una vez lo asignamos
		Scanner leer = new Scanner(System.in);		
		int num, resultado;

		System.out.println("Ingrese un número: ");
		num = leer.nextInt();


//Imprimimos resultado final y operaciones correspondientes para ver si es par o impar

		resultado = (int) (Math.random()*100+1);

		for (int i = 0; i <= num ; i++ ) {

			if (num == 0 ) { // la lógica es que si es divisible entre 2 entonces es par y si no entonces es impar
			System.out.println("El número es inválido");
			} else  {

				if (num %2 == 0) {
					System.out.println("El número es par: "+resultado);
				} 	else {
				System.out.println("El número es impar: "+resultado);
			} 
			
		} 
			
			}

		 }
}