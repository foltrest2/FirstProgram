import java.util.Scanner;

public class Pruebas {

	public final static int TOTALEST = 17;

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		String [] nombres = new String [TOTALEST];
		double [] notas = new double [TOTALEST];

		for (int i = 0; i < TOTALEST; i++) {

			System.out.println("Digite nombre est");
			nombres [i] = lector.nextLine();
			System.out.println("Digite nota est");
			notas[i] = lector.nextDouble();
			lector.nextLine();
		}

		double promedio = CalcularPromedio(notas);
		boolean existe = BuscarEstudiante("Jean Paul", nombres);
		boolean palindroma = esPalindroma(nombres[12]);
		
		System.out.println(promedio);
		System.out.println(existe);
		System.out.println(palindroma);
	}

	public static double CalcularPromedio(double[] arregloN) {

		double promedio = 0;

		for (int i = 0; i < arregloN.length; i++) {

			promedio += arregloN [i];	

		}
		
		promedio/= arregloN.length;
		return promedio;

	}

	public static boolean BuscarEstudiante (String pnom, String [] arregloNom) {

		boolean encontre = false;

		for (int i = 0; i < arregloNom.length; i++) {

			if (arregloNom[i].equalsIgnoreCase(pnom)) {

				encontre = false;
			}

		}

		return !encontre;
	}
	
	public static boolean esPalindroma (String pnom) {
	
		pnom = pnom.toUpperCase();
		boolean palindroma = false;
		
		for (int i = 0, j = pnom.length(); i <= j && palindroma; i++, j-- ) {
			
			if (pnom.charAt(i)== ' ') {
				
				i = i+1;
			}
			
			if (pnom.charAt(j)== ' ')
				
				j--;
			
			if (pnom.charAt(i) != pnom.charAt(j)) {
				
				palindroma=false;
				
			}
		}
		return palindroma;
	}
}
