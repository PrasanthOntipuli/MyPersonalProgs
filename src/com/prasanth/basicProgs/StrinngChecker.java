package com.prasanth.basicProgs;

public class StrinngChecker {

	public static String checkMyString(String data) throws StringExecption, AlphaNumericExecption {
		Boolean charExists = false, intExists = false;
		for (int i = 0; i < data.length(); i++) {
			if (!checkInteger(data.charAt(i))) {
				charExists = true;
			} else {
				intExists = true;
			}
		}
		if (charExists && intExists) {

			throw new AlphaNumericExecption("It is alphaNumeric");

		} else if (charExists) {
			throw new StringExecption("It is String");
		}

		return "valid";
	}

	public static boolean checkInteger(Character cha) {
		try {
			System.out.println(Integer.parseInt("" + cha));
		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		try {
			System.out.println(checkMyString("gja"));
		} catch (StringExecption e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			// e.printStackTrace();
		} catch (AlphaNumericExecption e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
	}

}

class AlphaNumericExecption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AlphaNumericExecption(String exe) {
		super(exe);
	}
}

class StringExecption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StringExecption(String exe) {
		super(exe);
	}
}
