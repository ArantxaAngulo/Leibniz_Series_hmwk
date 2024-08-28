package def;

import java.util.Arrays;

//los arreglos son de tipo unico, no se pueden alterar. Son consistentes
//al momento de la creacion de un arreglo, se reserva un espacio de memoria (1 int = 32bits)

public class Clase5 {
	public static void main(String[] args) {
		//para los arreglos existen diferentes tiempos:
		//1. DECLARACION
			//arreglos de 1 dimension
			int iArray[];
			byte bArray[];
			String [] strArray;
			
			//arreglos de 2 dimensiones
			int iMatrix[][];
			double dMatrix[][];
			// los arrays pueden tener N dimensiones
			
		//2. CREACION
			iArray = new int[5];
			int N = 4;
			bArray = new byte[N]; //tamano del arreglo
			
			iMatrix = new int[3][2];
			
			//Matriz irregular, arreglo de 2 dimensiones variables 
			//se podria automatizar si se conoce el # de columnas que habra
			dMatrix = new double[4][];
			dMatrix[0] = new double[2];
			dMatrix[1] = new double[5];
			dMatrix[2] = new double[3];
			dMatrix[3] = new double[7];
			
		//3. INICIALIZACION
			iArray = new int[] {1,2,3,4,5};
			
			bArray[0] = 34;
			bArray[3] = 98;
			bArray[1] = 100;
			bArray[2] = 127;
			
			for(int f = 0; f < dMatrix.length; f++) {
				for(int c = 0; c < dMatrix[f].length; c++) {
					dMatrix[f][c] = Math.random();
				}
			}
			
		//4. DELCARACION, CREACION E INICIALIZACION
			int [] iArray2 = {10,9,8,7,6};
			
			iMatrix = new int[][]
					   {{1,2},
					   {3,4},
					   {5,6},
					   {7,8}};
			
			strArray = new String[] {"este", "es", "un", "arreglo", "de", "strings"};
			for(String s: strArray) {
				System.out.println(s);
			}
			System.out.println();
					   
		//manipulacion de arreglos
			//recorrido con for
			for(int i = 0; i < iArray.length; i++) {
				System.out.print(iArray[i] + "");
			}
			System.out.println();
			System.out.println("=====");
			//recorrido con for each, SOLO 1 DIMENSION!!! unicamente se logra anidando
			for(int f: iArray) {
				System.out.print(f + " ");
			}
			System.out.println();
			System.out.println("=====");
			
			for(int[] f: iMatrix) {
				for(int element: f ) {
					System.out.print(element + " ");
				}
				System.out.println();
			}
			System.out.println("=====");
			
			//clonacion de arrays
			int[] iArray2Clone = iArray2.clone();
			for(int i: iArray2) {
				System.out.print(i + " ");
			}
			System.out.println();
			for(int i: iArray2Clone) {
				System.out.print(i + " ");
			}
			
			System.out.println("\nLos arreglos son " + (iArray2 == iArray2Clone ? "iguales" : "diferentes")); //Son "diferentes" porque apuntan a DIFERENTES espacios de memoria
			System.out.println("Los arreglos son " + (iArray2.equals(iArray2Clone) ? "iguales" : "diferentes")); //Son "diferentes" porque apuntan a DIFERENTES espacios de memoria
			
			System.out.println("Los arreglos son " + (Arrays.equals(iArray2, iArray2Clone) ? "iguales" : "diferentes")); 
			
	}

}
