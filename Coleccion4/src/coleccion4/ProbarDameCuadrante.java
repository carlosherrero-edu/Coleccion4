package coleccion4;

public class ProbarDameCuadrante {

	public static void main(String[] args) {
		double posXpos=5.5, posYpos=5.5;
		double posXneg=-5.5, posYneg= -5-5;
		double posXcero=0.0, posYcero=0.0;
		
		//casos de prueba
		
		//Hay que usar el método .equals() para la comparación de igualdad, pues los tipos enumerados son objetos
				System.out.println(Utilidades.dameCuadrante(posXpos, posYpos).equals(Cuadrantes.PRIMERO)? "Prueba OK " : "Prueba ERROR" );
				System.out.println(Utilidades.dameCuadrante(posXneg, posYpos).equals(Cuadrantes.SEGUNDO)? "Prueba OK " : "Prueba ERROR" );
				System.out.println(Utilidades.dameCuadrante(posXneg, posYneg).equals(Cuadrantes.TERCERO)? "Prueba OK " : "Prueba ERROR" );
				System.out.println(Utilidades.dameCuadrante(posXpos, posYneg).equals(Cuadrantes.CUARTO)? "Prueba OK " : "Prueba ERROR" );
				System.out.println(Utilidades.dameCuadrante(posXpos, posYcero).equals(Cuadrantes.EJE_HORIZONTAL)? "Prueba OK " : "Prueba ERROR" );
				System.out.println(Utilidades.dameCuadrante(posXcero, posYpos).equals(Cuadrantes.EJE_VERTICAL)? "Prueba OK " : "Prueba ERROR" );
				System.out.println(Utilidades.dameCuadrante(posXcero, posYcero).equals(Cuadrantes.ORIGEN)? "Prueba OK " : "Prueba ERROR" );

	}

}
