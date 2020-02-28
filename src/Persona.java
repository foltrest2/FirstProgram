
public class Persona {

	public static void main(String[] args) {
	
		String[] concatenacion= new String[5];
		String frase = "";
		
		concatenacion[0]= "hola";
		concatenacion[1]= "como";
		concatenacion[2]= "estas";
		concatenacion[3]= "espero";
		concatenacion[4]= "que bien";
		
	for (String palabra : concatenacion) {
		
//		System.out.println(palabra);
		
		frase = frase + palabra + " ";
		
	}
	System.out.println(frase);
	}
}
