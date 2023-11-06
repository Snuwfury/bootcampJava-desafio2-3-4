package desafio31;

public class objetoVolador implements INave {
private String tipoDeNave;




public objetoVolador(String tipoDeNave) {
	this.tipoDeNave = tipoDeNave;
	
}

public String getTipoDeNave() {
	return tipoDeNave;
}

@Override
public void aterrizar(IAutorizador a) {
a.auth(this, ((torreDeControl)a));
}

@Override
public String toString() {
	return tipoDeNave;
}

}
