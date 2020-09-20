package week5;

public class app {

	public static void main(String[] args) {
		
		AsteriskLogger textLog = new AsteriskLogger ();
		textLog.log("Hello");
		textLog.error("Hello");
		
		SpacedLogger textSpace = new SpacedLogger();
		textSpace.log("Hello");
		textSpace.error("Hello");

	}

}
