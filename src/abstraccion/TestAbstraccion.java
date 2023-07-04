package abstraccion;

public class TestAbstraccion {

	public static void main(String[] args) {
		// Aquí ya se usa el main para poder instanciar las abstracciones
		
		//Instancia de la clase automóvil
		Automovil myTroquita = new Automovil();
		
		//Instancia de la clase motocicleta
		Motocicleta ninja = new Motocicleta();
		
		//Llamamos a los métodos de cada instancia
		myTroquita.acelerar();
		ninja.acelerar();
		
		myTroquita.frenar();
		ninja.frenar();
		
		//Al correr, nos demuestra que los métodos abstractos

	}

}
