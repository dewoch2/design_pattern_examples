package fr.designpattern.clients;

import fr.designpattern.structuration.decorator.LogoDecorator;
import fr.designpattern.structuration.decorator.ModelDecorator;
import fr.designpattern.structuration.decorator.VehiculeGraphicalComponent;
import fr.designpattern.structuration.decorator.VehiculeView;
import fr.designpattern.structuration.decorator.VehiculeViewDecorator;

public final class DecoratorClient {

	public static void main(String[] args) {


		VehiculeGraphicalComponent vehiculeView = new VehiculeView();
		
		VehiculeViewDecorator modelDecorator = new ModelDecorator(vehiculeView);
		VehiculeViewDecorator logoDecorator = new LogoDecorator(modelDecorator);
		
		logoDecorator.draw();

	}

}
