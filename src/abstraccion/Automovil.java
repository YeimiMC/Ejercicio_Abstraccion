package abstraccion;

//esta es una clase concreta
public class Automovil extends Vehiculo {
	
	//Se traen los métodos de abstract
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("El automóvil está acelerando");
		
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("El automóvil está frenando");
		
	}

}
