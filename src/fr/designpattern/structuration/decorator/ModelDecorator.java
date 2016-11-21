package fr.designpattern.structuration.decorator;


//Concrete decorator
public class ModelDecorator extends VehiculeViewDecorator{

	public ModelDecorator(VehiculeGraphicalComponent component) {
		super(component);
		
	}

	@Override
	public void draw() {
		
		//Invoke method of abstract decorator (abstract decorator invokes method of wrapped class)
		component.draw();
		
		//Decoration
		System.out.println("Model description (ModelDecorator decoration)");
		
	}

}
