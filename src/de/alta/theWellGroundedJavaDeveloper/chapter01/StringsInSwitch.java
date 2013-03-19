package de.alta.theWellGroundedJavaDeveloper.chapter01;

public class StringsInSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String id = "4711";
		
		switch (id) {
		case "4711":
			System.out.println("kölsch wasser");
			break;

		case "42":
			System.out.println("antwort auf alle Fragen");
			break;
			
		default:
			System.out.println("noch nicht geklärt");
			break;
		}
	
		
		// regulaere expressions als switch-value waer nett. 
	}

}
