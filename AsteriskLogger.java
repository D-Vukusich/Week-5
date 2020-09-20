package week5;

public class AsteriskLogger implements Logger{

		String str;


	@Override
	public void log(String str) {
		str = "***" + str + "***";
		System.out.println (str + " ");
		
	}

	@Override
	public void error(String str) {
		str = "***ERROR: "+ str + "***";
		String str2 = "";
		for (int i =  0; i < str.length(); i++) {
			str2 = str2 + "*";
		}
		System.out.println(str2);
		System.out.println(str);
		System.out.println(str2);
	}

}
