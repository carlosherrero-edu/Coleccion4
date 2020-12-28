package coleccion4;

public class GenerarTablaMultiplicar {
	
	public static void main(String[] args) {
		int producto;
		
		for (int num1=1;  num1 <=10; num1++) {
			//bucle que genera el 1º factor
			
			
			for (int num2=1; num2 <=10; num2++) {
				//bucle que genera el 2º factor
				producto = num1* num2;
				System.out.format("%3d ", producto);
				//System.out.format("\n %d por %d es igual a : %d" , num1,num2,producto)  ;
				
			}
			
			System.out.println();//salto de línea
			
		}
		
	} //fin del main

}
