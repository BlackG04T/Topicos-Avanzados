import java.util.Scanner;

class SerieNumerosFibonacci{
	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 1;
		int suma = 0;
		int cantidadNumeros = 10;

		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros a mostrar: ");
		cantidadNumeros = reader.nextInt(); 
		System.out.println("-----");
		for (int x = 0; x<=cantidadNumeros ; x++ ) {
			suma = numero1 + numero2;
			numero1 = numero2;
			numero2 = suma;

			System.out.println(suma);
		}
	}
}