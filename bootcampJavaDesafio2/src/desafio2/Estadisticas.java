package desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estadisticas {

	public static void main(String[] args) {
		
		//datos para iniciar
		Scanner scn= new Scanner(System.in);
		System.out.println("Indica la cantidad de alumnos a procesar");
		int cantAlumnos = scn.nextInt();
		
		
		//creo un arraylist y guardo los objetos Alumno dentro para luego trabajarlos
		List<Alumno> misAlumnos = new ArrayList<Alumno>();
		for (int i = 0; i < cantAlumnos; i++) {
			int totalNotas = 0;
			int promedio = 0;
			int notas[] = new int[3];
			
			System.out.println("Ingresa el nombre");
			String nombre = scn.next();
			
			System.out.println("Ingresa el apellido");
			String apellido = scn.next();
			
			//asumo que todos los alumnos rindieron 3 examenes y pido nota de c/u
			for (int j = 0; j < 3; j++) {
				System.out.println("Ingresa la calificacion n°"+ j+1 + " que obtuviste");
				notas[j] = scn.nextInt();
				int sum = 0;
		        for (int t = 0; t < notas.length; i++) {
		            sum += notas[i];
		        }
				totalNotas += sum ; 
			}
			promedio = totalNotas/3;	
		//uso los datos solicitados para llenar el constructor y asi añadir alumnos al arraylist
			misAlumnos.add(new Alumno(nombre, apellido, promedio, notas));
		}
		scn.close();
		System.out.println(misAlumnos);
		
		//recorro el array buscando los promedios mas altos
		List<Alumno> promedioA = new ArrayList<Alumno>();
		
		for (Alumno alumno : misAlumnos) {
			if(alumno.getNotasAlumno()>= 7) {
				promedioA.add(alumno);
			}
		};
		System.out.println("Los alumnos con promedio mas alto son: " + promedioA);
		
		
		//recorro el array buscando los promedios mas bajos
		List<Alumno> promedioB = new ArrayList<Alumno>();
		
		for (Alumno a : misAlumnos) {
			if(a.getNotasAlumno()< 7) {
				promedioB.add(a);
			}
		};
		
		System.out.println("Los alumnos con promedio mas bajo son: " + promedioB);
		
		//busco los alumnos que tienen la nota mas baja
		//y los guardo en el siguiente array de alumnos
		List<Alumno> peorCalif = new ArrayList<Alumno>();
		
		for (Alumno a : misAlumnos) {
			int arrnotas[] = a.getNotas();
			for (int j = 0; j < arrnotas.length; j++) {
				if(arrnotas[j] < 6){
					peorCalif.add(a);
				}
			}			
		};
		System.out.println("Los alumnos con calificacion mas baja(-6) son: " + peorCalif);
		
		//busco los alumnos que tienen la nota mas alta
		//y los guardo en el siguiente array de alumnos
		
		List<Alumno> mejorCalif = new ArrayList<Alumno>();
		
		for (Alumno a : misAlumnos) {
			int arrnot[] = a.getNotas();
			for (int j = 0; j < arrnot.length; j++) {
				if(arrnot[j] > 7){
					mejorCalif.add(a);
				}
			}			
		};
		System.out.println("Los alumnos con calificacion mas alta(+6) son: " + mejorCalif);
		}
	}
