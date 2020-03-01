import java.util.Scanner;
import java.util.Arrays;
public class Arreglos {

	//My program has the next limitation: you need to restart the program after finishing with the chosen option

	public static void main(String[] args) {

		Scanner lector= new Scanner(System.in);
		//With the Scanner we going to read and save anything you type

		System.out.println("Welcome to menu");
		System.out.println("Please, choose one of the next three options");
		System.out.println("1: Character string");
		System.out.println("2: Division of real numbers");
		System.out.println("3: Three array creation (length and content choose for you)");
		//Each option do a part of the laboratory. 1 do points 2-5, 2 do points 6-8	

		int choose = lector.nextInt();
		lector.nextLine();

		if(choose==1) {

			String[] chain = new String[3];
			//Okay, you choose one. This array save the strings you will type next

			for (int i = 0; i < chain.length; i++) {
				System.out.println("Please, type the string number " + (i+1));
				chain[i] = lector.nextLine();
			}

			System.out.println("Please, choose one of the next three options");
			System.out.println("1: Concatenated sharacter strings");
			System.out.println("2: Length of the character strings");
			System.out.println("3: Character in typed number position");
			//This is the sub menu, here are the points 3-5 of the laboratory.  
			//I did that because all of there need the character strings

			choose = lector.nextInt();
			lector.nextLine();

//			With this switch the program recognize the chosen option and do that

			switch (choose) {
			case 1: 

				System.out.println("The concatenation of your words is: " + realizeConcatenation(chain));

				//This case do the concatenation of the point 4

				break;

			case 2:

				for (String word : chain) {	

					System.out.println("Length of '" + word + "' is " + word.length());

				}

				break;
				//This case display the length of the Strings. (Point 3 of the laboratory)

			case 3: 

				System.out.println("Type a whole number, please");

				int position = lector.nextInt();
				position = position-1;

				for (String word : chain) {

					if(position>=word.length() || position<0) { 

						System.out.println("Number entered is not valid");

					}
					else {

						System.out.println("Character in position " + (position+1) + " is: '" + word.charAt(position) + "'");

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

				double numerator = 0;
				double denominator = 0;

				System.out.println("Please enter two real numbers greater than 0 that you want to divide (if you have decimals, separate it with a comma)");
				System.out.println("Type the numerator");

				while (numerator<=0) {

					numerator = lector.nextDouble();
					lector.nextLine();

					if(numerator<=0) {

						System.out.println("Number entered is not valid");
					}
				}

				System.out.println("Now, type the denominator");
				while (denominator<=0) {


					denominator = lector.nextDouble();


					if(denominator<=0) {

						System.out.println("Number entered is not valid");
					}
				}

				//				After you choose two, you will stay here a long time if you don't type a real positive number
				//				This point receive two numbers 

				System.out.println("Please, choose one of the next two options");
				System.out.println("1: Show the result of the division of both numbers");
				System.out.println("2: Show the result of the division of both numbers and the value of the residual");

				int decision = lector.nextInt();
				lector.nextLine();

				switch (decision) {
				case 1:

					double resultado = calculateDivision(numerator, denominator);
					System.out.println("Quotient is: '" + resultado + " '");
					//This case gives you the double quotient of the division only

					break;

				case 2:

					int whole1 = (int) numerator;
					int whole2 = (int) denominator;

					int resultado2 = calculateDivision2(whole1, whole2);
					System.out.println("Quotient is: '" + resultado2 + " '");
					int resultado3 = calculateModule(whole1, whole2);
					System.out.println("Residue is: '" + resultado3 + " '");
					//And this case gives you the whole quotient and residue of the division

					break;

				default: System.out.println("Number entered is not valid, restart the program");
				break;
				}
			}
			else 

				if(choose==3) {

//					Here you enter your three arrays (point 9)

					System.out.println("The length of the arrays will be defined by three whole numbers");
					System.out.println("The extension of your first array is:");

					int a = lector.nextInt();

					int [] num1 = new int [a];

					if (a<0) 
						System.out.println("Type a number greater than 0");
					else
						if(a==0) 
							System.out.println("Your array is empty");	
						else
							System.out.println("Type the whole numbers that you want in your first array");

					for (int i = 0; i < num1.length; i++) {

						System.out.print("Type a whole number in position"+" " +(i+1)+": ");
						num1[i] = lector.nextInt();

					}

					System.out.println("The extension of your second array is:");
					int b = lector.nextInt();

					if (b<0) 
						System.out.println("Type a number greater than 0");
					else
						if(b==0) 
							System.out.println("Your array is empty");	
						else
							System.out.println("Type the whole numbers that you want in your second array");

					int [] num2 = new int[b];

					for (int i = 0; i < num2.length; i++) {

						System.out.print("Type a whole number in position"+" " +(i+1)+": ");
						num2[i] = lector.nextInt();

					}

					System.out.println("The extension of your third array is:");
					int c = lector.nextInt();

					if (b<0) 
						System.out.println("Type a number greater than 0");
					else
						if(b==0) 
							System.out.println("Your array is empty");	
						else
							System.out.println("Type the whole numbers that you want in your third array");

					int [] num3 = new int[c];

					for (int i = 0; i < num3.length; i++) {

						System.out.print("Type a whole number in position"+" " +(i+1)+": ");
						num3[i] = lector.nextInt();

					}

//					This is the sub menu in the option 3
					
					System.out.println("Please, choose one of the next options");
					System.out.println("1: Show the content of the arrays");
					System.out.println("2: Show the average of one of them");
					System.out.println("3: Show the biggest number in the array");
					System.out.println("4: Make a new array adding up, substracting or multiplying two of them");
					System.out.println("5: Make a new array with the union of all the arrays (with duplicate elements)");
					System.out.println("6: Make a new array with the union of all the arrays (without duplicate elements)");
					System.out.println("7: Find the intersection of your arrays in a new array");
					System.out.println("8: Rotate one of the arrays");
					System.out.println("9: Sort one of your arrays (bubble method)");

					
					int decision = lector.nextInt();
					lector.nextLine();

//					With this switch the program recognize the chosen option and do that
					
					switch (decision) {

					case 1:

//						This case print the content of the arrays in pyramid form
						
						System.out.println("Your first array contains:");
						for (int i = 0; i < num1.length; i++) {
							for (int j = 0; j <= i; j++) {
								System.out.print(num1[j] + " ");
							}	
							System.out.println();
						}

						System.out.println("Your second array contains:");
						for (int i = 0; i < num2.length; i++) {
							for (int j = 0; j <= i; j++) {
								System.out.print(num2[j] + " ");
							}	
							System.out.println();
						}

						System.out.println("Your third array contains:");
						for (int i = 0; i < num3.length; i++) {
							for (int j = 0; j <= i; j++) {
								System.out.print(num3[j] + " ");
							}	
							System.out.println();
						}

						break;

					case 2:
						
//						This case print the average of one of the arrays (chosen for you)
						
						System.out.println("Type a number from 1 to 3, 1 being your first array and 3 the last");
						int arreglo1 = lector.nextInt();
						arreglo1-=1;

						if (arreglo1<0||arreglo1>2) 
							System.out.println("The number entered isn't valid");

						else {

							if (arreglo1==0)

								System.out.println("The average of your array is " + 
										calculateAverage(num1));

							else if (arreglo1==1)

								System.out.println("The average of your array is" + 
										calculateAverage(num2));

							else if (arreglo1==2)

								System.out.println("The average of your array is" + 
										calculateAverage(num3));

						}

						break;

					case 3:
						
//						This case print the higher number in one of the arrays

						System.out.println("Type a number from 1 to 3, 1 being your first array and 3 the last");
						int arreglo2 = lector.nextInt();
						arreglo2-=1;

						if (arreglo2<0||arreglo2>2) 
							System.out.println("The number entered isn't valid");

						else {

							if (arreglo2==0)

								System.out.println("The higher number of your array is " + calculateHigher(num1));

							else if (arreglo2==1)

								System.out.println("The higher number of your array is " + calculateHigher(num2));

							else if (arreglo2==2)

								System.out.println("The higher number of your array is " + calculateHigher(num3));

						}

						break;

					case 4:
						
//						This case print a sub menu, when you can decide what do you want to do (add, subtract or multiply two arrays)

						System.out.println("What do you want to do?");
						System.out.println("1: Add");
						System.out.println("2: Subtract");
						System.out.println("3: Multiply");

						int desicion = lector.nextInt();
						lector.nextLine();

//						With this switch the program recognize the chosen option and do that
						switch (desicion) {
						case 1:

//							This case do the sum
							
							System.out.println("Type a number from 1 to 3, 1 being your first array and 3 the last, for adding up");
							int arreglo3 = lector.nextInt();
							arreglo3-=1;

							System.out.println("Now choose other");
							int arreglo4 = lector.nextInt();
							arreglo4-=1;

							if ((arreglo3<0||arreglo3>2) || (arreglo4<0||arreglo4>2)) 
								System.out.println("The number entered isn't valid");

							else {

								if (arreglo3==0 && arreglo4==0) {

									System.out.println("The sum between your array " + (arreglo3+1) + " and " + (arreglo4+1) + " is: ");

									int [] retorno = calculateSum(num1, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo3==0 && arreglo4==1) {

									System.out.println("The sum between your array " + (arreglo3+1) + " and " + (arreglo4+1) + " is: ");

									int [] retorno = calculateSum(num1, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}							
								}
								else if (arreglo3==0 && arreglo4==2) {

									System.out.println("The sum between your array " + (arreglo3+1) + " and " + (arreglo4+1) + " is: ");

									int [] retorno = calculateSum(num1, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}
								else if (arreglo3==1 && arreglo4==0) {

									System.out.println("The sum between your array " + (arreglo3+1) + " and " + (arreglo4+1) + " is: ");

									int [] retorno = calculateSum(num2, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo3==1 && arreglo4==1) {

									System.out.println("The sum between your array " + (arreglo3+1) + " and " + (arreglo4+1) + " is: ");

									int [] retorno = calculateSum(num2, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo3==1 && arreglo4==2) {

									System.out.println("The sum between your array " + (arreglo3+1) + " and " + (arreglo4+1) + " is: ");

									int [] retorno = calculateSum(num2, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo3==2 && arreglo4==0) {

									System.out.println("The sum between your array " + (arreglo3+1) + " and " + (arreglo4+1) + " is: ");

									int [] retorno = calculateSum(num3, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo3==2 && arreglo4==1) {

									System.out.println("The sum between your array " + (arreglo3+1) + " and " + (arreglo4+1) + " is: ");

									int [] retorno = calculateSum(num3, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo3==2 && arreglo4==2) {

									System.out.println("The sum between your array " + (arreglo3+1) + " and " + (arreglo4+1) + " is: ");

									int [] retorno = calculateSum(num3, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}
							}

							break;

						case 2:
							
//							This case do the subtract

							System.out.println("Type a number from 1 to 3, 1 being your first array and 3 the last, for substracting");
							int arreglo5 = lector.nextInt();
							arreglo5-=1;

							System.out.println("Now choose other");
							int arreglo6 = lector.nextInt();
							arreglo6-=1;

							if ((arreglo5<0||arreglo5>2) || (arreglo6<0||arreglo6>2)) 
								System.out.println("The number entered isn't valid");

							else {

								if (arreglo5==0 && arreglo6==0) {

									System.out.println("The subtraction between your array " + (arreglo5+1) + " and " + (arreglo6+1) + " is: ");

									int [] retorno = calculateSubtraction(num1, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo5==0 && arreglo6==1) {

									System.out.println("The subtraction between your array " + (arreglo5+1) + " and " + (arreglo6+1) + " is: ");

									int [] retorno = calculateSubtraction(num1, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}							
								}
								else if (arreglo5==0 && arreglo6==2) {

									System.out.println("The subtraction between your array " + (arreglo5+1) + " and " + (arreglo6+1) + " is: ");

									int [] retorno = calculateSubtraction(num1, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo5==1 && arreglo6==0) {

									System.out.println("The subtraction between your array " + (arreglo5+1) + " and " + (arreglo6+1) + " is: ");

									int [] retorno = calculateSubtraction(num2, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo5==1 && arreglo6==1) {

									System.out.println("The subtraction between your array " + (arreglo5+1) + " and " + (arreglo6+1) + " is: ");

									int [] retorno = calculateSubtraction(num2, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo5==1 && arreglo6==2) {

									System.out.println("The subtraction between your array " + (arreglo5+1) + " and " + (arreglo6+1) + " is: ");

									int [] retorno = calculateSubtraction(num2, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo5==2 && arreglo6==0) {

									System.out.println("The subtraction between your array " + (arreglo5+1) + " and " + (arreglo6+1) + " is: ");

									int [] retorno = calculateSubtraction(num3, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo5==2 && arreglo6==1) {

									System.out.println("The subtraction between your array " + (arreglo5+1) + " and " + (arreglo6+1) + " is: ");

									int [] retorno = calculateSubtraction(num3, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo5==2 && arreglo6==2) {

									System.out.println("The subtraction between your array " + (arreglo5+1) + " and " + (arreglo6+1) + " is: ");

									int [] retorno = calculateSubtraction(num3, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}
							}

							break;

						case 3:

//							This case do the multiply
							
							System.out.println("Type a number from 1 to 3, 1 being your first array and 3 the last, for multiplying");
							int arreglo7 = lector.nextInt();
							arreglo7-=1;

							System.out.println("Now choose other");
							int arreglo8 = lector.nextInt();
							arreglo8-=1;

							if ((arreglo7<0||arreglo7>2) || (arreglo8<0||arreglo8>2)) 
								System.out.println("The number entered isn't valid");

							else {

								if (arreglo7==0 && arreglo8==0) {

									System.out.println("The multiply between your array " + (arreglo7+1) + " and " + (arreglo8+1) + " is: ");

									int [] retorno = calculateMultiplying(num1, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo7==0 && arreglo8==1) {

									System.out.println("The multiply between your array " + (arreglo7+1) + " and " + (arreglo8+1) + " is: ");

									int [] retorno = calculateMultiplying(num1, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}							
								}
								else if (arreglo7==0 && arreglo8==2) {

									System.out.println("The multiply between your array " + (arreglo7+1) + " and " + (arreglo8+1) + " is: ");

									int [] retorno = calculateMultiplying(num1, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}
								else if (arreglo7==1 && arreglo8==0) {

									System.out.println("The multiply between your array " + (arreglo7+1) + " and " + (arreglo8+1) + " is: ");

									int [] retorno = calculateMultiplying(num2, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo7==1 && arreglo8==1) {

									System.out.println("The multiply between your array " + (arreglo7+1) + " and " + (arreglo8+1) + " is: ");

									int [] retorno = calculateMultiplying(num2, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}

								else if (arreglo7==1 && arreglo8==2) {

									System.out.println("The multiply between your array " + (arreglo7+1) + " and " + (arreglo8+1) + " is: ");

									int [] retorno = calculateMultiplying(num2, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}

								}

								else if (arreglo7==2 && arreglo8==0) {

									System.out.println("The multiply between your array " + (arreglo7+1) + " and " + (arreglo8+1) + " is: ");

									int [] retorno = calculateMultiplying(num3, num1);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo7==2 && arreglo8==1) {

									System.out.println("The multiply between your array " + (arreglo7+1) + " and " + (arreglo8+1) + " is: ");

									int [] retorno = calculateMultiplying(num3, num2);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);
									}
								}

								else if (arreglo7==2 && arreglo8==2) {

									System.out.println("The multiply between your array " + (arreglo7+1) + " and " + (arreglo8+1) + " is: ");

									int [] retorno = calculateMultiplying(num3, num3);
									for (int i = 0; i < retorno.length; i++) {

										System.out.println("In position "+(i+1)+ ": "+retorno[i]);

									}
								}
							}

							break;
						default: System.out.println("Type a number from 1 to 3 only");
						break;
						}

						break;

					case 5:
						
//						This case link the three arrays given and print the union with duplicate elements

						System.out.println("The union of your three arrays with repeated elements is:");

						int [] union = linkArrays(num1, num2, num3);

						System.out.println(Arrays.toString(union));

						break;

					case 6:
						
//						This case link the three arrays given and print the union without duplicate elements 

						System.out.println("The union of your three arrays without repeated elements is:");

						int [] union1 = linkArrays(num1, num2, num3);
						removeDuplicates(union1);

						break;

					case 7:
						
//						This case do the intersection of the three arrays given

						System.out.println("The intersection of your arrays is:");
						findCommon(num1, num2, num3);

						break;

					case 8:
						
//						This case asks a whole number to rotate one array, after that print the rotate array 

						System.out.println("Type a number from 1 to 3, 1 being your first array and 3 the last");
						int arreglo9 = lector.nextInt();
						lector.nextLine();
						arreglo9-=1;

						if (arreglo9<0||arreglo9>2) 
							System.out.println("The number entered isn't valid");

						else {

							if (arreglo9==0) {

								System.out.println("Type how many positions do you want to rotate");
								int rotate = lector.nextInt();

								System.out.println("The result of the rotate is:");
								int [] result = rotateArray(num1, rotate);
								System.out.println(Arrays.toString(result));

							}

							else if (arreglo9==1) {

								System.out.println("Type how many positions do you want to rotate");
								int rotate = lector.nextInt();

								System.out.println("The result of the rotate is:");
								int [] result = rotateArray(num2, rotate);
								System.out.println(Arrays.toString(result));

							}

							else if (arreglo9==2) {

								System.out.println("Type how many positions do you want to rotate");
								int rotate = lector.nextInt();

								System.out.println("The result of the rotate is:");
								int [] result = rotateArray(num3, rotate);
								System.out.println(Arrays.toString(result));

							}
						}

						break;

					case 9:
						
//						This case calls the bubble method to sort one array

						System.out.println("Type a number from 1 to 3, 1 being your first array and 3 the last");
						int arreglo10 = lector.nextInt();
						lector.nextLine();
						arreglo10-=1;

						if (arreglo10<0||arreglo10>2) 
							System.out.println("The number entered isn't valid");

						else {

							if (arreglo10==0) {

								System.out.println("Your sorted array is:");
								int [] result = bubble(num1);
								System.out.println(Arrays.toString(result));

							}

							else if (arreglo10==1) {

								System.out.println("Your sorted array is:");
								int [] result = bubble(num2);
								System.out.println(Arrays.toString(result));

							}

							else if (arreglo10==2) {

								System.out.println("Your sorted array is:");
								int [] result = bubble(num1);
								System.out.println(Arrays.toString(result));

							}
						}

						break;

					default: System.out.println("Number entered is not valid, restart the program");
					break;
					}
				}
				else
					System.out.println("Please, type one of the options. Restart the program");


	}

	/**name: realizeContatenation
	 * This method realize the concatenation of three character strings
	 * <b>Pre: arregloN should be initialized</b>
	 * @param arregloN is a string array
	 * @return Concatenation of the character strings
	 */
	public static String realizeConcatenation(String [] arregloN) {

		String concatenar = "";

		for (String palabra : arregloN) {

			concatenar = concatenar + palabra + " ";

		}

		return concatenar;

	}

	/** name: CalcularDivision
	 * Calculate the division with double result of two numbers
	 * <b>Pre: numerator, denominator should be initialized; denominator != 0</b>
	 * @param numerador is a double
	 * @param denominador is a double
	 * @return resultado de la disivión de ambos parámetros de tipo double
	 */

	public static double calculateDivision (double numerador, double denominador) {

		double resultado = 0;

		resultado = numerador/denominador;

		return resultado;

	}

	/** name: CalcularDivision2
	 * This method calculates the whole division of two numbers
	 * <b>Pre: entero1, entero2 should be initialized; entero2 != 0</b>
	 * @param entero1 is a int
	 * @param entero2 is a int
	 * @return Return the whole division of two numbers with int result
	 */

	public static int calculateDivision2 (int entero1, int entero2) {

		int resultado = 0;

		resultado = entero1/entero2;

		return resultado;
	} 

	/**name: CalcularModulo
	 * This method calculates residue of the division of the parameters, type of result int
	 * <b>Pre: entero1, entero2 should be initialized; entero2 != 0</b>
	 * @param entero1 is a int
	 * @param entero2 is a int
	 * @return Return residue of the division of the parameters, type of result int
	 */
	public static int calculateModule (int entero1, int entero2) {

		int resultado = 0;

		resultado = entero1%entero2;

		return resultado;
	} 

	/**name: calculateAverage
	 * This method calculates the average of a the elements in a unique array
	 * <b>Pre: arregloN should be initialized, arregloN.length != 0</b>
	 * @param arregloN is a int array
	 * @return Return the average of the array
	 */
	public static double calculateAverage(int arregloN[]) {

		double promedio = 0;

		for (int i = 0; i < arregloN.length; i++) {

			promedio += arregloN [i];

		}
		promedio/=arregloN.length;

		return promedio;

	}

	/**name: calculateHigher
	 * This method identifies the higher element in one array
	 * <b>Pre: arregloN should be initialized, arregloN.length != 0 </b>
	 * @param arregloN is a int array
	 * @return Return the higher element in the array
	 */
	public static int calculateHigher(int arregloN []) {

		int mayor = arregloN [0];

		for (int i = 0; i < arregloN.length; i++) {

			if(arregloN[i]>mayor) {

				mayor = arregloN[i];

			}
		}

		return mayor;
	}

	/**name: calculateSum
	 * This method calculates the sum of two arrays
	 * <b>Pre: arregloN, arregloK should be initialized; arregloN.length&&arregloK.length != 0 </b>
	 * @param arregloN is a int array
	 * @param arregloK is a int array
	 * @return Return a int array with the result of add up each element in arregloN and arregloK
	 */
	public static int [] calculateSum (int [] arregloN, int [] arregloK) {

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

	/**name: calculateSubtraction
	 * This method calculates the subtraction of two arrays
	 * <b>Pre: arregloN, arregloK should be initialized; arregloN.length&&arregloK.length != 0 </b>
	 * @param arregloN is a int array
	 * @param arregloK is a int array
	 * @return Return a int array with the result of subtract each element in arregloN and arregloK
	 */
	public static int [] calculateSubtraction(int [] arregloN, int [] arregloK) {

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

	/**name: calculateMultiplying
	 * This method calculates the multiply of two arrays
	 * <b>Pre: arregloN, arregloK should be initialized; arregloN.length&&arregloK.length != 0 </b>
	 * @param arregloN is a int array
	 * @param arregloK is a int array
	 * @return Return a int array with the result of multiply each element in arregloN and arregloK
	 */
	public static int [] calculateMultiplying (int [] arregloN, int [] arregloK) {

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

	/**name: linkArrays
	 * This method link three arrays with duplicate elements
	 * <b>Pre: arregloN, arregloK, arregloM should be initialized; arregloN.length&&arregloK.length&&arregloM != 0 </b>
	 * @param arregloN is a int array
	 * @param arregloK is a int array
	 * @param arregloM is a int array
	 * @return returns the resulting union of the arrays
	 */
	public static int [] linkArrays (int [] arregloN, int [] arregloK, int [] arregloM ) {

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

	/**name: removeDuplicates
	 * This method remove the duplicate elements in one array and print the no duplicate elements
	 * <b>Pre: arregloN should be initialized, arregloN.length != 0</b>
	 * @param arregloN is a int array
	 */
	public static void removeDuplicates(int [] arregloN) {

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

	/**name: findCommon
	 * This method find the common elements in three arrays and print them 
	 * <b>Pre: arregloN, arregloK, arregloM should be initialized </b>
	 * @param arregloN is a int array
	 * @param arregloM is a int array
	 * @param arregloK is a int array
	 */
	public static void findCommon(int arregloN[], int arregloM[], int arregloK[]) {

		Arrays.sort(arregloN);
		Arrays.sort(arregloM);
		Arrays.sort(arregloK);

		int i = 0, j = 0, k = 0; 

		System.out.print("[");
		while (i < arregloN.length && j < arregloM.length && k < arregloK.length) {

			if (arregloN[i] == arregloM[j] && arregloM[j] == arregloK[k]) {

				System.out.print(" " + arregloN[i] + " ");   i++; j++; k++;

			}

			else if (arregloN[i] < arregloM[j]) 
				i++; 

			else if (arregloM[j] < arregloK[k]) 
				j++; 

			else
				k++; 
		} 

		System.out.print("]");
	} 

	/**name: rotateArray
	 * This method rotate one array
	 * <b>Pre: arregloN, n should be initialized, n != 0</b>
	 * @param arregloN is a int array
	 * @param n is a int
	 * @return return the rotated array
	 */
	public static int[] rotateArray(int[] arregloN, int n){

		int i,j,temp,temp1;

		for(i=1;i<=n;i++){

			temp = arregloN[0];

			for(j=0;j<arregloN.length;j++){

				temp1 = arregloN[(j+1) % arregloN.length];
				arregloN[(j+1) % arregloN.length] = temp;
				temp = temp1;
			}
		}

		return arregloN;
	}

	/**name: bubble
	 * This method sort the array numbers from least to greatest
	 * @param arregloN is a int array
	 * @return return the sorted array
	 */
	public static int[] bubble(int[] arregloN) {

		int assistant;
		int[] arregloOrdenado;

		for(int i = 1; i < arregloN.length; i++) {

			for(int j = 0;j < arregloN.length-i;j++) {

				if(arregloN[j] > arregloN[j+1]) {

					assistant = arregloN[j];
					arregloN[j] = arregloN[j+1];
					arregloN[j+1] = assistant;

				}   

			}

		}
		arregloOrdenado = arregloN;
		return arregloOrdenado;
	}

}