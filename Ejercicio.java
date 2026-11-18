package X;

import java.util.*;

public class Ejercicio {



		public static void main(String[] args) {
			
	    //Definición de los array y las variables que necesitamos
	    
			Scanner scanner = new Scanner(System.in);
			String[] Alumnos = {"Alumno1", "Alumno2", "Alumno3", "Alumno4"};
			String[] Asignaturas = {"Matemáticas", "Lengua", "Inglés", "Ciencias", "Historia"};
			double Notas[][] = new double[Alumnos.length][Asignaturas.length];
			double notaAlta, notaBaja, media;
			
			//recogemos las notas para cada alumno en cada asignatura.
	    
			for (int i = 0; i < Alumnos.length; i++) {
					System.out.println("Introduzca las nota del alumno " + (i+1) + " para la asignatura: ");
				for (int j = 0; j < Asignaturas.length; j++) {
					System.out.print(Asignaturas[j] + ": ");
					Notas[i][j] = scanner.nextDouble();
				}
			}
			
	    //Imprimimos la parte superior de nuestra tabla
	    
			System.out.print("\tNota mas baja\tNota mas alta\tMedia\n");
			
	    //Creamos los bucles para imprimir los alumnos, buscar las notas mas altas y más bajas de cada uno, calcular sus medias e imprimir los datos.
	    
			for (int i = 0; i < Alumnos.length; i++) {
	    
	    //impresion de los alumnos e iniciamos las variables de nota alta, baja y media
	    
				System.out.print(Alumnos[i] + "|");
				notaAlta = Notas[i][0];
				notaBaja = Notas[i][0];
				media = 0;
	      
	      // Abrimos bucle para revisar todas las notas, ver cuales son mas altas y cuales son mas bajas ademas de sumar los valores a media
	      
				for (int j = 0; j < Asignaturas.length; j++){
					if (Notas[i][j] > notaAlta) {
						notaAlta = Notas[i][j];
					}else if(Notas[i][j] < notaBaja) {
						notaBaja = Notas[i][j];
					}
					media += Notas[i][j];
				}
	      
	      // Calculamos la media dividiendo el resultado por el numero de asignaturas e imprimimos todo con algo de formato para que quede bonito
				
				media = media/Asignaturas.length;
				
				System.out.println(notaBaja + "\t\t" + notaAlta + "\t\t" + media);
			}	

			scanner.close();
		}
		
	}

