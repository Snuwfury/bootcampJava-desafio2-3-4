package desafio4;

public class main {

	public static void main(String[] args) {

	CollectionCustom<String> palabras = new CollectionCustom<String>();
	
	palabras.add("hola");
	System.out.println(palabras);
	System.out.println(palabras.size());
	
	palabras.add("hola2");
	System.out.println(palabras);
	System.out.println(palabras.size());
	
	palabras.add("hola3");
	System.out.println(palabras);
	System.out.println(palabras.size());
	
	palabras.add("hola4");
	System.out.println(palabras);
	System.out.println(palabras.size());
	
	palabras.add("hola5");
	System.out.println(palabras);
	System.out.println(palabras.size());
	
	palabras.addFirst("primero");
	System.out.println(palabras);
	System.out.println(palabras.size());

	palabras.addLast("ultimo");
	System.out.println(palabras);
	System.out.println(palabras.size());
	
	System.out.println("este array esta vacio? -" + palabras.empty());
	
	palabras.remove("hola4");
	System.out.println(palabras);
	System.out.println(palabras.size());

	palabras.removeAll();
	System.out.println(palabras);
	System.out.println(palabras.size());
	System.out.println("este array esta vacio? -" + palabras.empty());
	}



	
}
