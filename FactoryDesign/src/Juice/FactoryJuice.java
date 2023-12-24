package Juice;

public class FactoryJuice {
	Juice getJuice(String ip) {
		switch(ip) {
		case "Apple" :
			return new Apple();
		case "Orange":
			return new Orange();
		case "Badam":
			return new Badam();
		default:
			return new Apple();
			
		}
		
	}
	

}
