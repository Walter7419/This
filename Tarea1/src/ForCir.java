import java.util.Scanner;

public class ForCir {
	static Scanner entrada;
	Scanner figura;
	private static Scanner geo;
	
	public static void main(String[] args) {
		Circulo cir = new
		Circulo(176770);
	
	geo = new Scanner(System.in);
	System.out.println("¿Que figura quieres hacer cu para cuadrado o ci para circulo?");
	String fir = entrada.nextLine();  
	
	if (fir.contains("ci")) {
	System.out.println("El perimetro es: "+cir.cPCi());
	
	System.out.println("El area es: "+cir.cACi());
	}


	
	if (fir.contains("cu")) {
		System.out.println("El perimetro es: "+cir.cPCu());
		
		System.out.println("El area es: "+cir.cACu());
		}
}
}

