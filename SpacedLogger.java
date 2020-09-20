package week5;

public class SpacedLogger implements Logger{
	
	String str;
	@Override
	public void log(String str) {
		String inplace = "";
		for (int i=0; i<str.length(); i++) {
			inplace = inplace + str.charAt(i) + " ";
		}
		System.out.println(" "+inplace+" ");
	}

	@Override
	public void error(String str) {
		String inplace = "";
		for (int i=0; i<str.length(); i++) {
			inplace = inplace + str.charAt(i) + " ";
		}
		System.out.println("Error: "+inplace+ " ");
		
	}

}
