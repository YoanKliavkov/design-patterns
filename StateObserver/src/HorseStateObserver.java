import java.util.Observable;
import java.util.Observer;

public class HorseStateObserver implements Observer {

	private String name;
	
	public HorseStateObserver(String str)
	{
		name = str;
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof Horse)
		System.out.println(name + " -> " +  ((Horse)o).name + " is eating");
		
	}

}
