
public class SleepState extends State {

	@Override
	public void handleEat(Animal a) {
		a.setState(new EatState());
	}

	@Override
	public void handleSleep(Animal a) {
		a.setState(new SleepState());
	}

	@Override
	public void handleIdle(Animal a) {
		a.setState(new IdleState());
	}

	@Override
	public StateEnum getState() {
		return StateEnum.SLEEP;
	}

}
