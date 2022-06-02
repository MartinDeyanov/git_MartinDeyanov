package masJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTestException {


	    @Test

	    public void testMultii() {//Hacemos el try primero en el que pondremos los número a multiplicar
	        try {  //El try catch lo que hace es que en el caso de intentar lo que esta en el try y no funciona pasara a darnos un mensaje de vuelta con el error es decir se dirige al Catch
	            Calculadora cal1= new Calculadora(2,-0);
	            int result = cal1.multiplica();
	            System.out.println(result);
	        } catch (ArithmeticException e) {
	            Exception excepcion = assertThrows(ArithmeticException.class,()->{ 
	            	 System.out.println("No se puede multiplicar por un caracter");
	        });
	        }
	    }
	
	
	
	@Test
	public void testDivir() {
		try { //Aqui hacemos un try catch para que cuando no funciona nos salte un error con un mensaje para saber donde esta el fallo
				//no funciona como deberia
			Calculadora cal= new Calculadora(2,1);
			int result = cal.divide();
			assertEquals( 2 , result);
			//fail(" Excepcion "); //Incita al fallo directaente 
		} catch (ArithmeticException e) {
			System.out.println("Es divisible");
			
		}
		}

}
