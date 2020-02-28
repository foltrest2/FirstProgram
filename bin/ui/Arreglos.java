import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Arreglos {

	//My program has the next limitation: if you don't follow the rules, you need to restart

	public static void main(String[] args) {

		Scanner lector= new Scanner(System.in);
		//With the Scanner we going to read and save anything you type

		System.out.println("Welcome to menu");
		System.out.println("Please, choose one of the next two options");
		System.out.println("1: Character string");
		System.out.println("2: Division of real numbers");
		System.out.println("3: Three array creation (length and content choose for you)");
		//Each option do a part of the laboratory. 1 do points 2-5, 2 do points 6-8	

		int choose = lector.nextInt();

		if(choose==1) {

			String[] chain = new String[3];
			//Okay, you choose one. This arrangement save the strings you will type next

			for (int i = 0; i < chain.length; i++) {
				System.out.println("Please, type the string number " + (i+1));
				chain[i] = lector.next();
				lector.nextLine();
			}

			System.out.println("Please, choose one of the next three options");
			System.out.println("1: Concatenated sharacter strings");
			System.out.println("2: Length of the character strings");
			System.out.println("3: Character in typed number position");
			//This is the sub menu, here are the points 3-5 of the laboratory.  
			//I did that because all of there need the character strings

			choose = lector.nextInt();

			switch (choose) {
			case 1: 

				System.out.println("La concatenación de sus palabras es: " + realizarConcatenacion(chain));

				//This case do the concatenation of the point 4

				break;

			case 2:

				for (String palabra : chain) {	

					System.out.println("Length of '" + palabra + "' is " + palabra.length());

				}

				break;
				//This case display the length of the Strings. (Point 3 of the laboratory)

			case 3: 

				System.out.println("Please, type a whole number");

				int posicion = lector.nextInt();
				posicion = posicion-1;

				for (String palabra : chain) {

					if(posicion>=palabra.length() || posicion<0) { 

						System.out.println("Number entered is not valid");

					}
					else {

						System.out.println("Character in position " + (posicion+1) + " is: '" + palabra.charAt(posicion) + "'");

					}
				}
				//This case display the character in typed number position. (Point 5)

				break;

			default: 
				System.out.println("Number entered is not valid, restart the program");
				//Limitation mentioned

				break;
			}
		}
		else

			if (choose==2) {

				double numerador = 0;
				double denominador = 0;

				System.out.println("Please enter two real numbers greater than 0 that you want to divide (if you have decimals, separate it with a comma)");
				System.out.println("Type the numerator");

				while (numerador<=0) {

					numerador = lector.nextDouble();


					if(numerador<=0) {

						System.out.println("Number entered is not valid");
					}
				}

				System.out.println("Now, type the denominator");
				while (denominador<=0) {


					denominador = lector.nextDouble();


					if(denominador<=0) {

						System.out.println("Number entered is not valid");
					}
				}

				//				After you choose two, you will stay here a long time if you don't type a real positive number

				System.out.println("Please, choose one of the next two options");
				System.out.println("1: Show the result of the division of both numbers");
				System.out.println("2: Show the result of the division of both numbers and the value of the residual");

				int decision = lector.nextInt();

				switch (decision) {
				case 1:

					double resultado = calcularDivision(numerador, denominador);
					System.out.println("Quotient is: '" + resultado + " '");
					//This case gives you the quotient of the division only

					break;

				case 2:

					int entero1 = (int) numerador;
					int entero2 = (int) denominador;

					int resultado2 = calcularDivision2(entero1, entero2);
					System.out.println("Quotient is: '" + resultado2 + " '");
					int resultado3 = calcularModulo(entero1, entero2);
					System.out.println("Residue is: '" + resultado3 + " '");
					//And this case gives you the quotient and the residue of the division

					break;

				default: System.out.println("Number entered is not valid, restart the program");
				break;
				}
			}
			else 

				if(choose==3) {

					System.out.println("La extensión de los arreglos se difinirá por tres números enteros");
					System.out.println("La extensión de su primer arreglo es:");

					int a = lector.nextInt();

					int [] num1 = new int [a];

					if (a<0) 
						System.out.println("Digita un número mayor que 0");
					else
						if(a==0) 
							System.out.println("Su arreglo está vacío");	
						else
							System.out.println("Digite los números enteros que desea en su primer arreglo");

					for (int i = 0; i < num1.length; i++) {

						System.out.print("Ingrese numero entero de la posicion"+" " +(i+1)+": ");
						num1[i] = lector.nextInt();

					}

					System.out.println("La extensión de su segundo arreglo es:");
					int b = lector.nextInt();

					if (b<0) 
						System.out.println("Digita un número mayor que 0");
					else
						if(b==0) 
							System.out.println("Su arreglo está vacío");	
						else
							System.out.println("Digite los números enteros que desea en su segundo arreglo");

					int [] num2 = new int[b];

					for (int i = 0; i < num2.length; i++) {

						System.out.print("Ingrese numero entero de la posicion"+" " +(i+1)+": ");
						num2[i] = lector.nextInt();

					}

					System.out.println("La extensión de su tercer arreglo es:");
					int c = lector.nextInt();

					if (b<0) 
						System.out.println("Digita un número mayor que 0");
					else
						if(b==0) 
							System.out.println("Su arreglo está vacío");	
						else
							System.out.println("Digite los números enteros que desea en su tercer arreglo");

					int [] num3 = new int[c];

					for (int i = 0; i < num3.length; i++) {

						System.out.print("Ingrese numero entero de la posicion"+" " +(i+1)+": ");
						num3[i] = lector.nextInt();

					}

					System.out.println("Please, choose one of the next options");
					System.out.println("1: Show the content of the arrays");
					System.out.println("2: Show the average of one of them");
					System.out.println("3: Show the biggest number in the array");
					System.out.println("4: Make a new array adding up, substracting or multiplying two of them");
					System.out.println("5: Make a new array with the union of all the arrays (with duplicate elements)");
					System.out.println("6: Make a new array with the union of all the arrays (without duplicate elements)");
					System.out.println("7");
					System.out.println("8");
					System.out.println("9");

					int decision = lector.nextInt();

					switch (decision) {

					case 1:

						System.out.println("Su primer arreglo contiene:");
						for (int i = 0; i < num1.length; i++) {
							for (int j = 0; j <= i; j++) {
								System.out.print(num1[j] + " ");
							}	
							System.out.println();
						}

						System.out.println("Su segundo arreglo contiene:");
						for (int i = 0; i < num2.length; i++) {
							for (int j = 0; j <= i; j++) {
								System.out.print(num2[j] + " ");
							}	
							System.out.println();
						}

						System.out.println("Su tercer arreglo contiene:");
						for (int i = 0; i < num3.length; i++) {
							for (int j = 0; j <= i; j++) {
								System.out.print(num3[j] + " ");
							}	
							System.out.println();
						}

						break;

					case 2:
						System.out.println("Digita un número del 1 al 3, siendo 1 tu primer arreglo y 3 el último");
						int arreglo1 = lector.nextInt();
						arreglo1-=1;

						if (arreglo1<0||arreglo1>2) 
							System.out.println("El número digitado es inválido");

						else {

							if (arreglo1==0)

								System.out.println("El promedio de su arreglo es " + calcularPromedio(num1));

							else if (arreglo1==1)

								System.out.println("El promedio de su arreglo es " + calcularPromedio(num2));

							else if (arreglo1==2)

								System.out.println("El promedio de su arreglo es " + calcularPromedio(num3));

						}

						break;

					case 3:

						System.out.println("Digita un número del 1 al 3, siendo 1 tu primer arreglo y 3 el último");
						int arreglo2 = lector.nextInt();
						arreglo2-=1;

						if (arreglo2<0||arreglo2>2) 
							System.out.println("El número digitado es inválido");

						else {

							if (arreglo2==0)

								System.out.println("El número mayor de su arreglo es " + calcularMayor(num1));

							else if (arreglo2==1)

								System.out.println("El número mayor de su arreglo es " + calcularMayor(num2));

							else if (arreglo2==2)

								System.out.println("El número mayor de su arreglo es " + calcularMayor(num3));

						}

						break;

					case 4:

						System.out.println("¿Qué desea hacer?");
						System.out.println("1: Sumar");
						System.out.println("2: Restar");
						System.out.println("3: Multiplicar");

						int desicion = lector.nextInt();

						switch (desicion) {
						case 1:

							System.out.println("Escoge un número del 1 al 3, siendo 1 tu primer arreglo y 3 el último, para sumarlo");
							int arreglo3 = lector.nextInt();
							arreglo3-=1;

							System.out.println("Ahora escoge otro");
							int arreglo4 = lector.nextInt();
							arreglo4-=1;

							if ((arreglo3<0||arreglo3>2) || (arreglo4<0||arreglo4>2)) 
								System.out.println("El número digitado es inválido");

							else {

								if (arreglo3==0 && arreglo4==0) {

									System.out.println("La suma entre su arreglo " + (arreglo3+1) + " y " + (arreglo4+1) + " es: ");

									int [] retorno = calcularSuma(num1, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo3==0 && arreglo4==1) {

									System.out.println("La suma entre su arreglo " + (arreglo3+1) + " y " + (arreglo4+1) + " es: ");

									int [] retorno = calcularSuma(num1, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}							
								}
								else if (arreglo3==0 && arreglo4==2) {

									System.out.println("La suma entre su arreglo " + (arreglo3+1) + " y " + (arreglo4+1) + " es: ");

									int [] retorno = calcularSuma(num1, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}
								else if (arreglo3==1 && arreglo4==0) {

									System.out.println("La suma entre su arreglo " + (arreglo3+1) + " y " + (arreglo4+1) + " es: ");

									int [] retorno = calcularSuma(num2, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo3==1 && arreglo4==1) {

									System.out.println("La suma entre su arreglo " + (arreglo3+1) + " y " + (arreglo4+1) + " es: ");

									int [] retorno = calcularSuma(num2, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo3==1 && arreglo4==2) {

									System.out.println("La suma entre su arreglo " + (arreglo3+1) + " y " + (arreglo4+1) + " es: ");

									int [] retorno = calcularSuma(num2, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo3==2 && arreglo4==0) {

									System.out.println("La suma entre su arreglo " + (arreglo3+1) + " y " + (arreglo4+1) + " es: ");

									int [] retorno = calcularSuma(num3, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo3==2 && arreglo4==1) {

									System.out.println("La suma entre su arreglo " + (arreglo3+1) + " y " + (arreglo4+1) + " es: ");

									int [] retorno = calcularSuma(num3, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo3==2 && arreglo4==2) {

									System.out.println("La suma entre su arreglo " + (arreglo3+1) + " y " + (arreglo4+1) + " es: ");

									int [] retorno = calcularSuma(num3, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}
							}

							break;

						case 2:

							System.out.println("Escoge un número del 1 al 3, siendo 1 tu primer arreglo y 3 el último, para restarlo");
							int arreglo5 = lector.nextInt();
							arreglo5-=1;

							System.out.println("Ahora escoge otro");
							int arreglo6 = lector.nextInt();
							arreglo6-=1;

							if ((arreglo5<0||arreglo5>2) || (arreglo6<0||arreglo6>2)) 
								System.out.println("El número digitado es inválido");

							else {

								if (arreglo5==0 && arreglo6==0) {

									System.out.println("La resta entre su arreglo " + (arreglo5+1) + " y " + (arreglo6+1) + " es: ");

									int [] retorno = calcularResta(num1, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo5==0 && arreglo6==1) {

									System.out.println("La resta entre su arreglo " + (arreglo5+1) + " y " + (arreglo6+1) + " es: ");

									int [] retorno = calcularResta(num1, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}							
								}
								else if (arreglo5==0 && arreglo6==2) {

									System.out.println("La resta entre su arreglo " + (arreglo5+1) + " y " + (arreglo6+1) + " es: ");

									int [] retorno = calcularResta(num1, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}
								else if (arreglo5==1 && arreglo6==0) {

									System.out.println("La resta entre su arreglo " + (arreglo5+1) + " y " + (arreglo6+1) + " es: ");

									int [] retorno = calcularResta(num2, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo5==1 && arreglo6==1) {

									System.out.println("La resta entre su arreglo " + (arreglo5+1) + " y " + (arreglo6+1) + " es: ");

									int [] retorno = calcularResta(num2, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo5==1 && arreglo6==2) {

									System.out.println("La resta entre su arreglo " + (arreglo5+1) + " y " + (arreglo6+1) + " es: ");

									int [] retorno = calcularResta(num2, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo5==2 && arreglo6==0) {

									System.out.println("La resta entre su arreglo " + (arreglo5+1) + " y " + (arreglo6+1) + " es: ");

									int [] retorno = calcularResta(num3, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo5==2 && arreglo6==1) {

									System.out.println("La resta entre su arreglo " + (arreglo5+1) + " y " + (arreglo6+1) + " es: ");

									int [] retorno = calcularResta(num3, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo5==2 && arreglo6==2) {

									System.out.println("La resta entre su arreglo " + (arreglo5+1) + " y " + (arreglo6+1) + " es: ");

									int [] retorno = calcularResta(num3, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}
							}

							break;

						case 3:

							System.out.println("Escoge un número del 1 al 3, siendo 1 tu primer arreglo y 3 el último, para multiplicarlo");
							int arreglo7 = lector.nextInt();
							arreglo7-=1;

							System.out.println("Ahora escoge otro");
							int arreglo8 = lector.nextInt();
							arreglo8-=1;

							if ((arreglo7<0||arreglo7>2) || (arreglo8<0||arreglo8>2)) 
								System.out.println("El número digitado es inválido");

							else {

								if (arreglo7==0 && arreglo8==0) {

									System.out.println("La multiplicacion entre su arreglo " + (arreglo7+1) + " y " + (arreglo8+1) + " es: ");

									int [] retorno = calcularMultiplicacion(num1, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo7==0 && arreglo8==1) {

									System.out.println("La multiplicacion entre su arreglo " + (arreglo7+1) + " y " + (arreglo8+1) + " es: ");

									int [] retorno = calcularMultiplicacion(num1, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}							
								}
								else if (arreglo7==0 && arreglo8==2) {

									System.out.println("La multiplicacion entre su arreglo " + (arreglo7+1) + " y " + (arreglo8+1) + " es: ");

									int [] retorno = calcularMultiplicacion(num1, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}
								else if (arreglo7==1 && arreglo8==0) {

									System.out.println("La multiplicacion entre su arreglo " + (arreglo7+1) + " y " + (arreglo8+1) + " es: ");

									int [] retorno = calcularMultiplicacion(num2, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo7==1 && arreglo8==1) {

									System.out.println("La multiplicacion entre su arreglo " + (arreglo7+1) + " y " + (arreglo8+1) + " es: ");

									int [] retorno = calcularMultiplicacion(num2, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo7==1 && arreglo8==2) {

									System.out.println("La multiplicacion entre su arreglo " + (arreglo7+1) + " y " + (arreglo8+1) + " es: ");

									int [] retorno = calcularMultiplicacion(num2, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo7==2 && arreglo8==0) {

									System.out.println("La multiplicacion entre su arreglo " + (arreglo7+1) + " y " + (arreglo8+1) + " es: ");

									int [] retorno = calcularMultiplicacion(num3, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo7==2 && arreglo8==1) {

									System.out.println("La multiplicacion entre su arreglo " + (arreglo7+1) + " y " + (arreglo8+1) + " es: ");

									int [] retorno = calcularMultiplicacion(num3, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo7==2 && arreglo8==2) {

									System.out.println("La multiplicacion entre su arreglo " + (arreglo7+1) + " y " + (arreglo8+1) + " es: ");

									int [] retorno = calcularMultiplicacion(num3, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("En la posición "+(i+1)+ ": "+retorno[i]);

									}
								}
							}

							break;
						default: 

							System.out.println("Por favor, digite un número del 1 al 3 solamente");

							break;
						}

						break;

					case 5:

						System.out.println("La unión de sus tres arreglos con elementos repetidos es la siguente");

						int [] union = unirArreglos(num1, num2, num3);

						System.out.println(Arrays.toString(union));

						break;

					case 6:

						System.out.println("La unión de sus tres arreglos sin elementos repetidos es la siguente");

						int [] union1 = unirArreglos(num1, num2, num3);
						quitarDuplicados(union1);

						break;

					case 7:

						break;

					case 8:

						break;

					case 9:

						break;

					default:
						break;
					}
				}
				else
					System.out.println("Please, type one of the options. Restart the program");


	}

	public static String realizarConcatenacion(String [] arregloN) {

		String concatenar = "";

		for (String palabra : arregloN) {

			concatenar = concatenar + palabra + " ";

		}

		return concatenar;

	}

	/** name: CalcularDivision
	 * Calcula la division de resultado double de dos números
	 * <b>Pre: double numerador, double denominador deben estar inicializados; denominador != 0</b>
	 * @param numerador
	 * @param denominador
	 * @return resultado de la disivión de ambos parámetros de tipo double
	 */

	public static double calcularDivision (double numerador, double denominador) {

		double resultado = 0;

		resultado = numerador/denominador;

		return resultado;

	}

	/** name: CalcularDivision2
	 * Calcula la división entera de dos números
	 * <b>Pre: int entero1, int entero2 deben estar inicializados; entero2 != 0</b>
	 * @param entero1
	 * @param entero2
	 * @return Retorna la division de ambos parámetros con resultado int
	 */

	public static int calcularDivision2 (int entero1, int entero2) {

		int resultado = 0;

		resultado = entero1/entero2;

		return resultado;
	} 

	/**name: CalcularModulo
	 * Calcula el residuo de los dos parámetros, resultado tipo int
	 * <b>Pre: int entero1, int entero2 deben estar inicializados; entero2 != 0</b>
	 * @param entero1
	 * @param entero2
	 * @return Retorna el residuo de la división de ambos parámetros con resultado int
	 */
	public static int calcularModulo (int entero1, int entero2) {

		int resultado = 0;

		resultado = entero1%entero2;

		return resultado;
	} 


	public static double calcularPromedio(int arregloN[]) {

		double promedio = 0;

		for (int i = 0; i < arregloN.length; i++) {

			promedio += arregloN [i];

		}
		promedio/=arregloN.length;

		return promedio;

	}

	public static int calcularMayor(int arregloN []) {

		int mayor = arregloN [0];

		for (int i = 0; i < arregloN.length; i++) {

			if(arregloN[i]>mayor) {

				mayor = arregloN[i];

			}
		}

		return mayor;
	}

	public static int [] calcularSuma (int [] arregloN, int [] arregloK) {

		int v1,v2,v3;

		v1 = arregloK.length;
		v2 = arregloN.length;
		v3 = 0;

		v3=v1;
		if (v2 > v1)
			v3=v2;

		int [] suma = new int [v3]; 
		for(int i1=0; i1<suma.length; i1++){
			int valv1 = 0;
			if (arregloN.length > i1){
				valv1 = arregloN[i1];
			}

			int valv2 = 0;
			if (arregloK.length>i1){
				valv2 = arregloK[i1];

			}

			suma [i1] = valv1 + valv2;

		}

		return suma;
	}

	public static int [] calcularResta (int [] arregloN, int [] arregloK) {

		int v1,v2,v3;

		v1 = arregloK.length;
		v2 = arregloN.length;
		v3 = 0;

		v3=v1;
		if (v2 > v1)
			v3=v2;

		int [] resta = new int [v3]; 
		for(int i1=0; i1<resta.length; i1++){
			int valv1 = 0;
			if (arregloN.length > i1){
				valv1 = arregloN[i1];
			}

			int valv2 = 0;
			if (arregloK.length>i1){
				valv2 = arregloK[i1];

			}

			resta [i1] = valv1 - valv2;

		}

		return resta;
	}

	public static int [] calcularMultiplicacion (int [] arregloN, int [] arregloK) {

		int v1,v2,v3;

		v1 = arregloK.length;
		v2 = arregloN.length;
		v3 = 0;

		v3=v1;
		if (v2 > v1)
			v3=v2;

		int [] multiplicacion = new int [v3]; 
		for(int i1=0; i1<multiplicacion.length; i1++){
			int valv1 = 0;
			if (arregloN.length > i1){
				valv1 = arregloN[i1];
			}

			int valv2 = 0;
			if (arregloK.length>i1){
				valv2 = arregloK[i1];

			}

			multiplicacion [i1] = valv1 * valv2;

		}

		return multiplicacion;
	}

	public static int [] unirArreglos (int [] arregloN, int [] arregloK, int [] arregloM ) {

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

		return union;

	}

	public static void quitarDuplicados(int [] arregloN) {

		for(int i=0;i<arregloN.length;i++){
			for(int j=0;j<arregloN.length-1;j++){
				if(i!=j){
					if(arregloN[i]==arregloN[j]){
						arregloN[i]=0;
					}
				}
			}
		}
		
		System.out.print("[");
		int n=arregloN.length;
		for (int k=0;k<=n-1;k++){
			if(arregloN[k]!=0){
				System.out.print(" " + arregloN[k] + " ");
			}
		}
		System.out.print("]");
		return;
	}
}