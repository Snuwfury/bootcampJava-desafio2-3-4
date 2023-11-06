package desafio2;

public class Alumno {

	private String nombre;
	private String apellido;
	private int promedio;
	private int[] notas;	
	//private String mejorCalificacion[];
	//private String peorCalificacion[];
	//private String promocionan[];
	//private String recursan[];
	
	
	public int[] getNotas() {
		return notas;
	}

	public Alumno(String nombre, String apellido, int promedio, int[] notas){
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.promedio = promedio;
		this.notas=notas;
	}

	public int getNotasAlumno() {
		return promedio;
	}

	@Override
	public String toString() {
		return "[nombre: " + nombre + ", apellido: " + apellido + ", nota final: " + promedio + "]\n";
	}

	
}
