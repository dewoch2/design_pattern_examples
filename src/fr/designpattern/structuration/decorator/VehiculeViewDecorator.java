package fr.designpattern.structuration.decorator;

//Abstract Decorator
public abstract class VehiculeViewDecorator implements VehiculeGraphicalComponent{
	
	protected VehiculeGraphicalComponent component;
	
	public VehiculeViewDecorator(VehiculeGraphicalComponent component){
		
		this.component = component;
	}
	
	
	public void draw(){
		
		//Invoke method of wrapped component
		component.draw();
	}

}
