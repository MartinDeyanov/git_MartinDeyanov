package masJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MayorNumeroTestExcepcion {
	@Test
	public void TestExcepcionMayorNumero() {
		
	MayorNumero numero = new MayorNumero();//Se crea un array con varios números los cuales tendra que recorrer en el metodo de "obt mayorNumero" y obtener el numero mas grande
	int cadenaNum[] = new int[]{90, 95, 80, 60, 40, 70, 1};
		
	Exception excep = assertThrows(ArrayIndexOutOfBoundsException.class,()->{ // Se comprueba que la excepción de clase ArrayIndexOutOfBounds sale de este método.
		int numMayor = numero.obt_mayorNumero(cadenaNum); //Aqui va al metodo de "obt_mayorNumero" para comprobar cual es el mayor entre la cadena de numero introducido anterior mente en el Array
		System.out.println(numMayor);
	});
		
		String texto = "out of bounds"; //Para comprobar que esto sea cierto y que se ejecuta como debe lo que hara es introducir un texto llamado "out of bounds"
		String texto2 = excep.getMessage();//Esta zona saca el mensaje que le da la excepcion
		
		assertTrue(texto2.contains(texto)); //Comprueba si texto2 contiene el texto 1 en el caso de no ser asi para inducir el fallo si cambiamos la zona de texto nos daria Fallo 
	}
}
