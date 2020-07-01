
public abstract class State
{
	public abstract void handleEat(final Animal a);
	
	public abstract void handleSleep(final Animal a);
	
	public abstract void handleIdle(final Animal a);
	
	public abstract StateEnum getState();
}
