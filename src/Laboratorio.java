import java.util.ArrayList;

public class Laboratorio {

	public static void main(String[] args) {

		Integer[] num1 = {1,2,3,4,5};
		Integer[] num2 = {6,7,3};
		
		ArrayList<Integer[]> nose  = new ArrayList<>();
		nose.add(num1);
//		nose.set(0, num1);
		
//		System.out.println(nose.get(1));
		
		int [][] m = new int[2][5];		
		m[0][0]= 1;
		m[0][1]= 2;
		m[0][2]= 3;
		m[0][3]= 4;
		m[0][4]= 1;
		m[1][0]= 7;
		m[1][1]= 6;
		m[1][2]= 8;
		m[1][3]= 9;
		m[1][4]= 10;
		
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.println(i + " " + j);
				
				
//				System.out.print(m[i][j] + " ");
				
			}
			System.out.println("\n");
			
		}
		
//		if (arreglo3==0 && arreglo4==0)
//
//			System.out.println("La suma entre " + calcularSuma(num1, num2));
//
//		else if (arreglo3==0 && arreglo4==1)
//
//			System.out.println("El número mayor de su arreglo es " + calcularMayor(num2));
//
//		else if (arreglo3==0 && arreglo4==2)
//
//			System.out.println("El número mayor de su arreglo es " + calcularMayor(num3));
//	
//		else if (arreglo3==1 && arreglo4==0)
//			
//			System.out.println();
//
//		else if (arreglo3==1 && arreglo4==1)
//
//			System.out.println();
//		
//		else if (arreglo3==1 && arreglo4==2)
//			
//			System.out.println();
//		
//		else if (arreglo3==2 && arreglo4==0)
//
//			System.out.println();
//		
//		else if (arreglo3==2 && arreglo4==1)
//			
//			System.out.println();
//		
//		else if (arreglo3==2 && arreglo4==2)
//			
//			System.out.println();
//
//	}
		
	}
}