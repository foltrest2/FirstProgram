/** name: calcularFactorial
 * Este método calcula el valor factorial de un número
 * <b> Pre: </b> El cálcuo factorial cabe en un entero
 *@param: valor - entero
 *@return: retorna un entero con el calculo del factorial
 */

public class Seguimiento1 {
	
	public static int calcularFactorial(int valor) {
		
	int factorial = 1; 
	
	if (factorial<=0 && factorial>20) {
		factorial= -1;
	}
	else
		for (  ; valor > 0; valor--) {
			
			factorial*=valor;
		}
		
		return factorial;
	}

}
