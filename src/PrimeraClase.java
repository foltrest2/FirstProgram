import java.util.Scanner;
public class PrimeraClase {
	
	public static void main(String[] args) {

		Scanner lector= new Scanner (System.in);

		double[] notas = new double [17];

		for (int i = 0; i < notas.length; i++) {

			System.out.println("Digite la nota del estudiante");

			notas [i] = lector.nextDouble();

		}
		System.out.println("Ingrese hasta qué posicion quiere sumar");
		int posicion = lector.nextInt();
		double promedio = CalcularPromedio(notas);
		double sumaTotal = CalcularSuma(notas, (posicion-1));

		System.out.println("El promedio del curso es " + promedio + " y la suma es " + sumaTotal);
	}
	
		public static double CalcularPromedio(double[] arregloN) {
			
			double promedio = 0;
			
			for (int i = 0; i < arregloN.length; i++) {
				
				promedio += arregloN [i];
				
			}
			
			promedio/= arregloN.length;
			return promedio;
					
		}
		
		public static double CalcularSuma (double [] arregloK, int p) {
			
			double suma = 0;
			
			for (int i = 0; i < arregloK.length; i++) {
				
				suma += arregloK [i];
				
			}
			
			return suma;
		}

}

