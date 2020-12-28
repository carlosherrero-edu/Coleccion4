package coleccion4;

public class BuclesAnidados {

	public static void main(String[] args) {
		int longitud = 20;

		for (int i = 1; i <= longitud; i++) {
			System.out.println();

			int j =1;
			
			while (j<=i) {
				if (j==1) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
				j++;
			}
			
		
			//fin del bucle interno
		} //fin del bucle externo

	} //fin del main

}
