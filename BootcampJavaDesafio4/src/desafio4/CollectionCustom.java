package desafio4;

import java.util.Arrays;

public class CollectionCustom<T> {
	@SuppressWarnings("unchecked")
	private T[] lista = (T[]) new Object[10];
	private int size = 0;
	
	@Override
	public String toString() {
			return Arrays.toString(lista);
	}
	public int size() {
		return size;
	};
	public void addFirst(T a) {
		if(lista[lista.length - 1 ] == null) {
			@SuppressWarnings("unchecked")
			T[] newarray = (T[])new Object[lista.length];
		for (int i = 1; i < lista.length; i++) {
			newarray[i] = lista[i-1];
		}
		newarray[0] = a;
		size++;
		lista = newarray;
		}else {
			@SuppressWarnings("unchecked")
		T[] newarray = (T[])new Object[lista.length + 1];
			newarray[0] = a;
		for (int i = 1; i < lista.length; i++) {
			newarray[i] = lista[i-1];
		}
			size++;
			lista = newarray;
		}
	}
	public void addLast(T a) {
		@SuppressWarnings("unchecked")
		T[] newarray = (T[])new Object[lista.length + 1];
		for (int i = 0; i < lista.length; i++) {
			newarray[i] = lista[i];
		}
		newarray[size] = a;
		size++;
		lista = newarray;
		}
	public void add(T a){
		lista[size] = a;
		size++;
			if(size == lista.length){
				@SuppressWarnings("unchecked")
			T[] newarray = (T[])new Object[lista.length + 1];
			for (int i = 0; i < lista.length; i++) {
				newarray[i] = lista[i];
			}
			lista = newarray;
			}
		}
	public T remove(T a) {
		if(lista.length == 1) {
		removeAll();
		}else {
		for (int i = 0; i < size- 1; i++) {	
			if(lista[i].equals(a)) {
				lista[i]=null;
			}
	// 		QUISE HACERLO DE ESTA FORMA,O SIMILAR PERO
	//		NO LOGRO COMPILAR		
	//		if(lista[i].equals(a)) {
	//			lista[i] = lista[i+1];
	//			for (int j = i; j < size; i++) {
	//				lista[j] = lista[j+1];
	//			}
	//		}
				}
		}
		size--;
		
		return a;
	}
	public void removeAll(){
		@SuppressWarnings("unchecked")
		T[] newarray = (T[]) new Object[lista.length];
		lista = newarray;
		size = 0;
	}
	public boolean empty() {
	if(this.size == 0) {
		return true;
	}
	else return false;
	}
	
}