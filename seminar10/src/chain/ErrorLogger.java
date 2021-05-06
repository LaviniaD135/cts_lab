package chain;

public class ErrorLogger extends AbstractLogger {
	public ErrorLogger(Verbosity verbosityLevel) {
		super(verbosityLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	void write(String message) {
		System.err.println(ErrorLogger.class.getName() + " : " + message);
		
	}
}
