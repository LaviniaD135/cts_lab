package chain;

public class ConsoleLogger extends AbstractLogger{
	public ConsoleLogger(Verbosity verbosityLevel) {
		super(verbosityLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	void write(String message) {
		System.out.println(ConsoleLogger.class.getName()+" : " + message);
		
	}
}
