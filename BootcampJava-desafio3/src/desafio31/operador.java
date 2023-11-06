package desafio31;

import java.util.ArrayList;

public class operador implements IAutorizador {

	@Override
	public void auth(objetoVolador obj,torreDeControl torre) {
		var getType = obj.getTipoDeNave();
		
		if	(
				(torre.getPista2().size()< 7) && 
				(
					(getType.compareToIgnoreCase(navesEnum.AVION.toString()) == 0) || 
					(getType.compareToIgnoreCase(navesEnum.CARGUERO.toString()) == 0) ||
					(getType.compareToIgnoreCase(navesEnum.HELICOPTERO.toString()) == 0) ||
					(getType.compareToIgnoreCase(navesEnum.GLOBO.toString()) == 0)	
				)
			){
				this.aterrizarEnPista2(obj, torre);
				return;
		}else if(
				(getType.compareToIgnoreCase(navesEnum.ALADELTA.toString()) == 0) || 
				(getType.compareToIgnoreCase(navesEnum.DIRIGIBLE.toString()) == 0) ||
				(getType.compareToIgnoreCase(navesEnum.ALAFIJA.toString()) == 0)
				){
				this.noAterriza(obj, torre);
				return;
		}
	}
	
	
	private void aterrizarEnPista2(objetoVolador obj,torreDeControl torre) {
		@SuppressWarnings("unchecked")
		ArrayList<INave> arr = (ArrayList<INave>)torre.getPista2().clone();
		arr.add(obj);
		torre.setPista2(arr);
		System.out.println("Aterrizando " + obj.getTipoDeNave());
	}
	private void noAterriza (objetoVolador obj,torreDeControl torre) {
	System.err.println("La nave " + obj.getTipoDeNave() + " no tiene autorizacion para aterrizar.");
	@SuppressWarnings("unchecked")
	ArrayList<INave> arr2 = (ArrayList<INave>)torre.getNoAterizan().clone();
	arr2.add(obj);
	torre.setNoAterizan(arr2);
	System.out.println("Aterrizando " + obj.getTipoDeNave());
}


}
