package abstraccion;

//esta es una clase concreta que hereda de la clase abstracta (Vehiculo)
public class Motocicleta extends Vehiculo{
	
	//Las anotaciones @ son "indicaciones" que le damos a JAVA

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("La motocicleta está acelerrando...");
		
	}
	
	//La subclase es quien decide cuándo y cómo se sobreescribe el método asbtracto. Es decir, la subclase implementa el método

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("La motocicleta está frenando...");
		
	}

}
