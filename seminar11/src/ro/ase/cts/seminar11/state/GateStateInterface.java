package ro.ase.cts.seminar11.state;

public interface GateStateInterface {

	public void enter(Gate gate);

	void authorize(Gate gate);
	
}
