
public class Test {

	public static void main(String[] args) {

		Horse h1 = new Horse("horse 1");
		Horse h2 = new Horse("horse 2");
		
		HorseStateObserver hso1 = new HorseStateObserver("Observer 1");
		HorseStateObserver hso2 = new HorseStateObserver("Observer 2");
		
		h1.addObserver(hso1);
		h1.addObserver(hso2);
		
		h2.addObserver(hso2);
		
		h1.eat();
		
		h2.eat();
		
		 
	}

}
