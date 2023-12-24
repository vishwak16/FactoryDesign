package Juice;

public class FactoryDesignJuice {
	public static void main(String args[]) {
		FactoryJuice factory= new FactoryJuice();
		Juice juice = factory.getJuice("");
		juice.juiceshop();
	}

}
