package abstraccion;

//esta es una clase abstracta
public abstract class Vehiculo {
	
	//Atributos
	
	public String marca;
	public int anio;
	
	
	//Método concreto
	public void mostrarInfo() {
		System.out.println("Mi auto es: " + marca + " y es del anio: " + anio);
	} //mostrarInfo
	
	//Método abstracto
	public abstract void acelerar();
	
	//Método abstracto 
	public abstract void frenar();

}



/*
Abstraccion

En Java, una clase abstracta es una clase que no puede ser implementada directamente (que no puede instanciar), si no que se utiliza como una base para crear subclases mas concretas. Se utiliza para definir una estructura comun y compartir el comportamiento entre las subclases relacionadas.


Una clase abstracta puede implementar métodos concreto (métodos que hemos utilizado hasta ahorita) y métodos abstractos.
*/