import java.util.*;
public class Pruebas2 {

	public static int [] unirArreglos (int [] arregloN, int [] arregloM, int [] arregloK ) {

		int i = 0;
		for (i = 0; i < arregloN.length; i++ ){
			for (int j = 0; j < arregloM.length; j++) {
				
			}

		}

		for (int j = 0; j < arregloK.length; j++ ){

			union[i] = arregloK[j];
			i++;

		}

		for (int k = 0; k < arregloM.length; k++) {

			union[i] = arregloM[k];
			i++;

		}

		return union;
	}

	public static void SortArray (int [] arregloN, int [] arregloK, int [] arregloM ) {

		int [] union = new int [arregloN.length+arregloK.length+arregloM.length];

		int i = 0;
		for (i = 0; i < arregloN.length; i++ ){

			union[i] = arregloN[i];

		}

		for (int j = 0; j < arregloK.length; j++ ){

			union[i] = arregloK[j];
			i++;

		}

		for (int k = 0; k < arregloM.length; k++) {

			union[i] = arregloM[k];
			i++;

		}

		Arrays.sort(union);

	}

	public static int removerDuplicados(int arregloR[], int length){

		if(length == 0 || length ==1 ){
			return length;
		}

		int j= 0 ;
		for(int i= 0; i <length-1; i++ )
			if(arregloR[i] !=arregloR [i+1])
				arregloR[j++]= arregloR [i];
		arregloR[j++] = arregloR [length-1];

		return j;


	}

	public static void main(String[] args) {

		int num1[] = {9,9,10,10,1};
		int num2[] = {81,71,1,4}; 
		int num3[] = {1,4,7,9,11};
		int union[] = unirArreglos(num1, num2, num3);
		//		SortArray(num1, num2, num3);

		int length = union.length;
		length =removerDuplicados(union, length);

		System.out.println("Printing element after removing duplicates");
		for (int i=0; i<length; i++){
			System.out.print (union[i]+" ");
		}
	}
}