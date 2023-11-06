package desafio31;

import java.util.Iterator;

public class UsoAeropuerto {

	public static void main(String[] args) {
		objetoVolador avion = new objetoVolador("avion");
		objetoVolador helicoptero1 = new objetoVolador("helicoptero");
		objetoVolador avion2 = new objetoVolador("avion");
		objetoVolador avion3 = new objetoVolador("avion");
		objetoVolador avion4 = new objetoVolador("avion");
		objetoVolador aladelta = new objetoVolador("aladelta");
		objetoVolador aladelta2 = new objetoVolador("aladelta");
		objetoVolador dirigible = new objetoVolador("dirigible");
		objetoVolador dirigible2 = new objetoVolador("dirigible");
		objetoVolador dirigible3 = new objetoVolador("dirigible");
		objetoVolador aladelta3 = new objetoVolador("aladelta");
		objetoVolador globo = new objetoVolador("globo");
		objetoVolador globo2 = new objetoVolador("globo");
		objetoVolador alafija = new objetoVolador("alafija");
		objetoVolador alafija2 = new objetoVolador("alafija");
		objetoVolador carguero = new objetoVolador("carguero");
		objetoVolador carguero2 = new objetoVolador("carguero");
		objetoVolador carguero3 = new objetoVolador("carguero");
		
		torreDeControl uno = new torreDeControl();
		
		
		avion.aterrizar(uno);
		helicoptero1.aterrizar(uno);
		avion2.aterrizar(uno);
		avion3.aterrizar(uno);
		avion4.aterrizar(uno);
		aladelta.aterrizar(uno);
		aladelta2.aterrizar(uno);
		dirigible.aterrizar(uno);
		dirigible2.aterrizar(uno);
		dirigible3.aterrizar(uno);
		aladelta3.aterrizar(uno);
		globo.aterrizar(uno);
		globo2.aterrizar(uno);
		alafija.aterrizar(uno);
		alafija2.aterrizar(uno);
		carguero.aterrizar(uno);
		carguero2.aterrizar(uno);
		carguero3.aterrizar(uno);
		
		  System.out.println("");
	System.out.println("Las naves que aterrizaron en la pista 1 son: ");	
	Iterator<INave> itr = uno.getPista1().iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next().toString());
    }
    System.out.println("");
	System.out.println("Las naves que aterrizaron en la pista 2 son: ");
	Iterator<INave> itr2 = uno.getPista2().iterator();
    while (itr2.hasNext()) {
        System.out.println(itr2.next().toString());
    }
    System.out.println("");
	System.out.println("Las naves que no aterrizaron son: ");
	Iterator<INave> itr3 = uno.getNoAterizan().iterator();
    while (itr3.hasNext()) {
        System.out.println(itr3.next().toString());
	}

}
}


