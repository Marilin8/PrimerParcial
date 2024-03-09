package lista_parcial;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		listaSimplementeEnlazada lista = new listaSimplementeEnlazada();

		while (true) {
			
			System.out.println("\nOpciones:");
			System.out.println("1. Insertar elemento al inicio");
			System.out.println("2. Eliminar  elemento");
			System.out.println("3. Eliminar elemento en una posicion especifica");
			System.out.println("4. Buscar un elemento");
			System.out.println("5. Imprimir lista");
			System.out.println("6. Salir");
			System.out.println("Seleccione una opcion");
			int opcion = scanner.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Ingrese el elemento a insertar al inicio: ");
				int elementoInicio = scanner.nextInt();
				lista.insertarAlinicio(elementoInicio);
				break;
			case 2:
				lista.eliminarPrimero();
				break;
			case 3:
				System.out.print("Ingrese la posicion del elemento a eliminar: ");
				int posEliminar = scanner.nextInt();
				lista.eliminarEnPosicion(posEliminar);
				break;
			case 4:
				System.out.print("Ingrese el elemento a buscar: ");
				int buscarElemento = scanner.nextInt();
				if (lista.buscar(buscarElemento)) {
					System.out.println("El elemento " + buscarElemento + " esta en la lista");
				}else {
					System.out.println("El elemento " + buscarElemento + " no esta en la lista");
				}
				break;
			case 5:
				lista.imprimirLista();
				break;
			case 6:
				System.out.println("Saliendo del programa...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Opcion invalida. Por favor, selecciona una opcion valida");
			}
		
	}

	}
}
