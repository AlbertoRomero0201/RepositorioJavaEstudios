/*
 * Objetivo: Aplicación para calcular el salario neto de un empleado
 * Nombre: Alberto Romero Meléndez
 * Fecha:29/10/2026
 * 
 */



package Romero;

import java.util.Scanner;

public class Alberto1 {

	public static void main(String[] args) {
		
		//Creamos el escaner para recoger el input del usuario.
		Scanner scanner = new Scanner(System.in);
		
		/*Creamos variables para cada uno de los datos solicitados, utilizando boolean
		 * para el complemento de transporte puesto que solo requerimos saber
		 * si se beneficia de este o no.
		*/
		
		//definimos todas las variables que necesitaremos para almecenar nuestros calculos
		String nombre;
		double sueldoBase;
		boolean tieneComplementoTransporte;
		double antiguedad;
		double bonusTransporte = 0;
		double complementoAntiguedad;
		double añosBonusAntiguedad;
		double porcentajeIRPF;
		double sueldoBruto;
		double impuestosRetenidos;
		double SueldoNeto;
		final double porcentajeExtra = 0.02;
		
		//Recibimos el nombre, salario, si reciben bono de transporte y años en la empresa.
		
		//nombre
		System.out.print("Por favor, introduzca su nombre: ");
		nombre = scanner.nextLine();
		
		//bucle para asegurarnos que el salario es mayor a 0
		do{
			System.out.print("Por favor, introduzca su salario actual: ");
			sueldoBase = scanner.nextDouble();
		}while(sueldoBase < 0);
		
		//comprobamos si aprovecha el bonus de transporte
		System.out.print("Consta de complemento por transporte? (true/false): ");
		tieneComplementoTransporte = scanner.nextBoolean();
		
		//pedimos sus años en la empresa
		System.out.print("Cuantos años lleva trabajando para esta empresa?: ");
		antiguedad = scanner.nextInt();
		
		añosBonusAntiguedad = (antiguedad/3);
		
		
		
		//realizamos todos los calculos para los salarios
		
		//comprobamos sus bonos y los sumamos al salario base para calcular el bruto.
		if (tieneComplementoTransporte) {
			bonusTransporte = 100;
			complementoAntiguedad = (sueldoBase * (añosBonusAntiguedad * porcentajeExtra));
			sueldoBruto = (sueldoBase + bonusTransporte + complementoAntiguedad);
		}else {
			complementoAntiguedad = (sueldoBase * añosBonusAntiguedad * porcentajeExtra);
			sueldoBruto = (sueldoBase + complementoAntiguedad);
		}
		
		//Calculamos la retencion por IRPF en funcion de su salario bruto
		if (sueldoBruto < 1000) {
			porcentajeIRPF = 10;
			impuestosRetenidos = (sueldoBruto * (porcentajeIRPF / 100));
		}else if ((1000 < sueldoBruto) || (sueldoBruto > 2000) ) {
			porcentajeIRPF = 15;
			impuestosRetenidos = (sueldoBruto * (porcentajeIRPF / 100));
		}else {
			porcentajeIRPF = 20;
			impuestosRetenidos = (sueldoBruto * (porcentajeIRPF / 100));
		}
		
		//finalmente calculamos el salario neto
		SueldoNeto = (sueldoBruto - impuestosRetenidos);
		
		//imprimimos todos los datos solicitados por el usuario.
		
		System.out.println("---RESUMEN DE NÓMINA---");
		System.out.println("Nombre: " + nombre);
		System.out.println("Sueldo Base: " + sueldoBase + " €");
		System.out.println("Complemento Transporte: " + bonusTransporte + "€");
		System.out.println("Complemento Antigüedad: " + complementoAntiguedad + "€");
		System.out.println("Sueldo Bruto: " + sueldoBruto + "€");
		System.out.println("Porcentaje IRPF: " + porcentajeIRPF + "%");
		System.out.println("Total Impuestos (Retención): " + impuestosRetenidos + "€");
		System.out.println("Sueldo Neto: " + SueldoNeto + "€");
		
		scanner.close();
	}

}
