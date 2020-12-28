package coleccion4.pruebas;

import coleccion4.Utilidades;

public class ProbarMetodosListas {

	public static void main(String[] args) {
		 //prueba 1: lista vacía
		
		System.out.println(Utilidades.calcularMenor( ));
		System.out.println(Utilidades.calcularMayor( ));
		System.out.println(Utilidades.calcularMedia( ));
		
		//prueba 2: lista de 1 elemento
		
		System.out.println(Utilidades.calcularMenor(100 ));
		System.out.println(Utilidades.calcularMayor( 100));
		System.out.println(Utilidades.calcularMedia( 100));
		
		//prueba 3: lista de N  elementos
		
		System.out.println(Utilidades.calcularMenor( 100, 50, 49.9, 200 ));
		System.out.println(Utilidades.calcularMayor(  100, 50, 49.9, 200));
		System.out.println(Utilidades.calcularMedia(  100, 50, 49.9, 200));
		
		//prueba 3: lista de N  elementos
		
		System.out.println(Utilidades.calcularMenor( 100, 50, -1, -1.001 ,49.9, 200 ));
		System.out.println(Utilidades.calcularMayor(  100, 50, 49.9, -1, -1.001,200));
		System.out.println(Utilidades.calcularMedia(  100, 50, 49.9, -1, -1.001, 200));

		

	}

}
