package coleccion4;

public class AlumnosAprobados4 {
	
	public static void main(String[] args) {
		
		int totAprob =0; 
		int alumnos=0;
		double nota;
		
		for (String elemento : args) {
			alumnos++;
			
			//convierto el elemento de la lista a número
			nota = Double.parseDouble(elemento);
			
			if (nota >= 5){
                totAprob++;
            }
			
		} //fin del for
		
		System.out.println("Alumnos leídos " + alumnos);
		
		System.out.println("El total de alumnos aprobados es " + totAprob);
		
		
	}

}
