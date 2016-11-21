package fr.designpattern.structuration.decorator;

//Concrete decorator 
public class LogoDecorator extends VehiculeViewDecorator {

	public LogoDecorator(VehiculeGraphicalComponent component) {
		super(component);

	}

	@Override
	public void draw() {

		//Invoke method of abstract decorator (abstract decorator invokes method of wrapped class)
		super.draw();
		
		//Decoration
		System.out.println("Show logo (LogoDecorator decoration)");

	}

}
