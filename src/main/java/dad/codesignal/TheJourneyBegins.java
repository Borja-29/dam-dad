package dad.codesignal;

public class TheJourneyBegins {
	
	int add(int param1, int param2) {
		return param1+param2;
	}
	
	int centuryFromYear(int year) {
		return (int)Math.floor(year / 100.0) + ((year % 100.0 == 0) ? 0 : 1);
	}
	
	boolean checkPalindrome(String inputString) {
	    String alReves = "";
	    for (int i=inputString.length()-1;i>=0;i--){
	        alReves = alReves + inputString.charAt(i);
	    }
	    if (inputString.equals(alReves)){
	        return true;
	    }else{
	        return false;
	    }
	}

}
