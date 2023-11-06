package desafio31;

import java.util.ArrayList;

public class torreDeControl implements IAutorizador {
private ArrayList<INave> pista1;	
private ArrayList<INave> pista2;
private ArrayList<INave> noAterizan;


public torreDeControl() {
	this.pista1 = new ArrayList<INave>(5);
	this.pista2 = new ArrayList<INave>(5);
	this.noAterizan =  new ArrayList<INave>();
}



public ArrayList<INave> getPista1() {
	return pista1;
}


public void setPista1(ArrayList<INave> pista1) {
	this.pista1 = pista1;
}


public ArrayList<INave> getPista2() {
	return pista2;
}

public void setPista2(ArrayList<INave> pista2) {
	this.pista2 = pista2;
}


public ArrayList<INave> getNoAterizan() {
	return noAterizan;
}

public void setNoAterizan(ArrayList<INave> noAterizan) {
	this.noAterizan = noAterizan;
}



public void auth(objetoVolador obj,torreDeControl torre) {
	torre = this;
	if (obj == null) {
		System.out.println("La nave no existe");
		return;
	}
	var getType = obj.getTipoDeNave();
	if (
			(this.pista1.size() < 5) && 
			(getType.compareToIgnoreCase(navesEnum.AVION.toString()) == 0) || 
			(getType.compareToIgnoreCase(navesEnum.HELICOPTERO.toString()) == 0) ||
			(getType.compareToIgnoreCase(navesEnum.CARGUERO.toString()) == 0)
		){
		this.aterrizarEnPista1(obj, torre);
		return;
		}
	IAutorizador aut = new operador();
	if(this.pista1.size() == 5 || 
			(obj.getTipoDeNave().compareToIgnoreCase(navesEnum.AVION.toString()) != 0) || 
			(obj.getTipoDeNave().compareToIgnoreCase(navesEnum.HELICOPTERO.toString()) != 0) ||
			(obj.getTipoDeNave().compareToIgnoreCase(navesEnum.CARGUERO.toString()) != 0)
		){
		aut.auth(obj, torre);
	}
}


private void aterrizarEnPista1(objetoVolador obj,torreDeControl torre) {
	@SuppressWarnings("unchecked")
	ArrayList<INave> arr = (ArrayList<INave>)torre.getPista1().clone();
	arr.add(obj);
	torre.setPista1(arr);
	System.out.println("Aterrizando " + obj.getTipoDeNave());
}

}
	
	
	
