package com.kaitzen;

public class Libro {
	private String nombre;
	private String editorial;
	private String alumno_cargo;
	private String autor;
	private Ubicacion ubicacion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Libro (){
		this.ubicacion = Ubicacion.BIBLIOTECA;
		this.alumno_cargo = "";
	}

	public Libro (String nombre, String autor, String editorial){
		this.autor = autor;
		this.nombre = nombre;
		this.editorial = editorial;
		this.ubicacion = Ubicacion.BIBLIOTECA;
		this.alumno_cargo = "";
	}
	
	public void prestamo (String nombre){
		this.ubicacion = Ubicacion.ALUMNO;
		this.alumno_cargo = nombre;
	}
	
	public void devolucion (){
		this.ubicacion = Ubicacion.BIBLIOTECA;
	}
	
	
	public String ToString (){
		StringBuffer strbuf = new StringBuffer();
		
		if (this.ubicacion == Ubicacion.BIBLIOTECA){
			strbuf.append("El libro se encuentra en biblioteca");
			if (this.alumno_cargo.isEmpty()){
			strbuf.append("nungun alumno se lo llevo anteriormente");
			}
			else{
				strbuf.append(" el ultimo alumno en retirarlo fue ");
				strbuf.append(this.alumno_cargo);
			}
			//return "El libro "+this.nombre+" esta en biblioteca, el ultimo retiro fue por el alumno "+ this.alumno_cargo;
		}
		else{
			strbuf.append("El libro no se encuentra en biblioteca, lo tiene el alumno ");
			strbuf.append(this.alumno_cargo);
		}
		
		return strbuf.toString();
		//return "El libro "+this.nombre+" no esta en biblioteca, el alumno "+ this.alumno_cargo+ " lo retiro";
		
	}

	
}
