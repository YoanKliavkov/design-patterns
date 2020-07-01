import java.util.Observable;

@SuppressWarnings("deprecation")
public class Horse extends Observable implements Animal 
{
	public String name;
	private State state;	

	public Horse(final State state)
	{
		this.state = state;
	}
	
	public Horse(String name)
	{
		this.name = name;
		 state = new IdleState();
	}
	
	public void setState(final State state)
	{
		this.state = state;
	}
	
	public State getState()
	{
		return state;
	}
	
	public void eat()
	{
		state.handleEat(this);
		setChanged();
		notifyObservers(state);
	}
	
	public void sleep()
	{
		state.handleSleep(this);
	}
	
	public void idle()
	{
		state.handleIdle(this);
	}
}
