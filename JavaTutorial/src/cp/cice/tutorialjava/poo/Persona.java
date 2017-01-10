package cp.cice.tutorialjava.poo;

public class Persona {
	//Un miembro de una clase es un atributo o un metodo
	//Los atributos definen el estado de un objeto	
	private String nombre;
	private int edad;
	private String domicilio;
	//Los metodos definen la funcionalidad de un objeto

	public Persona(String nombre, int edad){
		this.nombre=nombre;
		setEdad(edad);
	}
	public Persona(String nombre, int edad,String domicilio){
		this.nombre=nombre;
		setEdad(edad);
		this.domicilio=domicilio;
	}
	public void print (){
		System.out.println("Persona[nombre: " +nombre+",domicilio:"+domicilio+",edad:"+edad+"]");
	}
	public int getEdad(){
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public void setEdad(int edad) {
		if (edad>=0)
			this.edad = edad;
	}
}
