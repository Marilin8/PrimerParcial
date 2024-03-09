package lista_parcial;



public class listaSimplementeEnlazada {

Nodo cabeza; //Referencia al primer nodo de la lista
	
	//Constructor para inicializar la lista como vacia
public listaSimplementeEnlazada() {
	this.cabeza = null; //La lista comienza vacia

}

//Metodo para insertar un nuevo nodo al inicio de la lista
public void insertarAlinicio(int dato) {
	Nodo nuevoNodo = new Nodo(dato); //Crea un nuevo nodo con el valor proporcionado
	nuevoNodo.siguiente = cabeza;//Establece el siguiente de nuevo nodo como la cabeza actual
	cabeza = nuevoNodo;//Actualiza la cabeza para que apunte al nuevo nodo
}

public void eliminarPrimero() {
	if (cabeza != null) {//Verifica si la lista no esta vacia
		cabeza = cabeza.siguiente;//La cabeza se mueve al siguiente nodo
	}else {
		System.out.println("La lista esta vacia");
		
	}
}

//Metodo para eliminar un nodo en una posicion especifica de la lista

public void eliminarEnPosicion(int posicion) {
	if (posicion < 0) {//Verifica si la posicion es valida
		System.out.println("La posicion debe tener un numero positivo");
		return;
	}
	if(posicion == 0) {//Elimina el primer nodo si la posicion es de cero
		eliminarPrimero();
		return;
	}
	Nodo temp = cabeza;
	for (int i = 0; temp !=null && i < posicion - 1; i++) {//Avanza hasta la posicion anterior al nodo a eliminar
		temp = temp.siguiente;
	}
	if(temp == null || temp.siguiente == null) {//verifica si la posicion es valida
		System.out.println("La lista no tiene suficientes elementos");
		return;
	}
	temp.siguiente = temp.siguiente.siguiente;//Elimina el nodo en la posicion especificada
}

//Metodo para buscar un elemento en la lista

public boolean buscar(int dato) {
	Nodo temp = cabeza;
	while (temp != null) {//Recorre la lista
		if (temp.dato == dato) {//Compara el valor del nodo con el dato buscado
			return true;//Retorna true si lo encuentra
		}
		temp = temp.siguiente;
	}
	return false;//retorna false si no lo encuentra
}

//Metodo para imprimir los elementos de la lista
public void imprimirLista() {
	Nodo temp = cabeza;
	System.out.print("Lista: ");
	while (temp != null) {//Recorre la lista
		System.out.print(temp.dato + " ");//Imprime el valor del nodo actual
		temp = temp.siguiente;//Avanza al siguiente nodo
	}
	System.out.println();
}

}
